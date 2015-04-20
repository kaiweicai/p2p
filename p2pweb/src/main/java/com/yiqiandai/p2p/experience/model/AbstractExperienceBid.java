package com.yiqiandai.p2p.experience.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class AbstractExperienceBid  implements java.io.Serializable {
	
	/**
	 * 
	 */
	protected static final long serialVersionUID = 1L;

	/** 
     * 体验宝自增主键ID
     */
    protected Integer id;

    /** 
     * 体验宝创建人ID
     */
    protected Integer borrowId;
   
    /** 
     * 体验宝期数,标题
     */
    protected String periods;

    /** 
     * 体验总额
     */
    protected BigDecimal amount = BigDecimal.ZERO;
    
    /** 
     * 年利率
     */
    protected BigDecimal rate = BigDecimal.ZERO;

    /** 
     * 体验宝周期，期限,单位：天
     */
    protected Integer term;

    /** 
     * 筹款期限，单位：天
     */
    protected Integer raiseTerm;

    /** 
     * 还息方式,DQHX:到期还息；MYFX:每月付息；
     */
    protected String repayWay;

    /** 
     * 是否有担保，S:是；F:否
     */
    protected String guarantee;

    /** 
     * 担保方案，LXQEDB:利息全额担保；
     */
    protected String guaranteeWay;

    /** 
     * 是否有抵押，S：是；F：否。
     */
    protected String mortgage;

    /** 
     * 是否自动放款，S：是；F:否.
     */
    protected String autoLoan;

    /** 
     * 是否允许流标，S：是；F:否.
     */
    protected String flowStandard;

    /** 
     * 付息方式，ZRY:自然月;GDR：固定日
     */
    protected String interestWay;

    /** 
     * 起息时间,MBJX:满标计息；FKJX:放款计息；JRCGJX:加入成功计息
     */
    protected String interestTime;

    /** 
     * 最小体验总额
     */
    protected BigDecimal min = BigDecimal.ZERO;

    /** 
     * 最大体验总额
     */
    protected BigDecimal max = BigDecimal.ZERO;

    /** 
     * 图片模板编码
     */
    protected String template;

    /** 
     * 描述介绍
     */
    protected String description;

    /** 
     * 状态,DTJ:待提交；DSH:待审核；DFB:待发布；YZF:已作废；YFB1:预发布；TYZ:体验中；YLB:已流标；YME:已满额；SQZ:申请中；HKZ:还款中；YJZ:已截止；YFB2：已发布
     */
    protected String state;

    /** 
     * 创建时间
     */
    protected Timestamp createTime;

    /** 
     * 修改时间
     */
    protected Timestamp updateTime;

    /** 
     * 发布时间
     */
    protected Timestamp releaseTime;

    /** 
     * 结束时间
     */
    protected Timestamp endTime;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getBorrowId() {
		return borrowId;
	}

	public void setBorrowId(Integer borrowId) {
		this.borrowId = borrowId;
	}

	public String getPeriods() {
		return periods;
	}

	public void setPeriods(String periods) {
		this.periods = periods;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public BigDecimal getRate() {
		return rate;
	}

	public void setRate(BigDecimal rate) {
		this.rate = rate;
	}

	public Integer getTerm() {
		return term;
	}

	public void setTerm(Integer term) {
		this.term = term;
	}

	public Integer getRaiseTerm() {
		return raiseTerm;
	}

	public void setRaiseTerm(Integer raiseTerm) {
		this.raiseTerm = raiseTerm;
	}

	public String getRepayWay() {
		return repayWay;
	}

	public void setRepayWay(String repayWay) {
		this.repayWay = repayWay;
	}

	public String getGuarantee() {
		return guarantee;
	}

	public void setGuarantee(String guarantee) {
		this.guarantee = guarantee;
	}

	public String getGuaranteeWay() {
		return guaranteeWay;
	}

	public void setGuaranteeWay(String guaranteeWay) {
		this.guaranteeWay = guaranteeWay;
	}

	public String getMortgage() {
		return mortgage;
	}

	public void setMortgage(String mortgage) {
		this.mortgage = mortgage;
	}

	public String getAutoLoan() {
		return autoLoan;
	}

	public void setAutoLoan(String autoLoan) {
		this.autoLoan = autoLoan;
	}

	public String getFlowStandard() {
		return flowStandard;
	}

	public void setFlowStandard(String flowStandard) {
		this.flowStandard = flowStandard;
	}

	public String getInterestWay() {
		return interestWay;
	}

	public void setInterestWay(String interestWay) {
		this.interestWay = interestWay;
	}

	public String getInterestTime() {
		return interestTime;
	}

	public void setInterestTime(String interestTime) {
		this.interestTime = interestTime;
	}

	public BigDecimal getMin() {
		return min;
	}

	public void setMin(BigDecimal min) {
		this.min = min;
	}

	public BigDecimal getMax() {
		return max;
	}

	public void setMax(BigDecimal max) {
		this.max = max;
	}

	public String getTemplate() {
		return template;
	}

	public void setTemplate(String template) {
		this.template = template;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Timestamp getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}

	public Timestamp getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Timestamp updateTime) {
		this.updateTime = updateTime;
	}

	public Timestamp getReleaseTime() {
		return releaseTime;
	}

	public void setReleaseTime(Timestamp releaseTime) {
		this.releaseTime = releaseTime;
	}

	public Timestamp getEndTime() {
		return endTime;
	}

	public void setEndTime(Timestamp endTime) {
		this.endTime = endTime;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

    
    
}