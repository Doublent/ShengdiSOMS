<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="row col-md-12">
		<div class="col-md-10 col-md-pull-1">
			<table border="1" width="80%" align="center">
				<tr>
					<td colspan="7" align="center"><s:a href="index.jsp">返回首页</s:a>
					</td>
				</tr>
				<tr>
					<th>ID</th>
					<th>折扣名称</th>
					<th>折扣类型</th>
					<th>折扣基准</th>
					<th>基准数量</th>
					<th>折扣率</th>
					<th>有效</th>
				</tr>
				<% int id=0; %>
				<s:iterator id="nd" value="#request.normalDiscounts">
					<tr>
						<td><%=++id %></td>
<%-- 						<td><s:property value="#nd.discount_id" /></td> --%>
						<td><s:property value="#nd.discount_name" /></td>
						<td><s:property value="#nd.type" /></td>
						<td><s:property value="#nd.discount_base" /></td>
						<td><s:property value="#nd.base_qty" /></td>
						<td><s:property value="#nd.discount_rate" /></td>
						<td><s:property value="#nd.activity" /></td>
						<%-- 			<td><s:a href="userAction!updatePreUser.action?user.id=%{#us.id}">编辑</s:a> --%>
						<!-- 			</td> -->
						<%-- 			<td><s:a href="userAction!removeUser.action?user.id=%{#us.id}">删除</s:a> --%>
						<!-- 			</td> -->
					</tr>
				</s:iterator>
			</table>
		</div>
	</div>
</body>
</html>