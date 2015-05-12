package com.yiqiandai.p2p.web.experience.model;

import java.util.Date;

/**
 * 体验金
 * 
 * @author Administrator
 *
 */

public class AbstractExperienceFund implements java.io.Serializable {
	protected static final long serialVersionUID = 1L;

	/**
	 * 主键ID
	 */
	protected Integer id;
	/**
	 * 资金账户
	 */
	protected int fundAcctId;
	/**
	 * 帐号
	 */
	protected String number;
	/**
	 * 账户类型
	 */
	protected int type;
	/**
	 * 余额
	 */
	protected Double balance;
	/**
	 * 创建时间
	 */
	protected Date createTime;
	/**
	 * 最后更新时间
	 */
	protected Date lastUpdateTime;
	/**
	 * 状态
	 */
	protected int status;
	/**
	 * 生效时间
	 */
	protected Date startTime;
	/**
	 * 失效时间
	 */
	protected Date endTime;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	
	public Double getBalance() {
		return balance;
	}
	public void setBalance(Double balance) {
		this.balance = balance;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getLastUpdateTime() {
		return lastUpdateTime;
	}
	public void setLastUpdateTime(Date lastUpdateTime) {
		this.lastUpdateTime = lastUpdateTime;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public Date getStartTime() {
		return startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	public Date getEndTime() {
		return endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	public int getFundAcctId() {
		return fundAcctId;
	}
	public void setFundAcctId(int fundAcctId) {
		this.fundAcctId = fundAcctId;
	}

}
