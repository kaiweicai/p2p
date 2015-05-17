package com.yiqiandai.p2p.web.user;

public class UserModel {
	private String accountName;
	private String password;
	private String verifyCode;

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
	
	@Override
	public String toString() {
		return "UserModel [accountName=" + accountName + ", password=" + password + ", verifyCode=" + verifyCode + "]";
	}
}
