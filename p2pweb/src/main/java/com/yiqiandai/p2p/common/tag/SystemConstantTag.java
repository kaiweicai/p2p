package com.yiqiandai.p2p.common.tag;

import java.io.IOException;
import java.lang.reflect.Field;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.yiqiandai.p2p.common.constant.SystemConstant;

public class SystemConstantTag extends SimpleTagSupport {
	Logger logger = LoggerFactory.getLogger(getClass());
	private String systemConstant;
	@Override
	public void doTag() throws JspException, IOException {
		try {
			int posofLastPoint = systemConstant.lastIndexOf('.');
			String clazzName = systemConstant.substring(0,posofLastPoint);
			String fieldName = systemConstant.substring(posofLastPoint+1);
			
			super.doTag();
			Class SystemConstantClazz = Class.forName(clazzName);
			Field filed = SystemConstantClazz.getDeclaredField(fieldName);
			getJspContext().getOut().write((String)filed.get(SystemConstantClazz));
			
		} catch (Exception e) {
			logger.error("标签查询系统常量错误！",e);
		}
		
	}
	
	
	public String getSystemConstant() {
		return systemConstant;
	}
	public void setSystemConstant(String systemConstant) {
		this.systemConstant = systemConstant;
	}
}
