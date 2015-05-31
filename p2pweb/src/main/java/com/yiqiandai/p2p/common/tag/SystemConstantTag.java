package com.yiqiandai.p2p.common.tag;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.ServletContext;
import javax.servlet.jsp.JspContext;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.SimpleTagSupport;

import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.yiqiandai.p2p.common.constant.inter.VariableBean;
import com.yiqiandai.p2p.web.config.model.T1010;
import com.yiqiandai.p2p.web.config.service.T1010Service;

@Service
public class SystemConstantTag extends SimpleTagSupport {
	Logger logger = LoggerFactory.getLogger(getClass());
	private String con;
	@Autowired
	T1010Service configService;
	@Override
	public void doTag() throws JspException, IOException {
		try {
			super.doTag();
			int posofLastPoint = con.lastIndexOf('.');
			String parameter = "";
			String clazzName = con.substring(0,posofLastPoint);
			String fieldName = con.substring(posofLastPoint+1);
//			Class SystemConstantClazz = Class.forName(clazzName);
//			Field filed = SystemConstantClazz.getDeclaredField(fieldName);
//			ServletContext servletContext = ((PageContext)this.getJspContext()).getServletContext();
//			WebApplicationContext webAppContext = WebApplicationContextUtils.getWebApplicationContext(servletContext, "org.springframework.web.servlet.FrameworkServlet.CONTEXT.p2p");
//			configService = webAppContext.getBean("t1010ServiceImpl", T1010Service.class);
//			VariableBean variableBean = (VariableBean)filed.get(SystemConstantClazz);
//			T1010 config = configService.findSystemConfig(variableBean.getKey());
//			parameter = config.getF02();
//			Pattern p = Pattern.compile("\\$\\{\\s*(\\w|\\.|-|_|\\$)+\\s*\\}", 2);
//			Matcher m = p.matcher(parameter);
//			while(m.find()){
//				String sys = m.group();
//				String s = sys.substring(2, sys.length()-1);
//				String sysparameter = configService.findSystemConfig(s).getF02();
//				parameter = parameter.replace(sys, sysparameter);
//			}
			getJspContext().getOut().write(parameter);
		} catch (Exception e) {
			logger.error("标签查询系统常量错误！",e);
		}
	}
	public String getCon() {
		return con;
	}
	public void setCon(String con) {
		this.con = con;
	}
}
