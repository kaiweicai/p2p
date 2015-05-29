package com.yiqiandai.p2p.web.user.bo;

import com.yiqiandai.p2p.base.model.BaseObject;
/**
 * @comment 
 * @author Administrator
 * @date 2015-05-22
 */
@SuppressWarnings("serial")
public class T6110 extends AbstractT6110 implements BaseObject{
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
		sb.append("f08:"+f08+";");
		sb.append("f09:"+f09+";");
		sb.append("f10:"+f10+";");
		sb.append("f11:"+f11+";");
		sb.append("f12:"+f12+";");
		sb.append("f13:"+f13+";");

		return sb.toString();
	}

	@Override
	public Integer getId() {
		return f01;
	}
	
}