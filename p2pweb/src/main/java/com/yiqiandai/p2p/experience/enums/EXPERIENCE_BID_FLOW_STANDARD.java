package com.yiqiandai.p2p.experience.enums;

import com.dimeng.util.StringHelper;


/** 
 * 是否允许流标
 */
public enum EXPERIENCE_BID_FLOW_STANDARD {
	
	/** 
     * 允许流标
     */
	S("是"),

    /** 
     * 没有允许流标
     */
	F("否");

	protected final String chineseName;

    private EXPERIENCE_BID_FLOW_STANDARD(String chineseName){
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
     * @return {@link EXPERIENCE_BID_FLOW_STANDARD}
     */
    public static final EXPERIENCE_BID_FLOW_STANDARD parse(String value) {
        if(StringHelper.isEmpty(value)){
            return null;
        }
        try{
            return EXPERIENCE_BID_FLOW_STANDARD.valueOf(value);
        }catch(Throwable t){
            return null;
        }
    }


}
