package com.yiqiandai.p2p.web.experience.controller;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yiqiandai.p2p.web.experience.model.ExperienceFund;
import com.yiqiandai.p2p.web.experience.service.ExperienceFundService;
/**
 * 体验金管理
 * @author zhongl
 *
 */
@Controller
@RequestMapping("/exp")
public class ExperienceFundController {
	//@Resource
	//T1030Service t1030Service;
	@Resource
	ExperienceFundService experienceFundService;

	/**
	 * 体验金对象
	 */
	private ExperienceFund experienceFund = new ExperienceFund();
	
	@RequestMapping(value = "/login.dhtml", method = GET)
	public String login(Model model, HttpServletRequest request, HttpSession session) {
		//T1030 fund = t1030Service.findById(1);
		//model.addAttribute("fund", fund);
		return "/experience/example";
	}
	
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
		List<ExperienceFund> list = experienceFundService.dynamicQuery(null);
		model.addAttribute("list", list);
		return "/experience/experienceFund/list";
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
		List<ExperienceFund> list = experienceFundService.dynamicQuery(null);
		model.addAttribute("list", list);
		return "/experience/experienceFund/search";
	}

	
	
	/**************************************************************************************/
	
	
	public ExperienceFund getExperienceFund() {
		return experienceFund;
	}

	public void setExperienceFund(ExperienceFund experienceFund) {
		this.experienceFund = experienceFund;
	}
	
}
