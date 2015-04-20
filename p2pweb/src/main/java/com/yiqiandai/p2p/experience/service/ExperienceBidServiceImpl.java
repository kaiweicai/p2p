package com.yiqiandai.p2p.experience.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yiqiandai.p2p.base.service.BaseServiceImpl;
import com.yiqiandai.p2p.experience.dao.ExperienceBidDAO;
import com.yiqiandai.p2p.experience.model.ExperienceBid;

@Service 
public class ExperienceBidServiceImpl extends BaseServiceImpl<ExperienceBid> implements ExperienceBidService{
	public ExperienceBidDAO getDao() {
		// TODO Auto-generated method stub
		return (ExperienceBidDAO)super.dao;
	}
	
	@Resource(name="experienceBidDAOImpl")
	public void setDao(ExperienceBidDAO dao) {
		super.dao = dao;
	}
}
