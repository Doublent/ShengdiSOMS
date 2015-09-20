<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>经常性折扣</title>
<link
	href="http://cdn.bootcss.com/bootstrap/3.2.0/css/bootstrap.min.css"
	rel="stylesheet">
<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/style.css" rel="stylesheet">
<script src="js/jquery-1.11.3.min.js"></script>
<script src="js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
		<div class="row">
		<div id="add-find-form" class="col-md-12 form-inline">
			<form action="normalDiscountAction!findByCondition.action" method="post">
				<div class="control-group">
					<label class="col-md-1 col-md-offset-2 control-label">折扣名称</label>
					<input class="col-md-3 form-control" type="text" name="normalDiscount.discount_name"/>
					<label class="col-md-1 col-md-offset-1 control-label">类型</label>
					<input class="col-md-3 form-control" type="text" name="normalDiscount.type" />
				</div>
				<div class="add_find col-md-12" style="margin-top: 30px">
					<button onclick="location.href='addNormalDiscount.jsp'" type="button" class="btn btn-default col-md-1 col-md-offset-4">新增</button>
					<input class="btn btn-default col-md-1 col-md-offset-1" type="submit" value="查阅" />
				</div>
			</form>
		</div>
		<div class="line col-md-12"></div>
		<div id="dixcount-message-table" class="col-md-10"
				 style="overflow:scroll; height:500px; width: 100%">
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
					<%int id=0; %>
					<s:iterator id="nd" value="#request.normalDiscounts">
						<tr>
							<td><%=++id %></td>
<%-- 							<td><s:property value="#nd.discount_id" /></td> --%>
							<td><s:property value="#nd.discount_name" /></td>
							<td><s:property value="#nd.type" /></td>
							<td><s:property value="#nd.discount_base" /></td>
							<s:if test="#nd.base_qty == 0||#nd.base_qty == null">
								<td>-</td>
							</s:if>
							<s:else>
								<td><s:property value="#nd.base_qty" /></td>
							</s:else>
							<td><s:property value="#nd.discount_rate" /></td>
							<td><s:property value="#nd.activity" /></td>
							<td><a class="btn btn-default"
									href="normalDiscountAction!updatePreNormalDiscount.action?normalDiscount.discount_id=${nd.discount_id}">编辑</a>
							</td>
						</tr>
					</s:iterator>
				</tbody>
			</table>
		</div>
		</div>
	</div>
</body>
</html>
