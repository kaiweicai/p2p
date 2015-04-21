package com.yiqiandai.p2p.activity.bo;

import com.yiqiandai.p2p.base.model.BaseObject;
/**
 * @comment 活动记录表
 * @author Administrator
 * @date 2015-04-21
 */
@SuppressWarnings("serial")
public class Activity extends AbstractActivity implements BaseObject{
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
		sb.append("id:"+id+";");
		sb.append("activityId:"+activityId+";");
		sb.append("name:"+name+";");
		sb.append("startTime:"+startTime+";");
		sb.append("endTime:"+endTime+";");
		sb.append("isContinue:"+isContinue+";");
		sb.append("description:"+description+";");
		sb.append("content:"+content+";");
		sb.append("createTime:"+createTime+";");
		sb.append("status:"+status+";");
		sb.append("scope:"+scope+";");

		return sb.toString();
	}
}