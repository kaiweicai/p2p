package com.yiqiandai.p2p.web.user;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @comment 用户登陆Action
 * @author cloudwei
 * @date 2015-05-07 
 */
@Controller
@RequestMapping("/user")
public class Login {
	@RequestMapping(value="/loginview.dhtml",method=GET)
	public String loginDisplay(Model model){
		return "/user/login";
	}
	
	@RequestMapping(value="/loginheader.dhtml",method=GET)
	public String loginHeader(){
		return "/user/loginHeader";
	}
}