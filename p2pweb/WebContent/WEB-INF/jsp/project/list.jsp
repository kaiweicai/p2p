<!DOCTYPE html>
<html lang="zh-CN">
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
<table>
	<thead>
		<tr>
			<th><input type="checkbox" id="checkboxAll" value="0" onclick="selectForAll(this)"/></th>
			<th>序号</th>
			<th>&nbsp;项目ID</th>
			<th>&nbsp;项目标题</th>
			<th>&nbsp;</th>
			<th>&nbsp;</th>
			<th>&nbsp;</th>
			<th>&nbsp;融资主体 1.企业,2.政府,3.企业</th>
			<th>&nbsp;参考industryMap</th>
			<th>&nbsp;去年营业额,省略小数(万元)</th>
			<th>&nbsp;融资用途</th>
			<th>&nbsp;融资用途</th>
			<th>&nbsp;融资金额最小值</th>
			<th>&nbsp;融资金额最大值</th>
			<th>&nbsp;</th>
			<th>&nbsp;意向资金</th>
			<th>&nbsp;债权融资</th>
			<th>&nbsp;股权融资</th>
			<th>&nbsp;整体转让</th>
			<th>&nbsp;其他融资</th>
			<th>&nbsp;可提供资料</th>
			<th>&nbsp;</th>
			<th>&nbsp;项目优势</th>
			<th>&nbsp;其它备注</th>
			<th>&nbsp;</th>

			<th>查看</th>
			<th>编辑</th>
			<th>删除</th>			
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${projectList}" var="item"> 
			<tr class="even">
				<td>&nbsp;<input name="checkbox${item.id}"  value="${item.id}" type="checkbox" onclick="selectOne(this)"/></td>
				<td>&nbsp;${paginator.startRowNum+item_index+1}</td>
				<td>&nbsp;<c:out value="${item.id}"/></td>
				<td><c:out value="${item.title}"/></td>
				<td><c:out value="${item.province}"/></td>
				<td><c:out value="${item.city}"/></td>
				<td><c:out value="${item.couty}"/></td>
				<td><c:out value="${item.subject}"/></td>
				<td><c:out value="${item.industry}"/></td>
				<td><c:out value="${item.turnoverLastYear}"/></td>
				<td><c:out value="${item.netValue}"/></td>
				<td><c:out value="${item.finaceUse}"/></td>
				<td><c:out value="${item.finaceAmountMin}"/></td>
				<td><c:out value="${item.finaceAmountMax}"/></td>
				<td><c:out value="${item.investAmount}"/></td>
				<td><c:out value="${item.intendFund}"/></td>
				<td><c:out value="${item.debtFinacialing}"/></td>
				<td><c:out value="${item.equityFinacialing}"/></td>
				<td><c:out value="${item.overallTransfer}"/></td>
				<td><c:out value="${item.otherFinacialing}"/></td>
				<td><c:out value="${item.material}"/></td>
				<td><c:out value="${item.description}"/></td>
				<td><c:out value="${item.advantage}"/></td>
				<td><c:out value="${item.memo}"/></td>
				<td><c:out value="${item.tag}"/></td>
				<td><a  href='${webroot}/project!show.action?project.id=<c:out value="${item.id}"/>'>
					<img src="${webroot}/img/crud/magnifier.png" title="查看"/>
					</a>
				</td>
				<td><a  href='${webroot}/project!toCreateOrUpdate.action?project.id=<c:out value="${item.id}"/>'><img src="${webroot}/img/crud/user_edit.png" title="编辑"/></a></td>
				<td><a  href='${webroot}/project!remove.action?project.id=<c:out value="${item.id}"/>'><img src="${webroot}/img/crud/trash.png" title="删除"/></a></td>			
			</tr>
		</c:forEach>
	</tbody>	
</table>

</html>

