package com.yiqiandai.p2p.experience.enums;

import com.dimeng.util.StringHelper;


/** 
 * 还息方式
 */
public enum EXPERIENCE_BID_REPAY_WAY {
	

	/** 
     * 到期还息
     */
	DQHX("到期还息"),

    /** 
     * 每月付息
     */
	MYFX("每月付息");

	protected final String chineseName;

    private EXPERIENCE_BID_REPAY_WAY(String chineseName){
        this.chineseName = chineseName;
    }
    /**
     * 获取中文名称.
     * 
     * @return {@link String}
     */
    public String getChineseName() {
        return chineseName;
    }
    
    /**
     * 解析字符串.
     * 
     * @return {@link EXPERIENCE_BID_REPAY_WAY}
     */
    public static final EXPERIENCE_BID_REPAY_WAY parse(String value) {
        if(StringHelper.isEmpty(value)){
            return null;
        }
        try{
            return EXPERIENCE_BID_REPAY_WAY.valueOf(value);
        }catch(Throwable t){
            return null;
        }
    }
}
