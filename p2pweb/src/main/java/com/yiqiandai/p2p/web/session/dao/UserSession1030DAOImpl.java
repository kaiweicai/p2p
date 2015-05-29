package com.yiqiandai.p2p.web.session.dao;

import org.springframework.stereotype.Repository;

import com.yiqiandai.p2p.base.dao.BaseDAOImpl;
import com.yiqiandai.p2p.common.annotation.BoName;
import com.yiqiandai.p2p.web.session.bo.UserSession1030;

/**
 * @comment Service实现类
 * @author cloud.wei
 * @date 2015-05-07 
 */
@Repository
@BoName("UserSession1030")
public class UserSession1030DAOImpl extends BaseDAOImpl<UserSession1030> implements UserSession1030DAO{

	@Override
	public UserSession1030 findByUserId(int userId) {
		return this.getSqlSessionTemplate().selectOne(getStatement(), userId);
	}

	@Override
	public UserSession1030 findByUserId(Integer accountId) {
		return getSqlSessionTemplate().selectOne(getStatement(),accountId);
	}
}
