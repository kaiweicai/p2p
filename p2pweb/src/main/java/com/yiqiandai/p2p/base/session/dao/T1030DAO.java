package com.yiqiandai.p2p.base.session.dao;

import com.yiqiandai.p2p.base.dao.BaseDAO;
import com.yiqiandai.p2p.base.session.model.T1030;

/**
 * 
 * @author zhongl
 *
 */
public interface T1030DAO extends BaseDAO<T1030>{
	public T1030 findByCookieId(String cookieId);
}
