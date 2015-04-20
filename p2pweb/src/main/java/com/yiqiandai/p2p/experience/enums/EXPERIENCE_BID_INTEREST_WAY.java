package com.yiqiandai.p2p.experience.enums;

import com.dimeng.util.StringHelper;


/** 
 * 付息方式
 */
public enum EXPERIENCE_BID_INTEREST_WAY {

	/** 
     * 自然月
     */
	ZRY("自然月"),

    /** 
     * 固定日
     */
	GDR("固定日");

	protected final String chineseName;

    private EXPERIENCE_BID_INTEREST_WAY(String chineseName){
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
     * @return {@link EXPERIENCE_BID_INTEREST_WAY}
     */
    public static final EXPERIENCE_BID_INTEREST_WAY parse(String value) {
        if(StringHelper.isEmpty(value)){
            return null;
        }
        try{
            return EXPERIENCE_BID_INTEREST_WAY.valueOf(value);
        }catch(Throwable t){
            return null;
        }
    }
}
