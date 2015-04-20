package com.yiqiandai.p2p.base.config.dao;

import org.springframework.stereotype.Component;

import com.yiqiandai.p2p.base.config.model.T1010;
import com.yiqiandai.p2p.base.dao.BaseDAOImpl;
import com.yiqiandai.p2p.common.annotation.BoName;

/**
 * 
 * @author zhongl
 *
 */
@Component
@BoName("T1010")
public class T1010DAOImpl extends BaseDAOImpl<T1010>  implements T1010DAO{

	@Override
	public T1010 findSystemConfig(String configKey) {
		T1010 systemConfig = getSqlSessionTemplate().selectOne(getStatement(), configKey);
		return systemConfig;
	}
	
}