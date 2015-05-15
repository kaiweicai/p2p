<%@taglib uri="http://www.yiqiandai.com/tld/mytaglib" prefix="pp"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<link rel="stylesheet" type="text/css" href="/css/register.css" />
<link rel="stylesheet" type="text/css" href="/css/user.css" />
<link rel="stylesheet" type="text/css" href="/css/common.css" />
<div class="login_header">
	<div class="center">
    	<div class="logo">
    		<a href='<pp:SystemConstantTag con="com.yiqiandai.p2p.common.constant.URLVariable.INDEX"/>'>
    			<img src="/images/logo.png" />
    		</a>
    	</div>
        <div class="login_service">
        	<ul>
            	<li class="pt10">客服服务</li>
                <li>
                	<a title="关注新浪微博" href='<pp:SystemConstantTag con="com.yiqiandai.p2p.common.constant.URLVariable.COMPANY_SINA_URL"/>' class="s1" target="_blank"></a>
                </li>
                <li><a href="#" class="s2" id="weixin" target="_blank"></a></li>
                <li>
                	<a title="联系客服" href='<pp:SystemConstantTag con="com.yiqiandai.p2p.common.constant.SystemVariable.KFQQ"/>' class="s3" target="_blank"></a>
                </li>
                <li><a title="关注腾讯微博" href='<pp:SystemConstantTag con="com.yiqiandai.p2p.common.constant.URLVariable.COMPANY_TECENT_URL"/>' class="s4" target="_blank"></a></li>
            </ul>
            <div class="weixin" id="weixinimg" style="display:none; z-index:999;">
            	<img src="/images/weixin3.png">
            </div>
        </div>
        <div class="clear"></div>
    </div>
</div>
<div class="clear"></div>
<form:errors></form:errors>
<script type="text/javascript">
<!--
$("#weixin").mouseover(function(){
	$("#weixinimg").show();
});
$("#weixin").mouseout(function(){
	$("#weixinimg").hide();
});
//-->
</script>