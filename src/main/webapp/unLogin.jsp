<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>未登录</title>
<link href="css/bootstrap.min.css" rel="stylesheet">
<script src="js/jquery-1.11.3.min.js"></script>
<script src="js/bootstrap.min.js"></script>
</head>
<body>
	<script>
		alert("您尚未登录，请登录后再访问系统功能！");
		location.href = "login.jsp";
	</script>

</body>
</html>