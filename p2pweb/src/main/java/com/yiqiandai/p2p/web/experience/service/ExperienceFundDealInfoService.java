package com.yiqiandai.p2p.web.experience.service;

import com.yiqiandai.p2p.base.service.BaseService;
import com.yiqiandai.p2p.web.experience.model.ExperienceFundDealInfo;

/**
 * 
 * @author zhongl
 *
 */
public interface ExperienceFundDealInfoService extends BaseService<ExperienceFundDealInfo> {

	/**
	 * 根据用户名查用户往来账户id
	 * 
	 * @auther zhongl
	 * @date 2014年12月31日 下午6:05:10
	 * @param acct
	 */
	int queryFundAcctIdByAcct(String acct);
	
}
