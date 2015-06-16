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
	protected java.lang.Object subject;
	/**
	 * @alias 参考industryMap
	 */
	protected java.lang.Object industry;
	/**
	 * @alias 去年营业额,省略小数(万元)
	 */
	protected java.lang.Object turnoverLastYear;
	/**
	 * @alias 融资用途
	 */
	protected java.lang.Object netValue;
	/**
	 * @alias 融资用途
	 */
	protected java.lang.String finaceUse;
	/**
	 * @alias 融资金额最小值
	 */
	protected java.lang.Object finaceAmountMin;
	/**
	 * @alias 融资金额最大值
	 */
	protected java.lang.Object finaceAmountMax;
	/**
	 * @alias 
	 */
	protected java.lang.Object investAmount;
	/**
	 * @alias 意向资金
	 */
	protected java.lang.Integer intendFund;
	/**
	 * @alias 债权融资
	 */
	protected java.lang.Object debtFinacialing;
	/**
	 * @alias 股权融资
	 */
	protected java.lang.Object equityFinacialing;
	/**
	 * @alias 整体转让
	 */
	protected java.lang.Object overallTransfer;
	/**
	 * @alias 其他融资
	 */
	protected java.lang.Object otherFinacialing;
	/**
	 * @alias 可提供资料
	 */
	protected java.lang.Object material;
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

	public void setId(java.lang.Integer id){
		 this.id=id;
	}
	public java.lang.Integer getId(){
		 return this.id;
	}
	public void setTitle(java.lang.String title){
		 this.title=title;
	}
	public java.lang.String getTitle(){
		 return this.title;
	}
	public void setProvince(java.lang.String province){
		 this.province=province;
	}
	public java.lang.String getProvince(){
		 return this.province;
	}
	public void setCity(java.lang.String city){
		 this.city=city;
	}
	public java.lang.String getCity(){
		 return this.city;
	}
	public void setCouty(java.lang.String couty){
		 this.couty=couty;
	}
	public java.lang.String getCouty(){
		 return this.couty;
	}
	public void setSubject(java.lang.Object subject){
		 this.subject=subject;
	}
	public java.lang.Object getSubject(){
		 return this.subject;
	}
	public void setIndustry(java.lang.Object industry){
		 this.industry=industry;
	}
	public java.lang.Object getIndustry(){
		 return this.industry;
	}
	public void setTurnoverLastYear(java.lang.Object turnoverLastYear){
		 this.turnoverLastYear=turnoverLastYear;
	}
	public java.lang.Object getTurnoverLastYear(){
		 return this.turnoverLastYear;
	}
	public void setNetValue(java.lang.Object netValue){
		 this.netValue=netValue;
	}
	public java.lang.Object getNetValue(){
		 return this.netValue;
	}
	public void setFinaceUse(java.lang.String finaceUse){
		 this.finaceUse=finaceUse;
	}
	public java.lang.String getFinaceUse(){
		 return this.finaceUse;
	}
	public void setFinaceAmountMin(java.lang.Object finaceAmountMin){
		 this.finaceAmountMin=finaceAmountMin;
	}
	public java.lang.Object getFinaceAmountMin(){
		 return this.finaceAmountMin;
	}
	public void setFinaceAmountMax(java.lang.Object finaceAmountMax){
		 this.finaceAmountMax=finaceAmountMax;
	}
	public java.lang.Object getFinaceAmountMax(){
		 return this.finaceAmountMax;
	}
	public void setInvestAmount(java.lang.Object investAmount){
		 this.investAmount=investAmount;
	}
	public java.lang.Object getInvestAmount(){
		 return this.investAmount;
	}
	public void setIntendFund(java.lang.Integer intendFund){
		 this.intendFund=intendFund;
	}
	public java.lang.Integer getIntendFund(){
		 return this.intendFund;
	}
	public void setDebtFinacialing(java.lang.Object debtFinacialing){
		 this.debtFinacialing=debtFinacialing;
	}
	public java.lang.Object getDebtFinacialing(){
		 return this.debtFinacialing;
	}
	public void setEquityFinacialing(java.lang.Object equityFinacialing){
		 this.equityFinacialing=equityFinacialing;
	}
	public java.lang.Object getEquityFinacialing(){
		 return this.equityFinacialing;
	}
	public void setOverallTransfer(java.lang.Object overallTransfer){
		 this.overallTransfer=overallTransfer;
	}
	public java.lang.Object getOverallTransfer(){
		 return this.overallTransfer;
	}
	public void setOtherFinacialing(java.lang.Object otherFinacialing){
		 this.otherFinacialing=otherFinacialing;
	}
	public java.lang.Object getOtherFinacialing(){
		 return this.otherFinacialing;
	}
	public void setMaterial(java.lang.Object material){
		 this.material=material;
	}
	public java.lang.Object getMaterial(){
		 return this.material;
	}
	public void setDescription(java.lang.String description){
		 this.description=description;
	}
	public java.lang.String getDescription(){
		 return this.description;
	}
	public void setAdvantage(java.lang.String advantage){
		 this.advantage=advantage;
	}
	public java.lang.String getAdvantage(){
		 return this.advantage;
	}
	public void setMemo(java.lang.String memo){
		 this.memo=memo;
	}
	public java.lang.String getMemo(){
		 return this.memo;
	}
	public void setTag(java.lang.String tag){
		 this.tag=tag;
	}
	public java.lang.String getTag(){
		 return this.tag;
	}
}