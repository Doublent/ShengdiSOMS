<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="css/bootstrap.min.css" type="text/css" rel="stylesheet">
<link href="css/customer.css" type="text/css" rel="stylesheet">

</head>
<body>

	<%-- 	<s:if test="#request.customersInfo == null || #request.customersInfo.size() == 0"> --%>
	<!-- 		没有任何客户信息 -->
	<%-- 	</s:if> --%>
	<%-- 	<s:else> --%>
	<table border="1" cellpadding="10" cellspacing="0"
		class="table table-bordered table-hover" id="tablesize">
		<tr>
			<td>客户名称</td>
			<td>客户简称</td>
			<td>类型</td>
			<td>集团公司</td>
			<td>总公司</td>
			<td>国家</td>
		</tr>
		<s:if
			test="#request.customersInfo == null || #request.customersInfo.size() == 0">
			<tr>
				<td><font style="color: gray;">无</font></td>
				<td><font style="color: gray;">无</font></td>
				<td><font style="color: gray;">无</font></td>
				<td><font style="color: gray;">无</font></td>
				<td><font style="color: gray;">无</font></td>
				<td><font style="color: gray;">无</font></td>
			</tr>
		</s:if>
		<s:else>
			<s:iterator value="#request.customersInfo">
				<tr>
					<td>${cust_name }</td>
					<td>${cust_code }</td>
					<td>${type }</td>
					<td>${group_company }</td>
					<td>${corporation }</td>
					<td>${country }</td>
				</tr>
			</s:iterator>
		</s:else>
	</table>

</body>
</html>