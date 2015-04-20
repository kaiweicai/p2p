package com.yiqiandai.p2p.base.session.dao;

import org.springframework.stereotype.Component;

import com.yiqiandai.p2p.base.config.model.T1010;
import com.yiqiandai.p2p.base.dao.BaseDAOImpl;
import com.yiqiandai.p2p.base.session.model.T1030;
import com.yiqiandai.p2p.common.annotation.BoName;

/**
 * 
 * @author zhongl
 *
 */
@Component
@BoName("T1030")
public class T1030DAOImpl extends BaseDAOImpl<T1030>  implements T1030DAO{

	@Override
	public T1030 findByCookieId(String cookieId) {
		T1030 cookieSession = getSqlSessionTemplate().selectOne(getStatement(), cookieId);
		return cookieSession;
	}
	
}