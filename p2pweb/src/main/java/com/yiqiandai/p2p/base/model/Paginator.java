/**
 * 
 */
package com.yiqiandai.p2p.base.model;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * 分页器
 */
public class Paginator<T> {
	
	/**
	 * 结果列表
	 */
	private List<T> resultList = new ArrayList<T>(0);
	
	/**
	 * 总记录条数
	 */
	private long resultCount;
	
	/**
	 * 页面尺寸
	 */
	private int pageSize = 10;
	
	/**
	 * 起始的记录序号
	 */
	private long startRowNum=0;

	/**
	 * 终了记录序号(startRowNum+pageSize)
	 */
	private long endRowNum;
	
	
	private int pageCount = 1;//总页数
	private int pageIndex = 1;//当前页

	public List<T> getResultList() {
		if(resultList==null)
			resultList=new ArrayList<T>(0);
		return resultList;
	}

	public void setResultList(List<T> resultList) {
		this.resultList = resultList;
	}
	
	public int getResultListCount(){
		return getResultList().size();
	}

	public long getResultCount() {
		return resultCount;
	}

	/**
	 * 设置记录个数
	 * @param resultCount
	 */
	public void setResultCount(long resultCount) {
		this.resultCount = resultCount;
				
		//计算页数		
		pageCount = (int)((resultCount%pageSize>0)?(resultCount/pageSize+1):(resultCount/pageSize));
		pageCount = (pageCount==0)?1:pageCount;
		
		pageIndex = (int)startRowNum/pageSize+1;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public long getStartRowNum() {
		if(startRowNum >= resultCount){
			startRowNum = (pageCount-1)*pageSize;				
		}
		pageIndex = (int)startRowNum/pageSize+1;
		return startRowNum;		
	}
	
	public void setStartRowNum(long startRowNum) {
		this.startRowNum = startRowNum;
	}

	public long getEndRowNum() {
		endRowNum=startRowNum+pageSize;
		return endRowNum;
	}

	public void setEndRowNum(long endRowNum) {
		this.endRowNum = endRowNum;
	}
		
	/**
	 * @return 是否是最后一页
	 */
	public boolean isLastPage(){
		return getStartRowNum()+pageSize>=resultCount; 
	}
	
	/**
	 * 排序字段名称
	 */
	private String sortFieldName="ID";
	/**
	 * 排序是否是降序
	 */
	private boolean sortDesc=true;

	public String getSortFieldName()throws Exception {
		if(sortFieldName==null||sortFieldName.equals(""))
			sortFieldName="ID";
		if(sortFieldName.contains("\'")
				||sortFieldName.contains("\"")
				||sortFieldName.contains("%")
				||sortFieldName.contains("*")
				||sortFieldName.contains(" ")){
			throw new Exception("illegal order field!");
		}
		return sortFieldName;
	}

	public void setSortFieldName(String sortFieldName) {
		this.sortFieldName = sortFieldName;
	}

	public boolean isSortDesc() {
		return sortDesc;
	}
	
	public void setSortDesc(boolean sortDesc) {
		this.sortDesc = sortDesc;
	}

	public int getPageCount() {
		return pageCount;
	}

	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}

	public int getPageIndex() {
		return pageIndex;
	}

	public void setPageIndex(int pageIndex) {
		this.pageIndex = pageIndex;
	}
	
}






