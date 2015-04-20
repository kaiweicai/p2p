package com.yiqiandai.p2p.experience.model;

import java.math.BigDecimal;
import java.util.Date;
/**
 * 
 * @author zhongl
 *
 */
public class AbstractExperienceFundDealInfo  implements java.io.Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 主键ID
	 */
    protected Integer id;

    /**
	 * 体验金账户id
	 */
    protected Integer experienceGoldId;
    /**
	 * 交易类型ID
	 */
    protected Integer dealTypeId;
    /**
	 * 收入
	 */
    protected BigDecimal revenue;
    /**
	 * 支出
	 */
    protected BigDecimal expend;
    /**
	 * 余额
	 */
    protected BigDecimal balance;
    /**
	 * 备注
	 */
    protected String memo;
    /**
	 * 创建时间
	 */
    protected Date createTime;
   
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }



    public BigDecimal getRevenue() {
        return revenue;
    }

    public void setRevenue(BigDecimal revenue) {
        this.revenue = revenue;
    }

    public BigDecimal getExpend() {
        return expend;
    }

    public void setExpend(BigDecimal expend) {
        this.expend = expend;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

	public Integer getExperienceGoldId() {
		return experienceGoldId;
	}

	public void setExperienceGoldId(Integer experienceGoldId) {
		this.experienceGoldId = experienceGoldId;
	}

	public Integer getDealTypeId() {
		return dealTypeId;
	}

	public void setDealTypeId(Integer dealTypeId) {
		this.dealTypeId = dealTypeId;
	}
}