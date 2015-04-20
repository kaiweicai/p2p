<div class="r_main">
	<div class="home_main">
		<div class="box box1 mb15">
			<div class="atil">
				<h3>线下充值体验金</h3>
			</div>
			<div class="con">
				<form id="tb_input" action="http://localhost:8080/yiqiandai/expRecharge/add.dhtml" method="get" class="form1">
				
					<ul class="cell noborder yxjh ">
						<li>
							<div class="til">
								<span class="red">*</span>用户帐号：
							</div>
							<div class="info">
								<input name="acct" id="acct" type="text" class="yhgl_ser required"
									 />
								<p tip></p>
								<p errortip class="" style="display: none"></p>
							</div>
							<div class="clear"></div>
						</li>
						<li>
							<div class="til">
								<span class="red">*</span>充值金额：
							</div>
							<div class="info">
								<input name="ExperienceFundDealInfo.revenue" type="text"
									class="yhgl_ser required minf-size-0" maxlength="18" value=""
									mtest="/^[-\+]?\d+(\.\d+)?$/" mtestmsg="金额格式不正确" />
								<p tip></p>
								<p errortip class="" style="display: none"></p>
							</div>
							<div class="clear"></div>
						</li>
						<li>
							<div class="til">
								<span class="red">*</span>备注：
							</div>
							<div class="info">
								<textarea name=ExperienceFundDealInfo.memo cols="" rows=""
									class="area required max-length-80">
									
								</textarea>
								<p tip></p>
								<p errortip class="" style="display: none"></p>
							</div>
							<div class="clear"></div>
						</li>
						<li>
							<div class="til">&nbsp;</div>
							<div class="info">
								<p errortip class=""></p>
							</div>
							<div class="clear"></div>
						</li>
						<li>
							<div class="clear"></div>
						</li>
					</ul>
					<div class="tc w220 pt20">
					    <a class="btn4 mr30 sumbitForme" id="input_submit" href="javascript:void(0)" onclick="submitOsNotes()">提交</a>
						<!-- <input type="submit" class="btn4 mr30 sumbitForme" value="提交"
							fromname="form1" />  -->
							<input type="button" onclick="window.location.href=''" class="btn4" value="返回" />
					</div>
					<div class="clear"></div>
				</form>
				<div class="clear"></div>
			</div>
		</div>
		<div class="box2 clearfix"></div>
	</div>
</div>
<script type="text/javascript" src="js/jquery.form.js"></script>
<script type="text/javascript">

function submitOsNotes(){
	/* if (!$("#tb_input").valid()) {
		return false;
	} */
	//alert("a");
	alert($("#acct").val());
	$.ajax({
		url:"http://localhost:8080/yiqiandai/expRecharge/add.dhtml?acct="+$("#acct").val(),
		type:"get",
		async:false,
		success: function(result){
			if($.trim(result)=="true") {
				flag = true;
			} else {
				flag = false;
				$("#acctError").html("用户不存在");
			}
		}
	});
	alert($("#acct").val());
	
}

</script>
