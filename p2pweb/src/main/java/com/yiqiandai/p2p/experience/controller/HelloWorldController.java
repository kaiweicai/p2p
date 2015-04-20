package com.yiqiandai.p2p.experience.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.yiqiandai.p2p.base.session.model.T1030;
import com.yiqiandai.p2p.base.session.service.T1030Service;


public class HelloWorldController implements Controller {

	@Resource
	T1030Service sessionService;
	
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		Logger logger = LoggerFactory.getLogger(HelloWorldController.class);
		logger.info("start loging.............................................");
		// 1、收集参数、验证参数
		// 2、绑定参数到命令对象
		// 3、将命令对象传入业务对象进行业务处理
		// 4、选择下一个页面
		ModelAndView mv = new ModelAndView();
		T1030 session = sessionService.saveAndQuerySessionFromCookie("04923568-bd56-4960-9434-5c27f0c7f4f2", "192.168.0.1", "come from test");
		
		logger.info("session is "+session);
		// 添加模型数据 可以是任意的POJO对象
		mv.addObject("message", "亿钱贷首页test!!!");
		// 设置逻辑视图名，视图解析器会根据该名字解析到具体的视图页面
		mv.setViewName("hello");
		return mv;
	}
}
