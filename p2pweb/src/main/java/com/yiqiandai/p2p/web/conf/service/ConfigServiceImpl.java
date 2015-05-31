package com.yiqiandai.p2p.web.conf.service;

import javax.annotation.Resource;

import com.yiqiandai.p2p.base.service.BaseServiceImpl;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yiqiandai.p2p.web.conf.bo.Config;
import com.yiqiandai.p2p.web.conf.dao.ConfigDAO;

/**
 * @comment 网站配置Service实现类
 * @author Administrator
 * @date 2015-05-31 
 */
@Service 
public class ConfigServiceImpl extends BaseServiceImpl<Config> implements ConfigService{
	
	public ConfigDAO getDao() {
		// TODO Auto-generated method stub
		return (ConfigDAO)super.dao;
	}
	
	@Resource(name="configDAOImpl")
	public void setDao(ConfigDAO dao) {
		// TODO Auto-generated method stub
		super.dao = dao;
	}

	@Override
	@Cacheable(value = "config")
	public Config getStringByKey(String key) {
		return getDao().findOne(key);
	}
	
	@Transactional
	@CacheEvict(value = "config")
	public Integer saveOrUpdate(Config bo) {
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
	@CacheEvict(value = "config")
	public void removeLogic(Integer id) {
		dao.deleteLogic(id);
	}

	@Transactional
	@CacheEvict(value = "config")
	public void remove(Integer id) {
		dao.delete(id);
	}

	@Cacheable(value = "config")
	public Config findById(Integer id) {
		return dao.findOne(id);
	}
}
