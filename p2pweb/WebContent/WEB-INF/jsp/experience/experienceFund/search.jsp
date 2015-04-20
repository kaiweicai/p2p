<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Hello World</title>
</head>
<body>
	<div class="r_main">
			<div class="home_main">
				<div class="box box1 mb15">
					<div class="atil">
						<h3>体验金管理</h3>
					</div>
					<div class="con">
						<div class="clear"></div>
						<ul class="yhxq_li">
							<li>账户余额总额 ：<span class="blue"></span>元
							</li>
						</ul>

						<ul class="yhxq_li">
							<li>更新时间 ：<span class="blue"> </span>
							</li>
						</ul>
						<div class="clear"></div>
					</div>
				</div>
				
				<form action="" method="get" >
				
					<div class="box box1 mb15">
						<div class="con">
							<div class="admin_input admin_pb">
								<div class="table">
									<p>
										<span>用户名：</span> <input type="text" name="experienceFund.userName"
											value=""
											id="experienceFund.userName" class="yhgl_input" />
									</p>
									<p>
										<span>资金账户：</span> <input type="text" name="experienceFund.fundAccount"
											value=""
											id="experienceFund.fundAccount" class="yhgl_input" />
									</p>
									<p>
										<span>用户类型：</span> <select name="experienceFund.userType" id="experienceFund.userType"
											class="yhgl_sel">
											<option value="0">全部</option>
											
											<option value="">
												</option>
											
										</select>
									</p>
									<p>
										<span>资金账户类型：</span> <select name="experienceFund.fundAccountType"  id="experienceFund.fundAccountType" class="yhgl_sel">
											<option value="0">全部</option>
										</select>
									</p>
									<div class="clear"></div>
									<div class="mt10">
										<input  type="submit" class="btn2 mr10" value="搜索" />
									</div>
									<div class="clear"></div>
								</div>
							</div>
						</div>
					</div>
				
				</form>
				
				<div id="list">
					<%@include file="list.jsp"%>
				</div>
				
				
				<div class="box2 clearfix"></div>
			</div>
	</div>
</body>
</html>

<script type="text/javascript">

function rightLoad(url){
	//alert(url);
	$('#right_body').load(url,function() {
		//reset_left_content_height();//在common.js定义
	});
}




</script>