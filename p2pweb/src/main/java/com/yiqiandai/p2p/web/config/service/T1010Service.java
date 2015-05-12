package com.yiqiandai.p2p.web.config.service;

import com.yiqiandai.p2p.base.service.BaseService;
import com.yiqiandai.p2p.web.config.model.T1010;

/**
 * 
 * @author zhongl
 *
 */
public interface T1010Service extends BaseService<T1010> {
	public T1010 findSystemConfig(String configKey);
}
