package com.yiqiandai.p2p.web.conf.dao;

import com.yiqiandai.p2p.base.dao.BaseDAO;
import com.yiqiandai.p2p.web.conf.bo.Config;

/**
 * @comment 网站配置DAO接口
 * @author Administrator
 * @date 2015-05-31 
 */
public interface ConfigDAO extends BaseDAO<Config>{

	Config findOne(String key);
	
	
}