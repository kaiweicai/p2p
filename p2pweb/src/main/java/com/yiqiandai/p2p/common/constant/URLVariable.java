package com.yiqiandai.p2p.common.constant;

import java.io.InputStreamReader;

import com.yiqiandai.p2p.common.annotation.VariableTypeAnnotation;
import com.yiqiandai.p2p.common.constant.inter.VariableBean;


@VariableTypeAnnotation(id = "URL", name = "链接地址")
public enum URLVariable implements VariableBean {

	/**
	 * 网站首页地址
	 */
	INDEX("网站首页地址") {
		@Override
		public String getValue() {
			return "http://${SYSTEM.SITE_DOMAIN}";
		}
	},
	/**
	 * 用户中心地址
	 */
	USER_INDEX("用户中心地址") {
		@Override
		public String getValue() {
			return "http://${SYSTEM.SITE_DOMAIN}/user/";
		}
	},
	/**
	 * 平台账户地址
	 */
	XSZY_PTZH("平台账户地址") {
		@Override
		public String getValue() {
			return "http://${SYSTEM.SITE_DOMAIN}/xszy/ptzh.html";
		}
	},
	/**
	 * 用户实名认证地址
	 */
	USER_NCIIC("用户实名认证地址") {
		@Override
		public String getValue() {
			return "http://${SYSTEM.SITE_DOMAIN}/user/account/safetymsg.html";
		}
	},
	/**
	 * 第三方机构实名认证地址
	 */
	AGENCY_NCIIC("第三方机构实名认证地址") {
		@Override
		public String getValue() {
			return "http://${SYSTEM.SITE_DOMAIN}/agency/account/safetymsg.html";
		}
	},
	/**
	 * 站内信链接地址
	 */
	USER_LETTER("站内信链接地址") {
		@Override
		public String getValue() {
			return "http://${SYSTEM.SITE_DOMAIN}/user/letter/";
		}
	},
	/**
	 * 还款详情地址
	 */
	USER_LOAN_DETAIL("还款详情地址") {
		@Override
		public String getValue() {
			return "http://${SYSTEM.SITE_DOMAIN}/user/credit/loanDetail.html";
		}
	},
	/**
	 * 用户充值链接地址
	 */
	USER_CHARGE("用户充值链接地址") {
		@Override
		public String getValue() {
			return "http://${SYSTEM.SITE_DOMAIN}/user/capital/charge.html";
		}
	},
	/**
	 * 用户补充授权链接地址
	 */
	AUTHORIZE_URL("用户补充授权链接地址") {
		@Override
		public String getValue() {
			return "http://${SYSTEM.SITE_DOMAIN}/pay/authorize.htm";
		}
	},
	/**
	 * 用户提现链接地址
	 */
	USER_WITHDRAW("用户提现链接地址") {
		@Override
		public String getValue() {
			return "http://${SYSTEM.SITE_DOMAIN}/user/capital/withdraw.html";
		}
	},
	/**
	 * 帮助中心充值与提现连接地址
	 */
	FRONT_BZZX_CZYTX("帮助中心充值与提现连接地址") {
		@Override
		public String getValue() {
			return "http://${SYSTEM.SITE_DOMAIN}/xszy/czytx.html";
		}
	},
	/**
	 * 第三方用户充值链接地址
	 */
	AGENCY_CHARGE("第三方用户充值链接地址") {
		@Override
		public String getValue() {
			return "http://${SYSTEM.SITE_DOMAIN}/agency/capital/charge.html";
		}
	},
	/**
	 * 第三方入口
	 */
	AGENCY_LOGIN("第三方入口") {
		@Override
		public String getValue() {
			return "http://${SYSTEM.SITE_DOMAIN}/agency/login.html";
		}
	},
	/**
	 * 第三方用户提现链接地址
	 */
	AGENCY_WITHDRAW("第三方用户提现链接地址") {
		@Override
		public String getValue() {
			return "http://${SYSTEM.SITE_DOMAIN}/agency/capital/withdraw.html";
		}
	},
	/**
	 * 提现审核通过，放款
	 */
	WITHDRAW_FK("提现审核通过，放款") {
		@Override
		public String getValue() {
			return "http://${SYSTEM.SITE_DOMAIN}/pay/withdraw.htm";
		}
	},
	/**
	 * 用户资金管理链接地址
	 */
	USER_CAPITAL("用户资金管理链接地址") {
		@Override
		public String getValue() {
			return "http://${SYSTEM.SITE_DOMAIN}/user/capital/tradingRecord.html";
		}
	},
	/**
	 * 用户投资管理链接地址
	 */
	USER_FINANCING("用户投资管理链接地址") {
		@Override
		public String getValue() {
			return "http://${SYSTEM.SITE_DOMAIN}/user/financing/wdzq/hszdzq.html";
		}
	},
	/**
	 * 用户贷款管理链接地址
	 */
	USER_CREDIT("用户贷款管理链接地址") {
		@Override
		public String getValue() {
			return "http://${SYSTEM.SITE_DOMAIN}/user/credit/repaying.html";
		}
	},
	
	
	/**
	 * 支付地址入口
	 */
	PAY_INDEX("支付地址入口") {
		@Override
		public String getValue() {
			return "http://${SYSTEM.SITE_DOMAIN}/pay/";
		}
	},
	/**
	 * 充值地址入口
	 */
	PAY_CHARGE("充值地址入口") {
		@Override
		public String getValue() {
			return "http://${SYSTEM.SITE_DOMAIN}/pay/charge.htm";
		}
	},
	/**
	 * 订单查询入口
	 */
	PAY_CHECK("订单查询入口") {
		@Override
		public String getValue() {
			return "http://${SYSTEM.SITE_DOMAIN}/pay/check.htm";
		}
	},
	/**
	 * 投标入口地址
	 */
	PAY_BID_URL("投标入口地址") {
		@Override
		public String getValue() {
			return "http://${SYSTEM.SITE_DOMAIN}/pay/bid.htm";
		}
	},
	/**
	 * 体验宝投标入口地址
	 */
	TYB_BID_URL("体验宝投标入口地址") {
		@Override
		public String getValue() {
			return "http://${SYSTEM.SITE_DOMAIN}/user/financing/tytz/djtytz.htm";
		}
	},
	/**
	 * 在线客服页面地址
	 */
	CUSTOMERS("在线客服页面地址") {
		@Override
		public String getValue() {
			return "http://${SYSTEM.SITE_DOMAIN}/xszy/zxkf.html";
		}
	},
	/**
	 * 帮助中心页面地址
	 */
	HELP_CENTER("帮助中心页面地址") {
		@Override
		public String getValue() {
			return "http://${SYSTEM.SITE_DOMAIN}/xszy/";
		}
	},
	/**
	 * 帮助中心2页面地址
	 */
	HELP_CENTER2("帮助中心2页面地址") {
		@Override
		public String getValue() {
			return "http://${SYSTEM.SITE_DOMAIN}/bzzx/czytx.html";
		}
	},
	/**
	 * 我要理财产品介绍
	 */
	FINANCING_CENTER("我要理财产品介绍") {
		@Override
		public String getValue() {
			return "http://${SYSTEM.SITE_DOMAIN}/financing/";
		}
	},
	/**
	 * 中小企理财
	 */
	FINANCING_ZXQ_TB("中小企理财") {
		@Override
		public String getValue() {
			return "http://${SYSTEM.SITE_DOMAIN}/financing/sbtz/tzzq.html";
		}
	},
	/**
	 * 优选理财页面地址
	 */
	FINANCING_YX("优选理财页面地址") {
		@Override
		public String getValue() {
			return "http://${SYSTEM.SITE_DOMAIN}/financing/yxlc/";
		}
	},
	/**
	 * 亿钱体验宝页面网址
	 */
	FINANCING_TYB("亿钱体验宝页面网址") {
		@Override
		public String getValue() {
			return "http://${SYSTEM.SITE_DOMAIN}/financing/tyb/";
		}
	},
	/**
	 * 亿钱体验宝页面网址
	 */
	INTRODUCE_TYB("亿钱体验宝介绍页面网址") {
		@Override
		public String getValue() {
			return "http://${SYSTEM.SITE_DOMAIN}/yqtyb/";
		}
	},
	/**
	 * 散标投资页面地址
	 */
	FINANCING_SBTZ("散标投资页面地址") {
		@Override
		public String getValue() {
			return "http://${SYSTEM.SITE_DOMAIN}/financing/sbtz/";
		}
	},
	/**
	 * 理财频道产品介绍页面地址
	 */
	FINANCING_LCPD("理财频道产品介绍页面地址") {
		@Override
		public String getValue() {
			return "http://${SYSTEM.SITE_DOMAIN}/lcpd/index.html";
		}
	},
	/**
	 * 散标投资个人列表地址
	 */
	FINANCING_SBTZ_GR("散标投资个人列表地址") {
		@Override
		public String getValue() {
			return "http://${SYSTEM.SITE_DOMAIN}/financing/sbtz/grlb.html";
		}
	},
	/**
	 * 债权转让页面地址
	 */
	FINANCING_ZQZR("债权转让页面地址") {
		@Override
		public String getValue() {
			return "http://${SYSTEM.SITE_DOMAIN}/financing/sbtz/zqzrlb.html";
		}
	},
	
	/**
	 * 个人标页面地址
	 */
	FINANCING_GRB("个人标页面地址") {
		@Override
		public String getValue() {
			return "http://${SYSTEM.SITE_DOMAIN}/financing/sbtz/grlb.html";
		}
	},


    /**
     * 企业标页面地址
     */
    FINANCING_QYB("企业标页面地址") {
        @Override
        public String getValue() {
            return "http://${SYSTEM.SITE_DOMAIN}/financing/sbtz/index.html";
        }
    },

	/**
	 * 优选理财页面地址
	 */
	FINANCING_YX_XQ("优选理财详情页面地址") {
		@Override
		public String getValue() {
			return "http://${SYSTEM.SITE_DOMAIN}/financing/yxlc/index/";
		}
	},
	/**
	 * 散标投资页面地址
	 */
	FINANCING_SBTZ_XQ("散标投资详情页面地址") {
		@Override
		public String getValue() {
			return "http://${SYSTEM.SITE_DOMAIN}/financing/sbtz/bdxq/";
		}
	},
	/**
	 * 线下债权转让页面地址
	 */
	FINANCING_XXZQ_XQ("线下债权转让详情页面地址") {
		@Override
		public String getValue() {
			return "http://${SYSTEM.SITE_DOMAIN}/financing/xxzq/bdxq/";
		}
	},
	/**
	 * 债权转让详情页面地址
	 */
	FINANCING_ZQZR_XQ("债权转让详情页面地址") {
		@Override
		public String getValue() {
			return "http://${SYSTEM.SITE_DOMAIN}/financing/zqzr/bdxq/";
		}
	},
	/**
	 * 还款黑名单页面地址
	 */
	FINANCING_HKHMD("还款黑名单页面地址") {
		@Override
		public String getValue() {
			return "http://${SYSTEM.SITE_DOMAIN}/financing/hmd/";
		}
	},
	/**
	 * 我要借款产品介绍页面地址
	 */
	CREDIT_CENTER("我要借款产品介绍页面地址") {
		@Override
		public String getValue() {
			return "http://${SYSTEM.SITE_DOMAIN}/credit/";
		}
	},
	/**
	 * 薪金贷页面地址
	 */
	CREDIT_XJD("薪金贷页面地址") {
		@Override
		public String getValue() {
			return "http://${SYSTEM.SITE_DOMAIN}/credit/xjd/";
		}
	},
	/**
	 * 薪金贷申请地址
	 */
	CREDIT_XJD_SQ("薪金贷申请地址") {
		@Override
		public String getValue() {
			return "http://${SYSTEM.SITE_DOMAIN}/credit/xjd/xjd.html";
		}
	},
	/**
	 * 生意贷页面地址
	 */
	CREDIT_SYD("生意贷页面地址") {
		@Override
		public String getValue() {
			return "http://${SYSTEM.SITE_DOMAIN}/credit/syd/";
		}
	},
	/**
	 * 生意贷申请页面地址
	 */
	CREDIT_SYD_SQ("生意贷申请页面地址") {
		@Override
		public String getValue() {
			return "http://${SYSTEM.SITE_DOMAIN}/credit/syd/syd.html";
		}
	},
	/**
	 * 个人贷款意向页面地址
	 */
	CREDIT_DKYX("个人贷款意向页面地址") {
		@Override
		public String getValue() {
			return "http://${SYSTEM.SITE_DOMAIN}/credit/dkyx.html";
		}
	},
	/**
	 * 企业贷款意向页面地址
	 */
	CREDIT_QYDKYX("企业贷款意向页面地址") {
		@Override
		public String getValue() {
			return "http://${SYSTEM.SITE_DOMAIN}/credit/qydkyx.html";
		}
	},
	/**
	 * 登录页面地址
	 */
	LOGIN("登录页面地址") {
		@Override
		public String getValue() {
			return "http://${SYSTEM.SITE_DOMAIN}/user/login.html";
		}
	},
	/**
	 * 手机登录页面地址
	 */
	MLOGIN("登录页面地址") {
		@Override
		public String getValue() {
			return "http://${SYSTEM.SITE_DOMAIN}/user/m/login.html";
		}
	},
	/**
	 * 用户信息修改地址
	 */
	USER_INFO_UPDATE("用户信息修改地址") {
		@Override
		public String getValue() {
			return "http://${SYSTEM.SITE_DOMAIN}/user/user/userRevise.html";
		}
	},
	/**
	 * 用户信息查询地址
	 */
	USER_INFO_QUERY("用户信息查询地址") {
		@Override
		public String getValue() {
			return "http://${SYSTEM.SITE_DOMAIN}/user/userQuery.html";
		}
	},
	/**
	 * 冻结地址
	 */
	FUYOU_FREEZE_PAY_URL("冻结地址") {
		@Override
		public String getValue() {
			return "http://${SYSTEM.SITE_DOMAIN}/pay/freeze.htm";
		}
	},
	/**
	 * 解冻地址
	 */
	FUYOU_UNFREEZE_PAY_URL("解冻地址") {
		@Override
		public String getValue() {
			return "http://${SYSTEM.SITE_DOMAIN}/pay/unFreeze.htm";
		}
	},
	/**
	 * 注册页面地址
	 */
	REGISTER("注册页面地址") {
		@Override
		public String getValue() {
			return "http://${SYSTEM.SITE_DOMAIN}/user/register.html";
		}
	},
	
	/**
	 * 手机注册页面地址
	 */
	M_REGISTER("注册页面地址") {
		@Override
		public String getValue() {
			return "http://${SYSTEM.SITE_DOMAIN}/user/m/register.html";
		}
	},
	/**
	 * 用户注册提交
	 */
	REGISTER_SUBMIT("用户注册提交") {
		@Override
		public String getValue() {
			return "http://${SYSTEM.SITE_DOMAIN}/pay/register.htm";
		}
	},
	/**
	 * 用户中心注册提交
	 */
	REGISTER_SUBMIT2("用户中心注册提交") {
		@Override
		public String getValue() {
			return "http://${SYSTEM.SITE_DOMAIN}/user/register.htm";
		}
	},

    /**
     * 余额查询入口
     * add by lxl
     */
    QUERY_BLANCE("余额查询入口") {
        @Override
        public String getValue() {
            return "http://${SYSTEM.SITE_DOMAIN}/pay/userBlance.htm";
        }
    },

    /**
     * 明细查询入口
     * add by lxl
     */
    QUERY_ACCOUNT_DETAIL("明细查询入口") {
        @Override
        public String getValue() {
            return "http://${SYSTEM.SITE_DOMAIN}/pay/userAccountDetail.htm";
        }
    },

    /**
     * 转账预冻结入口
     * add by lxl
     */
    TRANSFER_BMU_FREEZE("转账预冻结入口") {
        @Override
        public String getValue() {
            return "http://${SYSTEM.SITE_DOMAIN}/pay/transferBmuAndFreeze.htm";
        }
    },

    /**
     * 划拨预冻结入口
     * add by lxl
     */
    TRANSFER_BU_FREEZE("划拨预冻结入口") {
        @Override
        public String getValue() {
            return "http://${SYSTEM.SITE_DOMAIN}/pay/transferBuAndFreeze.htm";
        }
    },

	/**
	 * 第三方注册页面地址
	 */
	AGENCY_REGISTER("第三方注册页面地址") {
		@Override
		public String getValue() {
			return "http://${SYSTEM.SITE_DOMAIN}/agency/register.html";
		}
	},
	/**
	 * 找回密码页面地址
	 */
	GET_PASSWORD("找回密码页面地址") {
		@Override
		public String getValue() {
			return "http://${SYSTEM.SITE_DOMAIN}/user/password/";
		}
	},
	/**
	 * 公司简介页面地址
	 */
	GYWM_GSJJ("公司简介页面地址") {
		@Override
		public String getValue() {
			return "http://${SYSTEM.SITE_DOMAIN}/gywm/gsjj.html";
		}
	},
	/**
	 * 合作机构页面地址
	 */
	GYWM_HZJG("合作机构页面地址") {
		@Override
		public String getValue() {
			return "http://${SYSTEM.SITE_DOMAIN}/gywm/hzjg.html";
		}
	},
	/**
	 * 联系我们页面地址
	 */
	GYWM_LXWM("联系我们页面地址") {
		@Override
		public String getValue() {
			return "http://${SYSTEM.SITE_DOMAIN}/gywm/lxwm.html";
		}
	},
	/**
	 * 常见问题页面地址
	 */
	CJ_WT("常见问题页面地址") {
		@Override
		public String getValue() {
			return "http://${SYSTEM.SITE_DOMAIN}/xszy/cjwt.html";
		}
	},
	/**
	 * 安全保障页面地址
	 */
	GYWM_AQBZ("安全保障页面地址") {
		@Override
		public String getValue() {
			return "http://${SYSTEM.SITE_DOMAIN}/gywm/aqbz.html";
		}
	},
	/**
	 * 管理团队地址
	 */
	GYWM_GLTD("管理团队地址") {
		@Override
		public String getValue() {
			return "http://${SYSTEM.SITE_DOMAIN}/gywm/gltd.html";
		}
	},
	/**
	 * 专家顾问地址
	 */
	GYWM_ZJGW("专家顾问地址") {
		@Override
		public String getValue() {
			return "http://${SYSTEM.SITE_DOMAIN}/gywm/zjgw.html";
		}
	},
	/**
	 * 媒体报道页面地址
	 */
	ZXDT_MTBD("媒体报道页面地址") {
		@Override
		public String getValue() {
			return "http://${SYSTEM.SITE_DOMAIN}/zxdt/mtbd.html";
		}
	},
	/**
	 * 社会责任页面地址
	 */
	ZXDT_SHZR("社会责任页面地址") {
		@Override
		public String getValue() {
			return "http://${SYSTEM.SITE_DOMAIN}/gywm/shzr.html";
		}
	},
	/**
	 * 招贤纳士页面地址
	 */
	GYWM_ZXNS("招贤纳士页面地址") {
		@Override
		public String getValue() {
			return "http://${SYSTEM.SITE_DOMAIN}/gywm/zxns.html";
		}
	},
	/**
	 * 散标投资地址
	 */
	TB_SBTZ("散标投资") {
		@Override
		public String getValue() {
			return "http://${SYSTEM.SITE_DOMAIN}/user/bid/sbtz.htm";
		}
	},
	/**
	 * 优选理财地址
	 */
	TB_YXLC("优选理财") {
		@Override
		public String getValue() {
			return "http://${SYSTEM.SITE_DOMAIN}/pay/financialPurchase.htm";
		}
	},
	/**
	 * 债权转让
	 */
	TB_ZQZR("债权转让") {
		@Override
		public String getValue() {
			return "http://${SYSTEM.SITE_DOMAIN}/user/bid/zqzr.htm";
		}
	},
	/**
	 * 线下债权转让
	 */
	TB_XXZQ("线下债权转让") {
		@Override
		public String getValue() {
			return "http://${SYSTEM.SITE_DOMAIN}/user/bid/xxzq.htm";
		}
	},
	/**
	 * 网站公告详情
	 */
	WZGG_XQ("网站公告详情") {
		@Override
		public String getValue() {
			return "http://${SYSTEM.SITE_DOMAIN}/zxdt/wzgg/";
		}
	},
	/**
	 * 投标中的债权
	 */
	USER_ZQTBZ("我的债权") {
		@Override
		public String getValue() {
			return "http://${SYSTEM.SITE_DOMAIN}/user/financing/wdzq/tbzdzq.html";
		}
	},
	/**
	 * 持有中的优选理财
	 */
	USER_YXLC("优选理财") {
		@Override
		public String getValue() {
			return "http://${SYSTEM.SITE_DOMAIN}/user/financing/yxlc/yxlccyz.html";
		}
	},
	/**
	 * 申请中的优选理财
	 */
	USER_YXLC_SQZ("优选理财申请中") {
		@Override
		public String getValue() {
			return "http://${SYSTEM.SITE_DOMAIN}/user/financing/yxlc/yxlcsqz.html";
		}
	},
	/**
	 * 已转入的债权
	 */
	USER_ZQYZR("已转入的债权") {
		@Override
		public String getValue() {
			return "http://${SYSTEM.SITE_DOMAIN}/user/financing/zqzr/zqyzr.html";
		}
	},
	/**
	 * 借款申请查询
	 */
	USER_JKSQCX("借款申请查询") {
		@Override
		public String getValue() {
			return "http://${SYSTEM.SITE_DOMAIN}/user/credit/apply.htm";
		}
	},
	/**
	 * 名词解释
	 */
	XSZY_MCJS("名词解释") {
		@Override
		public String getValue() {
			return "http://${SYSTEM.SITE_DOMAIN}/xszy/mcjs.html";
		}
	},
	/**
	 * 等级说明
	 */
	XSZY_DJSM("等级说明") {
		@Override
		public String getValue() {
			return "http://${SYSTEM.SITE_DOMAIN}/xszy/djsm.html";
		}
	},
	/**
	 * 身份证示例
	 */
	SL_SFZZL("身份证示例") {
		@Override
		public String getValue() {
			return "http://${SYSTEM.SITE_DOMAIN}/credit/sl/sfzsl.html";
		}
	},
	/**
	 * 身份证正面头部
	 */
	SL_SFZZL2("身份证正面头部") {
		@Override
		public String getValue() {
			return "http://${SYSTEM.SITE_DOMAIN}/credit/sl/sfzsl2.html";
		}
	},
	/**
	 * 学历样本01
	 */
	SL_XLYB1("学历样本01") {
		@Override
		public String getValue() {
			return "http://${SYSTEM.SITE_DOMAIN}/credit/sl/xlyb1sl.html";
		}
	},
	/**
	 * 学历样本02
	 */
	SL_XLYB2("学历样本02") {
		@Override
		public String getValue() {
			return "http://${SYSTEM.SITE_DOMAIN}/credit/sl/xlyb2sl.html";
		}
	},
	/**
	 * 结婚示例
	 */
	SL_JHSL("结婚示例") {
		@Override
		public String getValue() {
			return "http://${SYSTEM.SITE_DOMAIN}/credit/sl/jhsl.html";
		}
	},
	/**
	 * 收入认证
	 */
	SL_SRSL("收入认证") {
		@Override
		public String getValue() {
			return "http://${SYSTEM.SITE_DOMAIN}/credit/sl/srsl.html";
		}
	},
	/**
	 * 信用报告
	 */
	SL_XYBG("信用报告") {
		@Override
		public String getValue() {
			return "http://${SYSTEM.SITE_DOMAIN}/credit/sl/xybgsl.html";
		}
	},
	/**
	 * 房产示例
	 */
	SL_FCSL("房产示例") {
		@Override
		public String getValue() {
			return "http://${SYSTEM.SITE_DOMAIN}/credit/sl/fcsl.html";
		}
	},
	/**
	 * 车辆行驶证
	 */
	SL_GCSL("车辆行驶证") {
		@Override
		public String getValue() {
			return "http://${SYSTEM.SITE_DOMAIN}/credit/sl/gcsl.html";
		}
	},
	/**
	 * 和车辆合影
	 */
	SL_GCHYSL("和车辆合影") {
		@Override
		public String getValue() {
			return "http://${SYSTEM.SITE_DOMAIN}/credit/sl/gchysl.html";
		}
	},
	/**
	 * 本息保障计划
	 */
	XY_BXBZ("本息保障计划") {
		@Override
		public String getValue() {
			return "http://${SYSTEM.SITE_DOMAIN}/term/BXBZ.html";
		}
	},
	/**
	 * 注册协议
	 */
	XY_ZCXY("注册协议") {
		@Override
		public String getValue() {
			return "http://${SYSTEM.SITE_DOMAIN}/term/ZCXY.html";
		}
	},
	/**
	 * 债权转让及受让协议
	 */
	XY_ZQZRXY("债权转让及受让协议") {
		@Override
		public String getValue() {
			return "http://${SYSTEM.SITE_DOMAIN}/term/ZQZRXY.html";
		}
	},
	/**
	 * 优选理财协议范本
	 */
	XY_YXLCXY("优选理财协议范本") {
		@Override
		public String getValue() {
			return "http://${SYSTEM.SITE_DOMAIN}/term/YXLCXY.html";
		}
	},
	/**
	 * 借款协议(实)
	 */
	XY_SDRZBXY("借款协议(实)") {
		@Override
		public String getValue() {
			return "http://${SYSTEM.SITE_DOMAIN}/term/SDRZBXY.html";
		}
	},
	/**
	 * 借款协议(信)
	 */
	XY_XYRZBXY("借款协议(信)") {
		@Override
		public String getValue() {
			return "http://${SYSTEM.SITE_DOMAIN}/term/XYRZBXY.html";
		}
	},
	/**
	 * 借款协议(担保)
	 */
	XY_DBBXY("借款协议(担保)") {
		@Override
		public String getValue() {
			return "http://${SYSTEM.SITE_DOMAIN}/term/DBBXY.html";
		}
	},
	/**
	 * 借款协议(实、保)
	 */
	JKXYSB("借款协议(实、保)") {
		@Override
		public String getValue() {
			return "http://${SYSTEM.SITE_DOMAIN}/term/JKXYSB.html";
		}
	},
	/**
	 * 债权转让说明书
	 */
	ZQZRSMS("债权转让说明书") {
		@Override
		public String getValue() {
			return "http://${SYSTEM.SITE_DOMAIN}/term/ZQZRSMS.html";
		}
	},
	/**
	 * 什么是信用等级
	 */
	XSZY_MCJS_SB_XYDJ("什么是信用等级") {
		@Override
		public String getValue() {
			return "http://${SYSTEM.SITE_DOMAIN}/xszy/mcjs.html";
		}
	},
	/**
	 * 什么是信用认证标
	 */
	XSZY_MCJS_SB_XYRZB("什么是信用认证标") {
		@Override
		public String getValue() {
			return "http://${SYSTEM.SITE_DOMAIN}/xszy/mcjs.html";
		}
	},
	/**
	 * 什么是机构担保标
	 */
	XSZY_MCJS_SB_JGDBB("什么是机构担保标") {
		@Override
		public String getValue() {
			return "http://${SYSTEM.SITE_DOMAIN}/xszy/mcjs.html";
		}
	},
	/**
	 * 什么是实地认证标
	 */
	XSZY_MCJS_SB_SDRZB("什么是实地认证标") {
		@Override
		public String getValue() {
			return "http://${SYSTEM.SITE_DOMAIN}/xszy/mcjs.html";
		}
	},
	/**
	 * 什么是债权转让
	 */
	XSZY_MCJS_ZQ_ZQZR("什么是债权转让") {
		@Override
		public String getValue() {
			return "http://${SYSTEM.SITE_DOMAIN}/xszy/mcjs.html";
		}
	},
	/**
	 * 债权的价值如何计算
	 */
	XSZY_MCJS_ZQ_ZQDJZ("债权的价值计算") {
		@Override
		public String getValue() {
			return "http://${SYSTEM.SITE_DOMAIN}/xszy/mcjs.html";
		}
	},
	/**
	 * 债权转让如何收费
	 */
	XSZY_MCJS_ZQ_ZQDFY("债权转让如何收费") {
		@Override
		public String getValue() {
			return "http://${SYSTEM.SITE_DOMAIN}/xszy/mcjs.html";
		}
	},
	/**
	 * 什么情况下债权价值会变化
	 */
	XSZY_MCJS_ZQ_ZQJZBH("债权价值变化") {
		@Override
		public String getValue() {
			return "http://${SYSTEM.SITE_DOMAIN}/xszy/mcjs.html";
		}
	},
	/**
	 * 如何转出债权
	 */
	XSZY_MCJS_ZQ_ZCZQ("转出债权") {
		@Override
		public String getValue() {
			return "http://${SYSTEM.SITE_DOMAIN}/xszy/mcjs.html";
		}
	},
	/**
	 * 什么情况下债权会被锁定
	 */
	XSZY_MCJS_ZQ_SDZQ("债权的锁定") {
		@Override
		public String getValue() {
			return "http://${SYSTEM.SITE_DOMAIN}/xszy/mcjs.html";
		}
	},
	/**
	 * 如何转入债权
	 */
	XSZY_MCJS_ZQ_ZRZQ("转入债权") {
		@Override
		public String getValue() {
			return "http://${SYSTEM.SITE_DOMAIN}/xszy/mcjs.html";
		}
	},
	/**
	 * 什么样的债权可以转让？
	 */
	XSZY_MCJS_ZQ_KYZRDZQ("债权可以转让") {
		@Override
		public String getValue() {
			return "http://${SYSTEM.SITE_DOMAIN}/xszy/mcjs.html";
		}
	},
	/**
	 * 理财计算器
	 */
	LC_LCJSQ("理财计算器") {
		@Override
		public String getValue() {
			return "http://${SYSTEM.SITE_DOMAIN}/credit/lcjsq.html";
		}
	},
	/**
	 * 什么情况下购买债权会失败
	 */
	XSZY_MCJS_ZQ_GMZQSB("购买债权会失败") {
		@Override
		public String getValue() {
			return "http://${SYSTEM.SITE_DOMAIN}/xszy/mcjs.html";
		}
	},
	/**
	 * 平台电子协议地址
	 */
	XY_PTDZXY("平台电子协议地址") {
		@Override
		public String getValue() {
			return "http://${SYSTEM.SITE_DOMAIN}/financing/agreement/index.htm";
		}
	},
	/**
	 * 人信用融资意向页面地址
	 */
	CREDIT_GRXYRZ("个人信用融资意向页面地址") {
		@Override
		public String getValue() {
			return "http://${SYSTEM.SITE_DOMAIN}/credit/rzyx/grxy.html";
		}
	},
	/**
	 * 个人担保融资意向页面地址
	 */
	CREDIT_GRDBRZ("个人担保融资意向页面地址") {
		@Override
		public String getValue() {
			return "http://${SYSTEM.SITE_DOMAIN}/credit/rzyx/grdb.html";
		}
	},
	/**
	 * 企业信用融资意向页面地址
	 */
	CREDIT_QYXYRZ("企业信用融资意向页面地址") {
		@Override
		public String getValue() {
			return "http://${SYSTEM.SITE_DOMAIN}/credit/rzyx/qyxy.html";
		}
	},
	/**
	 * 企业贷款意向页面地址
	 */
	CREDIT_QYDBRZ("企业担保融资意向页面地址") {
		@Override
		public String getValue() {
			return "http://${SYSTEM.SITE_DOMAIN}/credit/rzyx/qydb.html";
		}
	},
	/**
	 * 我要找项目
	 */
	CREDIT_TZYX("我要找项目") {
		@Override
		public String getValue() {
			return "http://${SYSTEM.SITE_DOMAIN}/credit/rzyx/wyzxm.html";
		}
	},
	/**
	 * 新浪微薄关注
	 */
	XLWBGZ("新浪微薄关注") {
		@Override
		public String getValue() {
			return "http://${SYSTEM.SITE_DOMAIN}";
		}
	},
	/**
	 * 银行卡管理
	 */
	CARD_MANAGE("银行卡管理") {
		@Override
		public String getValue() {
			return "http://${SYSTEM.SITE_DOMAIN}/user/account/bankcardlist.html";
		}
	},
	/**
	 * 第三方托管，用户注册地址
	 */
	ESCROW_URL_USERREGISTER("第三方托管，用户注册地址") {
		@Override
		public String getValue() {
			return "http://${SYSTEM.SITE_DOMAIN}/pay/userRegister.htm";
		}
	},
	/**
	 * 第三方托管，提现
	 */
	ESCROW_URL_WITHDRAW("第三方托管，提现") {
		@Override
		public String getValue() {
			return "http://${SYSTEM.SITE_DOMAIN}/pay/withdraw.htm";
		}
	},
	/**
	 * 第三方托管，绑定银行卡
	 */
	ESCROW_URL_BINDCARD("第三方托管，绑定银行卡") {
		@Override
		public String getValue() {
			return "http://${SYSTEM.SITE_DOMAIN}/pay/bindCard.htm";
		}
	},
	/**
	 * 第三方托管，解除银行卡绑定
	 */
	ESCROW_URL_UNBINDCARD("第三方托管，解除银行卡绑定") {
		@Override
		public String getValue() {
			return "http://${SYSTEM.SITE_DOMAIN}/pay/unbindCard.htm";
		}
	},
	/**
	 * 第三方托管，债权转让
	 */
	ESCROW_URL_EXCHANGE("第三方托管，债权转让") {
		@Override
		public String getValue() {
			return "http://${SYSTEM.SITE_DOMAIN}/pay/bidExchange.htm";
		}
	},
	/**
	 * 担保模式页面地址
	 */
	YWMS_URL_DBMS("担保模式页面地址") {
		@Override
		public String getValue() {
			return "http://${SYSTEM.SITE_DOMAIN}/ywms/dbms.html";
		}
	},
	/**
	 * 融租模式页面地址
	 */
	YWMS_URL_RZMS("融租模式页面地址") {
		@Override
		public String getValue() {
			return "http://${SYSTEM.SITE_DOMAIN}/ywms/rzms.html";
		}
	},
	/**
	 * 债权模式页面地址
	 */
	YWMS_URL_ZQMS("债权模式页面地址") {
		@Override
		public String getValue() {
			return "http://${SYSTEM.SITE_DOMAIN}/ywms/zqms.html";
		}
	},

	/**
	 * 合作金融机构页面地址
	 */
	AQBZ_URL_HZJRJG("合作金融机构页面地址") {
		@Override
		public String getValue() {
			return "http://${SYSTEM.SITE_DOMAIN}/aqbz/hzjrjg.html";
		}
	},
	/**
	 * 信审风控体系页面地址
	 */
	AQBZ_URL_XSFKTX("信审风控体系页面地址") {
		@Override
		public String getValue() {
			return "http://${SYSTEM.SITE_DOMAIN}/aqbz/xsfktx.html";
		}
	},

	/**
	 * CFCA战略合作页面地址
	 */
	AQBZ_URL_CFCAZLHZ("CFCA战略合作页面地址") {
		@Override
		public String getValue() {
			return "http://${SYSTEM.SITE_DOMAIN}/aqbz/cfcazlhz.html";
		}
	},
	/**
	 * 政策法规保障页面地址
	 */
	YWMS_URL_ZCFGBZ("政策法规保障页面地址") {
		@Override
		public String getValue() {
			return "http://${SYSTEM.SITE_DOMAIN}/aqbz/zcfgbz.html";
		}
	},
	/**
	 * 公司新浪微博地址
	 */
	COMPANY_SINA_URL("公司新浪微博地址") {
		@Override
		public String getValue() {
			return "http://${SYSTEM.SITE_DOMAIN}";
		}
	},
	/**
	 * 公司腾讯微博地址
	 */
	COMPANY_TECENT_URL("公司腾讯微博地址") {
		@Override
		public String getValue() {
			return "http://${SYSTEM.SITE_DOMAIN}";
		}
	},
	/**
	 * 公司QQ空间地址
	 */
	COMPANY_QQZONE_URL("公司QQ空间地址") {
		@Override
		public String getValue() {
			return "http://${SYSTEM.SITE_DOMAIN}";
		}
	},
	/**
	 * 公司微信地址
	 */
	COMPANY_WECHAT_URL("公司微信地址") {
		@Override
		public String getValue() {
			return "http://${SYSTEM.SITE_DOMAIN}";
		}
	},
	/**
	 * 自动投标地址
	 */
	USER_AUTO_BID("自动投标地址") {
		@Override
		public String getValue() {
			return "http://${SYSTEM.SITE_DOMAIN}/user/financing/zdtb/index.html";
		}
	},
	/**
	 * 理财统计
	 */
	USER_FINANCING_STATISTICS("理财统计") {
		@Override
		public String getValue() {
			return "http://${SYSTEM.SITE_DOMAIN}/user/financing/financingStatistics.html";
		}
	},
	/**
	 * 网站手机端访问地址
	 */
	SITE_PHONE_URL("网站手机端访问地址") {
		@Override
		public String getValue() {
			return "http://${SYSTEM.SITE_DOMAIN}/";
		}
	},
	/**
	 * 新手引导：利息和费用
	 */
	XSYD_PROFITS_AND_FEES("新手引导：利息和费用") {
		@Override
		public String getValue() {
			return "http://${SYSTEM.SITE_DOMAIN}/xszy/lxhfy.html";
		}
	},
	/**
	 * 新手引导：我要投资
	 */
	XSYD_INVEST("新手引导：我要投资") {
		@Override
		public String getValue() {
			return "http://${SYSTEM.SITE_DOMAIN}/xszy/wylc.html";
		}
	},
	/**
	 * 新手引导：我要借款
	 */
	XSYD_BORROW("新手引导：我要借款") {
		@Override
		public String getValue() {
			return "http://${SYSTEM.SITE_DOMAIN}/xszy/wyjk.html";
		}
	},
	/**
	 * 新手引导：平台介绍
	 */
	XSYD_INTRO_PLATFORM("新手引导：平台介绍") {
		@Override
		public String getValue() {
			return "http://${SYSTEM.SITE_DOMAIN}/xszy/ptjs.html";
		}
	},
	/**
	 * 新手引导页
	 */
	XSYD_INDEX("新手引导页") {
		@Override
		public String getValue() {
			return "http://${SYSTEM.SITE_DOMAIN}/xszy/";
		}
	},
	/**
	 * 项目风控
	 */
	GYWM_XMFK("项目风控页") {
		@Override
		public String getValue() {
			return "http://${SYSTEM.SITE_DOMAIN}/gywm/xmfk.html";
		}
	},
	/**
	 * 公司资质
	 */
	GYWM_GSZZ("公司资质页") {
		@Override
		public String getValue() {
			return "http://${SYSTEM.SITE_DOMAIN}/gywm/gszz.html";
		}
	},
	/**
	 * 公司资质
	 */
	GYWM_FLHG("法律合规页") {
		@Override
		public String getValue() {
			return "http://${SYSTEM.SITE_DOMAIN}/gywm/flhg.html";
		}
	},
	/**
	 * 公司资质
	 */
	GYWM_ZJAQ("法律合规页") {
		@Override
		public String getValue() {
			return "http://${SYSTEM.SITE_DOMAIN}/gywm/zjaq.html";
		}
	},
	/**
	 * 利息和费用
	 */
	XSZY_LXHFY("利息和费用页") {
		@Override
		public String getValue() {
			return "http://${SYSTEM.SITE_DOMAIN}/xszy/lxhfy.html";
		}
	},
	/**
	 * 平台介绍
	 */
	XSZY_PTJS("平台介绍页") {
		@Override
		public String getValue() {
			return "http://${SYSTEM.SITE_DOMAIN}/xszy/ptjs.html";
		}
	},
	/**
	 * 合作机构
	 */
	XSZY_HZJG("合作机构页") {
		@Override
		public String getValue() {
			return "http://${SYSTEM.SITE_DOMAIN}/xszy/hzjg.html";
		}
	},
	/**
	 * 网贷行业资讯
	 */
	ZXDT_WDHYZX("网贷行业资讯") {
		@Override
		public String getValue() {
			return "http://${SYSTEM.SITE_DOMAIN}/zxdt/wdhyzx.html";
		}
	},
	/**
	 * 首页购买转让债权地址
	 */
	ZQZR_FOR_INDEX("首页购买转让债权地址") {
		@Override
		public String getValue() {
			return "http://${SYSTEM.SITE_DOMAIN}/user/bid/zqzrForIndex.htm";
		}
	},
	/**
	 * 新手引导：平台介绍
	 */
	XSYD_PTJS("新手引导：平台介绍") {
		@Override
		public String getValue() {
			return "http://${SYSTEM.SITE_DOMAIN}/xszy/ptjs.html";
		}
	},
	
	/**
	 * 业绩报告
	 */
	YJBG("业绩报告") {
		@Override
		public String getValue() {
			return "http://${SYSTEM.SITE_DOMAIN}/zxdt/yjbg.htm";
		}
	},
	/**
	 * 项目风控
	 */
	AQBZ_XMFK("项目风控") {
		@Override
		public String getValue() {
			return "http://${SYSTEM.SITE_DOMAIN}/gywm/xmfk.htm";
		}
	},
	/**
	 * 资金安全
	 */
	AQBZ_ZJAQ("资金安全") {
		@Override
		public String getValue() {
			return "http://${SYSTEM.SITE_DOMAIN}/gywm/zjaq.htm";
		}
	},
	/**
	 * 法律合规
	 */
	AQBZ_FLHG("法律合规") {
		@Override
		public String getValue() {
			return "http://${SYSTEM.SITE_DOMAIN}/gywm/flhg.htm";
		}
	},
	/**
	 * 本息保障
	 */
	AQBZ_BXDB("本息保障") {
		@Override
		public String getValue() {
			return "http://${SYSTEM.SITE_DOMAIN}/gywm/bxdb.htm";
		}

	},
	/**
	 * 新手专享
	 */
	INDEX_XSZX("新手专享") {
		@Override
		public String getValue() {
			return "http://${SYSTEM.SITE_DOMAIN}/financing/sbtz/xszx.html";
		}
	},
	/**
	 * 协议条款
	 */
	XSYD_XYTK("协议条款") {
		@Override
		public String getValue() {
			return "http://${SYSTEM.SITE_DOMAIN}/xszy/xytk.htm";
		}
	},
	/**
	 * 充值与提现
	 */
	XSYD_CZYTX("充值与提现") {
		@Override
		public String getValue() {
			return "http://${SYSTEM.SITE_DOMAIN}/xszy/czytx.htm";
		}
	},
	/**
	 * 投资与回款
	 */
	XSYD_TZYHK("投资与回款") {
		@Override
		public String getValue() {
			return "http://${SYSTEM.SITE_DOMAIN}/xszy/tzyhk.htm";
		}
	},
	/**
	 * 账户与安全
	 */
	XSYD_ZHYAQ("账户与安全") {
		@Override
		public String getValue() {
			return "http://${SYSTEM.SITE_DOMAIN}/xszy/zhyaq.htm";
		}
	},

    /**
     * 接口测试地址访问页面
     * add by lxl
     */
    TEST_INTERFACE("接口测试地址访问页面") {
        @Override
        public String getValue() {
            return "http://${SYSTEM.SITE_DOMAIN}/test.html";
        }
    },

    /**
     * 余额查询接口地址成功页面
     * add by lxl
     */
    QUERY_BLANCE_SUCC("余额查询接口地址成功页面") {
        @Override
        public String getValue() {
            return "http://${SYSTEM.SITE_DOMAIN}/user/succ.html";
        }
    },
    
    /**
	 * 新手指引-投资指引
	 */
	XSZY_TZZY("新手指引-投资指引") {
		@Override
		public String getValue() {
			return "http://${SYSTEM.SITE_DOMAIN}/xszy/tzzy.htm";
		}

	},
	
	/**
	 * 新手指引-融资指引
	 */
	XSZY_RZZY("新手指引-融资指引") {
		@Override
		public String getValue() {
			return "http://${SYSTEM.SITE_DOMAIN}/xszy/rzzy.htm";
		}

	},
	
	/**
	 * 我的推广
	 */
	WDTG("我的推广"){
		@Override
		public String getValue() {
			return "http://${SYSTEM.SITE_DOMAIN}/user/spread/wdtg.html";
		}
		
	},
	
	/**
	 * 我要推广
	 */
	WYTG("我要推广"){
		@Override
		public String getValue() {
			return "http://${SYSTEM.SITE_DOMAIN}/user/spread/wytg.html";
		}
		
	},
	
	AQRZ("安全认证页面"){
		@Override
		public String getValue() {
			return "http://${SYSTEM.SITE_DOMAIN}/user/account/safetymsg.html";
		}
	},
	
	/**
	 * 注册与登录
	 */
	XSYD_ZCYDL("注册与登录") {
		@Override
		public String getValue() {
			return "http://${SYSTEM.SITE_DOMAIN}/xszy/zcydl.htm";
		}
	},
	/**
	 * 用户认证信息地址
	 */
	USER_RZXX("认证信息") {
		@Override
		public String getValue() {
			return "http://${SYSTEM.SITE_DOMAIN}/user/account/attestationmsg.html";
		}
    },
    /**
     * APP下载链接
     */
    APP_DOWNLOAD("APP下载链接")
    {
        @Override
        public String getValue()
        {
            return "http://${SYSTEM.SITE_DOMAIN}/app/downloadApp.htm";
        }
    },
    
    EXP_BID_DESCR("体验宝详情连接")
    {
        @Override
        public String getValue()
        {
            return "http://${SYSTEM.SITE_DOMAIN}/financing/tyb/index.html";
        }
    };

	protected final String key;
	protected final String description;

	URLVariable(String description) {
		StringBuilder builder = new StringBuilder(getType());
		builder.append('.').append(name());
		key = builder.toString();
		this.description = description;
	}

	@Override
	public String getType() {
		return URLVariable.class.getAnnotation(VariableTypeAnnotation.class)
				.id();
	}

	@Override
	public String getKey() {
		return key;
	}

	@Override
	public String getDescription() {
		return description;
	}

	@Override
	public String getValue() {
		try (InputStreamReader reader = new InputStreamReader(
				URLVariable.class.getResourceAsStream(getKey()), "UTF-8")) {
			StringBuilder builder = new StringBuilder();
			char[] cbuf = new char[1024];
			int len = reader.read(cbuf);
			while (len > 0) {
				builder.append(cbuf, 0, len);
				len = reader.read(cbuf);
			}
			return builder.toString();
		} catch (Throwable t) {
		}
		return null;
	}
	
	public static void main(String[] args) {
		System.out.println(URLVariable.APP_DOWNLOAD.getKey());
		System.out.println(URLVariable.APP_DOWNLOAD.getValue());
	}
}
