package com.yiqiandai.p2p.experience.model;

import com.yiqiandai.p2p.base.model.BaseObject;

public class ExperienceFund extends AbstractExperienceFund implements BaseObject {

	private static final long serialVersionUID = -5255365845330865260L;

	/**
	 * 资金账户
	 */
	private String fundAccount;
	
	/**
	 * 资金账户类型
	 */
	private String fundAccountType;
	/**
	 * 用户名
	 */
	private String userName;
	/**
	 * 用户类型
	 */
	private String userType;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	public String getFundAccount() {
		return fundAccount;
	}
	public void setFundAccount(String fundAccount) {
		this.fundAccount = fundAccount;
	}
	public String getFundAccountType() {
		return fundAccountType;
	}
	public void setFundAccountType(String fundAccountType) {
		this.fundAccountType = fundAccountType;
	}
	
	
}
