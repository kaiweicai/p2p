package com.yiqiandai.p2p.base.session.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yiqiandai.p2p.base.service.BaseServiceImpl;
import com.yiqiandai.p2p.base.session.dao.T1033DAO;
import com.yiqiandai.p2p.base.session.model.T1033;

/**
 * 
 * @author zhongl
 *
 */
@Service
public class T1033ServiceImpl extends BaseServiceImpl<T1033> implements T1033Service{
	public T1033DAO getDao() {
		return (T1033DAO)super.dao;
	}
	
	@Resource(name="t1033DAOImpl")
	public void setDao(T1033DAO dao) {
		super.dao = dao;
	}
}
