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
<form:form id="tb_input" method="post" action="${webroot}/project!save.action">
<div class="input_box" style="width:800px">
	<div class="box_title">
		<c:if test="${project.id!=null}">修改</c:if>
		<c:if test="${project.id==null}">添加</c:if>
	</div>
	<div class="box_content">
		<input type="hidden" name="token" value="${token}" />
		<input type="hidden" name="project.id" id="project.id" value="${project.id}">
		<table class="tb_input" >
			<tbody>
				<tr>
					<th >项目ID<strong class="red">*</strong></th>
					<td><input type="text" name="project.id" value="${project.id}"></td>
				</tr>
				<tr>
					<th >项目标题<strong class="red">*</strong></th>
					<td><input type="text" name="project.title" value="${project.title}"></td>
				</tr>
				<tr>
					<th ><strong class="red">*</strong></th>
					<td><input type="text" name="project.province" value="${project.province}"></td>
				</tr>
				<tr>
					<th ><strong class="red">*</strong></th>
					<td><input type="text" name="project.city" value="${project.city}"></td>
				</tr>
				<tr>
					<th ><strong class="red">*</strong></th>
					<td><input type="text" name="project.couty" value="${project.couty}"></td>
				</tr>
				<tr>
					<th >融资主体 1.企业,2.政府,3.企业<strong class="red">*</strong></th>
					<td></td>
				</tr>
				<tr>
					<th >参考industryMap<strong class="red">*</strong></th>
					<td></td>
				</tr>
				<tr>
					<th >去年营业额,省略小数(万元)<strong class="red">*</strong></th>
					<td></td>
				</tr>
				<tr>
					<th >融资用途<strong class="red">*</strong></th>
					<td></td>
				</tr>
				<tr>
					<th >融资用途<strong class="red">*</strong></th>
					<td><input type="text" name="project.finaceUse" value="${project.finaceUse}"></td>
				</tr>
				<tr>
					<th >融资金额最小值<strong class="red">*</strong></th>
					<td></td>
				</tr>
				<tr>
					<th >融资金额最大值<strong class="red">*</strong></th>
					<td></td>
				</tr>
				<tr>
					<th ><strong class="red">*</strong></th>
					<td></td>
				</tr>
				<tr>
					<th >意向资金<strong class="red">*</strong></th>
					<td><input type="text" name="project.intendFund" value="${project.intendFund}"></td>
				</tr>
				<tr>
					<th >债权融资<strong class="red">*</strong></th>
					<td></td>
				</tr>
				<tr>
					<th >股权融资<strong class="red">*</strong></th>
					<td></td>
				</tr>
				<tr>
					<th >整体转让<strong class="red">*</strong></th>
					<td></td>
				</tr>
				<tr>
					<th >其他融资<strong class="red">*</strong></th>
					<td></td>
				</tr>
				<tr>
					<th >可提供资料<strong class="red">*</strong></th>
					<td></td>
				</tr>
				<tr>
					<th ><strong class="red">*</strong></th>
					<td><input type="text" name="project.description" value="${project.description}"></td>
				</tr>
				<tr>
					<th >项目优势<strong class="red">*</strong></th>
					<td><input type="text" name="project.advantage" value="${project.advantage}"></td>
				</tr>
				<tr>
					<th >其它备注<strong class="red">*</strong></th>
					<td><input type="text" name="project.memo" value="${project.memo}"></td>
				</tr>
				<tr>
					<th ><strong class="red">*</strong></th>
					<td><input type="text" name="project.tag" value="${project.tag}"></td>
				</tr>
			
			</tbody>
		</table>
	</div>
	<div class="box_foot">
		<div class="box_foot_buttons">
			<a class="bt_green f_wait" id="input_submit" href="javascript:void(0)" onclick="submitProject()">保 存</a>
			<a class="bt_blue" href="javascript:void(0)" onclick="$.colorbox.close()">取 消</a>	
		</div>
	</div>
</div>
</form:form>
</div>
</html>

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
			"project.industry":{
				required:true
			},
			"project.turnoverLastYear":{
				required:true
			},
			"project.netValue":{
				required:true
			},
			"project.finaceUse":{
				required:true
			},
			"project.finaceAmountMin":{
				required:true
			},
			"project.finaceAmountMax":{
				required:true
			},
			"project.investAmount":{
				required:true
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
			"project.equityFinacialing":{
				required:true
			},
			"project.overallTransfer":{
				required:true
			},
			"project.otherFinacialing":{
				required:true
			},
			"project.material":{
				required:true
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
			"project.industry":{
				required:"请输入参考industryMap"
			},
			"project.turnoverLastYear":{
				required:"请输入去年营业额,省略小数(万元)"
			},
			"project.netValue":{
				required:"请输入融资用途"
			},
			"project.finaceUse":{
				required:"请输入融资用途"
			},
			"project.finaceAmountMin":{
				required:"请输入融资金额最小值"
			},
			"project.finaceAmountMax":{
				required:"请输入融资金额最大值"
			},
			"project.investAmount":{
				required:"请输入"
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
			"project.equityFinacialing":{
				required:"请输入股权融资"
			},
			"project.overallTransfer":{
				required:"请输入整体转让"
			},
			"project.otherFinacialing":{
				required:"请输入其他融资"
			},
			"project.material":{
				required:"请输入可提供资料"
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
				jAlert('<#if project.id??>修改<#else>添加</#if>成功！',function(){pageQuery()});
			}
			else{
				jAlertError('<#if project.id??>修改<#else>添加</#if>失败！'+response.msg,function(){$("#tb_input").find("input[id='token']").val(response.token);});
			}
	},"json");
	
}
</script>