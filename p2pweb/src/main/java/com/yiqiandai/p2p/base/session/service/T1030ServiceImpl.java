package com.yiqiandai.p2p.base.session.service;

import java.util.Date;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.yiqiandai.p2p.base.config.model.T1010;
import com.yiqiandai.p2p.base.config.service.T1010Service;
import com.yiqiandai.p2p.base.service.BaseServiceImpl;
import com.yiqiandai.p2p.base.session.dao.T1030DAO;
import com.yiqiandai.p2p.base.session.model.T1030;
import com.yiqiandai.p2p.base.session.model.T1033;
import com.yiqiandai.p2p.common.constant.SystemConstant;

/**
 * 
 * @author zhongl
 *
 */
@Service 
public class T1030ServiceImpl extends BaseServiceImpl<T1030> implements T1030Service{
	
	@Resource(name="t1010ServiceImpl")
	T1010Service systemConfigService;
	@Resource(name = "t1033ServiceImpl")
	T1033Service uerAgentService;
	
	public T1030DAO getDao() {
		return (T1030DAO)super.dao;
	}
	
	@Resource(name="t1030DAOImpl")
	public void setDao(T1030DAO dao) {
		super.dao = dao;
	}
	
	public T1030 saveAndQuerySessionFromCookie(String cookieId,String ip,String userAgent) {
		long creationTime = System.currentTimeMillis();
		long sessionMaxIdelTime = 0L;
		T1030 userSession = this.getDao().findByCookieId(cookieId);
		if(userSession == null){
			return null;
		}
		if (isAuthenticated(userSession)) {
			// 如果是验证通过了的用户动作，更新用户最后登陆时间
			T1010 systemConfig = systemConfigService
					.findSystemConfig(SystemConstant.SYSTEM_SESSION_IDEL_KEY);
			if (systemConfig == null || sessionMaxIdelTime <= 0) {
				sessionMaxIdelTime = SystemConstant.SESSION_MAX_IDLE_TIME;
			}
			userSession.setF05(new Date(creationTime + sessionMaxIdelTime));
			this.getDao().update(userSession);
		}else if (userSession.getF01() <= 0L) {//用户未曾登陆过系统则新增一条session记录
			userSession.setF02(cookieId);
			userSession.setF03(new Date(creationTime));
			userSession.setF04(null);
			userSession.setF05(new Date(creationTime + sessionMaxIdelTime));
			userSession.setF06(ip);
			userSession.setF07(null);
			int rowid = this.getDao().insert(userSession);
			userSession.setF01(rowid);
		}else if(userSession.getF01()>0L){
			T1033 clientAgent = new T1033();
			clientAgent.setF01(userSession.getF01());
			clientAgent.setF02(userAgent);
			uerAgentService.saveOrUpdate(clientAgent);
		}
		return userSession;
	}
	
	public boolean isAuthenticated(T1030 userSession) {
		int accountId = userSession.getF04();
		long expires = userSession.getF05().getTime();
		return ((accountId > 0) && (expires > System.currentTimeMillis()));
	}
}
