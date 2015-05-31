package com.yiqiandai.p2p.common.constant;

import com.yiqiandai.p2p.common.utils.PropertyUtils;


public class SystemConstant {
	public static final String SYSTEM_SESSION_IDEL_KEY="SYSTEM.SESSION_MAX_IDLE_TIME";
	public static final long SESSION_MAX_IDLE_TIME = 1800000L;
	public static final Integer TEST = 1800000;
	public static final String XSYD_ZCYDL="http://${SYSTEM.SITE_DOMAIN}/xszy/zcydl.htm";
	public static final String INDEX="URL.INDEX";
	/**
	 * 应用部署路径的KEY
	 */
	public static String WEB_ROOT = PropertyUtils.getRoot();
}
