package com.yiqiandai.p2p.web.conf.dao;

import com.yiqiandai.p2p.common.annotation.BoName;
import com.yiqiandai.p2p.base.dao.BaseDAOImpl;

import org.springframework.stereotype.Repository;

import com.yiqiandai.p2p.web.conf.bo.Config;

/**
 * @comment 网站配置Service实现类
 * @author Administrator
 * @date 2015-05-31 
 */
@Repository
@BoName("Config")
public class ConfigDAOImpl extends BaseDAOImpl<Config> implements ConfigDAO{
	@Override
	public Config findOne(String key) {
		return getSqlSessionTemplate().selectOne(getStatement(), key);
	}
	
	
}
