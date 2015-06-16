<!DOCTYPE html>
<html lang="zh-cn">
<head>
	<%@include file="/WEB-INF/jsp/inc/layout.jsp"%>
	<%@include file="/WEB-INF/jsp/inc/meta.jsp"%>
    <meta charset="UTF-8">
    <title>专业的融资服务交易平台－商道界</title>
	<meta name="Keywords" content="${Keywords} " />
	<meta name="Description" content="${Description}" />
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="renderer" content="webkit">
</head>
<body>
	<div class="mainmenu-wrapper">
	        <div class="container">
	        	<div class="menuextras">
					<div class="extras">
						<ul>
							<li>
	        					<b>欢迎致电</b>
	        				</li>
	        				<li>
	        					<b class="text-danger">${pone400}</b>
	        				</li>
	        				<li>
	        					<a href="${sdjweburl}" target="_blank"><img src="${BASE_PATH}/assets/images/flags/ad.png" alt="商道界微博"/></a>
	        				</li>
	        				<li>
	        					<a href="${sdjwxurl}" target="_blank"><img src="${BASE_PATH}/assets/images/flags/cn.png" alt="微信二维码"/></a>
	        				</li>
	        				<li ><a href="http://www.trjcn.com/manage/home.html">我的商道界</a></li>
							<li ><a href="http://www.trjcn.com/help.html">新手指导</a></li>
                            <li>
                                 <span>手机投融界</span>
                            </li>
			        	</ul>
					</div>
		        </div>
		        <nav id="mainmenu" class="mainmenu">
					<ul>
						<li class="logo-wrapper">
							<a href="index.html">
								<img src="${BASE_PATH}/assets/images/less-logo.png" alt="Multipurpose Twitter Bootstrap Template" width="80px" height="50px">
							</a>
						</li>
						<li>
							<b>专业的融资服务交易平台</b>
						</li>
						<li class="active"><a href="http://www.trjcn.com" title="首页">首页</a></li>
		                <li><a href="http://zijin.trjcn.com" title="找资金">找资金</a></li>
		                <li><a href="http://xiangmu.trjcn.com" title="选项目">选项目</a></li>
		                <li><a href="http://huodong.trjcn.com" title="活动">活动</a></li>
		                <li><a href="http://zhiku.trjcn.com" title="投融学院">投融学院</a></li>
		                <li><a href="http://www.trjcn.com/service.html" title="投融服务">投融服务</a></li>
					</ul>
				</nav>
			</div>
		</div>

		<!-- 滑动页 -->
		<div class="homepage-slider">
        	<div id="sequence">
				<ul class="sequence-canvas">
					<!-- Slide 1 -->
					<li class="bg4 animate-out" style="display: list-item; opacity: 1; z-index: 1;">
						<!-- Slide Title -->
						<h2 class="title" style="">专业的投资渠道</h2>
						<!-- Slide Text -->
						<h3 class="subtitle" style="">提供最严格的审核,为客户打造最专业的投资渠道</h3>
						<!-- Slide Image -->
						<img class="slide-img" src="${BASE_PATH}/assets/images/homepage-slider/slide1.png" alt="Slide 1" style="">
					</li>
					<!-- End Slide 1 -->
					<!-- Slide 2 -->
					<li class="bg3 animate-out" style="display: list-item; opacity: 1; z-index: 1;">
						<!-- Slide Title -->
						<h2 class="title" style="">完全免费</h2>
						<!-- Slide Text -->
						<h3 class="subtitle" style="">投资方,项目方,中介方全部都免费.</h3>
						<!-- Slide Image -->
						<img class="slide-img" src="${BASE_PATH}/assets/images/homepage-slider/slide2.png" alt="Slide 2" style="">
					</li>
					<!-- End Slide 2 -->
					<!-- Slide 3 -->
					<li class="bg1 animate-in" style="display: list-item; opacity: 1; z-index: 3;">
						<!-- Slide Title -->
						<h2 class="title" style="">为中国崛起而努力</h2>
						<!-- Slide Text -->
						<h3 class="subtitle" style="">中国的崛起依靠我们所有人的努力.</h3>
						<!-- Slide Image -->
						<img class="slide-img" src="${BASE_PATH}/assets/images/homepage-slider/slide3.png" alt="Slide 3" style="">
					</li>
					<!-- End Slide 3 -->
				</ul>
				<div class="sequence-pagination-wrapper">
					<ul class="sequence-pagination" style="display: block;">
						<li class="">1</li>
						<li class="">2</li>
						<li class="current">3</li>
					</ul>
				</div>
			</div>
        </div>

                    
    <div class="login">
    	<div class="ui-tab login-tab " id="login-tab">
            <div class="ui-tab-head">
                <ul>
                    <li class="ui-tab-head-current">登录<i class="ui-tab-head-bg"></i></li>
                </ul>
            </div>
            <div class="ui-tab-cont">
                <div class="login-form" >
                <form id="J_loginfrm">
                    <ul>
                        <li><input class="form-control" type="text" id="login_username" maxlength="20" placeholder="手机号码">
                        <p id="login-msg"></p></li>
                        <li class="">
                        <input class="form-control" type="password" id="login_password" maxlength="20" class="" placeholder="密码" value="">
                        <li>
                        	<span class="text-danger">
                        		<a href="http://www.trjcn.com/login/forget.html" target="_blank">忘记密码？</a>
                        	</span>
                        	<input class="form-control" type="submit" value="登录"> 
                        </li>
                    </ul>
                </form>
                </div>
            </div>
        </div>
        <div class="login-bg"></div>
    </div>
                
                <div class="focus-nav"><ul></ul></div>
            </div>
            <div class="container">
                
                <div class="look-tab" id="look-tab">
                    <div class="ui-tab-head look-tab-head">
                        <ul>
                            <li id="look-tab-2"  class="ui-tab-head-current" ><span class="look-title">找资金</span></li>
                            <li ><span  class="look-title">选项目</span></li>
                        </ul>
                    </div>
                    <div class="ui-tab-cont look-tab-cont">
                        <div class="look-item ">
                            <form class="look-form fn-clear" action="http://zijin.trjcn.com">
                                <input name="k" type="text" id="J_keyword_zj" class="input-look-search J_placeholder" maxlength="30" tip="输入你想找的资金，来试试吧…" value="输入你想找的资金，来试试吧…">
                                <button class="btn-look-search J_search_submit" type="submit">搜资金</button>
                            </form>
                            <div class="look-sort fn-clear">
                                <dl class="look-grid-01">
                                    <dt>投资方式</dt>
                                    <dd><a href="http://zijin.trjcn.com/list_2010.html" target="_blank">股权投资</a></dd>
                                    <dd><a href="http://zijin.trjcn.com/list_2011.html" target="_blank">债权投资</a></dd>
                                    <dd><a href="http://zijin.trjcn.com/list_2012.html" target="_blank">金融投资</a></dd>
                                    <dd><a href="http://zijin.trjcn.com/list_2013.html" target="_blank">BT/BOT投资</a></dd>
                                </dl>
                                <dl class="look-grid-03">
                                    <dt>资金主体</dt>
                                    <dd><a href="http://zijin.trjcn.com/list_1000.html?d94=600" target="_blank">个人资金</a></dd>
                                    <dd><a href="http://zijin.trjcn.com/list_1000.html?d94=601" target="_blank">企业资金</a></dd>
                                    <dd><a href="http://zijin.trjcn.com/list_1000.html?d94=602" target="_blank">天使投资</a></dd>
                                    <dd><a href="http://zijin.trjcn.com/list_1000.html?d94=603" target="_blank">VC投资</a></dd>
                                    <dd><a href="http://zijin.trjcn.com/list_1000.html?d94=604" target="_blank">PE投资</a></dd>
                                    <dd><a href="http://zijin.trjcn.com/list_1000.html?d94=605" target="_blank">小额贷款</a></dd>
                                    <dd><a href="http://zijin.trjcn.com/list_1000.html?d94=609" target="_blank">投资公司</a></dd>
                                    <dd><a href="http://zijin.trjcn.com/list_1000.html?d94=610" target="_blank">商业银行</a></dd>
                                    <dd><a href="http://zijin.trjcn.com/list_1000.html?d94=611" target="_blank">基金公司</a></dd>
                                    <dd><a href="http://zijin.trjcn.com/list_1000.html?d94=612" target="_blank">证券公司</a></dd>
                                    <dd><a href="http://zijin.trjcn.com/list_1000.html?d94=607" target="_blank">担保公司</a></dd>
                                    <dd><a href="http://zijin.trjcn.com/list_1000.html" target="_blank">更多</a></dd>
                                </dl>
                                <dl class="look-grid-02">
                                    <dt>投资金额</dt>
                                    <dd><a href="http://zijin.trjcn.com/list_1000.html?m=2" target="_blank">1-10万</a></dd>
                                    <dd><a href="http://zijin.trjcn.com/list_1000.html?m=3" target="_blank">10-50万</a></dd>
                                    <dd><a href="http://zijin.trjcn.com/list_1000.html?m=4" target="_blank">50-100万</a></dd>
                                    <dd><a href="http://zijin.trjcn.com/list_1000.html?m=5" target="_blank">100-500万</a></dd>
                                    <dd><a href="http://zijin.trjcn.com/list_1000.html?m=6" target="_blank">500-1000万</a></dd>
                                    <dd><a href="http://zijin.trjcn.com/list_1000.html?m=7" target="_blank">1000-5000万</a></dd>
                                    <dd><a href="http://zijin.trjcn.com/list_1000.html?m=8" target="_blank">5000万-1亿</a></dd>
                                    <dd><a href="http://zijin.trjcn.com/list_1000.html?m=9" target="_blank">1亿以上</a></dd>
                                </dl>
                            </div>
                            <div class="look-tips">
                                不知道怎么找？<a href="###" id="J_btn_look_fund"  class="btn-look-tips fn-ml-10">填写项目信息，帮您找资金</a>
                            </div>
                        </div>
                        <div class="look-item">
                            <form class="look-form fn-clear" action="http://xiangmu.trjcn.com">
                                <input type="text" name="k" id="J_keyword_xm" class="input-look-search item J_placeholder" maxlength="30" tip="输入你想找的项目，来试试吧…" value="输入你想找的项目，来试试吧…">
                                <button class="btn-look-search J_search_submit" type="submit" >找项目</button></span>
                            </form>
                            <div class="look-sort fn-clear">
                                <dl class="look-grid-01">
                                    <dt>融资方式</dt>
                                    <dd><a href="http://xiangmu.trjcn.com/list_1.html?d146=618" target="_blank">债权融资</a></dd>
                                    <dd><a href="http://xiangmu.trjcn.com/list_1.html?d146=619" target="_blank">股权融资</a></dd>
                                    <dd><a href="http://xiangmu.trjcn.com/list_1.html?d146=892" target="_blank">其他融资</a></dd>
                                    <dd><a href="http://xiangmu.trjcn.com/list_1.html?d146=891" target="_blank">整体转让</a></dd>
                                </dl>
                                <dl class="look-grid-02">
                                    <dt>热门行业</dt>
                                                                                                                                                <dd><a href="http://xiangmu.trjcn.com/list_1.html?y=13" target="_blank">房地产</a></dd>
                                                                                                                                                <dd><a href="http://xiangmu.trjcn.com/list_1.html?y=23" target="_blank">IT互联网</a></dd>
                                                                                                                                                <dd><a href="http://xiangmu.trjcn.com/list_1.html?y=16" target="_blank">农林牧渔</a></dd>
                                                                                                                                                <dd><a href="http://xiangmu.trjcn.com/list_1.html?y=41" target="_blank">餐饮休闲娱乐</a></dd>
                                                                                                                                                <dd><a href="http://xiangmu.trjcn.com/list_1.html?y=19" target="_blank">建筑建材</a></dd>
                                                                                                                                                <dd><a href="http://xiangmu.trjcn.com/list_1.html?y=14" target="_blank">矿产冶金</a></dd>
                                                                                                                                                <dd><a href="http://xiangmu.trjcn.com/list_1.html?y=20" target="_blank">旅游酒店</a></dd>
                                                                                                                                                <dd><a href="http://xiangmu.trjcn.com/list_1.html?y=34" target="_blank">节能环保</a></dd>
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        </dl>
                                <dl class="look-grid-03">
                                    <dt>热门地区</dt>
                                                                                                                                                <dd><a href="http://xiangmu.trjcn.com/list_1.html?a=507" target="_blank">广东省</a></dd>
                                                                                                                                                <dd><a href="http://xiangmu.trjcn.com/list_1.html?a=6" target="_blank">北京</a></dd>
                                                                                                                                                <dd><a href="http://xiangmu.trjcn.com/list_1.html?a=2316" target="_blank">山东省</a></dd>
                                                                                                                                                <dd><a href="http://xiangmu.trjcn.com/list_1.html?a=1770" target="_blank">江苏省</a></dd>
                                                                                                                                                <dd><a href="http://xiangmu.trjcn.com/list_1.html?a=2739" target="_blank">上海</a></dd>
                                                                                                                                                <dd><a href="http://xiangmu.trjcn.com/list_1.html?a=5" target="_blank">浙江省</a></dd>
                                                                                                                                                <dd><a href="http://xiangmu.trjcn.com/list_1.html?a=2760" target="_blank">四川省</a></dd>
                                                                                                                                                <dd><a href="http://xiangmu.trjcn.com/list_1.html?a=1105" target="_blank">河南省</a></dd>
                                                                                                                                                <dd><a href="http://xiangmu.trjcn.com/list_1.html?a=917" target="_blank">河北省</a></dd>
                                                                                                                                                <dd><a href="http://xiangmu.trjcn.com/list_1.html?a=1440" target="_blank">湖北省</a></dd>
                                                                                                                                                <dd><a href="http://xiangmu.trjcn.com/list_1.html?a=1561" target="_blank">湖南省</a></dd>
                                                                                                                                                <dd><a href="http://xiangmu.trjcn.com/list_1.html?a=777" target="_blank">贵州省</a></dd>
                                                                                                                                                                                                                                                                                                                                </dl>
                            </div>
                            <div class="look-tips">
                                让项目方主动找您？<a href="http://www.trjcn.com/capital/zjrz.html" target="_blank" class="btn-look-tips fn-ml-10">申请成为投资人</a>
                            </div>
                        </div>
                    </div>
                </div>
                
                <div class="ui-case">
                    <div class="ui-case-total" id="case-total-roll">
                        <ul>
                            <li class="ui-case-data fn-clear">
                            <span class="text">今日新增项目&nbsp;</span>
                                                                                                                <span class="figure">3</span>
                                                                                                                <span class="punctuation">,</span>
                                                                                                                <span class="figure">1</span>
                                                                                                                <span class="figure">0</span>
                                                                                                                <span class="figure">0</span>
                                                                                    <span class="text">个</span>
                            </li>
                            <li class="ui-case-data fn-clear">
                            <span class="text">本周新增资金&nbsp;</span>
                                                                                    <span class="figure">3</span>
                                                                                                                <span class="figure">6</span>
                                                                                                                <span class="figure">9</span>
                                                        <span class="text">亿</span></li>
                            <li class="ui-case-data fn-clear">
                            <span class="text">昨日成功约谈&nbsp;</span>
                                                                                    <span class="figure">3</span>
                                                                                                                <span class="punctuation">,</span>
                                                                                                                <span class="figure">9</span>
                                                                                                                <span class="figure">6</span>
                                                                                                                <span class="figure">6</span>
                                                                                    <span class="text">个</span></li>
                        </ul>
                    </div>
                                        <div class="ui-case-group">
                        <div class="ui-case-title"><a href="/success_case.html">成功案例</a><i class="icon-box-anli"></i></div>
                            <div class="ui-case-pic">
                                <a href="http://www.trjcn.com/success_case.html" target="_blank" title="成功案例">
                                    <img src="http://static.trjcn.com/uploads/page_item/2015/06/402_1433139626.jpg" width="90" height="90" alt="成功案例">
                                </a>
                            </div>
                            <div class="ui-case-info">
                                <strong>广西桂林某在建纯住宅房开发项目成功获得融资</strong>
                                <p>桂林市区某在建纯住宅项目占地11000平方米，总建筑面积78000平方米，共670套...</p>
                                <a href="http://www.trjcn.com/success_case.html" target="_blank" class="btn-case-more">查看详细 &gt;</a>
                            </div>
                        </div>
                        <div class="ui-case-strategy">
                            想要和他们一样快速成功融资？快来看看<a href="http://www.trjcn.com/help/look_fund.html" target="_blank"><i class="icon-box-help"></i>融资攻略</a>
                        </div>
                    </div>
            </div>
                        
            <div class="container">
                <div class="ui-box fn-mt-20">
                    <div class="ui-box-head">
                        <h2 class="ui-box-title"><i class="icon-box-money"></i>精选资金</h2>
                        <a href="http://zijin.trjcn.com" target="_blank" class="ui-box-more">查看更多<i class="icon-box-more"></i></a>
                    </div>
                    <div class="ui-box-cont fn-clear">
                        <div class="classify">
                            <ul class="classify-group">
                                
                                                                <li class="classify-item">
                                    <div class="classify-head fn-clear">
                                        <h3 class="classify-title"><a href="http://zijin.trjcn.com/list_2010.html" target="_blank">股权投资</a></h3>
                                        <a href="http://zijin.trjcn.com/list_2010.html" target="_blank" class="classify-more">更多</a>
                                    </div>
                                    <dl class="classify-cont fn-clear">
                					                                        <dt class="classify-info-region"><a href="http://zijin.trjcn.com?d94=601" title="企业资金"target="_blank" >企业资金</a></dt>
                                        <dd class="classify-info-name"><a href="http://zijin.trjcn.com/detail_337964.html" title="上海某企业资金2000万元-10亿元寻优质矿产等项目股权投资"target="_blank" >上海某企业资金2000万元-10亿元寻优质矿产等项目股权投资</a></dd>
                                                                             <dt class="classify-info-region"><a href="http://zijin.trjcn.com?d94=600" title="个人资金"target="_blank" >个人资金</a></dt>
                                        <dd class="classify-info-name"><a href="http://zijin.trjcn.com/detail_337962.html" title="广东广州某个人资金2亿元寻生物医药等优质项目股权投资"target="_blank" >广东广州某个人资金2亿元寻生物医药等优质项目股权投资</a></dd>
                                                                             <dt class="classify-info-region"><a href="http://zijin.trjcn.com?d94=600" title="个人资金"target="_blank" >个人资金</a></dt>
                                        <dd class="classify-info-name"><a href="http://zijin.trjcn.com/detail_337133.html" title="新疆某个人资金2000万元寻发明专利项目股权投资"target="_blank" >新疆某个人资金2000万元寻发明专利项目股权投资</a></dd>
                                                                             <dt class="classify-info-region"><a href="http://zijin.trjcn.com?d94=600" title="个人资金"target="_blank" >个人资金</a></dt>
                                        <dd class="classify-info-name"><a href="http://zijin.trjcn.com/detail_336905.html" title="山东某个人资金500万元寻省内优质环保等项目投资"target="_blank" >山东某个人资金500万元寻省内优质环保等项目投资</a></dd>
                                                                             <dt class="classify-info-region"><a href="http://zijin.trjcn.com?d94=601" title="企业资金"target="_blank" >企业资金</a></dt>
                                        <dd class="classify-info-name"><a href="http://zijin.trjcn.com/detail_336648.html" title="四川某企业资金1亿-5亿元寻本省房地产项目股权投资"target="_blank" >四川某企业资金1亿-5亿元寻本省房地产项目股权投资</a></dd>
                                                                         </dl>
                                </li>
                                                                <li class="classify-item">
                                    <div class="classify-head fn-clear">
                                        <h3 class="classify-title"><a href="http://zijin.trjcn.com/list_2011.html" target="_blank">债权投资</a></h3>
                                        <a href="http://zijin.trjcn.com/list_2011.html" target="_blank" class="classify-more">更多</a>
                                    </div>
                                    <dl class="classify-cont fn-clear">
                					                                        <dt class="classify-info-region"><a href="http://zijin.trjcn.com?d94=601" title="企业资金"target="_blank" >企业资金</a></dt>
                                        <dd class="classify-info-name"><a href="http://zijin.trjcn.com/detail_337958.html" title="四川成都某企业资金1亿元寻省内优质医院建设项目债权投资"target="_blank" >四川成都某企业资金1亿元寻省内优质医院建设项目债权投资</a></dd>
                                                                             <dt class="classify-info-region"><a href="http://zijin.trjcn.com?d94=600" title="个人资金"target="_blank" >个人资金</a></dt>
                                        <dd class="classify-info-name"><a href="http://zijin.trjcn.com/detail_337333.html" title="成都某个人资金1000万-10亿元寻全国优质项目合作"target="_blank" >成都某个人资金1000万-10亿元寻全国优质项目合作</a></dd>
                                                                             <dt class="classify-info-region"><a href="http://zijin.trjcn.com?d94=613" title="信托公司"target="_blank" >信托公司</a></dt>
                                        <dd class="classify-info-name"><a href="http://zijin.trjcn.com/detail_336791.html" title="安徽某信托公司2亿-15亿元资金寻房地产项目投资"target="_blank" >安徽某信托公司2亿-15亿元资金寻房地产项目投资</a></dd>
                                                                             <dt class="classify-info-region"><a href="http://zijin.trjcn.com?d94=613" title="信托公司"target="_blank" >信托公司</a></dt>
                                        <dd class="classify-info-name"><a href="http://zijin.trjcn.com/detail_336665.html" title="广东某信托公司6亿-60亿元资金寻房地产项目投资"target="_blank" >广东某信托公司6亿-60亿元资金寻房地产项目投资</a></dd>
                                                                             <dt class="classify-info-region"><a href="http://zijin.trjcn.com?d94=605" title="小额贷款"target="_blank" >小额贷款</a></dt>
                                        <dd class="classify-info-name"><a href="http://zijin.trjcn.com/detail_335639.html" title="广西南宁某小额贷款10万-50万元资金寻当地优质项目"target="_blank" >广西南宁某小额贷款10万-50万元资金寻当地优质项目</a></dd>
                                                                         </dl>
                                </li>
                                                                <li class="classify-item">
                                    <div class="classify-head fn-clear">
                                        <h3 class="classify-title"><a href="http://zijin.trjcn.com" target="_blank">其它投资</a></h3>
                                        <a href="http://zijin.trjcn.com" target="_blank" class="classify-more">更多</a>
                                    </div>
                                    <dl class="classify-cont fn-clear">
                					                                        <dt class="classify-info-region"><a href="http://zijin.trjcn.com?d94=607" title="担保公司"target="_blank" >担保公司</a></dt>
                                        <dd class="classify-info-name"><a href="http://zijin.trjcn.com/detail_335906.html" title="福建某担保公司2000万-2亿元资金寻房地产项目合作"target="_blank" >福建某担保公司2000万-2亿元资金寻房地产项目合作</a></dd>
                                                                             <dt class="classify-info-region"><a href="http://zijin.trjcn.com?d94=600" title="个人资金"target="_blank" >个人资金</a></dt>
                                        <dd class="classify-info-name"><a href="http://zijin.trjcn.com/detail_335871.html" title="江苏某个人资金100万-120万元寻全国优质项目合作"target="_blank" >江苏某个人资金100万-120万元寻全国优质项目合作</a></dd>
                                                                             <dt class="classify-info-region"><a href="http://zijin.trjcn.com?d94=601" title="企业资金"target="_blank" >企业资金</a></dt>
                                        <dd class="classify-info-name"><a href="http://zijin.trjcn.com/detail_335433.html" title="江苏某企业资金500万-4亿元寻本地房地产、环保等项目合作"target="_blank" >江苏某企业资金500万-4亿元寻本地房地产、环保等项目合作</a></dd>
                                                                             <dt class="classify-info-region"><a href="http://zijin.trjcn.com?d94=601" title="企业资金"target="_blank" >企业资金</a></dt>
                                        <dd class="classify-info-name"><a href="http://zijin.trjcn.com/detail_333607.html" title="四川某企业资金500万元-5亿元寻全国金融投资项目合作"target="_blank" >四川某企业资金500万元-5亿元寻全国金融投资项目合作</a></dd>
                                                                             <dt class="classify-info-region"><a href="http://zijin.trjcn.com?d94=601" title="企业资金"target="_blank" >企业资金</a></dt>
                                        <dd class="classify-info-name"><a href="http://zijin.trjcn.com/detail_333562.html" title="江苏某企业资金100万-9000万元寻优质能源项目合作"target="_blank" >江苏某企业资金100万-9000万元寻优质能源项目合作</a></dd>
                                                                         </dl>
                                </li>
                                
                            </ul>
                        </div>
                    </div>
                </div>
                <div class="ui-box fn-mt-20">
                    <div class="ui-box-head">
                        <h2 class="ui-box-title"><i class="icon-box-item"></i>优质项目<a href="http://www.trjcn.com/quality_proj.html" target="_blank" class="btn-emphasis-item">重点项目推荐</a></h2>
                        <a href="http://xiangmu.trjcn.com" target="_blank" class="ui-box-more">查看更多<i class="icon-box-more"></i></a>
                    </div>
                    <div class="ui-box-cont fn-clear">
                        <div class="exhibition" id="exhibition">
                            <a class="prev" href="javascript:void(0)"></a>
                            <a class="next" href="javascript:void(0)"></a>
                            <div class="exhibition-scroll">
                                <ul>
                                                <li>
                    <div class="flipcard-container">
                        <div class="flipcard">
                            <div class="back face" >
                                <a href="http://www.trjcn.com/topic/index/3054.html" target="_blank" title="北京E鲜果智能贩售媒体机项目">
                                <h3>北京E鲜果智能贩售媒体机项目</h3>
                                <p class="text">
                                                                    所属行业：食品饮料烟草<br />
融资额度：500万元-800万元<br />
所在地区：北京市                                                                </p>
                                </a>
                            </div>
                            <div class="front face"><a href="http://www.trjcn.com/topic/index/3054.html" target="_blank" title="北京E鲜果智能贩售媒体机项目"><img src="http://static.trjcn.com/uploads/apply/201506/46_1433402674.jpg" width="182" height="118" alt="北京E鲜果智能贩售媒体机项目"></a></div>
                        </div>
                    </div>
                </li>
                                <li>
                    <div class="flipcard-container">
                        <div class="flipcard">
                            <div class="back face" >
                                <a href="http://www.trjcn.com/topic/index/2637.html" target="_blank" title="某生物质燃料固体成型整机项目">
                                <h3>某生物质燃料固体成型整机项目</h3>
                                <p class="text">
                                                                    所属行业：节能环保<br />
融资额度：2000万元<br />
所在地区：河北省 张家口市                                                                </p>
                                </a>
                            </div>
                            <div class="front face"><a href="http://www.trjcn.com/topic/index/2637.html" target="_blank" title="某生物质燃料固体成型整机项目"><img src="http://static.trjcn.com/uploads/apply/201506/46_1433406853.jpg" width="182" height="118" alt="某生物质燃料固体成型整机项目"></a></div>
                        </div>
                    </div>
                </li>
                                <li>
                    <div class="flipcard-container">
                        <div class="flipcard">
                            <div class="back face" >
                                <a href="http://www.trjcn.com/topic/index/2769.html" target="_blank" title="天津某国际幼儿园创办项目融资">
                                <h3>天津某国际幼儿园创办项目融资</h3>
                                <p class="text">
                                                                    所属行业：教育培训体育 <br />
融资额度：800万元<br />
所在地区：天津市                                                                 </p>
                                </a>
                            </div>
                            <div class="front face"><a href="http://www.trjcn.com/topic/index/2769.html" target="_blank" title="天津某国际幼儿园创办项目融资"><img src="http://static.trjcn.com/uploads/apply/201506/46_1433496360.jpg" width="182" height="118" alt="天津某国际幼儿园创办项目融资"></a></div>
                        </div>
                    </div>
                </li>
                                <li>
                    <div class="flipcard-container">
                        <div class="flipcard">
                            <div class="back face" >
                                <a href="http://www.trjcn.com/topic/index/3301.html" target="_blank" title="海外某互联网医疗健康平台融资">
                                <h3>海外某互联网医疗健康平台融资</h3>
                                <p class="text">
                                                                    所属行业：IT互联网<br />
融资额度：3800万元-1.98亿元<br />
所在地区：海外                                                                </p>
                                </a>
                            </div>
                            <div class="front face"><a href="http://www.trjcn.com/topic/index/3301.html" target="_blank" title="海外某互联网医疗健康平台融资"><img src="http://static.trjcn.com/uploads/apply/201505/46_1432782290.jpg" width="182" height="118" alt="海外某互联网医疗健康平台融资"></a></div>
                        </div>
                    </div>
                </li>
                                <li>
                    <div class="flipcard-container">
                        <div class="flipcard">
                            <div class="back face" >
                                <a href="http://www.trjcn.com/uploads/email1/ctrtk_201506018485.html" target="_blank" title="安徽某光伏发电B2C电商项目">
                                <h3>安徽某光伏发电B2C电商项目</h3>
                                <p class="text">
                                                                    所属行业：IT互联网<br />
融资额度：2000万元-5000万元<br />
所在地区：安徽省 芜湖市                                                                </p>
                                </a>
                            </div>
                            <div class="front face"><a href="http://www.trjcn.com/uploads/email1/ctrtk_201506018485.html" target="_blank" title="安徽某光伏发电B2C电商项目"><img src="http://static.trjcn.com/uploads/apply/201506/46_1433228244.jpg" width="182" height="118" alt="安徽某光伏发电B2C电商项目"></a></div>
                        </div>
                    </div>
                </li>
                                <li>
                    <div class="flipcard-container">
                        <div class="flipcard">
                            <div class="back face" >
                                <a href="http://www.trjcn.com/topic/index/2631.html" target="_blank" title="蓝盾快速建筑模板连锁租赁招商">
                                <h3>蓝盾快速建筑模板连锁租赁招商</h3>
                                <p class="text">
                                                                    所属行业：建筑建材<br />
融资额度：单店投资200万-1000万元<br />
所在地区：湖南省 长沙市                                                                </p>
                                </a>
                            </div>
                            <div class="front face"><a href="http://www.trjcn.com/topic/index/2631.html" target="_blank" title="蓝盾快速建筑模板连锁租赁招商"><img src="http://static.trjcn.com/uploads/apply/201506/46_1433301139.jpg" width="182" height="118" alt="蓝盾快速建筑模板连锁租赁招商"></a></div>
                        </div>
                    </div>
                </li>
                                <li>
                    <div class="flipcard-container">
                        <div class="flipcard">
                            <div class="back face" >
                                <a href="http://www.trjcn.com/uploads/email1/ctrtk_201506048589.html" target="_blank" title="重庆两江新区特大型土石方项目">
                                <h3>重庆两江新区特大型土石方项目</h3>
                                <p class="text">
                                                                    所属行业：建筑建材<br />
融资额度：600万元-1000万元<br />
所在地区：重庆市                                                                </p>
                                </a>
                            </div>
                            <div class="front face"><a href="http://www.trjcn.com/uploads/email1/ctrtk_201506048589.html" target="_blank" title="重庆两江新区特大型土石方项目"><img src="http://static.trjcn.com/uploads/apply/201506/46_1433411364.jpg" width="182" height="118" alt="重庆两江新区特大型土石方项目"></a></div>
                        </div>
                    </div>
                </li>
                                <li>
                    <div class="flipcard-container">
                        <div class="flipcard">
                            <div class="back face" >
                                <a href="http://www.trjcn.com/uploads/email1/ctrtk_201503317352.html" target="_blank" title="新疆伊犁某宾馆债权融资600万">
                                <h3>新疆伊犁某宾馆债权融资600万</h3>
                                <p class="text">
                                                                    所属行业：旅游酒店<br />
融资额度：600万元<br />
所在地区：新疆 伊犁哈萨克自治州                                                                </p>
                                </a>
                            </div>
                            <div class="front face"><a href="http://www.trjcn.com/uploads/email1/ctrtk_201503317352.html" target="_blank" title="新疆伊犁某宾馆债权融资600万"><img src="http://static.trjcn.com/uploads/apply/201506/46_1433471009.jpg" width="182" height="118" alt="新疆伊犁某宾馆债权融资600万"></a></div>
                        </div>
                    </div>
                </li>
                                <li>
                    <div class="flipcard-container">
                        <div class="flipcard">
                            <div class="back face" >
                                <a href="http://www.trjcn.com/uploads/email1/ctrtk_201505258387.html" target="_blank" title="混凝土外加剂项目债权融资">
                                <h3>混凝土外加剂项目债权融资</h3>
                                <p class="text">
                                                                    所属行业：其他行业<br />
融资额度：800万元-1200万元<br />
所在地区：山西省 运城市<br />
                                                                </p>
                                </a>
                            </div>
                            <div class="front face"><a href="http://www.trjcn.com/uploads/email1/ctrtk_201505258387.html" target="_blank" title="混凝土外加剂项目债权融资"><img src="http://static.trjcn.com/uploads/apply/201506/46_1433487936.jpg" width="182" height="118" alt="混凝土外加剂项目债权融资"></a></div>
                        </div>
                    </div>
                </li>
                                <li>
                    <div class="flipcard-container">
                        <div class="flipcard">
                            <div class="back face" >
                                <a href="http://www.trjcn.com/uploads/email1/ctrtk_201506018489.html" target="_blank" title="浙江某文化产业园建设项目融资">
                                <h3>浙江某文化产业园建设项目融资</h3>
                                <p class="text">
                                                                    所属行业：房地产<br />
融资额度：1000万元-1500万元<br />
所在地区：浙江省 台州市                                                                </p>
                                </a>
                            </div>
                            <div class="front face"><a href="http://www.trjcn.com/uploads/email1/ctrtk_201506018489.html" target="_blank" title="浙江某文化产业园建设项目融资"><img src="http://static.trjcn.com/uploads/apply/201506/46_1433208268.jpg" width="182" height="118" alt="浙江某文化产业园建设项目融资"></a></div>
                        </div>
                    </div>
                </li>
                                <li>
                    <div class="flipcard-container">
                        <div class="flipcard">
                            <div class="back face" >
                                <a href="http://www.trjcn.com/topic/index/3037.html" target="_blank" title="江西某理财投资项目融资">
                                <h3>江西某理财投资项目融资</h3>
                                <p class="text">
                                                                    所属行业：金融投资<br />
融资额度：3万元-6万元<br />
所在地区：江西省                                                                </p>
                                </a>
                            </div>
                            <div class="front face"><a href="http://www.trjcn.com/topic/index/3037.html" target="_blank" title="江西某理财投资项目融资"><img src="http://static.trjcn.com/uploads/apply/201505/46_1432784935.jpg" width="182" height="118" alt="江西某理财投资项目融资"></a></div>
                        </div>
                    </div>
                </li>
                                <li>
                    <div class="flipcard-container">
                        <div class="flipcard">
                            <div class="back face" >
                                <a href="http://www.trjcn.com/topic/index/2932.html" target="_blank" title="温州女装高级定制项目股权融资">
                                <h3>温州女装高级定制项目股权融资</h3>
                                <p class="text">
                                                                    所属行业：纺织服装饰品<br />
融资额度：100万元<br />
所在地区：浙江省 温州市                                                                </p>
                                </a>
                            </div>
                            <div class="front face"><a href="http://www.trjcn.com/topic/index/2932.html" target="_blank" title="温州女装高级定制项目股权融资"><img src="http://yf.trjcn.com/uploads/apply/201505/46_1431400720.jpg" width="182" height="118" alt="温州女装高级定制项目股权融资"></a></div>
                        </div>
                    </div>
                </li>
                                <li>
                    <div class="flipcard-container">
                        <div class="flipcard">
                            <div class="back face" >
                                <a href="http://www.trjcn.com/topic/index/3226.html" target="_blank" title="山西某肉牛养殖产业链项目融资">
                                <h3>山西某肉牛养殖产业链项目融资</h3>
                                <p class="text">
                                                                    所属行业：农林牧渔<br />
融资额度：5000万元-15亿元<br />
所在地区：山西省 太原市                                                                </p>
                                </a>
                            </div>
                            <div class="front face"><a href="http://www.trjcn.com/topic/index/3226.html" target="_blank" title="山西某肉牛养殖产业链项目融资"><img src="http://yf.trjcn.com/uploads/apply/201506/46_1433317157.jpg" width="182" height="118" alt="山西某肉牛养殖产业链项目融资"></a></div>
                        </div>
                    </div>
                </li>
                                <li>
                    <div class="flipcard-container">
                        <div class="flipcard">
                            <div class="back face" >
                                <a href="http://www.trjcn.com/uploads/email1/ctrtk_201505258364.html" target="_blank" title="北京某移动互联网APP项目">
                                <h3>北京某移动互联网APP项目</h3>
                                <p class="text">
                                                                    所属行业：IT互联网<br />
融资额度：300万元-500万元<br />
所在地区：北京市                                                                </p>
                                </a>
                            </div>
                            <div class="front face"><a href="http://www.trjcn.com/uploads/email1/ctrtk_201505258364.html" target="_blank" title="北京某移动互联网APP项目"><img src="http://static.trjcn.com/uploads/apply/201506/46_1433317281.jpg" width="182" height="118" alt="北京某移动互联网APP项目"></a></div>
                        </div>
                    </div>
                </li>
                                <li>
                    <div class="flipcard-container">
                        <div class="flipcard">
                            <div class="back face" >
                                <a href="http://www.trjcn.com/uploads/email1/ctrtk_201503167057.html" target="_blank" title="江苏常州某涂料项目融资">
                                <h3>江苏常州某涂料项目融资</h3>
                                <p class="text">
                                                                    所属行业：建筑建材<br />
融资额度：200万元<br />
所在地区：江苏省 常州市                                                                 </p>
                                </a>
                            </div>
                            <div class="front face"><a href="http://www.trjcn.com/uploads/email1/ctrtk_201503167057.html" target="_blank" title="江苏常州某涂料项目融资"><img src="http://static.trjcn.com/uploads/apply/201506/46_1433208391.jpg" width="182" height="118" alt="江苏常州某涂料项目融资"></a></div>
                        </div>
                    </div>
                </li>
                                <li>
                    <div class="flipcard-container">
                        <div class="flipcard">
                            <div class="back face" >
                                <a href="http://www.trjcn.com/uploads/email1/ctrtk_201504217746.html" target="_blank" title="湖北机械零部件项目融资或转让">
                                <h3>湖北机械零部件项目融资或转让</h3>
                                <p class="text">
                                                                    所属行业：机械机电<br />
融资额度：500万元<br />
所在地区：湖北省 荆州市                                                                </p>
                                </a>
                            </div>
                            <div class="front face"><a href="http://www.trjcn.com/uploads/email1/ctrtk_201504217746.html" target="_blank" title="湖北机械零部件项目融资或转让"><img src="http://static.trjcn.com/uploads/apply/201506/46_1433491421.jpg" width="182" height="118" alt="湖北机械零部件项目融资或转让"></a></div>
                        </div>
                    </div>
                </li>
                                <li>
                    <div class="flipcard-container">
                        <div class="flipcard">
                            <div class="back face" >
                                <a href="http://www.trjcn.com/uploads/email1/ctrtk_201505278417.html" target="_blank" title="重庆某汽车服务联盟平台融资">
                                <h3>重庆某汽车服务联盟平台融资</h3>
                                <p class="text">
                                                                    所属行业：IT互联网<br />
融资额度：6060万元<br />
所在地区：重庆市                                                                </p>
                                </a>
                            </div>
                            <div class="front face"><a href="http://www.trjcn.com/uploads/email1/ctrtk_201505278417.html" target="_blank" title="重庆某汽车服务联盟平台融资"><img src="http://static.trjcn.com/uploads/apply/201506/46_1433317379.jpg" width="182" height="118" alt="重庆某汽车服务联盟平台融资"></a></div>
                        </div>
                    </div>
                </li>
                                <li>
                    <div class="flipcard-container">
                        <div class="flipcard">
                            <div class="back face" >
                                <a href="http://www.trjcn.com/uploads/email1/ctrtk_201505148179.html" target="_blank" title="辽宁某矿产项目融资">
                                <h3>辽宁某矿产项目融资</h3>
                                <p class="text">
                                                                    所属行业：矿产冶金 <br />
融资额度：500万元-1000万元<br />
所在地区：辽宁省 营口市                                                                </p>
                                </a>
                            </div>
                            <div class="front face"><a href="http://www.trjcn.com/uploads/email1/ctrtk_201505148179.html" target="_blank" title="辽宁某矿产项目融资"><img src="http://static.trjcn.com/uploads/apply/201506/46_1433471133.jpg" width="182" height="118" alt="辽宁某矿产项目融资"></a></div>
                        </div>
                    </div>
                </li>
                                <li>
                    <div class="flipcard-container">
                        <div class="flipcard">
                            <div class="back face" >
                                <a href="http://www.trjcn.com/uploads/email1/ctrtk_201505128127.html" target="_blank" title="浙江极限格斗联赛传媒项目">
                                <h3>浙江极限格斗联赛传媒项目</h3>
                                <p class="text">
                                                                    所属行业：教育培训体育<br />
融资额度：5000万元以上<br />
所在地区：浙江省 宁波市                                                                </p>
                                </a>
                            </div>
                            <div class="front face"><a href="http://www.trjcn.com/uploads/email1/ctrtk_201505128127.html" target="_blank" title="浙江极限格斗联赛传媒项目"><img src="http://static.trjcn.com/uploads/apply/201505/46_1432276117.jpg" width="182" height="118" alt="浙江极限格斗联赛传媒项目"></a></div>
                        </div>
                    </div>
                </li>
                                <li>
                    <div class="flipcard-container">
                        <div class="flipcard">
                            <div class="back face" >
                                <a href="http://www.trjcn.com/uploads/email1/ctrtk_201504227760.html" target="_blank" title="重庆果桑综合应用开发项目">
                                <h3>重庆果桑综合应用开发项目</h3>
                                <p class="text">
                                                                    所属行业：食品饮料烟草<br />
融资额度：1000万元-5000万元<br />
所在地区：重庆市                                                                </p>
                                </a>
                            </div>
                            <div class="front face"><a href="http://www.trjcn.com/uploads/email1/ctrtk_201504227760.html" target="_blank" title="重庆果桑综合应用开发项目"><img src="http://static.trjcn.com/uploads/apply/201506/46_1433402629.jpg" width="182" height="118" alt="重庆果桑综合应用开发项目"></a></div>
                        </div>
                    </div>
                </li>
                                <li>
                    <div class="flipcard-container">
                        <div class="flipcard">
                            <div class="back face" >
                                <a href="http://www.trjcn.com/uploads/email1/ctrtk_201505208288.html" target="_blank" title="浙江某特色粽子开发项目融资">
                                <h3>浙江某特色粽子开发项目融资</h3>
                                <p class="text">
                                                                    所属行业：食品饮料烟草<br />
融资额度：1200万元<br />
所在地区：浙江省 绍兴市                                                                </p>
                                </a>
                            </div>
                            <div class="front face"><a href="http://www.trjcn.com/uploads/email1/ctrtk_201505208288.html" target="_blank" title="浙江某特色粽子开发项目融资"><img src="http://static.trjcn.com/uploads/apply/201506/46_1433483591.jpg" width="182" height="118" alt="浙江某特色粽子开发项目融资"></a></div>
                        </div>
                    </div>
                </li>
                                <li>
                    <div class="flipcard-container">
                        <div class="flipcard">
                            <div class="back face" >
                                <a href="http://www.trjcn.com/uploads/email1/ctrtk_201505128136.html" target="_blank" title="一站式整装家居O2O项目融资">
                                <h3>一站式整装家居O2O项目融资</h3>
                                <p class="text">
                                                                    所属行业：IT互联网<br />
融资额度：1200万元<br />
所在地区：湖南省                                                                </p>
                                </a>
                            </div>
                            <div class="front face"><a href="http://www.trjcn.com/uploads/email1/ctrtk_201505128136.html" target="_blank" title="一站式整装家居O2O项目融资"><img src="http://static.trjcn.com/uploads/apply/201506/46_1433483855.jpg" width="182" height="118" alt="一站式整装家居O2O项目融资"></a></div>
                        </div>
                    </div>
                </li>
                                                <li>
                    <div class="flipcard-container">
                        <div class="flipcard">
                            <div class="back face" >
                                <a href="http://www.trjcn.com/topic/index/3054.html" target="_blank" title="北京E鲜果智能贩售媒体机项目">
                                <h3>北京E鲜果智能贩售媒体机项目</h3>
                                <p class="text">
                                                                    所属行业：食品饮料烟草<br />
融资额度：500万元-800万元<br />
所在地区：北京市                                                                </p>
                                </a>
                            </div>
                            <div class="front face"><a href="http://www.trjcn.com/topic/index/3054.html" target="_blank" title="北京E鲜果智能贩售媒体机项目"><img src="http://static.trjcn.com/uploads/apply/201506/46_1433402674.jpg" width="182" height="118" alt="北京E鲜果智能贩售媒体机项目"></a></div>
                        </div>
                    </div>
                </li>
                                 <li>
                    <div class="flipcard-container">
                        <div class="flipcard">
                            <div class="back face" >
                                <a href="http://www.trjcn.com/topic/index/2637.html" target="_blank" title="某生物质燃料固体成型整机项目">
                                <h3>某生物质燃料固体成型整机项目</h3>
                                <p class="text">
                                                                    所属行业：节能环保<br />
融资额度：2000万元<br />
所在地区：河北省 张家口市                                                                </p>
                                </a>
                            </div>
                            <div class="front face"><a href="http://www.trjcn.com/topic/index/2637.html" target="_blank" title="某生物质燃料固体成型整机项目"><img src="http://static.trjcn.com/uploads/apply/201506/46_1433406853.jpg" width="182" height="118" alt="某生物质燃料固体成型整机项目"></a></div>
                        </div>
                    </div>
                </li>
                                 <li>
                    <div class="flipcard-container">
                        <div class="flipcard">
                            <div class="back face" >
                                <a href="http://www.trjcn.com/topic/index/2769.html" target="_blank" title="天津某国际幼儿园创办项目融资">
                                <h3>天津某国际幼儿园创办项目融资</h3>
                                <p class="text">
                                                                    所属行业：教育培训体育 <br />
融资额度：800万元<br />
所在地区：天津市                                                                 </p>
                                </a>
                            </div>
                            <div class="front face"><a href="http://www.trjcn.com/topic/index/2769.html" target="_blank" title="天津某国际幼儿园创办项目融资"><img src="http://static.trjcn.com/uploads/apply/201506/46_1433496360.jpg" width="182" height="118" alt="天津某国际幼儿园创办项目融资"></a></div>
                        </div>
                    </div>
                </li>
                                 <li>
                    <div class="flipcard-container">
                        <div class="flipcard">
                            <div class="back face" >
                                <a href="http://www.trjcn.com/topic/index/3301.html" target="_blank" title="海外某互联网医疗健康平台融资">
                                <h3>海外某互联网医疗健康平台融资</h3>
                                <p class="text">
                                                                    所属行业：IT互联网<br />
融资额度：3800万元-1.98亿元<br />
所在地区：海外                                                                </p>
                                </a>
                            </div>
                            <div class="front face"><a href="http://www.trjcn.com/topic/index/3301.html" target="_blank" title="海外某互联网医疗健康平台融资"><img src="http://static.trjcn.com/uploads/apply/201505/46_1432782290.jpg" width="182" height="118" alt="海外某互联网医疗健康平台融资"></a></div>
                        </div>
                    </div>
                </li>
                                 <li>
                    <div class="flipcard-container">
                        <div class="flipcard">
                            <div class="back face" >
                                <a href="http://www.trjcn.com/uploads/email1/ctrtk_201506018485.html" target="_blank" title="安徽某光伏发电B2C电商项目">
                                <h3>安徽某光伏发电B2C电商项目</h3>
                                <p class="text">
                                                                    所属行业：IT互联网<br />
融资额度：2000万元-5000万元<br />
所在地区：安徽省 芜湖市                                                                </p>
                                </a>
                            </div>
                            <div class="front face"><a href="http://www.trjcn.com/uploads/email1/ctrtk_201506018485.html" target="_blank" title="安徽某光伏发电B2C电商项目"><img src="http://static.trjcn.com/uploads/apply/201506/46_1433228244.jpg" width="182" height="118" alt="安徽某光伏发电B2C电商项目"></a></div>
                        </div>
                    </div>
                </li>
                                 <li>
                    <div class="flipcard-container">
                        <div class="flipcard">
                            <div class="back face" >
                                <a href="http://www.trjcn.com/topic/index/2631.html" target="_blank" title="蓝盾快速建筑模板连锁租赁招商">
                                <h3>蓝盾快速建筑模板连锁租赁招商</h3>
                                <p class="text">
                                                                    所属行业：建筑建材<br />
融资额度：单店投资200万-1000万元<br />
所在地区：湖南省 长沙市                                                                </p>
                                </a>
                            </div>
                            <div class="front face"><a href="http://www.trjcn.com/topic/index/2631.html" target="_blank" title="蓝盾快速建筑模板连锁租赁招商"><img src="http://static.trjcn.com/uploads/apply/201506/46_1433301139.jpg" width="182" height="118" alt="蓝盾快速建筑模板连锁租赁招商"></a></div>
                        </div>
                    </div>
                </li>
                                 <li>
                    <div class="flipcard-container">
                        <div class="flipcard">
                            <div class="back face" >
                                <a href="http://www.trjcn.com/uploads/email1/ctrtk_201506048589.html" target="_blank" title="重庆两江新区特大型土石方项目">
                                <h3>重庆两江新区特大型土石方项目</h3>
                                <p class="text">
                                                                    所属行业：建筑建材<br />
融资额度：600万元-1000万元<br />
所在地区：重庆市                                                                </p>
                                </a>
                            </div>
                            <div class="front face"><a href="http://www.trjcn.com/uploads/email1/ctrtk_201506048589.html" target="_blank" title="重庆两江新区特大型土石方项目"><img src="http://static.trjcn.com/uploads/apply/201506/46_1433411364.jpg" width="182" height="118" alt="重庆两江新区特大型土石方项目"></a></div>
                        </div>
                    </div>
                </li>
                                 <li>
                    <div class="flipcard-container">
                        <div class="flipcard">
                            <div class="back face" >
                                <a href="http://www.trjcn.com/uploads/email1/ctrtk_201503317352.html" target="_blank" title="新疆伊犁某宾馆债权融资600万">
                                <h3>新疆伊犁某宾馆债权融资600万</h3>
                                <p class="text">
                                                                    所属行业：旅游酒店<br />
融资额度：600万元<br />
所在地区：新疆 伊犁哈萨克自治州                                                                </p>
                                </a>
                            </div>
                            <div class="front face"><a href="http://www.trjcn.com/uploads/email1/ctrtk_201503317352.html" target="_blank" title="新疆伊犁某宾馆债权融资600万"><img src="http://static.trjcn.com/uploads/apply/201506/46_1433471009.jpg" width="182" height="118" alt="新疆伊犁某宾馆债权融资600万"></a></div>
                        </div>
                    </div>
                </li>
                                 <li>
                    <div class="flipcard-container">
                        <div class="flipcard">
                            <div class="back face" >
                                <a href="http://www.trjcn.com/uploads/email1/ctrtk_201505258387.html" target="_blank" title="混凝土外加剂项目债权融资">
                                <h3>混凝土外加剂项目债权融资</h3>
                                <p class="text">
                                                                    所属行业：其他行业<br />
融资额度：800万元-1200万元<br />
所在地区：山西省 运城市<br />
                                                                </p>
                                </a>
                            </div>
                            <div class="front face"><a href="http://www.trjcn.com/uploads/email1/ctrtk_201505258387.html" target="_blank" title="混凝土外加剂项目债权融资"><img src="http://static.trjcn.com/uploads/apply/201506/46_1433487936.jpg" width="182" height="118" alt="混凝土外加剂项目债权融资"></a></div>
                        </div>
                    </div>
                </li>
                                 <li>
                    <div class="flipcard-container">
                        <div class="flipcard">
                            <div class="back face" >
                                <a href="http://www.trjcn.com/uploads/email1/ctrtk_201506018489.html" target="_blank" title="浙江某文化产业园建设项目融资">
                                <h3>浙江某文化产业园建设项目融资</h3>
                                <p class="text">
                                                                    所属行业：房地产<br />
融资额度：1000万元-1500万元<br />
所在地区：浙江省 台州市                                                                </p>
                                </a>
                            </div>
                            <div class="front face"><a href="http://www.trjcn.com/uploads/email1/ctrtk_201506018489.html" target="_blank" title="浙江某文化产业园建设项目融资"><img src="http://static.trjcn.com/uploads/apply/201506/46_1433208268.jpg" width="182" height="118" alt="浙江某文化产业园建设项目融资"></a></div>
                        </div>
                    </div>
                </li>
                                 <li>
                    <div class="flipcard-container">
                        <div class="flipcard">
                            <div class="back face" >
                                <a href="http://www.trjcn.com/topic/index/3037.html" target="_blank" title="江西某理财投资项目融资">
                                <h3>江西某理财投资项目融资</h3>
                                <p class="text">
                                                                    所属行业：金融投资<br />
融资额度：3万元-6万元<br />
所在地区：江西省                                                                </p>
                                </a>
                            </div>
                            <div class="front face"><a href="http://www.trjcn.com/topic/index/3037.html" target="_blank" title="江西某理财投资项目融资"><img src="http://static.trjcn.com/uploads/apply/201505/46_1432784935.jpg" width="182" height="118" alt="江西某理财投资项目融资"></a></div>
                        </div>
                    </div>
                </li>
                                 <li>
                    <div class="flipcard-container">
                        <div class="flipcard">
                            <div class="back face" >
                                <a href="http://www.trjcn.com/topic/index/2932.html" target="_blank" title="温州女装高级定制项目股权融资">
                                <h3>温州女装高级定制项目股权融资</h3>
                                <p class="text">
                                                                    所属行业：纺织服装饰品<br />
融资额度：100万元<br />
所在地区：浙江省 温州市                                                                </p>
                                </a>
                            </div>
                            <div class="front face"><a href="http://www.trjcn.com/topic/index/2932.html" target="_blank" title="温州女装高级定制项目股权融资"><img src="http://static.trjcn.com/uploads/apply/201505/46_1431400720.jpg" width="182" height="118" alt="温州女装高级定制项目股权融资"></a></div>
                        </div>
                    </div>
                </li>
                                 <li>
                    <div class="flipcard-container">
                        <div class="flipcard">
                            <div class="back face" >
                                <a href="http://www.trjcn.com/topic/index/3226.html" target="_blank" title="山西某肉牛养殖产业链项目融资">
                                <h3>山西某肉牛养殖产业链项目融资</h3>
                                <p class="text">
                                                                    所属行业：农林牧渔<br />
融资额度：5000万元-15亿元<br />
所在地区：山西省 太原市                                                                </p>
                                </a>
                            </div>
                            <div class="front face"><a href="http://www.trjcn.com/topic/index/3226.html" target="_blank" title="山西某肉牛养殖产业链项目融资"><img src="http://static.trjcn.com/uploads/apply/201506/46_1433317157.jpg" width="182" height="118" alt="山西某肉牛养殖产业链项目融资"></a></div>
                        </div>
                    </div>
                </li>
                                 <li>
                    <div class="flipcard-container">
                        <div class="flipcard">
                            <div class="back face" >
                                <a href="http://www.trjcn.com/uploads/email1/ctrtk_201505258364.html" target="_blank" title="北京某移动互联网APP项目">
                                <h3>北京某移动互联网APP项目</h3>
                                <p class="text">
                                                                    所属行业：IT互联网<br />
融资额度：300万元-500万元<br />
所在地区：北京市                                                                </p>
                                </a>
                            </div>
                            <div class="front face"><a href="http://www.trjcn.com/uploads/email1/ctrtk_201505258364.html" target="_blank" title="北京某移动互联网APP项目"><img src="http://static.trjcn.com/uploads/apply/201506/46_1433317281.jpg" width="182" height="118" alt="北京某移动互联网APP项目"></a></div>
                        </div>
                    </div>
                </li>
                                 <li>
                    <div class="flipcard-container">
                        <div class="flipcard">
                            <div class="back face" >
                                <a href="http://www.trjcn.com/uploads/email1/ctrtk_201503167057.html" target="_blank" title="江苏常州某涂料项目融资">
                                <h3>江苏常州某涂料项目融资</h3>
                                <p class="text">
                                                                    所属行业：建筑建材<br />
融资额度：200万元<br />
所在地区：江苏省 常州市                                                                 </p>
                                </a>
                            </div>
                            <div class="front face"><a href="http://www.trjcn.com/uploads/email1/ctrtk_201503167057.html" target="_blank" title="江苏常州某涂料项目融资"><img src="http://static.trjcn.com/uploads/apply/201506/46_1433208391.jpg" width="182" height="118" alt="江苏常州某涂料项目融资"></a></div>
                        </div>
                    </div>
                </li>
                                 <li>
                    <div class="flipcard-container">
                        <div class="flipcard">
                            <div class="back face" >
                                <a href="http://www.trjcn.com/uploads/email1/ctrtk_201504217746.html" target="_blank" title="湖北机械零部件项目融资或转让">
                                <h3>湖北机械零部件项目融资或转让</h3>
                                <p class="text">
                                                                    所属行业：机械机电<br />
融资额度：500万元<br />
所在地区：湖北省 荆州市                                                                </p>
                                </a>
                            </div>
                            <div class="front face"><a href="http://www.trjcn.com/uploads/email1/ctrtk_201504217746.html" target="_blank" title="湖北机械零部件项目融资或转让"><img src="http://static.trjcn.com/uploads/apply/201506/46_1433491421.jpg" width="182" height="118" alt="湖北机械零部件项目融资或转让"></a></div>
                        </div>
                    </div>
                </li>
                                 <li>
                    <div class="flipcard-container">
                        <div class="flipcard">
                            <div class="back face" >
                                <a href="http://www.trjcn.com/uploads/email1/ctrtk_201505278417.html" target="_blank" title="重庆某汽车服务联盟平台融资">
                                <h3>重庆某汽车服务联盟平台融资</h3>
                                <p class="text">
                                                                    所属行业：IT互联网<br />
融资额度：6060万元<br />
所在地区：重庆市                                                                </p>
                                </a>
                            </div>
                            <div class="front face"><a href="http://www.trjcn.com/uploads/email1/ctrtk_201505278417.html" target="_blank" title="重庆某汽车服务联盟平台融资"><img src="http://static.trjcn.com/uploads/apply/201506/46_1433317379.jpg" width="182" height="118" alt="重庆某汽车服务联盟平台融资"></a></div>
                        </div>
                    </div>
                </li>
                                 <li>
                    <div class="flipcard-container">
                        <div class="flipcard">
                            <div class="back face" >
                                <a href="http://www.trjcn.com/uploads/email1/ctrtk_201505148179.html" target="_blank" title="辽宁某矿产项目融资">
                                <h3>辽宁某矿产项目融资</h3>
                                <p class="text">
                                                                    所属行业：矿产冶金 <br />
融资额度：500万元-1000万元<br />
所在地区：辽宁省 营口市                                                                </p>
                                </a>
                            </div>
                            <div class="front face"><a href="http://www.trjcn.com/uploads/email1/ctrtk_201505148179.html" target="_blank" title="辽宁某矿产项目融资"><img src="http://static.trjcn.com/uploads/apply/201506/46_1433471133.jpg" width="182" height="118" alt="辽宁某矿产项目融资"></a></div>
                        </div>
                    </div>
                </li>
                                 <li>
                    <div class="flipcard-container">
                        <div class="flipcard">
                            <div class="back face" >
                                <a href="http://www.trjcn.com/uploads/email1/ctrtk_201505128127.html" target="_blank" title="浙江极限格斗联赛传媒项目">
                                <h3>浙江极限格斗联赛传媒项目</h3>
                                <p class="text">
                                                                    所属行业：教育培训体育<br />
融资额度：5000万元以上<br />
所在地区：浙江省 宁波市                                                                </p>
                                </a>
                            </div>
                            <div class="front face"><a href="http://www.trjcn.com/uploads/email1/ctrtk_201505128127.html" target="_blank" title="浙江极限格斗联赛传媒项目"><img src="http://static.trjcn.com/uploads/apply/201505/46_1432276117.jpg" width="182" height="118" alt="浙江极限格斗联赛传媒项目"></a></div>
                        </div>
                    </div>
                </li>
                                 <li>
                    <div class="flipcard-container">
                        <div class="flipcard">
                            <div class="back face" >
                                <a href="http://www.trjcn.com/uploads/email1/ctrtk_201504227760.html" target="_blank" title="重庆果桑综合应用开发项目">
                                <h3>重庆果桑综合应用开发项目</h3>
                                <p class="text">
                                                                    所属行业：食品饮料烟草<br />
融资额度：1000万元-5000万元<br />
所在地区：重庆市                                                                </p>
                                </a>
                            </div>
                            <div class="front face"><a href="http://www.trjcn.com/uploads/email1/ctrtk_201504227760.html" target="_blank" title="重庆果桑综合应用开发项目"><img src="http://static.trjcn.com/uploads/apply/201506/46_1433402629.jpg" width="182" height="118" alt="重庆果桑综合应用开发项目"></a></div>
                        </div>
                    </div>
                </li>
                                 <li>
                    <div class="flipcard-container">
                        <div class="flipcard">
                            <div class="back face" >
                                <a href="http://www.trjcn.com/uploads/email1/ctrtk_201505208288.html" target="_blank" title="浙江某特色粽子开发项目融资">
                                <h3>浙江某特色粽子开发项目融资</h3>
                                <p class="text">
                                                                    所属行业：食品饮料烟草<br />
融资额度：1200万元<br />
所在地区：浙江省 绍兴市                                                                </p>
                                </a>
                            </div>
                            <div class="front face"><a href="http://www.trjcn.com/uploads/email1/ctrtk_201505208288.html" target="_blank" title="浙江某特色粽子开发项目融资"><img src="http://static.trjcn.com/uploads/apply/201506/46_1433483591.jpg" width="182" height="118" alt="浙江某特色粽子开发项目融资"></a></div>
                        </div>
                    </div>
                </li>
                                 <li>
                    <div class="flipcard-container">
                        <div class="flipcard">
                            <div class="back face" >
                                <a href="http://www.trjcn.com/uploads/email1/ctrtk_201505128136.html" target="_blank" title="一站式整装家居O2O项目融资">
                                <h3>一站式整装家居O2O项目融资</h3>
                                <p class="text">
                                                                    所属行业：IT互联网<br />
融资额度：1200万元<br />
所在地区：湖南省                                                                </p>
                                </a>
                            </div>
                            <div class="front face"><a href="http://www.trjcn.com/uploads/email1/ctrtk_201505128136.html" target="_blank" title="一站式整装家居O2O项目融资"><img src="http://static.trjcn.com/uploads/apply/201506/46_1433483855.jpg" width="182" height="118" alt="一站式整装家居O2O项目融资"></a></div>
                        </div>
                    </div>
                </li>
                                 
                                </ul>
                            </div>
                        </div>
                        <div class="classify">
                            <ul class="classify-group">
                            
                                                        <li class="classify-item">
                                <div class="classify-head fn-clear">
                                    <h3 class="classify-title"><a href="http://xiangmu.trjcn.com?y=13" target="_blank">房地产</a></h3>
                                    <a href="http://xiangmu.trjcn.com?y=13" target="_blank" class="classify-more">更多</a>
                                </div>
                                <dl class="classify-cont fn-clear">
                                                                    <dt class="classify-info-region"><a href="http://xiangmu.trjcn.com?a=1770" title="江苏省"target="_blank" >江苏省</a></dt>
                                    <dd class="classify-info-name"><a href="http://xiangmu.trjcn.com/detail_337855.html" title="江苏连云港某地产项目债权融资1.5亿元"target="_blank" >江苏连云港某地产项目债权融资1.5亿元</a></dd>
                                                                     <dt class="classify-info-region"><a href="http://xiangmu.trjcn.com?a=1440" title="湖北省"target="_blank" >湖北省</a></dt>
                                    <dd class="classify-info-name"><a href="http://xiangmu.trjcn.com/detail_337761.html" title="湖北某棚户区改造项目债权融资1亿元"target="_blank" >湖北某棚户区改造项目债权融资1亿元</a></dd>
                                                                     <dt class="classify-info-region"><a href="http://xiangmu.trjcn.com?a=1561" title="湖南省"target="_blank" >湖南省</a></dt>
                                    <dd class="classify-info-name"><a href="http://xiangmu.trjcn.com/detail_337457.html" title="湖南某老年活动中心项目债权融资20亿-30亿元"target="_blank" >湖南某老年活动中心项目债权融资20亿-30亿元</a></dd>
                                                                     <dt class="classify-info-region"><a href="http://xiangmu.trjcn.com?a=917" title="河北省"target="_blank" >河北省</a></dt>
                                    <dd class="classify-info-name"><a href="http://xiangmu.trjcn.com/detail_337369.html" title="河北某二手房项目股权融资300万元-500万元"target="_blank" >河北某二手房项目股权融资300万元-500万元</a></dd>
                                                                     <dt class="classify-info-region"><a href="http://xiangmu.trjcn.com?a=2117" title="内蒙古"target="_blank" >内蒙古</a></dt>
                                    <dd class="classify-info-name"><a href="http://xiangmu.trjcn.com/detail_337360.html" title="内蒙古呼和浩特某商业地产项目债权融资6000万-8000万元"target="_blank" >内蒙古呼和浩特某商业地产项目债权融资6000万-8000万元</a></dd>
                                                                 </dl>
                            </li>
                                                        <li class="classify-item">
                                <div class="classify-head fn-clear">
                                    <h3 class="classify-title"><a href="http://xiangmu.trjcn.com?y=23" target="_blank">IT互联网</a></h3>
                                    <a href="http://xiangmu.trjcn.com?y=23" target="_blank" class="classify-more">更多</a>
                                </div>
                                <dl class="classify-cont fn-clear">
                                                                    <dt class="classify-info-region"><a href="http://xiangmu.trjcn.com?a=8" title="福建省"target="_blank" >福建省</a></dt>
                                    <dd class="classify-info-name"><a href="http://xiangmu.trjcn.com/detail_337944.html" title="福建某互联网APP快递项目股权融资500万-600万元"target="_blank" >福建某互联网APP快递项目股权融资500万-600万元</a></dd>
                                                                     <dt class="classify-info-region"><a href="http://xiangmu.trjcn.com?a=6" title="北京"target="_blank" >北京</a></dt>
                                    <dd class="classify-info-name"><a href="http://xiangmu.trjcn.com/detail_337939.html" title="北京某互联网项目股权融资3000万-5000万元"target="_blank" >北京某互联网项目股权融资3000万-5000万元</a></dd>
                                                                     <dt class="classify-info-region"><a href="http://xiangmu.trjcn.com?a=6" title="北京"target="_blank" >北京</a></dt>
                                    <dd class="classify-info-name"><a href="http://xiangmu.trjcn.com/detail_337845.html" title="北京某装修互联网项目股权融资100万-300万元"target="_blank" >北京某装修互联网项目股权融资100万-300万元</a></dd>
                                                                     <dt class="classify-info-region"><a href="http://xiangmu.trjcn.com?a=507" title="广东省"target="_blank" >广东省</a></dt>
                                    <dd class="classify-info-name"><a href="http://xiangmu.trjcn.com/detail_337840.html" title="广东某去中心化O2O电商项目股权融资2000万-3000万元"target="_blank" >广东某去中心化O2O电商项目股权融资2000万-3000万元</a></dd>
                                                                     <dt class="classify-info-region"><a href="http://xiangmu.trjcn.com?a=7" title="重庆"target="_blank" >重庆</a></dt>
                                    <dd class="classify-info-name"><a href="http://xiangmu.trjcn.com/detail_337794.html" title="重庆某O2O印刷项目股权融资1000万元"target="_blank" >重庆某O2O印刷项目股权融资1000万元</a></dd>
                                                                 </dl>
                            </li>
                                                        <li class="classify-item">
                                <div class="classify-head fn-clear">
                                    <h3 class="classify-title"><a href="http://xiangmu.trjcn.com?y=16" target="_blank">农林牧渔</a></h3>
                                    <a href="http://xiangmu.trjcn.com?y=16" target="_blank" class="classify-more">更多</a>
                                </div>
                                <dl class="classify-cont fn-clear">
                                                                    <dt class="classify-info-region"><a href="http://xiangmu.trjcn.com?a=2760" title="四川省"target="_blank" >四川省</a></dt>
                                    <dd class="classify-info-name"><a href="http://xiangmu.trjcn.com/detail_337945.html" title="四川成都某农场项目股权融资250万-300万元"target="_blank" >四川成都某农场项目股权融资250万-300万元</a></dd>
                                                                     <dt class="classify-info-region"><a href="http://xiangmu.trjcn.com?a=3191" title="云南省"target="_blank" >云南省</a></dt>
                                    <dd class="classify-info-name"><a href="http://xiangmu.trjcn.com/detail_337916.html" title="云南某千年古树茶项目股权融资2000万元"target="_blank" >云南某千年古树茶项目股权融资2000万元</a></dd>
                                                                     <dt class="classify-info-region"><a href="http://xiangmu.trjcn.com?a=777" title="贵州省"target="_blank" >贵州省</a></dt>
                                    <dd class="classify-info-name"><a href="http://xiangmu.trjcn.com/detail_337807.html" title="贵州遵义某茶园一体化项目股权融资2000万元"target="_blank" >贵州遵义某茶园一体化项目股权融资2000万元</a></dd>
                                                                     <dt class="classify-info-region"><a href="http://xiangmu.trjcn.com?a=3191" title="云南省"target="_blank" >云南省</a></dt>
                                    <dd class="classify-info-name"><a href="http://xiangmu.trjcn.com/detail_337793.html" title="云南某农业项目债权融资300万元"target="_blank" >云南某农业项目债权融资300万元</a></dd>
                                                                     <dt class="classify-info-region"><a href="http://xiangmu.trjcn.com?a=1770" title="江苏省"target="_blank" >江苏省</a></dt>
                                    <dd class="classify-info-name"><a href="http://xiangmu.trjcn.com/detail_337777.html" title="江苏某农业项目股权融资1000万-1500万元"target="_blank" >江苏某农业项目股权融资1000万-1500万元</a></dd>
                                                                 </dl>
                            </li>
                                                        <li class="classify-item">
                                <div class="classify-head fn-clear">
                                    <h3 class="classify-title"><a href="http://xiangmu.trjcn.com?y=41" target="_blank">餐饮休闲娱乐</a></h3>
                                    <a href="http://xiangmu.trjcn.com?y=41" target="_blank" class="classify-more">更多</a>
                                </div>
                                <dl class="classify-cont fn-clear">
                                                                    <dt class="classify-info-region"><a href="http://xiangmu.trjcn.com?a=6" title="北京"target="_blank" >北京</a></dt>
                                    <dd class="classify-info-name"><a href="http://xiangmu.trjcn.com/detail_337679.html" title="北京某餐饮及创意蛋糕项目融资200万-500万元"target="_blank" >北京某餐饮及创意蛋糕项目融资200万-500万元</a></dd>
                                                                     <dt class="classify-info-region"><a href="http://xiangmu.trjcn.com?a=1289" title="黑龙江省"target="_blank" >黑龙江省</a></dt>
                                    <dd class="classify-info-name"><a href="http://xiangmu.trjcn.com/detail_337330.html" title="黑龙江哈尔滨某水上乐园项目融资50万-100万元"target="_blank" >黑龙江哈尔滨某水上乐园项目融资50万-100万元</a></dd>
                                                                     <dt class="classify-info-region"><a href="http://xiangmu.trjcn.com?a=6" title="北京"target="_blank" >北京</a></dt>
                                    <dd class="classify-info-name"><a href="http://xiangmu.trjcn.com/detail_337237.html" title="北京某高端儿童乐园项目股权融资200万-400万元"target="_blank" >北京某高端儿童乐园项目股权融资200万-400万元</a></dd>
                                                                     <dt class="classify-info-region"><a href="http://xiangmu.trjcn.com?a=8" title="福建省"target="_blank" >福建省</a></dt>
                                    <dd class="classify-info-name"><a href="http://xiangmu.trjcn.com/detail_337170.html" title="福建某餐饮项目股权融资80万元"target="_blank" >福建某餐饮项目股权融资80万元</a></dd>
                                                                     <dt class="classify-info-region"><a href="http://xiangmu.trjcn.com?a=777" title="贵州省"target="_blank" >贵州省</a></dt>
                                    <dd class="classify-info-name"><a href="http://xiangmu.trjcn.com/detail_337165.html" title="贵州某旅游度假项目股权融资80万-300万元"target="_blank" >贵州某旅游度假项目股权融资80万-300万元</a></dd>
                                                                 </dl>
                            </li>
                                                        <li class="classify-item">
                                <div class="classify-head fn-clear">
                                    <h3 class="classify-title"><a href="http://xiangmu.trjcn.com?y=19" target="_blank">建筑建材</a></h3>
                                    <a href="http://xiangmu.trjcn.com?y=19" target="_blank" class="classify-more">更多</a>
                                </div>
                                <dl class="classify-cont fn-clear">
                                                                    <dt class="classify-info-region"><a href="http://xiangmu.trjcn.com?a=5" title="浙江省"target="_blank" >浙江省</a></dt>
                                    <dd class="classify-info-name"><a href="http://xiangmu.trjcn.com/detail_337498.html" title="浙江某高活性冶金石灰或高品质轻质碳酸钙项目招商"target="_blank" >浙江某高活性冶金石灰或高品质轻质碳酸钙项目招商</a></dd>
                                                                     <dt class="classify-info-region"><a href="http://xiangmu.trjcn.com?a=1561" title="湖南省"target="_blank" >湖南省</a></dt>
                                    <dd class="classify-info-name"><a href="http://xiangmu.trjcn.com/detail_337399.html" title="湖南邵阳某装修公司债权融资100万-200万元"target="_blank" >湖南邵阳某装修公司债权融资100万-200万元</a></dd>
                                                                     <dt class="classify-info-region"><a href="http://xiangmu.trjcn.com?a=2231" title="宁夏"target="_blank" >宁夏</a></dt>
                                    <dd class="classify-info-name"><a href="http://xiangmu.trjcn.com/detail_337281.html" title="宁夏某建材公司项目融资1000万-2000万元"target="_blank" >宁夏某建材公司项目融资1000万-2000万元</a></dd>
                                                                     <dt class="classify-info-region"><a href="http://xiangmu.trjcn.com?a=1561" title="湖南省"target="_blank" >湖南省</a></dt>
                                    <dd class="classify-info-name"><a href="http://xiangmu.trjcn.com/detail_337111.html" title="湖南某铝材项目股权融资5000万元"target="_blank" >湖南某铝材项目股权融资5000万元</a></dd>
                                                                     <dt class="classify-info-region"><a href="http://xiangmu.trjcn.com?a=3413" title="安徽省"target="_blank" >安徽省</a></dt>
                                    <dd class="classify-info-name"><a href="http://xiangmu.trjcn.com/detail_337068.html" title="安徽某铜丝加工项目股权融资100万元"target="_blank" >安徽某铜丝加工项目股权融资100万元</a></dd>
                                                                 </dl>
                            </li>
                                                        <li class="classify-item">
                                <div class="classify-head fn-clear">
                                    <h3 class="classify-title"><a href="http://xiangmu.trjcn.com" target="_blank">其他行业</a></h3>
                                    <a href="http://xiangmu.trjcn.com" target="_blank" class="classify-more">更多</a>
                                </div>
                                <dl class="classify-cont fn-clear">
                                                                    <dt class="classify-info-region"><a href="http://xiangmu.trjcn.com?a=1890" title="江西省"target="_blank" >江西省</a></dt>
                                    <dd class="classify-info-name"><a href="http://xiangmu.trjcn.com/detail_337951.html" title="江西某生物保健项目股权融资1500万元"target="_blank" >江西某生物保健项目股权融资1500万元</a></dd>
                                                                     <dt class="classify-info-region"><a href="http://xiangmu.trjcn.com?a=2760" title="四川省"target="_blank" >四川省</a></dt>
                                    <dd class="classify-info-name"><a href="http://xiangmu.trjcn.com/detail_337936.html" title="四川某矿产企业债权融资1000万元"target="_blank" >四川某矿产企业债权融资1000万元</a></dd>
                                                                     <dt class="classify-info-region"><a href="http://xiangmu.trjcn.com?a=1561" title="湖南省"target="_blank" >湖南省</a></dt>
                                    <dd class="classify-info-name"><a href="http://xiangmu.trjcn.com/detail_337934.html" title="湖南永州某教育项目债权融资5000万元"target="_blank" >湖南永州某教育项目债权融资5000万元</a></dd>
                                                                     <dt class="classify-info-region"><a href="http://xiangmu.trjcn.com?a=2760" title="四川省"target="_blank" >四川省</a></dt>
                                    <dd class="classify-info-name"><a href="http://xiangmu.trjcn.com/detail_337866.html" title="四川某建筑垃圾回收再利用项目股权融资280万-360万元"target="_blank" >四川某建筑垃圾回收再利用项目股权融资280万-360万元</a></dd>
                                                                     <dt class="classify-info-region"><a href="http://xiangmu.trjcn.com?a=2739" title="上海"target="_blank" >上海</a></dt>
                                    <dd class="classify-info-name"><a href="http://xiangmu.trjcn.com/detail_337865.html" title="上海某新型石墨烯及其制备项目股权融资3000万元"target="_blank" >上海某新型石墨烯及其制备项目股权融资3000万元</a></dd>
                                                                 </dl>
                            </li>
                                                           
                            </ul>
                        </div>
                    </div>
                </div>
            </div>
                    
        </div>
        
        <div class="links">
            <div class="container">
                <h2 class="links-title">links<strong>友情链接</strong></h2>
                <div class="links-info">
                                    <a href="http://www.hunteron.com/" target="_blank" title="猎上网">猎上网</a>                        <a href="http://www.xspcf.com" target="_blank" title="小算盘财富">小算盘财富</a>                        <a href="http://corp.eastmoney.com/links.aspx" target="_blank" title="东方财富网">东方财富网</a>                        <a href="http://shiwuhuangjin.gold678.com/" target="_blank" title="汇金网">汇金网</a>                        <a href="http://www.yzforex.com/" target="_blank" title="亚洲外汇网">亚洲外汇网</a>                        <a href="http://www.ceo.hc360.com/" target="_blank" title="慧聪企业管理">慧聪企业管理</a>                        <a href="http://www.afinance.cn/" target="_blank" title="第一金融网">第一金融网</a>                        <a href="http://finance.gucheng.com/" target="_blank" title="股城财经">股城财经</a>                        <a href="http://www.qianzhan.com/indynews/" target="_blank" title="前瞻财经">前瞻财经</a>                        <a href="http://www.91jin.com/" target="_blank" title="国鑫黄金">国鑫黄金</a>                        <a href="http://www.ocn.com.cn/" target="_blank" title="中投顾问">中投顾问</a>                        <a href="http://www.souqian.com/" target="_blank" title="天使投资">天使投资</a>                        <a href="http://www.jinhaidai.com/" target="_blank" title="金海贷">金海贷</a>                        <a href="http://www.diyizby.com" target="_blank" title="第一纸白银">第一纸白银</a>                        <a href="http://jr.dahe.cn/" target="_blank" title="大河网金融频道">大河网金融频道</a>                        <a href="http://value500.com" target="_blank" title="投资理财导航">投资理财导航</a>                        <a href="http://www.roadoor.com/" target="_blank" title="贷款网站">贷款网站</a>                        <a href="http://money.ycwb.com/" target="_blank" title="金羊网理财">金羊网理财</a>                        <a href="http://www.cofool.com/" target="_blank" title="叩富网模拟炒股">叩富网模拟炒股</a>                        <a href="http://www.51zjxm.com/" target="_blank" title="找资金">找资金</a>                        <a href="http://www.55188.com/" target="_blank" title="理想股票论坛">理想股票论坛</a>                        <a href="http://www.zgsxzs.com/" target="_blank" title="招商引资">招商引资</a>                        <a href="http://www.gpcxw.com/" target="_blank" title="爱股股票网">爱股股票网</a>                        <a href="http://www.laohucaijing.com/" target="_blank" title="环球老虎财经">环球老虎财经</a>                        <a href="http://www.cnffi.com/" target="_blank" title="中国期货信息网">中国期货信息网</a>                        <a href="http://www.cfcyb.com/" target="_blank" title="创业板">创业板</a>                        <a href="http://jiameng.qudao.com/" target="_blank" title="投资创业">投资创业</a>                        <a href="http://www.globevisa.com.cn/" target="_blank" title="投资移民">投资移民</a>                        <a href="http://bbs.macd.cn/" target="_blank" title="MACD股票论坛">MACD股票论坛</a>                        <a href="http://biz.zjol.com.cn/" target="_blank" title="浙商网">浙商网</a>                        <a href="http://www.caiguu.com/" target="_blank" title="股票网">股票网</a>                        <a href="http://www.tou18.cn/" target="_blank" title="股市行情">股市行情</a>                        <a href="http://www.xyz.cn/" target="_blank" title="新一站保险网">新一站保险网</a>                        <a href="http://www.xinxindai.com/" target="_blank" title="P2P理财">P2P理财</a>                        <a href="/about_link.html" target="_blank" title="更多友情链接>>>">更多友情链接>>></a>                            </div>
            </div>
        </div>
        
        <footer id="footer">
    <div class="help">
        <div class="container">
            <div class="help-service">
                <div class="help-service-logo">投融界</div>
                <p class="help-service-text">免费服务热线</p>
                <p class="help-service-call">400-858-9000</p>
                <p class="help-service-text">投诉电话：0571-56132500</p>
                <p class="help-service-text">周一到周六 9:00-20:00</p>
                <p class="help-service-text">邮箱：kefu@trjcn.com</p>
            </div>
            <dl class="help-group">
                <dt class="help-title">平台保障</dt>
                <dd class="help-item"><a href="http://www.trjcn.com/help/list_134_p1.html" target="_blank" rel="nofollow">会员身份实名认证</a></dd>
                <dd class="help-item"><a href="http://www.trjcn.com/help/detail_73019.html" target="_blank" rel="nofollow">举报投诉违规处罚</a></dd>
            </dl>
            <dl class="help-group">
                <dt class="help-title"><a href="http://www.trjcn.com/help/look_fund.html" target="_blank" rel="nofollow">新手指导</a></dt>
                <dd class="help-item"><a href="http://www.trjcn.com/help/list_124_p1.html" target="_blank" rel="nofollow">免费注册生成名片</a></dd>
                <dd class="help-item"><a href="http://www.trjcn.com/help/detail_73029.html" target="_blank" rel="nofollow">免费发布投融信息</a></dd>
                <dd class="help-item"><a href="http://www.trjcn.com/help.html" target="_blank" rel="nofollow">常见问题解答</a></dd>
            </dl>
            <dl class="help-group">
                <dt class="help-title"><a href="http://www.trjcn.com/service.html" target="_blank" rel="nofollow">投融服务</a></dt>
   			    <dd class="help-item"><a href="http://www.trjcn.com/service_B_RONGZI.html" target="_blank" rel="nofollow">易融宝</a></dd>
    			<dd class="help-item"><a href="http://www.trjcn.com/service_B_TOUZI.html" target="_blank" rel="nofollow">投资宝</a></dd>
    			<dd class="help-item"><a href="http://www.trjcn.com/service_Z_SHUAXIN.html" target="_blank" rel="nofollow">委托刷新</a></dd>
   				<dd class="help-item"><a href="http://www.trjcn.com/service_Z_TOUDI.html" target="_blank" rel="nofollow">投递项目</a></dd>
            </dl>
            <dl class="help-group">
                <dt class="help-title"><a href="http://www.trjcn.com/about.html" target="_blank" rel="nofollow">关于投融界</a></dt>
                <dd class="help-item"><a href="http://www.trjcn.com/about.html" target="_blank" rel="nofollow">投融界介绍</a></dd>
                <dd class="help-item"><a href="http://www.trjcn.com/about_contact.html" target="_blank" rel="nofollow">联系我们</a></dd>
                <dd class="help-item"><a href="http://www.trjcn.com/about_notice.html" target="_blank" rel="nofollow">网站公告</a></dd>
                <dd class="help-item"><a href="http://www.trjcn.com/about_privacy.html" target="_blank" rel="nofollow">隐私条款</a></dd>
                <dd class="help-item"><a href="http://www.trjcn.com/sitemap.html" target="_blank">网站地图</a></dd>
            </dl>
            <dl class="help-group help-group-icon">
                <dt class="help-title">微信订阅</dt>
                <dd class="help-item-wechat"><img src="http://yf.trjcn.com/assets/src/images/v6/temp/wechat-qrcode.jpg" alt="微信二维码" height="97" width="97"><span>扫描二维码，加关注</span></dd>
            </dl>
        </div>
    </div>
    <div class="copyright">
        <div class="container">
            <p class="copyright-info">Copyright © 2015 杭州投融界网络有限公司（www.trjcn.com） 版权所有 | ICP经营许可证:<a href="http://www.trjcn.com/about_notice_102794.html" target="_blank">浙B2-20130239</a></p>
            <p class="certificate"><a href="http://122.224.75.236/wzba/login.do?method=hdurl&amp;doamin=http://www.trjcn.com&amp;id=330103000101378&amp;SHID=1223.0AFF_NAME=com.rouger.%0Ags.main.UserInfoAff&amp;AFF_ACTION=qyhzdetail&amp;PAGE_URL=ShowDetail" target="_blank" rel="nofollow" class="mod mod-a"></a><a href="http://www.pingpinganan.gov.cn" target="_blank" rel="nofollow" class="mod mod-b"></a><a href="https://ss.knet.cn/verifyseal.dll?sn=e13020633010039151s9hn000000&amp;ct=df&amp;a=1&amp;pa=243344" target="_blank" rel="nofollow" class="mod mod-c"></a><a href="https://search.szfw.org/cert/l/CX20140808008687008783" target="_blank" rel="nofollow" class="mod mod-d"></a><a href="http://zhanzhang.anquan.org/physical/report/?domain=www.trjcn.com" logo_type="realname" logo_size="75x27" key="5338c575efbfb07f1090353f" target="_blank" rel="nofollow" class="mod mod-e"></a></p>
        </div>
    </div>
</footer>
<div style="display:none;">
<script type="text/javascript">
var re = new RegExp("trackid=([^&]*)", "i" );
var a = re.exec( document.location.search );
if (a !==null && a[1])document.write('<img src="http://h.trjcn.com/h.gif?'+a[1]+':end&'+Math.random()+'">');
</script>
<script>
var _hmt = _hmt || [];
(function() {
  var hm = document.createElement("script");
  hm.src = "//hm.baidu.com/hm.js?1b0c1e9521b3960dfab379e388960190";
  var s = document.getElementsByTagName("script")[0]; 
  s.parentNode.insertBefore(hm, s);
})();
</script>
<script type="text/javascript">
<!-- 
(function (d) {
window.bd_cpro_rtid="rjTzrjT";
var s = d.createElement("script");s.type = "text/javascript";s.async = true;s.src = location.protocol + "//cpro.baidu.com/cpro/ui/rt.js";
var s0 = d.getElementsByTagName("script")[0];s0.parentNode.insertBefore(s, s0);
})(document);
//-->
</script>
<script>
var _hmt = _hmt || [];
(function() {
  var hm = document.createElement("script");
  hm.src = "//hm.baidu.com/hm.js?d5f6ea52add8852695bb7161e4cdb42d";
  var s = document.getElementsByTagName("script")[0]; 
  s.parentNode.insertBefore(hm, s);
})();
</script>
</div>
        
    </div>
    <script>seajs.use("page/v6/home")</script>
<div id="J_tmp_look_fund" class="fn-hide">
        <div class="seek-dialog-title">请填写真实信息，以便为您匹配合适的资金信息</div>
        <ul class="seek-dialog-form">
            <li class="seek-dialog-item">
                <label class="seek-dialog-label">融资金额:</label>
                <span class="seek-dialog-value">
                <select class="seek-dialog-select" name="m"><option value=''>选择要融资的金额</option>
                <option value="2">1-10万</option>
                <option value="3">10-50万</option>
                <option value="4">50-100万</option>
                <option value="5">100-500万</option>
                <option value="6">500-1000万</option>
                <option value="7">1000-5000万</option>
                <option value="8">5000万-1亿</option>
                <option value="9">1亿以上</option>
                </select>
                </span>
            </li>
            <li class="seek-dialog-item">
                <label class="seek-dialog-label">融资方式:</label>
                <span class="seek-dialog-value">
                <select class="seek-dialog-select" name="cid">
                <option value=''>选择项目融资方式</option>
                <option value="2010">股权投资</option>
                <option value="2011">债权投资</option>
                </select></span>
            </li>
            <li class="seek-dialog-item">
                <label class="seek-dialog-label">所属行业:</label>
                <span class="seek-dialog-value"><select class="seek-dialog-select" name="y"><option value=''>选择项目所属行业</option>
                <option value="13">房地产</option>
            <option value="34">节能环保</option>
            <option value="14">矿产冶金</option>
            <option value="16">农林牧渔</option>
            <option value="19">建筑建材</option>
            <option value="22">机械机电</option>
            <option value="35">基础设施</option>
            <option value="20">旅游酒店</option>
            <option value="21">医疗保健</option>
            <option value="46">生物医药</option>
            <option value="30">纺织服装饰品</option>
            <option value="53">化学化工</option>
            <option value="23">IT互联网</option>
            <option value="38">电气设备</option>
            <option value="40">汽车汽配</option>
            <option value="24">电子通信</option>
            <option value="28">文化传媒广告</option>
            <option value="41">餐饮休闲娱乐</option>
            <option value="39">交通运输</option>
            <option value="44">食品饮料烟草</option>
            <option value="48">商务贸易</option>
            <option value="43">批发零售</option>
            <option value="42">教育培训体育</option>
            <option value="37">航空航天</option>
            <option value="45">家居日用</option>
            <option value="50">园林园艺</option>
            <option value="31">行政事业机构</option>
            <option value="36">国防军工</option>
            <option value="47">海洋开发</option>
            <option value="49">家政服务</option>
            <option value="51">收藏品</option>
            <option value="18">能源</option>
            <option value="15">金融投资</option>
            <option value="56">仓储物流</option>
            <option value="57">家电数码</option>
            <option value="54">其他行业</option>
                    </select></span>
            </li>
            <li class="seek-dialog-item">
                <label class="seek-dialog-label">所在地区:</label>
                <span class="seek-dialog-value"><select class="seek-dialog-select" name="a"><option value=''>选择项目所在地区</option>
                <option value="507">广东省</option>
            <option value="6">北京</option>
            <option value="2316">山东省</option>
            <option value="2739">上海</option>
            <option value="1770">江苏省</option>
            <option value="5">浙江省</option>
            <option value="1105">河南省</option>
            <option value="2760">四川省</option>
            <option value="917">河北省</option>
            <option value="1440">湖北省</option>
            <option value="8">福建省</option>
            <option value="1561">湖南省</option>
            <option value="2614">陕西省</option>
            <option value="7">重庆</option>
            <option value="2002">辽宁省</option>
            <option value="3413">安徽省</option>
            <option value="652">广西省</option>
            <option value="2477">山西省</option>
            <option value="3191">云南省</option>
            <option value="1890">江西省</option>
            <option value="777">贵州省</option>
            <option value="2965">天津</option>
            <option value="1289">黑龙江省</option>
            <option value="1700">吉林省</option>
            <option value="2117">内蒙古</option>
            <option value="3072">新疆</option>
            <option value="405">甘肃省</option>
            <option value="877">海南省</option>
            <option value="2231">宁夏</option>
            <option value="3572">海外</option>
            <option value="2259">青海省</option>
            <option value="2985">西藏</option>
            <option value="3553">澳门</option>
            <option value="3556">台湾</option>
            <option value="3552">香港</option>
                    </select></span>
            </li>
            <li class="seek-dialog-item"><a href="#" url="http://zijin.trjcn.com" id="J_btn_look_fund_do" class="btn-seek-dialog">找资金</a></li>
        </ul>
    </div>
	<div id="float-sidebar">
    <a href="http://chat.53kf.com/webCompany.php?arg=trjcn&style=1" target="_blank" rel="nofollow" class="go-service"></a>
    <a href="javascript:;" class="go-top" id="go-top"></a>
</div>
<div  id="float-bottom-toolbar" class="fn-hide">
    <div class="bottom-toolbar-cont">
        <div class="container">
        <form id="J_regfrmfooter">
        <div class="quick-register"><input type="text" class="qr-phone J_placeholder" tip="您的手机号码"value="您的手机号码" name="mobile" id="J_phone"  maxlength="11" ><input type="text" class="qr-captcha J_placeholder" tip="短信验证码"value="短信验证码" maxlength="6" name="mobilecode" id="J_phone_code"><button class="btn-qr-captcha" type="button" id="T-reg-phone-code">获取验证码</button><button class="btn-qr-submit" type="button" id="J_btn_reg">免费生成名片</button><span class="login-link">已经是会员，<a href="http://www.trjcn.com/login.html">立即登录</a></span><p class="quick-register-tips" id="J_phone_info"></p>
            <input type="hidden" value="trj3" name="ver">
            <input type="hidden" value="zjxmsms" name="method">
            <input type="hidden" value="trjindexfooter" name="w">
            </div>
            </form>
        </div>
    </div>
    <div class="bottom-toolbar-bg"></div>
    <a href="javascript:;" class="bottom-toolbar-close">×</a>
</div><div style="display:none;">

</div>

<script src="${BASE_PATH}/assets/js/jquery.bxslider.js"></script>
<script src="http://cdn.leafletjs.com/leaflet-0.5.1/leaflet.js"></script>
<script src="${BASE_PATH}/assets/js/jquery.fitvids.js"></script>
<script src="${BASE_PATH}/assets/js/jquery.sequence-min.js"></script>
<script src="${BASE_PATH}/assets/js/jquery.bxslider.js"></script>
<script src="${BASE_PATH}/assets/js/main-menu.js"></script>
<script src="${BASE_PATH}/assets/js/template.js"></script>

</body>
</html>