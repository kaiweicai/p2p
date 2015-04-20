package com.yiqiandai.p2p.experience.enums;

import com.dimeng.util.StringHelper;


/** 
 * 担保方案
 */
public enum EXPERIENCE_BID_GUARANTEE_WAY {
	
	/** 
     * 利息全额担保
     */
	LXQEDB("利息全额担保");

	protected final String chineseName;

    private EXPERIENCE_BID_GUARANTEE_WAY(String chineseName){
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
     * @return {@link EXPERIENCE_BID_GUARANTEE_WAY}
     */
    public static final EXPERIENCE_BID_GUARANTEE_WAY parse(String value) {
        if(StringHelper.isEmpty(value)){
            return null;
        }
        try{
            return EXPERIENCE_BID_GUARANTEE_WAY.valueOf(value);
        }catch(Throwable t){
            return null;
        }
    }

}
