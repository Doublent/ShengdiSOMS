<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2015/9/16
  Time: 11:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>经常性折扣</title>
<!-- <link -->
<!-- 	href="http://cdn.bootcss.com/bootstrap/3.2.0/css/bootstrap.min.css" -->
<!-- 	rel="stylesheet"> -->
<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/normalDiscount.css" rel="stylesheet">
<script src="http://cdn.bootcss.com/jquery/2.1.1/jquery.min.js"></script>
<script src="js/jquery-1.11.3.min.js"></script>
<script src="http://cdn.bootcss.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
<script src="js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
		<div id="add-update-form" class="col-md-12">
			<form action="normalDiscountAction!listNormalDiscount.action" method="POST">
				<label class="col-md-2">折扣名称</label>
				<input class="col-md-3" type="text" name="normalDiscount.discount_name"/>
				<label class="col-md-2">类型</label>
				<input class="col-md-3" type="text" name="normalDiscount.type" />
				<div class="col-md-12">
					<button class="col-md-1 col-md-offset-4">新增</button>
					<input class="col-md-1 col-md-offset-1" type="submit" value="查阅" />
				</div>
			</form>
		</div>
		<div id="dixcount-message-table" class="col-md-12">
			<table
				class="table table-striped table-bordered table-hover table-condensed">
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
						<th>操作</th>
					</tr>
				</thead>
				<tbody>
					<s:iterator id="nd" value="#request.normalDiscounts">
						<tr>
							<td><s:property value="#nd.discount_id" /></td>
							<td><s:property value="#nd.discount_name" /></td>
							<td><s:property value="#nd.type" /></td>
							<td><s:property value="#nd.discount_base" /></td>
							<td><s:property value="#nd.base_qty" /></td>
							<td><s:property value="#nd.discount_rate" /></td>
							<td><s:property value="#nd.activity" /></td>
							<td><s:a
									href="NormalDiscountAction!updatePreNormalDiscount.action?normalDiscount.id=%{#nd.discount_id}">编辑</s:a>
							</td>
						</tr>
					</s:iterator>
				</tbody>
			</table>
		</div>
	</div>
</body>
</html>
