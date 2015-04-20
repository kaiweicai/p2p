package com.yiqiandai.p2p.base.config.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yiqiandai.p2p.base.config.dao.T1010DAO;
import com.yiqiandai.p2p.base.config.model.T1010;
import com.yiqiandai.p2p.base.service.BaseServiceImpl;

/**
 * 
 * @author zhongl
 *
 */
@Service
public class T1010ServiceImpl extends BaseServiceImpl<T1010> implements T1010Service{
	
	public T1010DAO getDao() {
		return (T1010DAO)super.dao;
	}
	
	@Resource(name="t1010DAOImpl")
	public void setDao(T1010DAO dao) {
		super.dao = dao;
	}
	
	public T1010 findSystemConfig(String configKey){
		T1010 systemConfig = this.getDao().findSystemConfig(configKey);
		return systemConfig;
	}
}
