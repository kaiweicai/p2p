<div class="login_header container-fluid">
	<div class="row">
    	<div class="col-md-3 col-md-offset-3">
    		<a href='<pp:SystemConstantTag con="com.yiqiandai.p2p.common.constant.URLVariable.INDEX"/>'>
    			<img src="${root}/assets/images/logo.png" />
    		</a>
    	</div>
        <div class="col-md-3 col-md-offset-2">
        	<ul class="list-inline">
            	<li>客服服务</li>
                <li>
                	<a title="关注新浪微博" href='<pp:SystemConstantTag con="com.yiqiandai.p2p.common.constant.URLVariable.COMPANY_SINA_URL"/>' class="s1" target="_blank">
                	</a>
                </li>
                <li><a href="#" class="s2" id="weixin" target="_blank"></a></li>
                <li>
                	<a title="联系客服" href='<pp:SystemConstantTag con="com.yiqiandai.p2p.common.constant.SystemVariable.KFQQ"/>' class="s3" target="_blank"></a>
                </li>
                <li><a title="关注腾讯微博" href='<pp:SystemConstantTag con="com.yiqiandai.p2p.common.constant.URLVariable.COMPANY_TECENT_URL"/>' class="s4" target="_blank">
                </a>
                </li>
            </ul>
            <div class="weixin" id="weixinimg" style="display:none; z-index:999;">
            	<img src="/assets/images/weixin3.png">
            </div>
        </div>
    </div>
</div>
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