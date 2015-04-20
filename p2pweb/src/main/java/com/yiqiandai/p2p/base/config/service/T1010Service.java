package com.yiqiandai.p2p.base.config.service;

import com.yiqiandai.p2p.base.config.model.T1010;
import com.yiqiandai.p2p.base.service.BaseService;

/**
 * 
 * @author zhongl
 *
 */
public interface T1010Service extends BaseService<T1010> {
	public T1010 findSystemConfig(String configKey);
}
