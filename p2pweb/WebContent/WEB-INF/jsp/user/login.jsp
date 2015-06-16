<!DOCTYPE html>
<html lang="zh-CN">
<head>
<%@include file="/WEB-INF/jsp/inc/layout.jsp"%>
<meta name="description" content="魏勇测试">
<meta name="author" content="cloud.wei">
<link rel="icon" href="http://www.yiqiandai.com/images/news_icons.gif">
<%@include file="/WEB-INF/jsp/inc/meta.jsp"%>
<title>用户登录</title>
</head>
<body>
	<%@include file="/WEB-INF/jsp/user/loginHeader.jsp"%>
	<div class="container">
		<form:form commandName="usermodel"  action="/user/login.dhtml" method="post" class="form-signin">
			<input type="hidden" id="from"/>
	    	<!-- <div class="login_bg">
	    		<img src="/assets/images/login/loginbg.jpg" width="527" height="440" />
	    	</div> -->
	        <div id="login_box">
            	<h5 class="form-signin-heading">欢迎来到亿钱贷!
                	没有账号？
                	<a href='<pp:SystemConstantTag con="com.yiqiandai.p2p.common.constant.URLVariable.REGISTER"/>' class="blue">免费注册</a>
                </h5>
			</div>
			<form:errors path="*" style="color:red"></form:errors>
			<label for="accountName" class="sr-only">accountName</label>
			<input id="accountName" name="accountName" value="${usermodel.accountName}" maxlength="18" type="text" class="form-control"
				 placeholder="用户名/手机" required="required" autofocus/>
			<label id="login_tips" class="login_tips gray"></label>
			<label for="password" class="sr-only">Password</label>
			<input maxlength="20" name="password" type="password" value="${usermodel.password}" class="form-control" id="password" placeholder="密码" required="required"/>
			<label id="password_tips" class="login_tips gray"></label>
			<div class="form-group">
				<input type="text" name="verifyCode" class="form-control"
					placeholder="验证码" style="width: 100px; float: left;"> <img
					id="captcha"
					style="cursor: pointer; cursor: hand; margin-top: -13px;"
					onclick="this.src='/user/captcha.dhtml?'+Math.random();"
					src="/user/captcha.dhtml">
			</div>
			<div class="clearfix"></div>
			<div>
				<p class="error" for="captcha" style="display: none;"></p>
			</div>
			<label id="verifyError" class="login_tips"></label>
			<div class="formgroup checkbox">
					<label>
						<input type="checkbox" name="remember" id="remember"/>记住用户名
					</label>
					<label>
						<a href='<pp:SystemConstantTag con="com.yiqiandai.p2p.common.constant.URLVariable.GET_PASSWORD"/>' class="blue">忘记密码？</a>
					</label>
			</div>
			<button class="btn btn-lg btn-primary btn-block" type="submit">立即登录</button>
		</form:form>
	</div>
</body>
<script type="text/javascript">
	var rootPath="";
	var codeUrl=rootPath+"/user/ValidCode/jpg?id=";
	var model = avalon.define({
		$id : "loginCtrl",
		data : {
			userno : "",
			pwd : "",
			company : "北京朗天鑫业信息工程技术有限公司",
			validCode : "",
			autoLogin : true
		},
		errMsg : "",
		vcUrl:codeUrl,
		vcV:false,
		showVc:function(){
			model.vcV=true;
		},
		ldCode:function(){
			model.vcUrl=codeUrl+(new Date()).getTime();
		},
		submit : function() {
			model.errMsg ="";
			if (model.data.company == "") {
				model.errMsg = "企业名称不能为空！";
				return;
			}
			if (model.data.userno == "") {
				model.errMsg = "帐号不能为空！";
				return;
			}
			if (model.data.pwd == "") {
				model.errMsg = "密码不能为空！";
				return;
			}
			if (model.data.validCode == "") {
				model.errMsg = "验证码不能为空！";
				return;
			}
			$.ajax({
				url : rootPath + '/login',
				data : model.data.$model,
				type : 'POST',
				dataType : "json",
				success : function(data) {
					if (data.success == false) {
						$("#validCodeImg").click();
						model.data.validCode = "";
						model.data.pwd = "";
						model.errMsg = data.msg;
					} else {
						window.location.reload();
					}
				}
			});
		}
	});
</script>
<script type="text/javascript">
	var isNull = /^[\s]{0,}$/;
	//var verify = /^\d4$/;
	var verify = /^\d$/;
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
</html>
