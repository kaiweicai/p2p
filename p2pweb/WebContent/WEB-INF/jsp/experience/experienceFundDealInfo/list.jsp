<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Hello World</title>
</head>
<body>
	<div class="r_main">
		<form action=""
			method="post" name="form1" id="searchForm">
			<input type="hidden" name="id" value=""> <input
				type="hidden" name="yhid" value="">
			<div class="home_main">
				<div class="box box1 mb15">
					<div class="atil">
						<h3>体验金交易记录</h3>
					</div>
					<div class="con">
						<div class="clear"></div>
						
						<ul class="yhxq_li">
							<li>用户名 ：<span class="blue">
									
							</span>
							</li>
						</ul>
						<ul class="yhxq_li">
							<li>投资总计 ：<span class="blue"></span>元
							</li>
						</ul>
						<ul class="yhxq_li">
							<li>收益总计 ：<span class="blue"></span>元
							</li>
						</ul>
						<div class="clear"></div>

					</div>
				</div>
				<div class="box box1 mb15">
					<div class="con">
						<div class="admin_input admin_pb">
							<div class="table top3">
								<p>
									<span>类型明细：</span> <select name="type" class="yhgl_sel">
										<option>所有</option>
										
									</select>
								</p>
								<p>
									<span>时间：</span> 
										
								</p>
								<div class="clear"></div>
								<div class="mt10">
									<input name="search" type="submit" class="btn2 mr10" value="搜索" />
									
								
								</div>
								<div class="clear"></div>
							</div>
						</div>
					</div>
				</div>
				<table width="100%" border="0" cellspacing="0" cellpadding="3"
					class="yhgl_table tc">
					<tr class="hsbg">
						<td>序号</td>
						<td>时间</td>
						<td>类型</td>
						<td>明细</td>
						<td>收入</td>
						<td>支出</td>
						<td>结余</td>
						<td>备注</td>
					</tr>
					<%int i=1; %>
					<c:forEach items="${list}" var="item"> 
					<tr class="dhsbg">
						<td><%=i++ %></td>
						<td><fmt:formatDate value="${item.createTime}" type="both"/></td>
						<td>类型</td>
						<td>明细</td>
						<td>${item.revenue}</td>
						<td>${item.expend}</td>
						<td>${item.balance}</td>
						<td>${item.memo}</td>
						</tr>
						</c:forEach>
					
				</table>
				
				<div class="box2 clearfix"></div>
			</div>
		</form>
	</div>
</body>
</html>