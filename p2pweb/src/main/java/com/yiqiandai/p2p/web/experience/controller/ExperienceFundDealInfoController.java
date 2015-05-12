package com.yiqiandai.p2p.web.experience.controller;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yiqiandai.p2p.web.experience.model.ExperienceFundDealInfo;
import com.yiqiandai.p2p.web.experience.service.ExperienceFundDealInfoService;

@Controller
@RequestMapping("/exp/dealInfo")
public class ExperienceFundDealInfoController {
	@Resource
	ExperienceFundDealInfoService experienceFundDealInfoService;

	
	@RequestMapping(value = "/list.dhtml", method = GET)
	public String list(Model model, HttpServletRequest request, HttpSession session) {
		
		List<ExperienceFundDealInfo> list = experienceFundDealInfoService.dynamicQuery(null);
		model.addAttribute("list", list);
		return "/experience/experienceFundDealInfo/list";
	}
	
}
