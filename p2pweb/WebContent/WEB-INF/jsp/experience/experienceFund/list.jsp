<table width="100%" border="0" cellspacing="0" cellpadding="3"
	class="yhgl_table tc">
	<tr class="hsbg">
		<td>序号</td>
		<td>资金账户</td>
		<td>资金账户类型</td>
		<td>用户名</td>
		<td>用户类型</td>
		<td>账户余额(元)</td>
		<td>用户收益(元)</td>
		<td>最后更新时间</td>
		<td>操作</td>
	</tr>
	<%
		int i = 1;
	%>
	<c:forEach items="${list}" var="item">

		<tr class="dhsbg">
			<td><%=i++%></td>
			<td>${item.fundAccount}</td>
			<td>${item.fundAccountType}</td>
			<td>${item.userName}</td>
			<td>${item.userType}</td>
			<td>${item.balance}</td>
			<td>用户收益</td>
			<td><fmt:formatDate value="${item.lastUpdateTime}" type="both" />
			</td>

			<td class="blue"><a
				href="javascript:rightLoad('http://localhost:8080/yiqiandai/exp/dealInfo/list.dhtml'?id=${item.id} })">交易记录</a></td>
		</tr>
	</c:forEach>

</table>