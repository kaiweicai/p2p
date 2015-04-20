package com.yiqiandai.p2p.base.session.model;



import java.util.Date;

/**
 * session 与数据库字段一一对应
 * @author zhongl
 *
 */
public class AbstractT1030 {
	/**
	 * id
	 */
    protected Integer f01;
    
    /**
     * cookie value
     */
    protected String f02;

    /**
     * login time
     */
    protected Date f03;

    protected Integer f04;

    /**
     * expire time 
     */
    protected Date f05;

    /**
     * ip
     */
    protected String f06;

    /**
     * userAgentDigest
     */
    protected String f07;

    public Integer getF01() {
        return f01;
    }

    public void setF01(Integer f01) {
        this.f01 = f01;
    }

    public String getF02() {
        return f02;
    }

    public void setF02(String f02) {
        this.f02 = f02 == null ? null : f02.trim();
    }

    public Date getF03() {
        return f03;
    }

    public void setF03(Date f03) {
        this.f03 = f03;
    }

    public Integer getF04() {
    	if(f04 == null){
    		return 0;
    	}
        return f04;
    }

    public void setF04(Integer f04) {
        this.f04 = f04;
    }

    public Date getF05() {
        return f05;
    }

    public void setF05(Date f05) {
        this.f05 = f05;
    }

    public String getF06() {
        return f06;
    }

    public void setF06(String f06) {
        this.f06 = f06 == null ? null : f06.trim();
    }

    public String getF07() {
        return f07;
    }

    public void setF07(String f07) {
        this.f07 = f07 == null ? null : f07.trim();
    }
}