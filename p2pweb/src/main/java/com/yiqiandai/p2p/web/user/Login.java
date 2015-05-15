package com.yiqiandai.p2p.web.user;

import static org.springframework.web.bind.annotation.RequestMethod.*;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yiqiandai.p2p.base.controller.BaseController;

/**
 * @comment 用户登陆Action
 * @author cloudwei
 * @date 2015-05-07 
 */
@Controller
@RequestMapping("/user")
public class Login extends BaseController{
	@RequestMapping(value="/loginview.dhtml",method=GET)
	public String loginDisplay(Model model){
		return "/user/login";
	}
	
	@RequestMapping(value="/login.dhtml",method={GET,POST})
	public String login(@ModelAttribute("usermodel") UserModel usermodel){
		logger.debug(usermodel.toString());
//		model.addAttribute("accountName", accountName);
		return "/user/login";
	}
	
	@RequestMapping(value="/loginheader.dhtml",method=GET)
	public String loginHeader(){
		return "/user/loginHeader";
	}
}