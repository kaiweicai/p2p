package com.yiqiandai.p2p.base.interceptor;

import java.lang.reflect.Method;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.yiqiandai.p2p.common.annotation.Token;


public class TokenInterceptor extends HandlerInterceptorAdapter {
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		if (handler instanceof HandlerMethod) {
			//得到controller.
			HandlerMethod handlerMethod = (HandlerMethod) handler;
			//得到controller的对应的方法
			Method method=handlerMethod.getMethod();
			Token tokenAnnotation = method.getAnnotation(Token.class);
			if(tokenAnnotation!=null){
				boolean needSave = tokenAnnotation.save();
				if(needSave){//创建一个UUID存储到session中.
					String token = UUID.randomUUID().toString();
					request.getSession().setAttribute("token", token);
				}
				boolean needRemove = tokenAnnotation.remove();
				if(needRemove){//查看session中是否存在该session,防止重复提交
					//开始检查是否是重复提交
					if(isRepeatSubmit(request)){
						return false;
					}else{//如果不是重复提交则移除session中的uuid.
						request.getSession(false).removeAttribute("token");
					}
				}
			}
			return true;
		}
		else
			return super.preHandle(request, response, handler);
	}

	/**
	 * 判断用户是否是重复提交
	 * 
	 * @param request
	 * @return
	 */
	private boolean isRepeatSubmit(HttpServletRequest request) {
		boolean result = false;
		String token =(String) request.getSession().getAttribute("token");
		if(StringUtils.isBlank(token)){
			result = true;
		}else{
			String clientToken = request.getParameter("token");
			if(!token.equals(clientToken)){
				result = true;
			}
		}
		return result;
	}
}
