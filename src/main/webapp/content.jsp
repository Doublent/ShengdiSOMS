<%@ page import="org.apache.struts2.components.Include"%>
<%@page language="java" contentType="text/html;charset=UTF-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link
	href="http://cdn.bootcss.com/bootstrap/3.2.0/css/bootstrap.min.css"
	rel="stylesheet">
<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/index.css" rel="stylesheet">
<script src="http://cdn.bootcss.com/jquery/2.1.1/jquery.min.js"></script>
<!--     <script src="js/jquery-1.11.3.min.js"></script> -->
<script src="http://cdn.bootcss.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
<!--     <script src="js/bootstrap.min.js"></script> -->
</head>
<body>
	<div class="container">
		<div id="right" class="tab-content col-md-9">
			<div class="tab-pane" id="normalDiscount">
<%-- 				<jsp:include page="normalDiscount.jsp" /> --%>
			</div>

			<div class="tab-pane active" id="welcome">
				<h2>welcome</h2>
			</div>
			<div class="tab-pane" id="customerInquiry">
				<h2>customerInquiry.jsp</h2>
			</div>
			<div class="tab-pane" id="normalDiscount">
				<h2>normalDiscount.jsp</h2>
				<%--                         <jsp:include page="normalDiscount.jsp"/> --%>
			</div>
			<div class="tab-pane" id="specialDiscount">
				<h2>specialDiscount.jsp</h2>
				<%-- 						<jsp:include page="specialDiscount.jsp"/> --%>
			</div>
		</div>
	</div>
</body>
</html>