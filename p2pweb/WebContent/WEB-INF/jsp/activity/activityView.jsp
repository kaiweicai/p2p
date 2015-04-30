<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<c:set var="sessionMaxTime" value="<%=com.yiqiandai.p2p.common.constant.SystemConstant.SESSION_MAX_IDLE_TIME%>" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="http://localhost:8080/css/common.css" />
</head>
<body>
	<div class="w_main">
		<div class="main clearfix">
			<div class="wrap" id="right_body">
				<div class="r_main">
					<div class="home_main">
						<div class="box box1 mb15">
							<div class="atil">
								<h3>查看推广活动${sessionMaxTime}</h3>
							</div>
							<div class="til clearfix" id="return1">
									<div class="Menubox">
										<ul>
											<li class="hover">项目信息</li>
											<li id="tzjl"><a href="" >参与记录</a></li>
											
										</ul>
									</div>
								</div>
								<div class="border p30 Men_bt no_table yw_dl" id="con_one_1">
							<div class="con">
								
									<ul class="cell noborder yxjh ">
										<li>
											<div class="til">
												<span class="red">*</span>
												活动ID：
											</div>
											<div class="info">
												${activity.activityId}
											</div>
											<div class="clear"></div>
										</li>
										
										<li>
											<div class="til">
												<span class="red">*</span>名称：
											</div>
											<div class="info">
												${activity.name}
											</div>
											<div class="clear"></div>
										</li>
										
										<li>
											<div class="til">
												<span class="red">*</span>活动时间：
											</div>
											<div class="info">
											<fmt:formatDate  value="${activity.startTime}"  pattern="yyyy-MM-dd hh:mm" />
											 至<fmt:formatDate  value="${activity.endTime}"  pattern="yyyy-MM-dd hh:mm" /> 
											 
											</div>
											<div class="clear"></div>
										</li>
										
										<li>
											<div class="til">
												<span class="red">*</span>活动对象：
											</div>
											<div class="info">
												<c:if test="${activity.scope==('ALL')}">
													所有用户
												</c:if>
												<c:if test="${activity.scope==('NEW')}">
													新用户
												</c:if>
											</div>
											<div class="clear"></div>
										</li>
										
										<li>
											<div class="til">
												<span class="red">*</span>活动内容：
											</div>
											<div class="info">
											</div>
											<div class="clear"></div>
										</li>
										
										<li>
											<div class="til">
												<span class="red">*</span>描述：
											</div>
											<div class="info">
												<textarea id="description" name="description" cols="45" disabled="disabled"
													rows="5"
													class="border w490 mb10 required min-length-10 max-length-500">
														${activity.description}
													</textarea>
												<p tip></p>
												<p errortip class="" style="display: none"></p>
											</div>
											<div class="clear"></div>
										</li>
									</ul>
									
									<div class="tc w220 pt20"
										style="width: 330px; margin-left: 440px">
										
										<input type="button" onclick="window.location.href='javascript:history.go(-1);'"
											class="btn4" value="返回" />
									</div>
									</div>
								<div class="clear"></div>
							</div>
						</div>
						<div class="box2 clearfix"></div>
					</div>
				</div>
			</div>
		</div>
	</div>

	<script type="text/javascript">
	</script>

</body>
</html>