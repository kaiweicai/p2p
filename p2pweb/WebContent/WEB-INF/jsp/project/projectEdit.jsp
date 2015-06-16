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
<div class="container">
<form:form method="post" action="${webroot}/project/save.dhtml">
<div class="input_box">
	<div class="box_title">
		<c:if test="${project.id}!=null">修改</c:if>
		<c:if test="${project.id}==null">添加</c:if>
	</div>
	<div class="box_content">
		<input type="hidden" name="token" value="${token}" />
		<input type="hidden" name="${project.id}" id="${project.id}" value="${project.id}">
		<table class="tb_input" >
			<tbody>
								<tr>
					<th >项目ID<strong class="red">*</strong></th>
					<td><input type="text" name="id" value="${project.id}"></td>
				</tr>
				<tr>
					<th >项目标题<strong class="red">*</strong></th>
					<td><input type="text" name="title" value="${project.title}"></td>
				</tr>
				<tr>
					<th ><strong class="red">*</strong></th>
					<td><input type="text" name="province" value="${project.province}"></td>
				</tr>
				<tr>
					<th ><strong class="red">*</strong></th>
					<td><input type="text" name="city" value="${project.city}"></td>
				</tr>
				<tr>
					<th ><strong class="red">*</strong></th>
					<td><input type="text" name="couty" value="${project.couty}"></td>
				</tr>
				<tr>
					<th >融资主体 1.企业,2.政府,3.企业<strong class="red">*</strong></th>
					<td><input type="text" name="subject" value="${project.subject}"></td>
				</tr>
				<tr>
					<th >参考industryMap<strong class="red">*</strong></th>
					<td><input type="text" name="industry" value="${project.industry}"></td>
				</tr>
				<tr>
					<th >去年营业额,省略小数(万元)<strong class="red">*</strong></th>
					<td><input type="text" name="turnoverLastYear" value="${project.turnoverLastYear}"></td>
				</tr>
				<tr>
					<th >融资用途<strong class="red">*</strong></th>
					<td><input type="text" name="netValue" value="${project.netValue}"></td>
				</tr>
				<tr>
					<th >融资用途<strong class="red">*</strong></th>
					<td><input type="text" name="finaceUse" value="${project.finaceUse}"></td>
				</tr>
				<tr>
					<th >融资金额最小值<strong class="red">*</strong></th>
					<td><input type="text" name="finaceAmountMin" value="${project.finaceAmountMin}"></td>
				</tr>
				<tr>
					<th >融资金额最大值<strong class="red">*</strong></th>
					<td><input type="text" name="finaceAmountMax" value="${project.finaceAmountMax}"></td>
				</tr>
				<tr>
					<th ><strong class="red">*</strong></th>
					<td><input type="text" name="investAmount" value="${project.investAmount}"></td>
				</tr>
				<tr>
					<th >意向资金<strong class="red">*</strong></th>
					<td><input type="text" name="intendFund" value="${project.intendFund}"></td>
				</tr>
				<tr>
					<th >债权融资<strong class="red">*</strong></th>
					<td><input type="text" name="debtFinacialing" value="${project.debtFinacialing}"></td>
				</tr>
				<tr>
					<th >股权融资<strong class="red">*</strong></th>
					<td><input type="text" name="equityFinacialing" value="${project.equityFinacialing}"></td>
				</tr>
				<tr>
					<th >整体转让<strong class="red">*</strong></th>
					<td><input type="text" name="overallTransfer" value="${project.overallTransfer}"></td>
				</tr>
				<tr>
					<th >其他融资<strong class="red">*</strong></th>
					<td><input type="text" name="otherFinacialing" value="${project.otherFinacialing}"></td>
				</tr>
				<tr>
					<th >可提供资料<strong class="red">*</strong></th>
					<td><input type="text" name="material" value="${project.material}"></td>
				</tr>
				<tr>
					<th ><strong class="red">*</strong></th>
					<td><input type="text" name="description" value="${project.description}"></td>
				</tr>
				<tr>
					<th >项目优势<strong class="red">*</strong></th>
					<td><input type="text" name="advantage" value="${project.advantage}"></td>
				</tr>
				<tr>
					<th >其它备注<strong class="red">*</strong></th>
					<td><input type="text" name="memo" value="${project.memo}"></td>
				</tr>
				<tr>
					<th ><strong class="red">*</strong></th>
					<td><input type="text" name="tag" value="${project.tag}"></td>
				</tr>

			</tbody>
		</table>
	</div>
	<div class="box_foot">
		<div class="box_foot_buttons">
			<input type="submit" value="保 存"/>
			<a class="bt_blue" href="javascript:void(0)" onclick="$.colorbox.close()">取 消</a>	
		</div>
	</div>
</div>
</form:form>
</div>

<script type="text/javascript">
$(function(){
	$(".f_item").find("input[type='text']").change(function(){
		if($(this).attr("class").indexOf("filedError") > -1){
			$(this).removeClass("filedError");
		}
	});
	$("#tb_input").validate({
		rules:{
			"project.id":{
				required:true
			},
			"project.id":{
				digits:true,min:0
			},
			"project.title":{
				required:true
			},
			"project.province":{
				required:true
			},
			"project.city":{
				required:true
			},
			"project.couty":{
				required:true
			},
			"project.subject":{
				required:true
			},
			"project.subject":{
				digits:true,min:0
			},
			"project.industry":{
				required:true
			},
			"project.industry":{
				digits:true,min:0
			},
			"project.turnoverLastYear":{
				required:true
			},
			"project.turnoverLastYear":{
				digits:true,min:0
			},
			"project.netValue":{
				required:true
			},
			"project.netValue":{
				digits:true,min:0
			},
			"project.finaceUse":{
				required:true
			},
			"project.finaceAmountMin":{
				required:true
			},
			"project.finaceAmountMin":{
				digits:true,min:0
			},
			"project.finaceAmountMax":{
				required:true
			},
			"project.finaceAmountMax":{
				digits:true,min:0
			},
			"project.investAmount":{
				required:true
			},
			"project.investAmount":{
				digits:true,min:0
			},
			"project.intendFund":{
				required:true
			},
			"project.intendFund":{
				digits:true,min:0
			},
			"project.debtFinacialing":{
				required:true
			},
			"project.debtFinacialing":{
				digits:true,min:0
			},
			"project.equityFinacialing":{
				required:true
			},
			"project.equityFinacialing":{
				digits:true,min:0
			},
			"project.overallTransfer":{
				required:true
			},
			"project.overallTransfer":{
				digits:true,min:0
			},
			"project.otherFinacialing":{
				required:true
			},
			"project.otherFinacialing":{
				digits:true,min:0
			},
			"project.material":{
				required:true
			},
			"project.material":{
				digits:true,min:0
			},
			"project.description":{
				required:true
			},
			"project.advantage":{
				required:true
			},
			"project.memo":{
				required:true
			},
			"project.tag":{
				required:true
			}
		},
		messages:{
			"project.id":{
				required:"请输入项目ID"
			},
			"project.id":{
				digits:"项目ID必须为整数",min:"项目ID不能小于0"
			},
			"project.title":{
				required:"请输入项目标题"
			},
			"project.province":{
				required:"请输入"
			},
			"project.city":{
				required:"请输入"
			},
			"project.couty":{
				required:"请输入"
			},
			"project.subject":{
				required:"请输入融资主体 1.企业,2.政府,3.企业"
			},
			"project.subject":{
				digits:"融资主体 1.企业,2.政府,3.企业必须为整数",min:"融资主体 1.企业,2.政府,3.企业不能小于0"
			},
			"project.industry":{
				required:"请输入参考industryMap"
			},
			"project.industry":{
				digits:"参考industryMap必须为整数",min:"参考industryMap不能小于0"
			},
			"project.turnoverLastYear":{
				required:"请输入去年营业额,省略小数(万元)"
			},
			"project.turnoverLastYear":{
				digits:"去年营业额,省略小数(万元)必须为整数",min:"去年营业额,省略小数(万元)不能小于0"
			},
			"project.netValue":{
				required:"请输入融资用途"
			},
			"project.netValue":{
				digits:"融资用途必须为整数",min:"融资用途不能小于0"
			},
			"project.finaceUse":{
				required:"请输入融资用途"
			},
			"project.finaceAmountMin":{
				required:"请输入融资金额最小值"
			},
			"project.finaceAmountMin":{
				digits:"融资金额最小值必须为整数",min:"融资金额最小值不能小于0"
			},
			"project.finaceAmountMax":{
				required:"请输入融资金额最大值"
			},
			"project.finaceAmountMax":{
				digits:"融资金额最大值必须为整数",min:"融资金额最大值不能小于0"
			},
			"project.investAmount":{
				required:"请输入"
			},
			"project.investAmount":{
				digits:"必须为整数",min:"不能小于0"
			},
			"project.intendFund":{
				required:"请输入意向资金"
			},
			"project.intendFund":{
				digits:"意向资金必须为整数",min:"意向资金不能小于0"
			},
			"project.debtFinacialing":{
				required:"请输入债权融资"
			},
			"project.debtFinacialing":{
				digits:"债权融资必须为整数",min:"债权融资不能小于0"
			},
			"project.equityFinacialing":{
				required:"请输入股权融资"
			},
			"project.equityFinacialing":{
				digits:"股权融资必须为整数",min:"股权融资不能小于0"
			},
			"project.overallTransfer":{
				required:"请输入整体转让"
			},
			"project.overallTransfer":{
				digits:"整体转让必须为整数",min:"整体转让不能小于0"
			},
			"project.otherFinacialing":{
				required:"请输入其他融资"
			},
			"project.otherFinacialing":{
				digits:"其他融资必须为整数",min:"其他融资不能小于0"
			},
			"project.material":{
				required:"请输入可提供资料"
			},
			"project.material":{
				digits:"可提供资料必须为整数",min:"可提供资料不能小于0"
			},
			"project.description":{
				required:"请输入"
			},
			"project.advantage":{
				required:"请输入项目优势"
			},
			"project.memo":{
				required:"请输入其它备注"
			},
			"project.tag":{
				required:"请输入"
			}
		}
	});
});
function submitProject(){
	if (!$("#tb_input").valid()) {
		return false;
	}
	
	$.post($('#tb_input').attr("action"), $('#tb_input').formSerialize(), function(response){
			if(response.result==0){
				$.colorbox.close();
				jAlert('<#if ${project.id}??>修改<#else>添加</#if>成功！',function(){pageQuery()});
			}
			else{
				jAlertError('<#if ${project.id}??>修改<#else>添加</#if>失败！'+response.msg,function(){$("#tb_input").find("input[id='token']").val(response.token);});
			}
	},"json");
	
}
</script>