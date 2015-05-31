package com.yiqiandai.p2p.web.user.service;

import java.sql.SQLException;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

import com.yiqiandai.p2p.base.service.BaseService;
import com.yiqiandai.p2p.web.session.bo.UserSession1030;
import com.yiqiandai.p2p.web.user.UserModel;
import com.yiqiandai.p2p.web.user.bo.T6110;
import com.yiqiandai.p2p.web.user.exception.AuthenticationException;

/**
 * @comment Service接口
 * @author Administrator
 * @date 2015-05-22 
 */
public interface T6110Service extends BaseService<T6110>{
	/**
	 * 检查用户表中是否存在该用户。
	 * @param usermodel
	 * @return 
	 * @throws Exception 
	 */
	UserSession1030 checkin(UserModel usermodel) throws AuthenticationException, SQLException;

	UserSession1030 checkin(UserModel usermodel, HttpServletRequest request)throws AuthenticationException, SQLException;
}