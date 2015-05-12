<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>用户登录</title>
<%@include file="/WEB-INF/include/loginHeader.jsp"%>
</head>
<body>
	<form action="<%=controller.getURI(request, Login.class)%>" method="post" onsubmit="return onSubmit();">
	<div class="main_box">
    	<div class="login_bg">
    		<img src="<%=controller.getStaticPath(request)%>/images/login/loginbg.jpg" width="527" height="440" />
    	</div>
        <div class="login_box">
        	<div class="login_tit pt30 pb20">
            	<span class="fl f18">欢迎来到亿钱贷</span>
                <span class="fr pt5">没有账号？<a href="<%configureProvider.format(out, URLVariable.REGISTER);%>" class="blue">免费注册</a></span>
                <div class="clear"></div>
            </div>
            	<input type="hidden" name="_z" value="<%StringHelper.filterHTML(out, returnUrl);%>" />
            	<%{String errorMessage = controller.getPrompt(request,response,PromptLevel.ERROR);
				if (!StringHelper.isEmpty(errorMessage)) {%>
					<div class="newerro_tip">
						<%StringHelper.filterHTML(out, errorMessage);%>
					</div>
				<%}
				}%>
				<div class="login_tx">
					<input id="accountName"  name="accountName" maxlength="18" type="text" class="logininput w340" value="<%StringHelper.filterHTML(out, _accountName);%>"
						 placeholder="用户名/手机" />
				</div>
				<div id="login_tips" class="login_tips gray"></div>
				<div class="login_tx">
					<input maxlength="20" name="password" type="password" class="logininput w340"	id="password" placeholder="密码" />
				</div>
				<div id="password_tips" class="login_tips"></div>
				<div class="login_tx">
					<span class="fl mr10">
						<input id="verifyCode" name="verifyCode" maxlength="<%=systemDefine.getVerifyCodeLength() %>" type="text"	class="logininput w180" id="textfield" maxlength="6" placeholder="验证码" />
					</span>
					<div class="rf">
						<img width="133px" height="53px" alt="验证码" id="_verifyImg" src="<%=controller.getURI(request, LoginVerify.class)%>" alt="验证码" title="点击刷新" onclick="this.src='<%=controller.getURI(request, LoginVerify.class)%>?'+Math.random()" style="cursor: pointer;" />
					</div>
					<div class="clear"></div>
				</div>
				<div id="verifyError" class="login_tips"></div>
				
				<div class="login_name">
					<span class="fl mr10 pt5">
						<input type="checkbox" name="remember" id="remember" <%=remObject == null ? "": "checked=\"checked\""%>/>
					</span>
					<span class="fl">记住用户名</span>
					<span class="fr"><a href="<%configureProvider.format(out,URLVariable.GET_PASSWORD);%>" class="blue">忘记密码？</a></span>
					<div class="clear"></div>
				</div>
				<div class="loginlj">
					<input value="立即登录" type="submit" />
				</div>
    	</div>
    <div class="clear"></div>
</div>
</form>
<div style="height: 150px"></div>
	<%@include file="/WEB-INF/include/loginFooter.jsp"%>
	<%@include file="/WEB-INF/include/script.jsp"%>
	<script type="text/javascript">
	var isNull = /^[\s]{0,}$/;
	var verify = /^\d{<%=systemDefine.getVerifyCodeLength() %>}$/;
	var loginName = /^[a-z]([\w]*)$/i;

	$("#accountName").blur(accountCheck);
	
	$("#accountName").focus(function(){
		$("#login_tips").html("用户名为6——18个字符");
		$("#login_tips").addClass("gray");
	});
	
	function accountCheck() {
		var val = $("#accountName").val();
		var loginTips = $("#login_tips");
		if (isNull.test(val)) {
			loginTips.html("用户名不能为空!");
			loginTips.removeClass("gray");
			return false;
		}else if(val.length<6||val.length>18){
			loginTips.html("用户名为6——18个字符");
			loginTips.removeClass("gray");
			return false;
		}else{
			loginTips.html("");
		}
		return true;
	}
	
	
	$("#password").focus(function(){
		$("#password_tips").html("密码为6——20个字符");
		$("#password_tips").addClass("gray");
	});
	
	$("#password").blur(passwordCheck);
	function passwordCheck() {
		var val = $("#password").val();
		var loginTips = $("#password_tips");
		loginTips.html("&nbsp;");
		loginTips.removeClass("red");
		if (isNull.test(val)) {
			loginTips.html("密码不能为空");
			loginTips.addClass("red");
			return false;
		}else if(val.length<6||val.length>20){
			loginTips.html("密码为6——20个字符");
			loginTips.removeClass("gray");
			return false;
		}
		return true;
	}
	
	$("#verifyCode").blur(verifyCheck);
	
	function verifyCheck() {
		var val = $("#verifyCode").val();
		var p = $("#verifyError");
		p.html("&nbsp;");
		p.removeClass("red");
		if (isNull.test(val)) {
			p.html("验证码不能为空");
			return false;
		} else if (!verify.test(val)) {
			p.html("您输入的验证码有误");
			return false;
		}
		return true;
	}
	function onSubmit() {
		return accountCheck() && passwordCheck() && verifyCheck();
	}
	</script>
</body>
</html>
