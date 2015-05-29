package com.yiqiandai.p2p.web.user.dao;

import com.yiqiandai.p2p.base.dao.BaseDAO;
import com.yiqiandai.p2p.web.user.UserModel;
import com.yiqiandai.p2p.web.user.bo.T6110;

/**
 * @comment DAO接口
 * @author Administrator
 * @date 2015-05-22 
 */
public interface T6110DAO extends BaseDAO<T6110>{

	T6110 findUser(UserModel user);
	
}