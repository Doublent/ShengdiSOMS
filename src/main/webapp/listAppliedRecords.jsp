<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>一次性查看历史记录</title>
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
		
		<div id="dixcount-message-table" class="col-md-10 col-md-pull-1"
			style="overflow: scroll; height: 500px; width: 100%">
			<table border="0" cellspacing="0" cellpadding="0" 
				class="table table-striped table-bordered table-hover table-condensed">
				<thead>
					<tr>
						<th>序号</th>
						<th>折扣名称</th>
						<th>客户代码</th>
						<th>发货单标识号</th>
						<th>已用金额</th>
						<th>应用日期</th>
						<th>取消</th>
						<th>取消日期</th>
					</tr>
				</thead>
				<tbody>
					<%
						int id = 0;
					%>
					<s:iterator id="dar" value="#request.discountAppliedRecords">
						<tr>
							<td><%=++id%></td>
							<td><s:property value="#dar.discount_name" /></td>
							<td><s:property value="#dar.cust_code" /></td>
							<td><s:property value="#dar.dn_identify_num" /></td>
							<td><s:property value="#dar.applied_amount" /></td>
							<td><s:property value="#dar.applied_date" /></td>
							<td><s:property value="#dar.cancel" /></td>
							<td><s:property value="#dar.cancel_date" /></td>
						</tr>
					</s:iterator>

				</tbody>
			</table>
		</div>
		<button type="button" class="btn btn-default col-lg-2 col-lg-offset-4"
			onclick="history.go(-1)" style="font-size: large;margin-top: 20px">返回</button>
	</div>
</body>
</html>