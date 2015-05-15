package com.yiqiandai.p2p.common.constant;

import java.io.InputStreamReader;

import com.yiqiandai.p2p.common.annotation.VariableTypeAnnotation;
import com.yiqiandai.p2p.common.constant.inter.VariableBean;


@VariableTypeAnnotation(id = "SYSTEM", name = "系统参数")
public enum SystemVariable implements VariableBean
{
    
	
	/**
     * 体验宝模板图片
     */
	TYBMB1("体验宝模板图片")
    {
        @Override
        public String getValue()
        {
            return "moban1.jpg";
        }
    },
	
    /**
     * 网站标题
     */
    SITE_TITLE("网站标题")
    {
        @Override
        public String getValue()
        {
            return "迪蒙网贷";
        }
    },
    
    /**
     * 重复提交错误信息
     */
    ERROR_INFO("重复提交错误信息")
    {
        @Override
        public String getValue()
        {
            return "很抱歉,请不要重复提交请求.";
        }
    },
    
    /**
     * 网站名称
     */
    SITE_NAME("网站名称")
    {
        @Override
        public String getValue()
        {
            return "迪蒙网贷";
        }
    },
    /**
     * 网站域名
     */
    SITE_DOMAIN("网站域名")
    {
        @Override
        public String getValue()
        {
            return "www.dimeng.net";
        }
    },
    
    /**
     * 网站版权信息
     */
    SITE_COPYRIGTH("网站版权信息")
    {
        @Override
        public String getValue()
        {
            return "© 2014 ${SYSTEM.SITE_DOMAIN} All Rights Reserved ";
        }
    },
    /**
     * 网站备案号
     */
    SITE_FILING_NUM("网站备案号")
    {
        @Override
        public String getValue()
        {
            return "粤ICP备13082949号";
        }
    },
    /**
     * 客服电话
     */
    SITE_CUSTOMERSERVICE_TEL("客服电话")
    {
        @Override
        public String getValue()
        {
            return "400-8888 8888";
        }
    },
    /**
     * 网站口号
     */
    SITE_WORD("网站口号")
    {
        @Override
        public String getValue()
        {
            return "轻松贷款 投资无忧";
        }
    },
    /**
     * 邮编
     */
    SITE_POSTCODE("邮编")
    {
        @Override
        public String getValue()
        {
            return "518000";
        }
    },
    /**
     * 网站Meta关键字
     */
    SITE_META_KEYWORDS("网站Meta关键字"),
    /**
     * 网站Meta描述
     */
    SITE_META_DESC("网站Meta关键字描述"),
    /**
     * 工作时间
     */
    SITE_WORK_TIME("工作时间")
    {
        @Override
        public String getValue()
        {
            return "9:00 - 18:00";
        }
    },
    /**
     * 投资管理费率
     */
    SUCCESS_TZ_RATE("投资管理费率")
    {
        @Override
        public String getValue()
        {
            return "0.01";
        }
    },
    /**
     * 逾期罚息率
     */
    YU_QI_FAXI_RATE("逾期罚息费率")
    {
        @Override
        public String getValue()
        {
            return "0.005";
        }
    },
    /**
     * 投标奖励利率
     */
    TB_JLLL_RATE("投标奖励利率")
    {
        @Override
        public String getValue()
        {
            return "0.005";
        }
    },
    /**
     * 成交服务费率
     */
    SUCCESS_BMONEY_RATE("成交服务费率")
    {
        @Override
        public String getValue()
        {
            return "0.05";
        }
    },
    /**
     * 充值最低金额(元)
     */
    CHARGE_MIN_AMOUNT("充值最低金额(元)")
    {
        @Override
        public String getValue()
        {
            return "10";
        }
    },
    /**
     * 充值最高金额(元)
     */
    CHARGE_MAX_AMOUNT("充值最高金额(元)")
    {
        @Override
        public String getValue()
        {
            return "200000";
        }
    },
    /**
     * 用户充值手续费率
     */
    CHARGE_RATE("用户充值手续费率")
    {
        @Override
        public String getValue()
        {
            return "0.004";
        }
    },
    /**
     * 双乾收取平台的充值手续费率
     */
    CHARGE_RATE_SQ("双乾收取平台的充值手续费率")
    {
        @Override
        public String getValue()
        {
            return "0.003";
        }
    },
    /**
     * 通联收取平台的充值手续费率
     */
    CHARGE_RATE_TL("通联收取平台的充值手续费率")
    {
        @Override
        public String getValue()
        {
            return "0.003";
        }
    },
    /**
     * 汇付收取平台的充值手续费率
     */
    CHARGE_RATE_HF("汇付收取平台的充值手续费率")
    {
        @Override
        public String getValue()
        {
            return "0.003";
        }
    },
    /**
     * 汇潮收取平台的充值手续费率
     */
    CHARGE_RATE_HUICHAO("汇潮收取平台的充值手续费率")
    {
        @Override
        public String getValue()
        {
            return "0.003";
        }
    },
    /**
     * 智付收取平台的充值手续费率
     */
    CHARGE_RATE_DINPAY("智付收取平台的充值手续费率")
    {
        @Override
        public String getValue()
        {
            return "0.003";
        }
    },
    /**
     * 充值最高手续费（元）
     */
    CHARGE_MAX_POUNDAGE("充值最高手续费（元）")
    {
        @Override
        public String getValue()
        {
            return "100";
        }
    },
    /**
     * 借款管理费率
     */
    LMONEY_SUCCESS_RATION("借款管理费率")
    {
        @Override
        public String getValue()
        {
            return "0.003";
        }
    },
    /**
     * 债权转让管理费率
     */
    ZQZRGLF_RATE("债权转让管理费率")
    {
        @Override
        public String getValue()
        {
            return "0.01";
        }
    },
    
    /**
     * 设置债权几天后可以转让
     */
    USER_ZQZR_DAY("设置债权几天后可以转让")
    {
        @Override
        public String getValue()
        {
            return "60";
        }
    },
    /**
     * 提现最低金额（元）
     */
    WITHDRAW_MIN_FUNDS("提现最低金额（元）")
    {
        @Override
        public String getValue()
        {
            return "1";
        }
    },
    /**
     * 提现最高金额（元）
     */
    WITHDRAW_MAX_FUNDS("提现最高金额（元）")
    {
        @Override
        public String getValue()
        {
            return "200000";
        }
    },
    /**
     * [按额度]提现手续费1-5万收费
     */
    WITHDRAW_POUNDAGE_1_5("[按额度]提现手续费1-5万收费")
    {
        @Override
        public String getValue()
        {
            return "3";
        }
    },
    
    /**
     * [按额度]提现手续费小于一百收费
     */
    WITHDRAW_POUNDAGE_L_100("[按额度]提现手续费少于100收费")
    {
        @Override
        public String getValue()
        {
            return "2";
        }
    },
    /**
     * [按额度]提现手续费5-20万收费
     */
    WITHDRAW_POUNDAGE_5_20("[按额度]提现手续费5-20万收费")
    {
        @Override
        public String getValue()
        {
            return "5";
        }
    },
    /**
     * [按比例]提现手续费比例值
     */
    WITHDRAW_POUNDAGE_PROPORTION("[按比例]提现手续费比例值")
    {
        @Override
        public String getValue()
        {
            return "0.003";
        }
    },
    /**
     * 提前还款费率
     */
    FANACING_PREPAYMENT_RATES("提前还款费率")
    {
        @Override
        public String getValue()
        {
            return "0.01";
        }
    },
    /**
     * 用户自动投标:最低可用金额
     */
    AUTO_BIDING_MUST_AMOUNT("用户自动投标:最低可用金额")
    {
        @Override
        public String getValue()
        {
            return "1000";
        }
    },
    /**
     * 用户自动投标:最低投标金额
     */
    AUTO_BIDING_MIN_AMOUNT("用户自动投标:最低投标金额")
    {
        @Override
        public String getValue()
        {
            return "200";
        }
    },
    /**
     * 用户自动投标:投标金额的倍数
     */
    AUTO_BIDING_MULT_AMOUNT("用户自动投标:投标金额的倍数")
    {
        @Override
        public String getValue()
        {
            return "100";
        }
    },
    /**
     * 用户自动投标:每次投标金额
     */
    AUTO_BIDING_PER_AMOUNT("用户自动投标:每次投标金额")
    {
        @Override
        public String getValue()
        {
            return "200.00";
        }
    },
    /**
     * 用户自动投标:利息范围起
     */
    AUTO_BIDING_RATE_START("用户自动投标:利息范围起")
    {
        @Override
        public String getValue()
        {
            return "0.10";
        }
    },
    /**
     * 用户自动投标:利息范围止
     */
    AUTO_BIDING_RATE_END("用户自动投标:利息范围止")
    {
        @Override
        public String getValue()
        {
            return "0.24";
        }
    },
    /**
     * 用户自动投标:借款期限起
     */
    AUTO_BIDING_PERIOD_START("用户自动投标:借款期限起")
    {
        @Override
        public String getValue()
        {
            return "6";
        }
    },
    /**
     * 用户自动投标:借款期限止
     */
    AUTO_BIDING_PERIOD_END("用户自动投标:借款期限止")
    {
        @Override
        public String getValue()
        {
            return "18";
        }
    },
    /**
     * 用户自动投标:信用等级起(分值计)
     */
    AUTO_BIDING_CREDIT_CLASS_START("用户自动投标:信用等级起(分值计)")
    {
        @Override
        public String getValue()
        {
            return "E";
        }
    },
    /**
     * 用户自动投标:信用等级止(分值计)
     */
    AUTO_BIDING_CREDIT_CLASS_END("用户自动投标:信用等级止(分值计)")
    {
        @Override
        public String getValue()
        {
            return "AA";
        }
    },
    /**
     * 用户自动投标:账户保留余额
     */
    AUTO_BIDING_USER_ACCOUNT_REMAIN("用户自动投标:账户保留余额")
    {
        @Override
        public String getValue()
        {
            return "200.00";
        }
    },
    /**
     * 最低起投金额
     */
    MIN_BIDING_AMOUNT("最低起投金额")
    {
        @Override
        public String getValue()
        {
            return "100.00";
        }
    },
    /**
     * 投资理财特性描述
     */
    FETURE_TZLC("投资理财特性描述")
    {
        @Override
        public String getValue()
        {
            return "成为理财人，通过主动投标或加入优选理财计划将资金进行出借投资，可获得预期12-15%的稳定年化收益。";
        }
    },
    /**
     * 快捷贷款特性描述
     */
    FETURE_KJDK("快捷贷款特性描述")
    {
        @Override
        public String getValue()
        {
            return "成为借款人，按照要求完善个人信息，通过发标进行贷款，最快2小时可获得所需资金。";
        }
    },
    /**
     * 本息保障特性描述
     */
    FETURE_BZBZ("本息保障特性描述")
    {
        @Override
        public String getValue()
        {
            return "所有投资标的100%适用本息保障计划，如遇贷款人违约，${SYSTEM.SITE_NAME}将通过风险备用金有效保障理财人的本息安全。";
        }
    },
    /**
     * 低门槛
     */
    FETURE_DMK("低门槛")
    {
        @Override
        public String getValue()
        {
            return "成为借款人，按照要求完善个人信息，通过发标进行贷款，最快2小时可获得所需资金。";
        }
    },
    /**
     * 低风险
     */
    FETURE_DFX("低风险")
    {
        @Override
        public String getValue()
        {
            return "有投资标的100%适用本息保障计划，如遇贷款人违约，标准版将通过风险备用金有效保障理财人的本息安全。";
        }
    },
    /**
     * 稳收益
     */
    FETURE_WSY("稳收益")
    {
        @Override
        public String getValue()
        {
            return "理财服务，收益稳固，理财理出好生活，稳中收益好处多，优质理财，少风险多回报，浮动收益伴随您。";
        }
    },
    /**
     * 推广邀请一位充值成功的奖励
     */
    TG_CHARGE_REWARD("推广充值奖励")
    {
        @Override
        public String getValue()
        {
            return "5";
        }
    },
    /**
     * 推广奖励没人每月封顶
     */
    TG_CHARGE_REWARD_MAX("推广每月封顶")
    {
        @Override
        public String getValue()
        {
            return "50";
        }
    },
    /**
     * 推广连续奖励单笔投资金额
     */
    TG_CONTINUE_REWARD_ADD("连续奖励单笔投资金额")
    {
        @Override
        public String getValue()
        {
            return "5000";
        }
    },
    /**
     * 推广连续奖励金额
     */
    TG_CONTINUE_REWARD("连续奖励金额")
    {
        @Override
        public String getValue()
        {
            return "5";
        }
    },
    /**
     * 进入招标中多久后，才会启动自动投标(分钟)
     */
    AUTO_BIDING_START_TIME("启动自动投标时间(分钟)")
    {
        @Override
        public String getValue()
        {
            return "30";
        }
    },
    /**
     * 体验金利息返还任务自动执行时间(时)
     */
    EXPERIENCE_AUTO_TIME("体验金利息返还任务自动执行时间(时),24小时制")
    {
        @Override
        public String getValue()
        {
            return "24";
        }
    },
    /**
     * 体验金利息返还任务间隔执行时间(小时)
     */
    EXPERIENCE_EXECUTE_TIME("体验金利息返还任务间隔执行时间(小时)")
    {
        @Override
        public String getValue()
        {
            return "24";
        }
    },
    /**
     * 体验金过期任务自动执行时间(时)
     */
    EXPERIENCE_INVALID_AUTO_TIME("体验金过期任务自动执行时间(时),24小时制")
    {
        @Override
        public String getValue()
        {
            return "24";
        }
    },
    /**
     * 体验金过期任务间隔执行时间(小时)
     */
    EXPERIENCE_INVALID_TIME("体验金过期任务间隔执行时间(小时)")
    {
        @Override
        public String getValue()
        {
            return "24";
        }
    },
    /**
     *  推广活动奖励发放间隔执行时间(小时)
     */
    ACTIVITY_TIME(" 推广活动奖励发放间隔执行时间")
    {
        @Override
        public String getValue()
        {
            return "5";
        }
    },
    /**
     * 停止自动投标的进度
     */
    AUTO_BIDING_END_PROGRESS("停止自动投标的进度")
    {
        @Override
        public String getValue()
        {
            return "0.95";
        }
    },
    /**
     * 投标进度达到进度后的金额向下取多少的倍数投标
     */
    AUTO_BIDING_PROGRESS_MONEY("投标进度达到后投标的倍数")
    {
        @Override
        public String getValue()
        {
            return "100";
        }
    },
    /**
     * 单笔投标金额若超过该标借款总额的百分比
     */
    AUTO_BIDING_MAX_PERCENT("单笔投标占借款总额的百分比")
    {
        @Override
        public String getValue()
        {
            return "0.2";
        }
    },
    /**
     * 占借款总额百分比后的投标倍数
     */
    AUTO_BIDING_AMOUNT_PROGRESS_MONEY("占借款总额百分比后的投标倍数")
    {
        @Override
        public String getValue()
        {
            return "100";
        }
    },
    /**
     * 推广有效充值基数
     */
    TG_YXCZJS("推广_有效充值基数")
    {
        @Override
        public String getValue()
        {
            return "5000";
        }
    },
    /**
     * 推广有效推广奖励
     */
    TG_YXTGJL("推广_有效推广奖励")
    {
        @Override
        public String getValue()
        {
            return "5";
        }
    },
    /**
     * 推广有效推广上限
     */
    TG_YXTGSX("推广_有效推广上限")
    {
        @Override
        public String getValue()
        {
            return "50";
        }
    },
    /**
     * 推广投资基数
     */
    TG_TZJS("推广_投资基数")
    {
        @Override
        public String getValue()
        {
            return "5000";
        }
    },
    /**
     * 推广投资奖励
     */
    TG_TZJL("推广_投资奖励")
    {
        @Override
        public String getValue()
        {
            return "10";
        }
    },
    /**
     * 实名认证次数
     */
    SM_RZCS("实名认证次数")
    {
        @Override
        public String getValue()
        {
            return "2";
        }
    },
    /**
     * 邮件认证次数
     */
    YJ_RZCS("邮件认证次数")
    {
        @Override
        public String getValue()
        {
            return "10";
        }
    },
    /**
     * 短信认证次数
     */
    DX_RZCS("短信认证次数")
    {
        @Override
        public String getValue()
        {
            return "10";
        }
    },
    /**
     * 最多添加银行卡数量
     */
    MAX_BANKCARD_COUNT("最多添加银行卡数量")
    {
        @Override
        public String getValue()
        {
            return "3";
        }
    },
    /**
     * 逾期积分扣除
     */
    YQJFCF("逾期积分扣除")
    {
        @Override
        public String getValue()
        {
            return "1";
        }
    },
    /**
     * 平台所属公司名称
     */
    COMPANY_NAME("平台所属公司名")
    {
        @Override
        public String getValue()
        {
            return "深圳市迪蒙网络科技有限公司";
        }
    },
    /**
     * 平台所属公司地址
     */
    COMPANY_ADDRESS("平台所属公司地址")
    {
        @Override
        public String getValue()
        {
            return "广东省深圳市罗湖区振业大厦28楼";
        }
    },
    /**
     * 严重逾期积分扣除
     */
    YZYQJFCF("严重逾期积分扣除")
    {
        @Override
        public String getValue()
        {
            return "30";
        }
    },
    /**
     * 还请积分奖励
     */
    HQJFJL("还请积分奖励")
    {
        @Override
        public String getValue()
        {
            return "1";
        }
    },
    /**
     * 交易密码最大输入次数
     */
    WITHDRAW_MAX_INPUT("交易密码最大输入次数")
    {
        @Override
        public String getValue()
        {
            return "10";
        }
    },
    /**
     * 优选理财投资下限
     */
    YXLCTZXX("优选理财投资下限")
    {
        @Override
        public String getValue()
        {
            return "100";
        }
    },
    /**
     * 每月还款日
     */
    MYHK_DAY("每月还款日")
    {
        @Override
        public String getValue()
        {
            return "20";
        }
    },
    // /**
    // * 借款成交服务费
    // */
    // JKCJ_RATE("借款成交服务费") {
    // @OverrideF
    // public String getValue() {
    // return "0.01";
    // }
    // },
    /**
     * 持有标的天数
     */
    CYBDTS_DAY("持有标的天数")
    {
        @Override
        public String getValue()
        {
            return "90";
        }
    },
    
    /**
     * 付息方式
     */
    FXFS("付息方式")
    {
        @Override
        public String getValue()
        {
            return "GDR";
        }
    },
    /**
     * 固定日
     */
    GDR("固定日")
    {
        @Override
        public String getValue()
        {
            return "20";
        }
    },
    /**
     * 起息天数
     */
    QXTS("起息天数")
    {
        @Override
        public String getValue()
        {
            return "1";
        }
    },
    /**
     * 担保方案
     */
    DBFA("担保方案")
    {
        @Override
        public String getValue()
        {
            return "BXQEDB";
        }
    },
    /**
     * 是否自动放款
     */
    SFZDFK("是否自动放款")
    {
        @Override
        public String getValue()
        {
            return "F";
        }
    },
    /**
     * 计息日
     */
    BID_JXR("计息日")
    {
        @Override
        public String getValue()
        {
            return "1";
        }
    },
    /**
     * 是否允许流标
     */
    SFYXLB("是否允许流标")
    {
        @Override
        public String getValue()
        {
            return "F";
        }
    },
    /**
     * 第三方机构查标费用
     */
    AGENCY_CBFY("第三方机构查标费用")
    {
        @Override
        public String getValue()
        {
            return "30";
        }
    },
    /**
     * 是否资金托管
     */
    SFZJTG("是否资金托管")
    {
        @Override
        public String getValue()
        {
            return "false";
        }
    },
    /**
     * 前台Logo图片
     */
    QTLOGO("前台Logo图片")
    {
        @Override
        public String getValue()
        {
            return "logo.jpg";
        }
    },
    /**
     * 后台登录LOGO图片
     */
    HTDLLOGO("后台登录LOGO图片")
    {
        @Override
        public String getValue()
        {
            return "logo.jpg";
        }
    },
    /**
     * 违约金费率
     */
    WYJ_RATE("违约金费率")
    {
        @Override
        public String getValue()
        {
            return "0.005";
        }
    },
    /**
     * 后台首页Logo图片
     */
    HTSYLOGO("后台首页Logo图片")
    {
        @Override
        public String getValue()
        {
            return "logo.jpg";
        }
    },
    /**
     * 客服邮箱
     */
    KFYX("客服邮箱")
    {
        @Override
        public String getValue()
        {
            return "kfyx@163.com";
        }
    },
    /**
     * 客服QQ号码
     */
    KFQQ("客服QQ号码")
    {
        @Override
        public String getValue()
        {
            return "499849064";
        }
    },
    /**
     * 发标是否自己可投
     */
    BID_SFZJKT("发标是否自己可投")
    {
        @Override
        public String getValue()
        {
            return "true";
        }
    },
    /**
     * 是否推广
     */
    ACCOUNT_SFTG("是否推广")
    {
        @Override
        public String getValue()
        {
            return "true";
        }
    },
    /**
     * 还款计算:年表示的天数
     */
    REPAY_DAYS_OF_YEAR("还款计算:年表示的天数")
    {
        @Override
        public String getValue()
        {
            return "360";
        }
    },
    /**
     * 个人担保标
     */
    CREDIT_GRDBB("个人担保标")
    {
        @Override
        public String getValue()
        {
            return "个人担保标是指贷款人向${SYSTEM.SITE_NAME}的合作机构提供抵押担保，当贷款人逾期时，先由${SYSTEM.SITE_NAME}对投资人进行垫付，承担本息保障责任，再由${SYSTEM.SITE_NAME}向贷款人进行追偿的贷款。";
        }
    },
    /**
     * 个人信用标
     */
    CREDIT_GRXXB("个人信用标")
    {
        @Override
        public String getValue()
        {
            return "个人信用标是${SYSTEM.SITE_NAME}通过对贷款用户的个人信用资质进行全面审核后，允许用户发布的贷款标。";
        }
    },
    /**
     * 企业担保标
     */
    CREDIT_QYDBB("企业担保标")
    {
        @Override
        public String getValue()
        {
            return "企业担保标是指贷款人向${SYSTEM.SITE_NAME}的合作机构提供抵押担保，当贷款人逾期时，先由${SYSTEM.SITE_NAME}对投资人进行垫付，承担本息保障责任，再由${SYSTEM.SITE_NAME}向贷款人进行追偿的贷款。";
        }
    },
    /**
     * 企业信用标
     */
    CREDIT_QYXYB("企业信用标")
    {
        @Override
        public String getValue()
        {
            return "企业信用标是${SYSTEM.SITE_NAME}通过对贷款企业信用资质进行全面审核后，允许用户发布的贷款标";
        }
    },
    /**
     * 网站名称解释
     */
    SITE_DESC("网站名称解释")
    {
        @Override
        public String getValue()
        {
            return "安平贷网络金融平台是互联网金融倡导者和引领者，专业提供互联网金融信息发布及网络借贷撮合交易服务。希望通过互联网大数据应用为民间金融阳光化、为普惠金融贡献自己的一份力量";
        }
    },
    /**
     * 自动任务执行时间(时)
     */
    AUTO_TASK_TIME_HOUR("自动任务执行时间(时),24小时制[重启后生效]")
    {
        @Override
        public String getValue()
        {
            return "2";
        }
    },
    /**
     * 自动任务执行时间(分)
     */
    AUTO_TASK_TIME_MINUTE("自动任务执行时间(分)[重启后生效]")
    {
        @Override
        public String getValue()
        {
            return "0";
        }
    },
    /**
	 * 自动放款任务执行时间(时)
	 */
	LOAN_AUTO_TASK_TIME_HOUR("自动放款任务执行时间(时),24小时制") {
		@Override
		public String getValue() {
			return "2";
		}
	},
	/**
	 * 自动放款任务执行时间(分)
	 */
	LOAN_AUTO_TASK_TIME_MINUTE("自动放款任务执行时间(分)") {
		@Override
		public String getValue() {
			return "0";
		}
	},
    /**
     * 计算罚息自动任务执行间隔(分钟)
     */
    YQ_HK_FX_DATE("计算罚息自动任务执行间隔(分钟)[重启后生效]")
    {
        @Override
        public String getValue()
        {
            return "10";
        }
    },
    /**
     * 自动还款自动任务执行间隔(分钟)
     */
    AUTO_HK_DATE("自动还款自动任务执行间隔(分钟)[重启后生效]")
    {
        @Override
        public String getValue()
        {
            return "120";
        }
    },
    /**
	 * 自动放款自动任务执行间隔(分钟)
	 */
	LOAN_AUTO_HK_DATE("自动放款自动任务执行间隔(分钟)") {
		@Override
		public String getValue() {
			return "120";
		}
	},
    /**
     * 认证视频的格式(多项以逗号隔开)
     */
    AUTH_VIDEO_TYPES("认证视频的格式(多项以逗号隔开)")
    {
        @Override
        public String getValue()
        {
            return "mp4";
        }
    },
    /**
     * 认证视频的大小限制(单位:M, 系统接受最大值:50)
     */
    AUTH_VIDEO_MAX_FILE_SIZE("认证视频的大小限制(单位:M, 系统接受最大值:50)")
    {
        @Override
        public String getValue()
        {
            return "50";
        }
    },
    /**
     * 优惠券使用规则
     */
    TG_YHQSYGZ("优惠券使用规则")
    {
        @Override
        public String getValue()
        {
            return "优惠券使用规则";
        }
    },
    /**
     * 优惠劵每日使用最高额度
     */
    TG_YHQMRSYZGED("优惠劵每日使用最高额度")
    {
        @Override
        public String getValue()
        {
            return "100";
        }
    },
    
    /**
     * 优惠劵每日使用次数
     */
    TG_YHQMRSYCS("优惠劵每日使用次数")
    {
        @Override
        public String getValue()
        {
            return "1";
        }
    },
    
    /**
     * 优惠劵不能超过投资总额的 %
     */
    TG_YHJBNCGTZZE("优惠劵不能超过投资总额的")
    {
        @Override
        public String getValue()
        {
            return "0.01";
        }
    },
    
    /**
     * 本息到期，一次付清（按天计），起借天数
     */
    JK_BXDQ_LEAST_DAYS("本息到期，一次付清（按天计），起借天数")
    {
        @Override
        public String getValue()
        {
            return "1";
        }
    },
    /**
     * 公司传真地址
     */
    COMPANY_FAX("公司传真地址")
    {
        @Override
        public String getValue()
        {
            return "0755-25879477";
        }
    },
    /**
     * 公司联系电话地址
     */
    COMPANY_CONTACT_TEL("公司联系电话")
    {
        @Override
        public String getValue()
        {
            return "0755-25879788";
        }
    },
    /**
     * 接口私钥
     */
    PRI_KEY_PATH("接口私钥")
    {
        @Override
        public String getValue()
        {
            return "C:/p2p/xd/prkey.key";
        }
    },
    /**
     * 接口公钥
     */
    PUB_KEY_PATH("接口公钥")
    {
        @Override
        public String getValue()
        {
            return "C:/p2p/xd/pbkey.key";
        }
    },
    
    /**
     * 公司QQ号码
     */
    COMPANY_QQ_NUMBER("公司QQ号码")
    {
        @Override
        public String getValue()
        {
            return "8695235763";
        }
    },
    /**
     * 首页投资列表描述
     */
    INDEX_INVEST_DESC("首页投资列表描述")
    {
        @Override
        public String getValue()
        {
            return "首页投资列表描述";
        }
    },
    /**
     * 首页是否显示挡板
     */
    INDEX_SHOW_DB("首页是否显示挡板")
    {
        @Override
        public String getValue()
        {
            return "true";
        }
    },
    /**
     * 首页借款描述
     */
    INDEX_LOAN_DESC("首页借款描述")
    {
        @Override
        public String getValue()
        {
            return "首页借款描述";
        }
    },
    
    /**
     * 体验金金额
     */
    EXPERIENCE_AMOUNT("体验金金额")
    {
        @Override
        public String getValue()
        {
            return "1000.00";
        }
    },
    /**
     * 体验金活动开始时间
     */
    EXPERIENCE_START_TIME("体验金活动开始时间")
    {
        @Override
        public String getValue()
        {
            return "2014-09-23";
        }
    },
    /**
     * 体验金活动结束时间
     */
    EXPERIENCE_END_TIME("体验金活动结束时间")
    {
        @Override
        public String getValue()
        {
            return "2014-09-23";
        }
    },
    /**
     * 体验金有效天数
     */
    EXPERIENCE_VALID_DAY("体验金有效天数")
    {
        @Override
        public String getValue()
        {
            return "7";
        }
    },
    /**
     * 体验金投资有效收益月份数
     */
    EXPERIENCE_VALID_MONTH("体验金投资有效收益月份数")
    {
        @Override
        public String getValue()
        {
            return "6";
        }
    },
    
    /**
     * 绑定手机送体验金开关
     */
    EXPERIENCE_SWITCH("绑定手机送体验金开关(on为开启)")
    {
        @Override
        public String getValue()
        {
            return "on";
        }
    },
    
    /**
     * 体验金添加过期时间开关
     */
    EXPERIENCE_DEADLINE_SWITCH("体验金添加过期时间开关(on为开启)")
    {
        @Override
        public String getValue()
        {
            return "on";
        }
    },
    
    /**
     * 体验金过期任务执行开关
     */
    EXPERIENCE_INVALID_AUTO_SWITCH("体验金过期任务执行开关(on为开启)")
    {
        @Override
        public String getValue()
        {
            return "on";
        }
    },
    /**
     * 体验金过期任务执行开关
     */
    ACTIVITY_SWITCH("推广活动奖励发放开关(on为开启)")
    {
        @Override
        public String getValue()
        {
            return "on";
        }
    },
    /**
     * 普通账户充值体验金开关(on所有账户可充)
     */
    YYGR_RECHARGE_SWITCH("普通账户充值体验金开关(on所有账户可充)")
    {
        @Override
        public String getValue()
        {
            return "on";
        }
    },
    /**
     * 充值描述
     */
    USER_CHARGE_DESC("充值描述")
    {
        @Override
        public String getValue()
        {
            return "充值描述";
        }
    },
    /**
     * 提现描述
     */
    USER_WITHFRAW_DESC("提现描述")
    {
        @Override
        public String getValue()
        {
            return "提现描述";
        }
    },
    /**
     * 投标最大占比
     */
    BID_MAX_RATE("投标最大占比")
    {
        @Override
        public String getValue()
        {
            return "0.1";
        }
    },
    
    /**
     * 新手指引： 全免体验
     */
    XSYD_PROFITS_AND_FEES("全免体验")
    {
        @Override
        public String getValue()
        {
            return "开户免费、充值免费、提现免费<br />利息管理免费，让投资尽享免费体验";
        }
    },
    
    /**
     * 年化收益率
     */
    SYS_ANNUAL_YIELD("年化收益率")
    {
        @Override
        public String getValue()
        {
            return "16.";
        }
    },
    /**
     * 年化收益率尾数
     */
    SYS_ANNUAL_YIELD_DEC("年化收益率尾数")
    {
        @Override
        public String getValue()
        {
            return "00%";
        }
    },
    
    /**
     * 大于活期存款倍数
     */
    SYS_DEMAND_DEPOSIT("活期存款倍数")
    {
        @Override
        public String getValue()
        {
            return "30";
        }
    },
    
    /**
     * 大于余额宝倍数
     */
    SYS_YEB_MULTIPLE("余额宝倍数")
    {
        @Override
        public String getValue()
        {
            return "2.6";
        }
    },
    /**
     * 项目风控
     */
    AQBZ_XMFK_DESC("项目风控描述")
    {
        @Override
        public String getValue()
        {
            return "广泛的项目来源，严苛的风控体系挑选最优质的项目";
        }
    },
    /**
    * 优惠劵使用规则
    */
    TG_TBQSYGZ("优惠劵使用规则")
    {
        @Override
        public String getValue()
        {
            return "优惠劵使用规则";
        }
    },
    /**
     * 债权转让是否自己可投
     */
    ZQZR_SFZJKT("债权转让是否自己可投")
    {
        @Override
        public String getValue()
        {
            return "false";
        }
    },
    /**
     * 高收益
     */
    FETURE_GSY("高收益")
    {
        @Override
        public String getValue()
        {
            return "<span class='blue f16'><strong>49</strong></span>倍银行活期存款利息，<br/>"
                + "<span class='blue f16'><strong>3.9</strong></span>倍余额宝收益预期<br/>" + "<span class='blue f16'>"
                + "<strong>12—16%</strong></span>的稳定年化收益。";
        }
    },
    /**
     * 更安全
     */
    FETURE_GAQ("更安全")
    {
        @Override
        public String getValue()
        {
            return "机构全额担保，逾期垫付，<br/>严谨的风控体系<span class='blue f16'>"
                + "<strong>100%</strong></span>保障<br/>理财人的本息安全，投资无忧！";
        }
    },
    /**
     * 验证码超时时间 默认为3分钟 
     */
    VERIFY_CODE_TIME_OUT("验证码超时时间(毫秒)")
    {
        @Override
        public String getValue()
        {
            return "180000";
        }
    },
    /**
     * session超时时间,默认为0.5小时
     */
    SESSION_MAX_IDLE_TIME("session超时时间(毫秒)")
    {
        @Override
        public String getValue()
        {
            return "1800000";
        }
    },
    /**
     * 债权持有多少天后可转让
     */
    ZQZR_CY_DAY("债权持有多少天后可转让"){
    	@Override
        public String getValue()
        {
            return "90";
        }
    },
    /**
     * 提现手续费计算方式, ED:按额度(默认方式);BL:按比例
     */
    WITHDRAW_POUNDAGE_WAY("提现手续费计算方式, ED:按额度(默认方式);BL:按比例"){
    	@Override
        public String getValue()
        {
            return "ED";
        }
    },
    /**
     * 首页展示收益率
     */
    INDEX_SHOW_POUNDAGE("首页展示收益率"){
    	@Override
        public String getValue()
        {
            return "18%+3.6%";
        }
    },
    /**
     * 提前还款手续费率
     */
    FORWARD_REPAY_POUNDAGE("提前还款手续费率")
    {
        @Override
        public String getValue()
        {
            return "0.001";
        }
    },
    /**
     * 提前还款违约费率
     */
    
    FORWARD_REPAY_BREACH_POUNDAGE("提前还款违约费率")
    {
        @Override
        public String getValue()
        {
            return "0.001";
        }
    },
    
    FINACIAL_BEFORE_CHECK_DAYS("财务查看应还款提前天数")
    {
        @Override
        public String getValue()
        {
            return "28";
        }
    },
    
    INVEST_GIVE_EXP_FUND_SWITCH("投资送体验金开关")
    {
        @Override
        public String getValue()
        {
            return "true";
        }
    },
    
    INVEST_GIVE_EXP_START_TIME("投资送体验金活动开始时间")
    {
        @Override
        public String getValue()
        {
            return "2010-01-30";
        }
    },
    INVEST_GIVE_EXP_END_TIME("投资送体验金活动结束时间")
    {
        @Override
        public String getValue()
        {
            return "2018-01-30";
        }
    },
    /**
     * 同一IP注册限制开关(on开启限制)
     */
    RIGISTER_IP_LIMIT_SWITCH("同一IP注册限制开关(on开启限制)")
    {
        @Override
        public String getValue()
        {
            return "on";
        }
    },
    /**
     * 同一IP注册次数限制
     */
    RIGISTER_IP_LIMIT_COUNT("同一IP注册次数限制")
    {
        @Override
        public String getValue()
        {
            return "15";
        }
    },
    
    /**
     * 提现手续费扣除方式
     */
    TXSXF_KCFS("提现手续费扣除方式(true:内扣，false：外扣)")
    {
        @Override
        public String getValue()
        {
            return "true";
        }
    };
    protected final String key;
    
    protected final String description;
    
    SystemVariable(String description)
    {
        StringBuilder builder = new StringBuilder(getType());
        builder.append('.').append(name());
        key = builder.toString();
        this.description = description;
    }
    
    @Override
    public String getType()
    {
        return SystemVariable.class.getAnnotation(VariableTypeAnnotation.class).id();
    }
    
    @Override
    public String getKey()
    {
        return key;
    }
    
    @Override
    public String getDescription()
    {
        return description;
    }
    
    @Override
    public String getValue()
    {
        try (InputStreamReader reader =
            new InputStreamReader(SystemVariable.class.getResourceAsStream(getKey()), "UTF-8"))
        {
            StringBuilder builder = new StringBuilder();
            char[] cbuf = new char[1024];
            int len = reader.read(cbuf);
            while (len > 0)
            {
                builder.append(cbuf, 0, len);
                len = reader.read(cbuf);
            }
            return builder.toString();
        }
        catch (Throwable t)
        {
        }
        return null;
    }
}
