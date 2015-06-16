/**
 * 
 */
package com.yiqiandai.p2p.base.dao;

import java.util.List;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.yiqiandai.p2p.base.model.BaseObject;
import com.yiqiandai.p2p.base.model.PageParam;
import com.yiqiandai.p2p.base.model.Paginator;
import com.yiqiandai.p2p.common.annotation.BoName;
import com.yiqiandai.p2p.common.annotation.MybatisNamespace;

/**
 * @author chenh
 * @date 2013年8月12日
 */
public class BaseDAOImpl<T extends BaseObject> implements BaseDAO<T>{
	
	private static final Logger logger = LoggerFactory.getLogger(BaseDAOImpl.class);
	
	public SqlSessionTemplate sqlSessionTemplate;
	
	public SqlSessionTemplate getSqlSessionTemplate() {
		return sqlSessionTemplate;
	}
	
	@Resource
	public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
		this.sqlSessionTemplate = sqlSessionTemplate;
	}
	/**
	 * @author chenh
	 * @date 2013年8月12日
	 * @return
	 */
	protected String getStatement(){
		String namespace;
		BoName boName = getClass().getAnnotation(BoName.class);
		if(boName==null){
			MybatisNamespace mybatis = getClass().getAnnotation(MybatisNamespace.class);
			namespace = mybatis!=null?mybatis.value():"";
		}
		else
			namespace = boName!=null?boName.value():"";
		StackTraceElement[] stackElements = new Throwable().getStackTrace();
		if(stackElements.length>1){
			logger.info("SQL Mapper ==> "+namespace+"."+stackElements[1].getMethodName());
			return namespace+"."+stackElements[1].getMethodName();
		}
		logger.error("SQL Mapper ==> "+namespace);
		return namespace;
	}
	/**
	 * 插入
	 * @param bo
	 * @return
	 * @
	 */	
	public Integer insert(T bo){
		int row = this.getSqlSessionTemplate().insert(getStatement(), bo);
		return row;
	}
	
	/**
	 * 更新
	 * @param bo
	 * @
	 */
	public void update(T bo){
		getSqlSessionTemplate().update(getStatement(), bo);
	}
	
	/**
	 * 逻辑删除
	 * @param id
	 * @
	 */
	public void deleteLogic(Integer id){
		getSqlSessionTemplate().update(getStatement(), id);
	}
	
	/**
	 * 物理删除
	 * @param id
	 * @
	 */
	public void delete(Integer id){
		getSqlSessionTemplate().delete(getStatement(), id);
	}
	
	/**
	 * 通过ID查询对象
	 * @param id
	 * @
	 */
	public T findOne(Integer id){
		return getSqlSessionTemplate().selectOne(getStatement(), id);
	}
	
	/**
	 * 动态查询
	 * @param data
	 * @
	 */
	public List<T> findList(T bo){
		return getSqlSessionTemplate().selectList(getStatement(), bo);		
	}
	
	/**
	 * 分页查询
	 * @param bo
	 * @param page  分页器
	 * @
	 */
	public List<T> selectPage(T bo,Paginator<T> page){
		List<T> list = getSqlSessionTemplate().selectList(getStatement(), new PageParam<T>(bo,page));
		page.setResultList(list);
		return list;
	}
}
