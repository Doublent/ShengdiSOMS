<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>新增 / 编辑折扣</title>
<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/style.css" rel="stylesheet">
<link href="css/updateDiscount.css" rel="stylesheet">
<script src="js/jquery-1.11.3.min.js"></script>
<script src="js/bootstrap.min.js"></script>

<script>
	$(document).ready(function() {

	});
	function changeValue(obj) {
		var _value = $(obj).val();
		if (_value == "数量") {
			$("#base_qty")
					.replaceWith(
							"<input id='base_qty' type='text' class='form-control' name='normalDiscount.base_qty'/>");
		} else {
			$("#base_qty")
					.replaceWith(
							"<input id='base_qty' type='text' class='form-control' name='normalDiscount.base_qty' disabled/>");
		}
	}
</script>
</head>
<body>
	<div class="container">
		<div class="col-md-12 ">
			<div>
				<label>新增 / 编辑折扣</label>
			</div>
			<div class="line"></div>
			<div id="dixcount-message-table">
				<s:form
					action="normalDiscountAction!updateNormalDiscount.action?normalDiscount.discount_id=%{normalDiscount.discount_id}"
					method="post">
					<table id="updateDiscount-form"
						class="table table-striped table-bordered table-condensed">
						<thead>
							<tr>
								<th>序号</th>
								<th>折扣名称</th>
								<th>折扣类型</th>
								<th>折扣基准</th>
								<th>基准数量<br>（片）
								</th>
								<th>折扣率</th>
								<th>有效</th>
							</tr>
						</thead>
						<tbody>
						<%int id=0; %>
							<tr>
								<td><input type="text" class="form-control"
									value="<%=++id %>" name="id" disabled /></td>
								<td><input type="text" class="form-control"
									value="${normalDiscount.discount_name}"
									name="normalDiscount.discount_name" /></td>
								<td><select class="form-control" name="normalDiscount.type"
									style="width: 120px">
										<option value="一般折扣">一般折扣</option>
										<option value="通用加价">通用加价</option>
								</select></td>
								<!-- <td><input type="text" class="form-control" name="normalDiscount.discount_base" /></td> -->
								<td><select class="form-control"
									onchange="changeValue(this)"
									name="normalDiscount.discount_base" style="width: 100px">
										<option value="金额">金额</option>
										<option value="单价">单价</option>
										<option value="数量">数量</option>
								</select></td>
								<td><input id="base_qty" type="text" class="form-control"
									value="${normalDiscount.base_qty}"
									name="normalDiscount.base_qty" disabled /></td>
								<td><input type="text" class="form-control"
									value="${normalDiscount.discount_rate}"
									name="normalDiscount.discount_rate" /></td>
								<td><input type="text" class="form-control"
									value="${normalDiscount.activity}"
									name="normalDiscount.activity" /></td>
							</tr>
							<tr>

								<td colspan="7">
									<button type="button"
										class="btn btn-default pull-left col-md-1"
										onclick="history.go(-1)">返回</button> <input
									class="btn btn-default pull-right col-md-1" type="submit"
									value="保存" />
								</td>
							</tr>

						</tbody>
					</table>
				</s:form>
			</div>
		</div>
	</div>
</body>

</html>