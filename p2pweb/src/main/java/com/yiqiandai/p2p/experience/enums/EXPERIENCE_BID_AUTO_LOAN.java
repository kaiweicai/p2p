package com.yiqiandai.p2p.experience.enums;

import com.dimeng.util.StringHelper;


/** 
 * 是否自动放款
 */
public enum EXPERIENCE_BID_AUTO_LOAN {
	
	/** 
     * 自动放款
     */
	S("是"),

    /** 
     * 没有自动放款
     */
	F("否");

	protected final String chineseName;

    private EXPERIENCE_BID_AUTO_LOAN(String chineseName){
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
     * @return {@link EXPERIENCE_BID_AUTO_LOAN}
     */
    public static final EXPERIENCE_BID_AUTO_LOAN parse(String value) {
        if(StringHelper.isEmpty(value)){
            return null;
        }
        try{
            return EXPERIENCE_BID_AUTO_LOAN.valueOf(value);
        }catch(Throwable t){
            return null;
        }
    }

}
