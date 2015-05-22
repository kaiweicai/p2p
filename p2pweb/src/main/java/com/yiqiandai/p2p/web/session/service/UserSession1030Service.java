package com.yiqiandai.p2p.web.session.service;

import com.yiqiandai.p2p.base.service.BaseService;
import com.yiqiandai.p2p.web.session.bo.UserSession1030;

/**
 * @comment Service接口
 * @author Administrator
 * @date 2015-05-07 
 */
public interface UserSession1030Service extends BaseService<UserSession1030>{
	public void updateRegister(int accountId);

	public void getSession(String cookieKey);
}