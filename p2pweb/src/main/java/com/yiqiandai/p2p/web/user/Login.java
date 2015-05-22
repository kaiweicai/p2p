package com.yiqiandai.p2p.web.user;

import static org.springframework.web.bind.annotation.RequestMethod.*;

import java.text.Bidi;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.DataBinder;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yiqiandai.p2p.base.controller.BaseController;
import com.yiqiandai.p2p.common.valid.UserValidator;
import com.yiqiandai.p2p.web.user.service.T6110Service;

/**
 * @comment 用户登陆Action
 * @author cloudwei
 * @date 2015-05-07 
 */
@Controller
@RequestMapping("/user")
public class Login extends BaseController{
	public static final String COOKIE_KEY = "136a3d03-9748-4f83-a54f-9b2a93f979a0";
	@Resource
	private T6110Service userService;
	@InitBinder
	public void initBider(DataBinder binder){
		binder.setValidator(new UserValidator());
	}
	
	@RequestMapping(value="/loginview.dhtml",method=GET)
	public String loginDisplay(Model model){
		return "/user/login";
	}
	
	@RequestMapping(value="/login.dhtml",method={POST})
	public String login(@ModelAttribute("usermodel") @Validated UserModel usermodel,
			@CookieValue(value=COOKIE_KEY, defaultValue="") String cookieKey, 
			BindingResult result) {
		if (result.hasErrors()) {
			return "/user/login";
		}
		usermodel.setCookieKey(cookieKey);
		userService.checkin(usermodel);
		// model.addAttribute("accountName", accountName);
		return "/user/login";
	}
	
	@RequestMapping(value="/loginboot.dhtml",method=GET)
	public String loginBoot(){
		return "/user/loginboot";
	}
	
	@RequestMapping(value="/loginheader.dhtml",method=GET)
	public String loginHeader(){
		return "/user/loginHeader";
	}
}