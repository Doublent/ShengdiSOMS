<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>新增 / 编辑一次性折扣</title>
<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/style.css" rel="stylesheet">
<link href="css/updateDiscount.css" rel="stylesheet">
<script src="js/jquery-1.11.3.min.js"></script>
<script src="js/bootstrap.min.js"></script>

<script>
	$(document).ready(function() {
		$("input[name='specialDiscount.amount']").on("keyup",getBalance);
		$("input[name='specialDiscount.applied_amount']").on("change",getBalance);
	});
	function getBalance() {
		$("input[name='specialDiscount.balance']").val($("input[name='specialDiscount.amount']").val() - $("input[name='specialDiscount.applied_amount']").val());
	}
</script>
</head>
<body>
	<div class="container">
		<div class="col-md-12 col-md-pull-1">
			<div>
				<label>新增 / 编辑折扣</label>
			</div>
			<div class="line"></div>
			<div id="dixcount-message-table">
				<s:form action="specialDiscountAction!saveSpecialDiscount.action"
					method="post">
					<table id="updateDiscount-form"
						class="table table-striped table-bordered table-condensed">
						<thead>
							<tr>
								<th>折扣名称</th>
								<th>客户代码</th>
								<th>折扣金额</th>
								<th>已用金额</th>
								<th>折扣余额</th>
								<th>有效</th>
							</tr>
						</thead>
						<tbody>
							<tr>
								<td><input type="text" class="form-control"
									name="specialDiscount.discount_name" /></td>
								<td><input type="text" class="form-control" 
									name="specialDiscount.cust_code" /></td>
								<td><input type="text" class="form-control"
									name="specialDiscount.amount" /></td>
								<td><input type="text" class="form-control"
									name="specialDiscount.applied_amount" value="0" disabled/></td>
								<td><input type="text" class="form-control"
									name="specialDiscount.balance" disabled/></td>
								<td><select class="form-control" name="specialDiscount.activity" style="width: 80px;">
										<option value="是">是</option>
										<option value="否">否</option>
								</select></td>
<!-- 								<td><input type="text" class="form-control" -->
<!-- 									name="specialDiscount。activity" value="是"/></td> -->
							</tr>
							<tr>
								<td colspan="7">
								<button type="button" class="btn btn-default pull-left col-md-1" onclick="history.go(-1)">返回</button>
								<input class="btn btn-default pull-right col-md-1"
									type="submit" value="保存" /></td>
							</tr>

						</tbody>
					</table>
				</s:form>
			</div>
		</div>
	</div>
</body>

</html>