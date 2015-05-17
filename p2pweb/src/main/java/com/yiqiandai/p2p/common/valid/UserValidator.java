package com.yiqiandai.p2p.common.valid;

import org.apache.commons.lang.StringUtils;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.yiqiandai.p2p.web.user.UserModel;

public class UserValidator implements Validator{

	@Override
	public boolean supports(Class<?> clazz) {
		return UserModel.class.equals(clazz);
	}

	@Override
	public void validate(Object obj, Errors errors) {
		ValidationUtils.rejectIfEmpty(errors, "accountName", null, "用户名为空");
		UserModel user = (UserModel) obj;
		String password = user.getPassword();
		if (StringUtils.isBlank(password)){
			errors.rejectValue("password", null, "密码为空");
		}
	}
}
