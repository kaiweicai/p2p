/**
 * 
 */
package com.yiqiandai.p2p.base.service;

import java.util.List;

/**
 * @author chenh
 * @date 2013年8月13日
 */
public interface BaseService<T> {
	/**
	 * 插入或更新
	 * @param bo
	 * @return
	 * @
	 */		
	public Integer saveOrUpdate(T bo);	
	
	/**
	 * 逻辑删除
	 * @param id
	 * @
	 */
	public void removeLogic(Integer id);
	
	/**
	 * 物理删除
	 * @param id
	 * @
	 */
	public void remove(Integer id);
	
	/**
	 * 通过ID查询对象
	 * @param id
	 * @
	 */
	public T findById(Integer id);
	
	/**
	 * 动态查询
	 * @param bo
	 * @
	 */
	public List<T> dynamicQuery(T bo);
	
//	/**
//	 * 分页查询
//	 * @param bo
//	 * @param page  分页器
//	 * @
//	 */
//	public List<T> pageQuery(T bo,Paginator<T> page);
//	
}
