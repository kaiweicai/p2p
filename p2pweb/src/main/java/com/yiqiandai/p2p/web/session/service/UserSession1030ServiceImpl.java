package com.yiqiandai.p2p.web.session.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.Date;
import java.util.UUID;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;






import com.yiqiandai.p2p.base.service.BaseServiceImpl;
import com.yiqiandai.p2p.web.session.SessionConstant;
import com.yiqiandai.p2p.web.session.bo.Session;
import com.yiqiandai.p2p.web.session.bo.UserSession1030;
import com.yiqiandai.p2p.web.session.dao.UserSession1030DAO;

/**
 * @comment Service实现类
 * @author Administrator
 * @date 2015-05-07 
 */
@Service 
public class UserSession1030ServiceImpl extends BaseServiceImpl<UserSession1030> implements UserSession1030Service{
	@Override
	public void updateRegister(int accountId) {
		UserSession1030 userSession = this.getDao().findByUserId(accountId);
		userSession.setF05(new Date(System.currentTimeMillis()+this
				.getMaxIdleTime()));
		this.getDao().update(userSession);
	}
	
	public UserSession1030DAO getDao() {
		return (UserSession1030DAO)super.dao;
	}
	
	@Resource(name="userSession1030DAOImpl")
	public void setDao(UserSession1030DAO dao) {
		super.dao = dao;
	}
	
	private long getMaxIdleTime(){
		return 5*60*1000;
	}

	@Override
	public void getSession(String cookieKey) {
		
	}

	@Override
	public UserSession1030 findByAccountId(Integer accountId) {
		return getDao().findByUserId(accountId);
	}

	@Override
	public UserSession1030 insertSession(Integer f01) {
		String cookieKey = UUID.randomUUID().toString();
		long creationTime = new Date().getTime();
		UserSession1030 userSession = new UserSession1030();
		userSession.setF02(cookieKey);
		userSession.setF03(new Timestamp(creationTime));
		userSession.setF04(f01);
		userSession.setF05(new Timestamp(creationTime
				+ getMaxIdleTime()));
		userSession.setF06("127.0.0.1");
		userSession.setF07("userAgentDigest");
		getDao().insert(userSession);
		return userSession;
	}

//	@Override
//	public void getSession(String cookieKey) {
//		String tokenName = SessionConstant.COOKIE_KEY;
//		if (StringUtils.isBlank(cookieKey)) {
//			cookieKey = newToken();
//		}
//		Cookie token = new Cookie(tokenName, cookieKey);
//		//更新cookie信息
//		token.setHttpOnly(true);
//		token.setSecure(false);
//		token.setMaxAge(-1);
//		token.setPath("/");
//
//		Session session = newSession(token, request, response);
//		return session;
//	}
//	
//	public SQLStoreSession(Cookie cookie, HttpServletRequest request, HttpServletResponse response) {
////		super(cookie, request, response);
//		loginSessionManager.super(cookie, request, response);
//		try {
//			Connection connection = LoginSessionManager.this.getConnection();
//			Throwable localThrowable8 = null;
//			try {
//				PreparedStatement pstmt = connection
//						.prepareStatement("SELECT F01, F04, F05, F06, F07 FROM _1030 WHERE F02 = ?");
//				Throwable localThrowable9 = null;
//				Throwable localThrowable10;
//				try {
//					pstmt.setString(1, cookie.getValue());
//					ResultSet resultSet = pstmt.executeQuery();
//					localThrowable10 = null;
//					try {
//						if (resultSet.next()) {
//							this.id = resultSet.getLong(1);
//							this.accountId = resultSet.getInt(2);
//							this.expires = resultSet.getTimestamp(3).getTime();
//						}
//					} catch (Throwable localThrowable1) {
//					} finally {
//						if (resultSet != null)
//							if (localThrowable10 != null)
//								try {
//									resultSet.close();
//								} catch (Throwable x2) {
//									localThrowable10.addSuppressed(x2);
//								}
//							else
//								resultSet.close();
//					}
//				} catch (Throwable localThrowable2) {
//				} finally {
//					if (pstmt != null)
//						if (localThrowable9 != null)
//							try {
//								pstmt.close();
//							} catch (Throwable x2) {
//								localThrowable9.addSuppressed(x2);
//							}
//						else
//							pstmt.close();
//				}
//				if (isAuthenticated()) {
//					PreparedStatement pstmt1 = connection.prepareStatement("UPDATE _1030 SET F05 = ? WHERE F01 = ?");
//					localThrowable9 = null;
//					try {
//						pstmt1.setTimestamp(1,
//								new Timestamp(this.creationTime + getMaxIdleTime()));
//
//						pstmt1.setLong(2, this.id);
//						pstmt1.executeUpdate();
//					} catch (Throwable localThrowable3) {
//					} finally {
//						if (pstmt1 != null)
//							if (localThrowable9 != null)
//								try {
//									pstmt1.close();
//								} catch (Throwable x2) {
//									localThrowable9.addSuppressed(x2);
//								}
//							else
//								pstmt1.close();
//					}
//				} else if (this.id <= 0L) {
//					PreparedStatement preparedStatement = connection
//							.prepareStatement(
//									"INSERT INTO _1030 SET F02 = ?, F03 = ?, F04 = ?, F05 = ?, F06 = ?, F07 = ? ON DUPLICATE KEY UPDATE F03 = VALUES(F03), F04 = VALUES(F04), F05 = VALUES(F05), F06 = VALUES(F06), F07 = VALUES(F07)",
//									1);
//					localThrowable9 = null;
//					try {
//						preparedStatement.setString(1, cookie.getValue());
//						preparedStatement.setTimestamp(2, new Timestamp(this.creationTime));
//
//						preparedStatement.setNull(3, 4);
//						preparedStatement.setTimestamp(4, new Timestamp(this.creationTime
//								+ getMaxIdleTime()));
//
//						preparedStatement.setString(5, this.ip);
//						preparedStatement.setString(6, this.userAgentDigest);
//						preparedStatement.execute();
//						ResultSet resultSet = preparedStatement.getGeneratedKeys();
//						localThrowable10 = null;
//						try {
//							if (resultSet.next())
//								this.id = resultSet.getLong(1);
//						} catch (Throwable localThrowable4) {
//						} finally {
//							if (resultSet != null)
//								if (localThrowable10 != null)
//									try {
//										resultSet.close();
//									} catch (Throwable x2) {
//										localThrowable10.addSuppressed(x2);
//									}
//								else
//									resultSet.close();
//						}
//					} catch (Throwable localThrowable5) {
//					} finally {
//						if (preparedStatement != null)
//							if (localThrowable9 != null)
//								try {
//									preparedStatement.close();
//								} catch (Throwable x2) {
//									localThrowable9.addSuppressed(x2);
//								}
//							else
//								preparedStatement.close();
//					}
//					if (this.id > 0L) {
//						PreparedStatement preparedStatement2 = connection
//								.prepareStatement("INSERT INTO _1033 SET F01 = ?, F02 = ? ON DUPLICATE KEY UPDATE F02 = VALUES(F02)");
//						localThrowable9 = null;
//						try {
//							preparedStatement2.setLong(1, this.id);
//							preparedStatement2.setString(2, this.userAgent);
//							preparedStatement2.execute();
//						} catch (Throwable localThrowable6) {
//						} finally {
//							if (preparedStatement != null)
//								if (localThrowable9 != null)
//									try {
//										preparedStatement2.close();
//									} catch (Throwable x2) {
//										localThrowable9.addSuppressed(x2);
//									}
//								else
//									preparedStatement2.close();
//						}
//					}
//				}
//			} catch (Throwable localThrowable7) {
//			} finally {
//				if (connection != null)
//					if (localThrowable8 != null)
//						try {
//							connection.close();
//						} catch (Throwable x2) {
//							localThrowable8.addSuppressed(x2);
//						}
//					else
//						connection.close();
//			}
//		} catch (Throwable throwable) {
//			resourceProvider.log(throwable);
//		}
//	}
//	
//	protected String newToken() {
//		return UUID.randomUUID().toString();
//	}
}
