package com.yiqiandai.p2p.web.project.bo;

/**
 * @comment 
 * @author Administrator
 * @date 2015-06-12
 */
@SuppressWarnings("serial")
public abstract class AbstractProject implements java.io.Serializable{
	/**
	 * @alias 项目ID
	 */
	protected java.lang.Integer id;
	/**
	 * @alias 项目标题
	 */
	protected java.lang.String title;
	/**
	 * @alias 
	 */
	protected java.lang.String province;
	/**
	 * @alias 
	 */
	protected java.lang.String city;
	/**
	 * @alias 
	 */
	protected java.lang.String couty;
	/**
	 * @alias 融资主体 1.企业,2.政府,3.企业
	 */
	protected Integer subject;
	/**
	 * @alias 参考industryMap
	 */
	protected Integer industry;
	/**
	 * @alias 去年营业额,省略小数(万元)
	 */
	protected Integer turnoverLastYear;
	/**
	 * @alias 融资用途
	 */
	protected Integer netValue;
	/**
	 * @alias 融资用途
	 */
	protected java.lang.String finaceUse;
	/**
	 * @alias 融资金额最小值
	 */
	protected Integer finaceAmountMin;
	/**
	 * @alias 融资金额最大值
	 */
	protected Integer finaceAmountMax;
	/**
	 * @alias 
	 */
	protected Integer investAmount;
	/**
	 * @alias 意向资金
	 */
	protected java.lang.Integer intendFund;
	/**
	 * @alias 债权融资
	 */
	protected Integer debtFinacialing;
	/**
	 * @alias 股权融资
	 */
	protected Integer equityFinacialing;
	/**
	 * @alias 整体转让
	 */
	protected Integer overallTransfer;
	/**
	 * @alias 其他融资
	 */
	protected Integer otherFinacialing;
	/**
	 * @alias 可提供资料
	 */
	protected Integer material;
	/**
	 * @alias 
	 */
	protected java.lang.String description;
	/**
	 * @alias 项目优势
	 */
	protected java.lang.String advantage;
	/**
	 * @alias 其它备注
	 */
	protected java.lang.String memo;
	/**
	 * @alias 
	 */
	protected java.lang.String tag;
	public java.lang.Integer getId() {
		return id;
	}
	public void setId(java.lang.Integer id) {
		this.id = id;
	}
	public java.lang.String getTitle() {
		return title;
	}
	public void setTitle(java.lang.String title) {
		this.title = title;
	}
	public java.lang.String getProvince() {
		return province;
	}
	public void setProvince(java.lang.String province) {
		this.province = province;
	}
	public java.lang.String getCity() {
		return city;
	}
	public void setCity(java.lang.String city) {
		this.city = city;
	}
	public java.lang.String getCouty() {
		return couty;
	}
	public void setCouty(java.lang.String couty) {
		this.couty = couty;
	}
	public Integer getSubject() {
		return subject;
	}
	public void setSubject(Integer subject) {
		this.subject = subject;
	}
	public Integer getIndustry() {
		return industry;
	}
	public void setIndustry(Integer industry) {
		this.industry = industry;
	}
	public Integer getTurnoverLastYear() {
		return turnoverLastYear;
	}
	public void setTurnoverLastYear(Integer turnoverLastYear) {
		this.turnoverLastYear = turnoverLastYear;
	}
	public Integer getNetValue() {
		return netValue;
	}
	public void setNetValue(Integer netValue) {
		this.netValue = netValue;
	}
	public java.lang.String getFinaceUse() {
		return finaceUse;
	}
	public void setFinaceUse(java.lang.String finaceUse) {
		this.finaceUse = finaceUse;
	}
	public Integer getFinaceAmountMin() {
		return finaceAmountMin;
	}
	public void setFinaceAmountMin(Integer finaceAmountMin) {
		this.finaceAmountMin = finaceAmountMin;
	}
	public Integer getFinaceAmountMax() {
		return finaceAmountMax;
	}
	public void setFinaceAmountMax(Integer finaceAmountMax) {
		this.finaceAmountMax = finaceAmountMax;
	}
	public Integer getInvestAmount() {
		return investAmount;
	}
	public void setInvestAmount(Integer investAmount) {
		this.investAmount = investAmount;
	}
	public java.lang.Integer getIntendFund() {
		return intendFund;
	}
	public void setIntendFund(java.lang.Integer intendFund) {
		this.intendFund = intendFund;
	}
	public Integer getDebtFinacialing() {
		return debtFinacialing;
	}
	public void setDebtFinacialing(Integer debtFinacialing) {
		this.debtFinacialing = debtFinacialing;
	}
	public Integer getEquityFinacialing() {
		return equityFinacialing;
	}
	public void setEquityFinacialing(Integer equityFinacialing) {
		this.equityFinacialing = equityFinacialing;
	}
	public Integer getOverallTransfer() {
		return overallTransfer;
	}
	public void setOverallTransfer(Integer overallTransfer) {
		this.overallTransfer = overallTransfer;
	}
	public Integer getOtherFinacialing() {
		return otherFinacialing;
	}
	public void setOtherFinacialing(Integer otherFinacialing) {
		this.otherFinacialing = otherFinacialing;
	}
	public Integer getMaterial() {
		return material;
	}
	public void setMaterial(Integer material) {
		this.material = material;
	}
	public java.lang.String getDescription() {
		return description;
	}
	public void setDescription(java.lang.String description) {
		this.description = description;
	}
	public java.lang.String getAdvantage() {
		return advantage;
	}
	public void setAdvantage(java.lang.String advantage) {
		this.advantage = advantage;
	}
	public java.lang.String getMemo() {
		return memo;
	}
	public void setMemo(java.lang.String memo) {
		this.memo = memo;
	}
	public java.lang.String getTag() {
		return tag;
	}
	public void setTag(java.lang.String tag) {
		this.tag = tag;
	}

}