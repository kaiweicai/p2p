package com.yiqiandai.p2p.activity.bo;

/**
 * @comment 活动记录表
 * @author Administrator
 * @date 2015-04-21
 */
@SuppressWarnings("serial")
public abstract class AbstractActivity implements java.io.Serializable{
	/**
	 * @alias 活动ID
	 */
	protected java.lang.Integer id;
	/**
	 * @alias 
	 */
	protected java.lang.String activityId;
	/**
	 * @alias 活动名称
	 */
	protected java.lang.String name;
	/**
	 * @alias 活动开始时间
	 */
	protected java.util.Date startTime;
	/**
	 * @alias 活动结束时间
	 */
	protected java.util.Date endTime;
	/**
	 * @alias 是否长期有效
	 */
	protected java.lang.Object isContinue;
	/**
	 * @alias 描述
	 */
	protected java.lang.String description;
	/**
	 * @alias 活动内容：2^0=1表示复选推荐投资人数达标送奖励。2^1=2表示复选投资人投资送现金。2^2和2^3以后增加。
	 */
	protected java.lang.Integer content;
	/**
	 * @alias 
	 */
	protected java.util.Date createTime;
	/**
	 * @alias 
	 */
	protected java.lang.String status;
	/**
	 * @alias 活动范围：ALL所有用户，NEW新增用户。
	 */
	protected java.lang.String scope;

	public void setId(java.lang.Integer id){
		 this.id=id;
	}
	public java.lang.Integer getId(){
		 return this.id;
	}
	public void setActivityId(java.lang.String activityId){
		 this.activityId=activityId;
	}
	public java.lang.String getActivityId(){
		 return this.activityId;
	}
	public void setName(java.lang.String name){
		 this.name=name;
	}
	public java.lang.String getName(){
		 return this.name;
	}
	public void setStartTime(java.util.Date startTime){
		 this.startTime=startTime;
	}
	public java.util.Date getStartTime(){
		 return this.startTime;
	}
	public void setEndTime(java.util.Date endTime){
		 this.endTime=endTime;
	}
	public java.util.Date getEndTime(){
		 return this.endTime;
	}
	public void setIsContinue(java.lang.Object isContinue){
		 this.isContinue=isContinue;
	}
	public java.lang.Object getIsContinue(){
		 return this.isContinue;
	}
	public void setDescription(java.lang.String description){
		 this.description=description;
	}
	public java.lang.String getDescription(){
		 return this.description;
	}
	public void setContent(java.lang.Integer content){
		 this.content=content;
	}
	public java.lang.Integer getContent(){
		 return this.content;
	}
	public void setCreateTime(java.util.Date createTime){
		 this.createTime=createTime;
	}
	public java.util.Date getCreateTime(){
		 return this.createTime;
	}
	public void setStatus(java.lang.String status){
		 this.status=status;
	}
	public java.lang.String getStatus(){
		 return this.status;
	}
	public void setScope(java.lang.String scope){
		 this.scope=scope;
	}
	public java.lang.String getScope(){
		 return this.scope;
	}
}