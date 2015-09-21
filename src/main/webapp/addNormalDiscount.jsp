<<<<<<< HEAD
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>新增 / 编辑经常性折扣</title>
<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/style.css" rel="stylesheet">
<link href="css/updateDiscount.css" rel="stylesheet">
<script src="js/jquery-1.11.3.min.js"></script>
<script src="js/bootstrap.min.js"></script>

<script>
	$(document).ready(function() {
		
	});
	function changeType(obj) {
		var _value = $(obj).val();
		if(_value == "通用加价") {
			$('select[name="normalDiscount.discount_base"]').val("数量");
			$("#base_qty").replaceWith("<input id='base_qty' type='text' class='form-control' name='normalDiscount.base_qty'/>");
		}
	}
	function changeDiscount_base(obj) {
		var _value = $(obj).val();
		if(_value == "数量") {
			$("#base_qty").replaceWith("<input id='base_qty' type='text' class='form-control' name='normalDiscount.base_qty'/>");
		} else {
			$("#base_qty").replaceWith("<input id='base_qty' type='text' class='form-control' name='normalDiscount.base_qty' disabled/>");
		}
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
				<s:form action="normalDiscountAction!saveNormalDiscount.action"
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
							<tr>
								<td><input type="text" class="form-control" value="1"
									name="id" disabled/></td>
								<td><input type="text" class="form-control"
									name="normalDiscount.discount_name" /></td>
								<td><select class="form-control" onchange="changeType(this)" 
									name="normalDiscount.type" style="width: 120px">
										<option value="一般折扣">一般折扣</option>
										<option value="通用加价">通用加价</option>
								</select></td>
								<!-- <td><input type="text" class="form-control" name="normalDiscount.discount_base" /></td> -->
								<td><select class="form-control" onchange="changeDiscount_base(this)"
									name="normalDiscount.discount_base" style="width: 100px">
										<option value="金额">金额</option>
										<option value="单价">单价</option>
										<option value="数量">数量</option>
								</select></td>
								<td><input id="base_qty" type="text" class="form-control"
									name="normalDiscount.base_qty" disabled /></td>
								<td><input type="text" class="form-control"
									name="normalDiscount.discount_rate" /></td>
								<td><select class="form-control"
									name="normalDiscount.activity" style="width: 80px;">
										<option selected value="是">是</option>
										<option value="否">否</option>
								</select></td>
<!-- 								<td><input type="text" class="form-control" -->
<!-- 									name="normalDiscount.activity" value="是"/></td> -->
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

=======
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>新增 / 编辑经常性折扣</title>
<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/style.css" rel="stylesheet">
<link href="css/updateDiscount.css" rel="stylesheet">
<script src="js/jquery-1.11.3.min.js"></script>
<script src="js/bootstrap.min.js"></script>

<script>
	$(document).ready(function() {
		
	});
	function changeType(obj) {
		var _value = $(obj).val();
		if(_value == "通用加价") {
			$('select[name="normalDiscount.discount_base"]').val("数量");
			$("#base_qty").replaceWith("<input id='base_qty' type='text' class='form-control' name='normalDiscount.base_qty'/>");
		}
	}
	function changeDiscount_base(obj) {
		var _value = $(obj).val();
		if(_value == "数量") {
			$("#base_qty").replaceWith("<input id='base_qty' type='text' class='form-control' name='normalDiscount.base_qty'/>");
		} else {
			$("#base_qty").replaceWith("<input id='base_qty' type='text' class='form-control' name='normalDiscount.base_qty' disabled/>");
		}
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
				<s:form action="normalDiscountAction!saveNormalDiscount.action"
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
							<tr>
								<td><input type="text" class="form-control" value="1"
									name="id" disabled/></td>
								<td><input type="text" class="form-control"
									name="normalDiscount.discount_name" /></td>
								<td><select class="form-control" onchange="changeType(this)" 
									name="normalDiscount.type" style="width: 120px">
										<option value="一般折扣">一般折扣</option>
										<option value="通用加价">通用加价</option>
								</select></td>
								<!-- <td><input type="text" class="form-control" name="normalDiscount.discount_base" /></td> -->
								<td><select class="form-control" onchange="changeDiscount_base(this)"
									name="normalDiscount.discount_base" style="width: 100px">
										<option value="金额">金额</option>
										<option value="单价">单价</option>
										<option value="数量">数量</option>
								</select></td>
								<td><input id="base_qty" type="text" class="form-control"
									name="normalDiscount.base_qty" disabled /></td>
								<td><input type="text" class="form-control"
									name="normalDiscount.discount_rate" /></td>
								<td><select class="form-control"
									name="normalDiscount.activity" style="width: 80px;">
										<option selected value="是">是</option>
										<option value="否">否</option>
								</select></td>
<!-- 								<td><input type="text" class="form-control" -->
<!-- 									name="normalDiscount.activity" value="是"/></td> -->
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

>>>>>>> huangzijing
</html>