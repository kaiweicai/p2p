package com.yiqiandai.p2p.web.conf.bo;

/**
 * @comment 网站配置
 * @author Administrator
 * @date 2015-05-31
 */
@SuppressWarnings("serial")
public abstract class AbstractConfig implements java.io.Serializable{
	/**
	 * @alias Key
	 */
	protected java.lang.String key;
	/**
	 * @alias 值
	 */
	protected java.lang.String value;
	/**
	 * @alias 描述
	 */
	protected java.lang.Object description;
	/**
	 * @alias 时间
	 */
	protected java.util.Date createtime;

	public void setKey(java.lang.String key){
		 this.key=key;
	}
	public java.lang.String getKey(){
		 return this.key;
	}
	public void setValue(java.lang.String value){
		 this.value=value;
	}
	public java.lang.String getValue(){
		 return this.value;
	}
	public void setDescription(java.lang.Object description){
		 this.description=description;
	}
	public java.lang.Object getDescription(){
		 return this.description;
	}
	public void setCreatetime(java.util.Date createtime){
		 this.createtime=createtime;
	}
	public java.util.Date getCreatetime(){
		 return this.createtime;
	}
}