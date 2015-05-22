package com.yiqiandai.p2p.web.user;

public class UserModel {
	/**
	 * 用户名
	 */
	protected String accountName;
	
	/**
	 * 用户密码
	 */
	protected String password;
	
	/**
	 * 用户验证码
	 */
	protected String verifyCode;
	
	/**
	 * 验证码类型
	 */
	protected String verifyCodeType;
	
	/**
	 * cookie key
	 * @return
	 */
	protected String cookieKey;
	
	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getVerifyCode() {
		return verifyCode;
	}

	public void setVerifyCode(String verifyCode) {
		this.verifyCode = verifyCode;
	}
	
	public String getCookieKey() {
		return cookieKey;
	}

	public void setCookieKey(String cookieKey) {
		this.cookieKey = cookieKey;
	}

	@Override
	public String toString() {
		return "UserModel [accountName=" + accountName + ", password=" + password + ", verifyCode=" + verifyCode + "]";
	}
}
