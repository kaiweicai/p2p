package com.yiqiandai.p2p.base.config.dao;

import com.yiqiandai.p2p.base.config.model.T1010;
import com.yiqiandai.p2p.base.dao.BaseDAO;

/**
 * 
 * @author zhongl
 *
 */
public interface T1010DAO extends BaseDAO<T1010>{

	T1010 findSystemConfig(String configKey);
	
}
