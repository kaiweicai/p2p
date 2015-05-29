package com.yiqiandai.p2p.web.user;

import static org.springframework.web.bind.annotation.RequestMethod.*;

import java.sql.SQLException;
import java.text.Bidi;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.DataBinder;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yiqiandai.p2p.base.controller.BaseController;
import com.yiqiandai.p2p.common.valid.UserValidator;
import com.yiqiandai.p2p.web.session.SessionConstant;
import com.yiqiandai.p2p.web.session.bo.UserSession1030;
import com.yiqiandai.p2p.web.user.exception.AuthenticationException;
import com.yiqiandai.p2p.web.user.service.T6110Service;

/**
 * @comment 用户登陆Action
 * @author cloudwei
 * @date 2015-05-07 
 */
@Controller
@RequestMapping("/user")
public class Login extends BaseController{
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
			@CookieValue(value=SessionConstant.COOKIE_KEY, defaultValue="") String cookieKey, 
			BindingResult result,HttpServletResponse response){
		if (result.hasErrors()) {
			return "/user/login";
		}
		String cookieValue = "";
		usermodel.setCookieKey(cookieKey);
		UserSession1030 session = null;
		try {
			session = userService.checkin(usermodel);
		} catch (AuthenticationException e) {
			result.addError(new ObjectError("usermodel", e.getMessage()));
			logger.warn("用户登陆错误!{}",usermodel);
		} catch (SQLException e) {
			logger.error("用户登陆SQL异常。",e);
		}
		if(session!=null){
			cookieValue = session.getF02();
		}
		Cookie cookie = new Cookie(SessionConstant.COOKIE_KEY,cookieValue);
		response.addCookie(cookie);
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