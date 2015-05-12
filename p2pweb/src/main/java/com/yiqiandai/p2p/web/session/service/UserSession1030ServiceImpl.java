package com.yiqiandai.p2p.web.session.service;

import java.util.Date;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yiqiandai.p2p.base.service.BaseServiceImpl;
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
}
