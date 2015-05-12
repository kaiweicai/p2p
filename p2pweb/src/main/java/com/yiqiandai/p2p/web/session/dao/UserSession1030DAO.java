package com.yiqiandai.p2p.web.session.dao;

import com.yiqiandai.p2p.base.dao.BaseDAO;
import com.yiqiandai.p2p.web.session.bo.UserSession1030;

/**
 * @comment DAO接口
 * @author Administrator
 * @date 2015-05-07 
 */
public interface UserSession1030DAO extends BaseDAO<UserSession1030>{

	UserSession1030 findByUserId(int userId);
	
}