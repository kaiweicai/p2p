package com.yiqiandai.p2p.experience.controller;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yiqiandai.p2p.experience.model.ExperienceFund;
import com.yiqiandai.p2p.experience.model.ExperienceFundDealInfo;
import com.yiqiandai.p2p.experience.service.ExperienceFundDealInfoService;
import com.yiqiandai.p2p.experience.service.ExperienceFundService;

/**
 * 体验金线下充值管理
 * @author zhongl
 *
 */
@Controller
@RequestMapping("/expRecharge")
public class ExperienceFundRechargeController {
	@Resource
	ExperienceFundService experienceFundService;
	@Resource
	ExperienceFundDealInfoService experienceFundDealInfoService;
	
	/**
	 * 体验金对象
	 */
	private ExperienceFund experienceFund = new ExperienceFund();
	
	private ExperienceFundDealInfo experienceFundDealInfo;
	/**
	 * 用户名
	 */
	private String acct;
	
	/**
	 * list
	 * @auther zhongl
	 * @date 2014年12月29日 下午4:49:11
	 * @param model
	 * @param request
	 * @param session 
	 * @return
	 */
	@RequestMapping(value = "/list.dhtml", method = GET)
	public String list(Model model, HttpServletRequest request, HttpSession session) {
		
		return "/experience/experienceFundRecharge/list";
	}
	
	/**
	 * search
	 * @auther zhongl
	 * @date 2014年12月30日 下午9:29:55
	 * @param model
	 * @param request
	 * @param session
	 * @return
	 */
	@RequestMapping(value = "/search.dhtml", method = GET)
	public String search(Model model, HttpServletRequest request, HttpSession session) {
		
		return "/experience/experienceFundRecharge/search";
	}
	
	/**
	 * 线下充值体验金
	 * 
	 * @auther zhongl
	 * @date 2014年12月31日 下午3:55:54
	 * @param model
	 * @param request
	 * @param session
	 * @return
	 */
	@RequestMapping(value = "/rechargeOfLine.dhtml", method = GET)
	public String rechargeOfLine(Model model, HttpServletRequest request, HttpSession session) {
		
		return "/experience/experienceFundRecharge/recharge";
	}
	
	/**
	 * 添加
	 * @auther zhongl
	 * @date 2014年12月31日 下午4:15:06
	 * @param model
	 * @param request
	 * @param session
	 * @return
	 */
	@RequestMapping(value = "/add.dhtml", method = GET )
	public String add(Model model, HttpServletRequest request, HttpSession session) {
		
		System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
		String acct = request.getParameter("acct");
		//根据用户名取得用户对应的往来资金账户id
		
		int experienceGoldId = experienceFundDealInfoService.queryFundAcctIdByAcct(acct);
		//插入充值记录到体验金交易记录表
		experienceFundDealInfo.setExperienceGoldId(experienceGoldId);
		
		
		//修改体验金表体验金余额
		System.out.println(acct);
		
		System.out.println(acct);
		return null;
	}


	
	
	/**************************************************************************************/
	
	
	public ExperienceFund getExperienceFund() {
		return experienceFund;
	}

	public void setExperienceFund(ExperienceFund experienceFund) {
		this.experienceFund = experienceFund;
	}

	public String getAcct() {
		return acct;
	}

	public void setAcct(String acct) {
		this.acct = acct;
	}

	public ExperienceFundDealInfo getExperienceFundDealInfo() {
		return experienceFundDealInfo;
	}

	public void setExperienceFundDealInfo(
			ExperienceFundDealInfo experienceFundDealInfo) {
		this.experienceFundDealInfo = experienceFundDealInfo;
	}
	
}
