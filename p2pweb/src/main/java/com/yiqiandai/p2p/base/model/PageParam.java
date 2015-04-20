/**
 * 
 */
package com.yiqiandai.p2p.base.model;

import java.util.HashMap;

/**

 */
@SuppressWarnings("serial")
public class PageParam<T> extends HashMap<String,Object>{

	private static final String KEY_BO = "bo";
	private static final String KEY_PAGE = "page";
	
	public PageParam(T t,Paginator<T> page){
		this.put(KEY_BO,t);
		this.put(KEY_PAGE, page);
	}
	
	@SuppressWarnings("unchecked")
	public T getParamObject(){
		return (T)this.get(KEY_BO);
	}
	
	@SuppressWarnings("unchecked")
	public Paginator<T> getPage(){
		return (Paginator<T>)this.get(KEY_PAGE);
	}
}
