package com.yiqiandai.p2p.web.user.dao;

import com.yiqiandai.p2p.common.annotation.BoName;
import com.yiqiandai.p2p.base.dao.BaseDAOImpl;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.yiqiandai.p2p.web.user.UserModel;
import com.yiqiandai.p2p.web.user.bo.T6110;

/**
 * @comment Service实现类
 * @author Administrator
 * @date 2015-05-22 
 */
@Repository
@BoName("T6110")
@Component
public class T6110DAOImpl extends BaseDAOImpl<T6110> implements T6110DAO{


	@Override
	public T6110 findUser(UserModel user) {
		return getSqlSessionTemplate().selectOne(getStatement(), user);
	}
	
	
}
