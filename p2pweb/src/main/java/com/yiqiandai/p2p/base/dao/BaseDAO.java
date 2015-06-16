/**
 * 
 */
package com.yiqiandai.p2p.base.dao;

import java.util.List;

import com.yiqiandai.p2p.base.model.Paginator;

/**
 * @author chenh
 * @date 2013年8月12日
 */
public interface BaseDAO<T>{
	
	/**
	 * 新增数据
	 * @param bo
	 * @return
	 * @
	 */	
	public Integer insert(T bo);
	
	
	/**
	 * 更新
	 * @param bo
	 * @
	 */
	public void update(T bo);
	
	/**
	 * 逻辑删除
	 * @param id
	 * @
	 */
	public void deleteLogic(Integer id);
	
	/**
	 * 物理删除
	 * @param id
	 * @
	 */
	public void delete(Integer id);
	
	/**
	 * 通过ID查询对象
	 * @param id
	 * @
	 */
	public T findOne(Integer id);
	
	/**
	 * 动态查询
	 * @param data
	 * @
	 */
	public List<T> findList(T bo);
	
	/**
	 * 分页查询
	 * @param bo
	 * @param page  分页器
	 * @
	 */
	public List<T> selectPage(T bo,Paginator<T> page);
}
