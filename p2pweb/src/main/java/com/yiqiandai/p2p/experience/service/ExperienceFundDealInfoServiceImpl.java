package com.yiqiandai.p2p.experience.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yiqiandai.p2p.base.service.BaseServiceImpl;
import com.yiqiandai.p2p.experience.dao.ExperienceFundDealInfoDAO;
import com.yiqiandai.p2p.experience.model.ExperienceFundDealInfo;

/**
 * 
 * @author zhongl
 *
 */
@Service 
public class ExperienceFundDealInfoServiceImpl extends BaseServiceImpl<ExperienceFundDealInfo> implements ExperienceFundDealInfoService{
	public ExperienceFundDealInfoDAO getDao() {
		return (ExperienceFundDealInfoDAO)super.dao;
	}
	
	@Resource(name="experienceFundDealInfoDAOImpl")
	public void setDao(ExperienceFundDealInfoDAO dao) {
		super.dao = dao;
	}

	@Override
	public int queryFundAcctIdByAcct(String acct) {
		return 0;
		
	}
}
