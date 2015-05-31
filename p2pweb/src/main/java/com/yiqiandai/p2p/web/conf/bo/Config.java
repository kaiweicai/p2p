package com.yiqiandai.p2p.web.conf.bo;

import com.yiqiandai.p2p.base.model.BaseObject;
/**
 * @comment 网站配置
 * @author Administrator
 * @date 2015-05-31
 */
@SuppressWarnings("serial")
public class Config extends AbstractConfig implements BaseObject{
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
		sb.append("key:"+key+";");
		sb.append("value:"+value+";");
		sb.append("description:"+description+";");
		sb.append("createtime:"+createtime+";");

		return sb.toString();
	}

	@Override
	public Integer getId() {
		return 0;
	}
}