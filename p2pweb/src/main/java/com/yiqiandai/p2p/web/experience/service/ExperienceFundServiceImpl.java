package com.yiqiandai.p2p.web.experience.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yiqiandai.p2p.base.service.BaseServiceImpl;
import com.yiqiandai.p2p.web.experience.dao.ExperienceFundDAO;
import com.yiqiandai.p2p.web.experience.model.ExperienceFund;

/**
 * 
 */
@Service 
public class ExperienceFundServiceImpl extends BaseServiceImpl<ExperienceFund> implements ExperienceFundService{
	public ExperienceFundDAO getDao() {
		// TODO Auto-generated method stub
		return (ExperienceFundDAO)super.dao;
	}
	
	@Resource(name="experienceFundDAOImpl")
	public void setDao(ExperienceFundDAO dao) {
		super.dao = dao;
	}
}
