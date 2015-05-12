package com.yiqiandai.p2p.web.experience.controller;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yiqiandai.p2p.web.experience.model.ExperienceBid;
import com.yiqiandai.p2p.web.experience.service.ExperienceBidService;

@Controller
@RequestMapping("/expBid")
public class ExperienceBidController {
	@Resource
	ExperienceBidService experienceBidService;

	@RequestMapping(value = "/login.dhtml", method = GET)
	public String login(Model model, HttpServletRequest request, HttpSession session) {
		ExperienceBid bid = experienceBidService.findById(1);
		model.addAttribute("bid", bid);
		return "/activity/activityView";
	}
}
