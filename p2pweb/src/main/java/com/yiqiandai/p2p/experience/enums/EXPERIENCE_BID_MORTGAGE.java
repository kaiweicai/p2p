package com.yiqiandai.p2p.experience.enums;

import com.dimeng.util.StringHelper;


/** 
 * 是否有抵押
 */
public enum EXPERIENCE_BID_MORTGAGE {
	
	/** 
     * 有抵押
     */
	S("是"),

    /** 
     * 没有抵押
     */
	F("否");

	protected final String chineseName;

    private EXPERIENCE_BID_MORTGAGE(String chineseName){
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
     * @return {@link EXPERIENCE_BID_MORTGAGE}
     */
    public static final EXPERIENCE_BID_MORTGAGE parse(String value) {
        if(StringHelper.isEmpty(value)){
            return null;
        }
        try{
            return EXPERIENCE_BID_MORTGAGE.valueOf(value);
        }catch(Throwable t){
            return null;
        }
    }

}
