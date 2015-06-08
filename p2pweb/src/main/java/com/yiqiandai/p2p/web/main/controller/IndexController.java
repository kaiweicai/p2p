package com.yiqiandai.p2p.web.main.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.yiqiandai.p2p.base.controller.BaseController;
import com.yiqiandai.p2p.common.constant.WEBConstant;

@Controller
@RequestMapping("/")
public class IndexController extends BaseController{

	@RequestMapping(value = "index.dhtml", method = RequestMethod.GET)
	public ModelAndView index(HttpServletRequest request, HttpServletResponse response,ModelAndView model)
			throws Exception {
		model.addObject("pone400", WEBConstant.phone400);
		model.addObject("sdjweburl", WEBConstant.sdjweburl);
		model.addObject("sdjwxurl", WEBConstant.sdjwxurl);
		model.setViewName("/index");
		return model;
	}
}
