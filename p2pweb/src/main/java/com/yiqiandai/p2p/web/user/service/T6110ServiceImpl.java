package com.yiqiandai.p2p.web.user.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.UUID;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

import com.yiqiandai.p2p.base.service.BaseServiceImpl;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.codec.digest.UnixCrypt;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.yiqiandai.p2p.web.session.SessionConstant;
import com.yiqiandai.p2p.web.session.bo.UserSession1030;
import com.yiqiandai.p2p.web.session.service.UserSession1030Service;
import com.yiqiandai.p2p.web.user.UserModel;
import com.yiqiandai.p2p.web.user.bo.T6110;
import com.yiqiandai.p2p.web.user.dao.T6110DAO;
import com.yiqiandai.p2p.web.user.exception.AuthenticationException;

/**
 * @comment Service实现类
 * @author Administrator
 * @date 2015-05-22 
 */
@Service 
public class T6110ServiceImpl extends BaseServiceImpl<T6110> implements T6110Service{
	private static final int MAX_TRY_LOGIN_TIME = 10;
	@Resource
	UserSession1030Service userSessionService;
	
	
	public T6110DAO getDao() {
		return (T6110DAO)super.dao;
	}
	
	@Resource(name="t6110DAOImpl")
	public void setDao(T6110DAO dao) {
		super.dao = dao;
	}

	@Override
	public UserSession1030 checkin(UserModel usermodel)throws AuthenticationException, SQLException {
		try{
			UserSession1030 session = null;
//			String cookieKey = usermodel.getCookieKey();
//			if (usermodel == null) {
//				throw new AuthenticationException("用户名或密码错误.");
//			}
			//不做验证码的验证。
	//		authenticateVerifyCode(authentication);
			String accountName = usermodel.getAccountName();
			String password = usermodel.getPassword();
			if (StringUtils.isEmpty(accountName) || StringUtils.isEmpty(password)) {
				throw new AuthenticationException("用户名或密码不能为空！");
			}
			
			T6110 t6110 = readAccountId(usermodel);
			if(t6110 == null){
				throw new AuthenticationException("用户名或密码不能为空！");
			}else{
				session = register(t6110);
			}
			return session;
		}catch(AuthenticationException e){
			logger.error("查询用户出错，用户名:{}",usermodel.getAccountName());
			throw e;
		} catch (SQLException e) {
			logger.error("查询用户出错",e);
			throw e;
		}
		
//		checkMaxErrorTimes(accountName);
//		userSessionService.getSession(cookieKey);
//		try {
//			ServiceSession serviceSession = ((ServiceProvider) resourceProvider
//					.getResource(ServiceProvider.class)).createServiceSession(this);
//			Throwable localThrowable2 = null;
//			try {
//				SystemDefine systemDefine = resourceProvider.getSystemDefine();
//				int accountId = systemDefine.readAccountId(serviceSession, accountName, password);
//				if (accountId > 0) {
//					register(accountId);
//				} else {
//					markError(accountName);
//				}
//				systemDefine.writeLog(request, response, serviceSession, authentication, accountId);
//				return accountId;
//			} catch (Throwable localThrowable1) {
//			} finally {
//				if (serviceSession != null)
//					if (localThrowable2 != null)
//						try {
//							serviceSession.close();
//						} catch (Throwable x2) {
//							localThrowable2.addSuppressed(x2);
//						}
//					else
//						serviceSession.close();
//			}
//		} catch (AuthenticationException e) {
//			markError(accountName);
//			throw e;
//		} catch (Throwable e) {
//			throw new AuthenticationException("鉴权失败.", e);
//		}
	}
	
	
	/**
	 * 更新该用户的信息，如最后登陆时间，session过期时间等。
	 * @param t6110
	 */
	private UserSession1030 register(T6110 t6110) {
		//TODO 记录用户IP地址
		//TODO 取得用户的session信息。
		UserSession1030 session = userSessionService.findByAccountId(t6110.getF01());
		if(session==null){
			session = userSessionService.insertSession(t6110.getF01());
		}else{
			session.setF02(UUID.randomUUID().toString());
			userSessionService.saveOrUpdate(session);
		}
		return session;
	}


	public T6110 readAccountId(UserModel usermodel)
			throws AuthenticationException, SQLException {
		int accountId = 0;
		T6110DAO t6110Dao = getDao();
		T6110 t6110 = t6110Dao.findUser(usermodel);
		if(t6110==null){
			throw new AuthenticationException("该用户不存在。");
		}
		String inputPassword = usermodel.getPassword();
		String password = t6110.getF03();
		accountId = t6110.getF01();
		if (!UnixCrypt.crypt(inputPassword,
				DigestUtils.sha256Hex(inputPassword)).equals(password)) {
			throw new AuthenticationException("用户名或密码错误.");
		}
		
		String status = (String)t6110.getF07();
		if ("SD".equals(status)) {
			throw new AuthenticationException("该帐号被锁定，禁止登录。");
		}
		if ("HMD".equals(status)) {
			throw new AuthenticationException("该账号被拉黑, 禁止登录。");
		}
		return t6110;
	}
	
	protected void checkMaxErrorTimes(String accountName) throws AuthenticationException {
//		int maxErrorTimes = MAX_TRY_LOGIN_TIME;
//		
//		if (maxErrorTimes <= 0)
//			return;
//		try {
//			Connection connection = getConnection();
//			Throwable localThrowable4 = null;
//			try {
//				PreparedStatement pstmt = connection
//						.prepareStatement("SELECT F03 FROM _1037 WHERE F01 = ? AND F02 = ?");
//				Throwable localThrowable5 = null;
//				try {
//					pstmt.setString(1, accountName);
//					pstmt.setString(2, this.ip);
//					ResultSet resultSet = pstmt.executeQuery();
//					Throwable localThrowable6 = null;
//					try {
//						if ((resultSet.next()) && (resultSet.getInt(1) >= maxErrorTimes))
//							throw new AuthenticationException("超过登录最大错误限制数,请明天再尝试");
//					} catch (Throwable localThrowable1) {
//					} finally {
//						if (resultSet != null)
//							if (localThrowable6 != null)
//								try {
//									resultSet.close();
//								} catch (Throwable x2) {
//									localThrowable6.addSuppressed(x2);
//								}
//							else
//								resultSet.close();
//					}
//				} catch (Throwable localThrowable2) {
//				} finally {
//					if (pstmt != null)
//						if (localThrowable5 != null)
//							try {
//								pstmt.close();
//							} catch (Throwable x2) {
//								localThrowable5.addSuppressed(x2);
//							}
//						else
//							pstmt.close();
//				}
//			} catch (Throwable localThrowable3) {
//			} finally {
//				if (connection != null)
//					if (localThrowable4 != null)
//						try {
//							connection.close();
//						} catch (Throwable x2) {
//							localThrowable4.addSuppressed(x2);
//						}
//					else
//						connection.close();
//			}
//		} catch (SQLException e) {
//			resourceProvider.log(e);
//		}
	}

	@Override
	public UserSession1030 checkin(UserModel usermodel, HttpServletRequest request) throws AuthenticationException,
			SQLException {
		try{
			UserSession1030 session = null;
//			String cookieKey = usermodel.getCookieKey();
//			if (usermodel == null) {
//				throw new AuthenticationException("用户名或密码错误.");
//			}
			//不做验证码的验证。
	//		authenticateVerifyCode(authentication);
			String captcha = usermodel.getVerifyCode();
			String kaptcha = (String) request.getSession().getAttribute(
					com.google.code.kaptcha.Constants.KAPTCHA_SESSION_KEY);
			if (!StringUtils.isEmpty(kaptcha)
					&& kaptcha.equalsIgnoreCase(captcha)) {

			} else {
				throw new AuthenticationException("验证码错误");
			}
			String accountName = usermodel.getAccountName();
			String password = usermodel.getPassword();
			if (StringUtils.isEmpty(accountName) || StringUtils.isEmpty(password)) {
				throw new AuthenticationException("用户名或密码不能为空！");
			}
			
			T6110 t6110 = readAccountId(usermodel);
			if(t6110 == null){
				throw new AuthenticationException("用户名或密码不能为空！");
			}else{
				session = register(t6110);
			}
			return session;
		}catch(AuthenticationException e){
			logger.error("查询用户出错，用户名:{}",usermodel.getAccountName());
			throw e;
		} catch (SQLException e) {
			logger.error("查询用户出错",e);
			throw e;
		}
	}
}
