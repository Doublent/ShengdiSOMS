<<<<<<< HEAD
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>经常性折扣</title>
<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/style.css" rel="stylesheet">
<link href="css/normalDiscount.css" rel="stylesheet">
<script src="http://cdn.bootcss.com/jquery/2.1.1/jquery.min.js"></script>
<script src="js/jquery-1.11.3.min.js"></script>
<script src="http://cdn.bootcss.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
<script src="js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
		<div id="add-find-form" class="col-md-12  form-inline">
			<form action="specialDiscountAction!findByCondition.action"
				method="post">
				<div class="control-group">
					<label class="col-md-1 col-md-offset-2 control-label">折扣名称</label>
					<input class="col-md-3 form-control" type="text"
						name="specialDiscount.discount_name" /> <label
						class="col-md-1 col-md-offset-1 control-label">客户代码</label> <input
						class="col-md-3 form-control" type="text"
						name="specialDiscount.cust_code" />
				</div>
				<div class="add_find col-md-12" style="margin-top: 30px">
					<button onclick="location.href='customerreadCodeToAddNormalJsp.action'"
						type="button" class="btn btn-default col-md-1 col-md-offset-4">新增</button>
					<input class="btn btn-default col-md-1 col-md-offset-1"
						type="submit" value="查阅" />
				</div>
			</form>
		</div>
		<div class="line col-md-12 "></div>
		<div id="dixcount-message-table" class="col-md-10 " style="overflow:scroll; height:500px; width: 100%">
			<table border="0" cellspacing="0" cellpadding="0"
				class="table table-striped table-bordered table-hover table-condensed">
				<thead>
					<tr>
						<th>序号</th>
						<th>折扣名称</th>
						<th>客户代码</th>
						<th>折扣金额</th>
						<th>已用金额</th>
						<th>折扣余额</th>
						<th>有效</th>
						<th>操作</th>
						<th>记录</th>
					</tr>
				</thead>
				<tbody>
					<%
						int id = 0;
					%>
					<s:iterator id="sd" value="#request.specialDiscounts">
						<tr>
							<td><%=++id%></td>
							<td><s:property value="#sd.discount_name" /></td>
							<td><s:property value="#sd.cust_code" /></td>
							<td><s:property value="#sd.amount" /></td>
							<td><s:property value="#sd.applied_amount" /></td>
							<td><s:property value="#sd.balance" /></td>
							<td><s:property value="#sd.activity" /></td>
							<!-- 							<td></td> -->
							<td><a class="btn btn-default"
								href="specialDiscountAction!updatePreSpecialDiscount.action?specialDiscount.discount_id=${sd.discount_id}">编辑</a>
							</td>
							<td><a class="btn btn-default"
								href="specialDiscountAction!findAppliedRecords.action?specialDiscount.discount_id=${sd.discount_id}">查看</a>
							</td>
						</tr>
					</s:iterator>
				</tbody>
			</table>
		</div>
	</div>
</body>
</html>
=======
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>经常性折扣</title>
<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/style.css" rel="stylesheet">
<link href="css/normalDiscount.css" rel="stylesheet">
<script src="http://cdn.bootcss.com/jquery/2.1.1/jquery.min.js"></script>
<script src="js/jquery-1.11.3.min.js"></script>
<script src="http://cdn.bootcss.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
<script src="js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
		<div id="add-find-form" class="col-md-12  form-inline">
			<form action="specialDiscountAction!findByCondition.action"
				method="post">
				<div class="control-group">
					<label class="col-md-1 col-md-offset-2 control-label">折扣名称</label>
					<input class="col-md-3 form-control" type="text"
						name="specialDiscount.discount_name" /> <label
						class="col-md-1 col-md-offset-1 control-label">客户代码</label> <input
						class="col-md-3 form-control" type="text"
						name="specialDiscount.cust_code" />
				</div>
				<div class="add_find col-md-12" style="margin-top: 30px">
					<button onclick="location.href='customerreadCodeToAddNormalJsp.action'"
						type="button" class="btn btn-default col-md-1 col-md-offset-4">新增</button>
					<input class="btn btn-default col-md-1 col-md-offset-1"
						type="submit" value="查阅" />
				</div>
			</form>
		</div>
		<div class="line col-md-12 "></div>
		<div id="dixcount-message-table" class="col-md-10 " style="overflow:scroll; height:500px; width: 100%">
			<table border="0" cellspacing="0" cellpadding="0"
				class="table table-striped table-bordered table-hover table-condensed">
				<thead>
					<tr>
						<th>序号</th>
						<th>折扣名称</th>
						<th>客户代码</th>
						<th>折扣金额</th>
						<th>已用金额</th>
						<th>折扣余额</th>
						<th>有效</th>
						<th>操作</th>
						<th>记录</th>
					</tr>
				</thead>
				<tbody>
					<%
						int id = 0;
					%>
					<s:iterator id="sd" value="#request.specialDiscounts">
						<tr>
							<td><%=++id%></td>
							<td><s:property value="#sd.discount_name" /></td>
							<td><s:property value="#sd.cust_code" /></td>
							<td><s:property value="#sd.amount" /></td>
							<td><s:property value="#sd.applied_amount" /></td>
							<td><s:property value="#sd.balance" /></td>
							<td><s:property value="#sd.activity" /></td>
							<!-- 							<td></td> -->
							<td><a class="btn btn-default"
								href="specialDiscountAction!updatePreSpecialDiscount.action?specialDiscount.discount_id=${sd.discount_id}">编辑</a>
							</td>
							<td><a class="btn btn-default"
								href="specialDiscountAction!findAppliedRecords.action?specialDiscount.discount_id=${sd.discount_id}">查看</a>
							</td>
						</tr>
					</s:iterator>
				</tbody>
			</table>
		</div>
	</div>
</body>
</html>
>>>>>>> huangzijing
