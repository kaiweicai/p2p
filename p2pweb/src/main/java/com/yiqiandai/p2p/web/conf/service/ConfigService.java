package com.yiqiandai.p2p.web.conf.service;

import com.yiqiandai.p2p.base.service.BaseService;
import com.yiqiandai.p2p.web.conf.bo.Config;

/**
 * @comment 网站配置Service接口
 * @author Administrator
 * @date 2015-05-31 
 */
public interface ConfigService extends BaseService<Config>{

	Config getStringByKey(String string);

	
}