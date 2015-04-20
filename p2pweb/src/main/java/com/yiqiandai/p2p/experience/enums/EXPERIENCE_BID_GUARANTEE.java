package com.yiqiandai.p2p.experience.enums;

import com.dimeng.util.StringHelper;

/** 
 * 是否有担保
 */
public enum EXPERIENCE_BID_GUARANTEE {
	
	/** 
     * 有担保
     */
	S("是"),

    /** 
     * 没有担保
     */
	F("否");

	protected final String chineseName;

    private EXPERIENCE_BID_GUARANTEE(String chineseName){
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
     * @return {@link EXPERIENCE_BID_GUARANTEE}
     */
    public static final EXPERIENCE_BID_GUARANTEE parse(String value) {
        if(StringHelper.isEmpty(value)){
            return null;
        }
        try{
            return EXPERIENCE_BID_GUARANTEE.valueOf(value);
        }catch(Throwable t){
            return null;
        }
    }

}
