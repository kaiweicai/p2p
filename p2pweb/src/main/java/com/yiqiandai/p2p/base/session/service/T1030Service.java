package com.yiqiandai.p2p.base.session.service;

import com.yiqiandai.p2p.base.service.BaseService;
import com.yiqiandai.p2p.base.session.model.T1030;

/**
 * 
 * @author zhongl
 *
 */
public interface T1030Service extends BaseService<T1030> {
	public T1030 saveAndQuerySessionFromCookie(String cookieId,String ip,String userAgent);
}
