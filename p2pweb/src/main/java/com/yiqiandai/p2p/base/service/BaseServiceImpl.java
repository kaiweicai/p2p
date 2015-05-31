/**
 * 
 */
package com.yiqiandai.p2p.base.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.transaction.annotation.Transactional;

import com.yiqiandai.p2p.base.dao.BaseDAO;
import com.yiqiandai.p2p.base.model.BaseObject;


/**
 * @author chenh
 * @date 2013年8月13日
 */
public class BaseServiceImpl<T extends BaseObject> implements BaseService<T>{
	protected Logger logger = LoggerFactory.getLogger(getClass());
	protected BaseDAO<T> dao;
	
	public BaseDAO<T> getDao() {
		return dao;
	}

	public void setDao(BaseDAO<T> dao) {
		this.dao = dao;
	}

	@Transactional
	public Integer saveOrUpdate(T bo) {
		Integer id=bo.getId();
		if(id!=null&&id.longValue()>0){
			dao.update(bo);
			return id;
		}
		else{
			return dao.insert(bo);
		}
	}

	@Transactional
	public void removeLogic(Integer id) {
		dao.deleteLogic(id);
	}

	@Transactional
	public void remove(Integer id) {
		dao.delete(id);
	}

	public T findById(Integer id) {
		return dao.findOne(id);
	}

	public List<T> dynamicQuery(T bo) {
		return dao.findList(bo);
	}

//	public List<T> pageQuery(T bo, Paginator<T> page) {
//		return dao.selectPage(bo, page);
//	}


}
