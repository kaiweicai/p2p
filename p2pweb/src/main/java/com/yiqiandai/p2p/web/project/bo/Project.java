package com.yiqiandai.p2p.web.project.bo;

import com.yiqiandai.p2p.base.model.BaseObject;
/**
 * @comment 
 * @author Administrator
 * @date 2015-06-12
 */
@SuppressWarnings("serial")
public class Project extends AbstractProject implements BaseObject{
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
		sb.append("title:"+title+";");
		sb.append("province:"+province+";");
		sb.append("city:"+city+";");
		sb.append("couty:"+couty+";");
		sb.append("subject:"+subject+";");
		sb.append("industry:"+industry+";");
		sb.append("turnoverLastYear:"+turnoverLastYear+";");
		sb.append("netValue:"+netValue+";");
		sb.append("finaceUse:"+finaceUse+";");
		sb.append("finaceAmountMin:"+finaceAmountMin+";");
		sb.append("finaceAmountMax:"+finaceAmountMax+";");
		sb.append("investAmount:"+investAmount+";");
		sb.append("intendFund:"+intendFund+";");
		sb.append("debtFinacialing:"+debtFinacialing+";");
		sb.append("equityFinacialing:"+equityFinacialing+";");
		sb.append("overallTransfer:"+overallTransfer+";");
		sb.append("otherFinacialing:"+otherFinacialing+";");
		sb.append("material:"+material+";");
		sb.append("description:"+description+";");
		sb.append("advantage:"+advantage+";");
		sb.append("memo:"+memo+";");
		sb.append("tag:"+tag+";");

		return sb.toString();
	}
}