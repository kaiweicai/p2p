package com.yiqiandai.p2p.web.session.bo;

import com.yiqiandai.p2p.base.model.BaseObject;
/**
 * @comment 
 * @author Administrator
 * @date 2015-05-07
 */
@SuppressWarnings("serial")
public class UserSession1030 extends Abstract1030 implements BaseObject{
	
	public Integer getId() {
		return f01;
	}

	public void setId(Integer id) {
		this.f01 = id;
	}

	/**
	 * 批量操作ID
	 */
	private Integer[] ids;
	
	public Integer[] getIds() {
		return ids;
	}

	public void setIds(Integer[] ids) {
		this.ids = ids;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("f01:"+f01+";");
		sb.append("f02:"+f02+";");
		sb.append("f03:"+f03+";");
		sb.append("f04:"+f04+";");
		sb.append("f05:"+f05+";");
		sb.append("f06:"+f06+";");
		sb.append("f07:"+f07+";");

		return sb.toString();
	}
}