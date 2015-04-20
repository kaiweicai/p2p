package com.yiqiandai.p2p.experience.enums;

import com.dimeng.util.StringHelper;


/** 
 * 起息时间
 */
public enum EXPERIENCE_BID_INTEREST_TIME {

	/** 
     * 满标计息
     */
	MBJX("满标计息"),

	/** 
     * 加入成功计息
     */
	JRCGJX("加入成功计息"),
	
    /** 
     * 放款计息
     */
	FKJX("放款计息");

	protected final String chineseName;

    private EXPERIENCE_BID_INTEREST_TIME(String chineseName){
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
     * @return {@link EXPERIENCE_BID_INTEREST_TIME}
     */
    public static final EXPERIENCE_BID_INTEREST_TIME parse(String value) {
        if(StringHelper.isEmpty(value)){
            return null;
        }
        try{
            return EXPERIENCE_BID_INTEREST_TIME.valueOf(value);
        }catch(Throwable t){
            return null;
        }
    }
}
