package com.yiqiandai.p2p.experience.enums;

import com.dimeng.util.StringHelper;

/** 
 * 状态
 */
public enum EXPERIENCE_BID_STATE {

	/** 
     * 待提交
     */
	DTJ("待提交"),

	/** 
     * 待审核
     */
	DSH("待审核"),
	
	/** 
     * 待发布
     */
	DFB("待发布"),
	

	/** 
     * 已发布
     */
	YFB1("已发布"),
	
	/** 
     * 已作废
     */
	YZF("已作废"),
	
	/** 
     * 预发布
     */
	YFB2("预发布"),
	
	/** 
     * 体验中
     */
	TYZ("体验中"),
	
	/** 
     * 已流标
     */
	YLB("已流标"),
	
	/** 
     * 已满额
     */
	YME("已满额"),
	
	/** 
     * 申请中
     */
	SQZ("申请中"),
	
	/** 
     * 还款中
     */
	HKZ("还款中"),
	
    /** 
     * 已截止
     */
	YJZ("已截止");

	protected final String chineseName;

    private EXPERIENCE_BID_STATE(String chineseName){
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
     * @return {@link EXPERIENCE_BID_STATE}
     */
    public static final EXPERIENCE_BID_STATE parse(String value) {
        if(StringHelper.isEmpty(value)){
            return null;
        }
        try{
            return EXPERIENCE_BID_STATE.valueOf(value);
        }catch(Throwable t){
            return null;
        }
    }
   
}
