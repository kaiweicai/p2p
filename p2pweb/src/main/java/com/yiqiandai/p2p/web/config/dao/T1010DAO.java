package com.yiqiandai.p2p.web.config.dao;

import com.yiqiandai.p2p.base.dao.BaseDAO;
import com.yiqiandai.p2p.web.config.model.T1010;

/**
 * 
 * @author zhongl
 *
 */
public interface T1010DAO extends BaseDAO<T1010>{

	T1010 findSystemConfig(String configKey);
	
}
