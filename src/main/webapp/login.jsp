<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd"> -->
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link
	href="http://cdn.bootcss.com/bootstrap/3.2.0/css/bootstrap.min.css"
	rel="stylesheet">
<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/style.css" rel="stylesheet">
<script src="js/jquery-1.11.3.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<style>
* {
	margin: 0;
	padding: 0;
}

.container {
	width: 80%;
}

.login_form {
	margin: 0 auto;
	width: 100%;
}
</style>
</head>
<body>
	<div class="container">

		<div class="login_form">
			<form action="userAction.action" class="form-horizontal" role="form">
				<div class="form-group">
					<label class="col-md-2 col-md-offset-1 control-label">账号</label>
					<div class="col-md-3 ">
						<input type="text" class="form-control"
							name="user.username" placeholder="Enter username ">
					</div>
				</div>
				<div class="form-group">
					<label class="col-md-2 col-md-offset-1 control-label">密码</label>
					<div class="col-md-3 ">
						<input type="password" class="form-control"
							name="user.password" placeholder="Enter password ">
					</div>
				</div>
				<div class="form-group">
					<div class=" col-md-2 col-md-offset-2">
						<div class="checkbox">
							<label> <input type="checkbox">记住密码
							</label>
						</div>
					</div>
				</div>
				<div class="form-group">
					<div class="col-md-8 col-md-offset-3">
						<button type="submit" class="btn btn-primary col-md-1">登陆</button>
						<button type="button" class="btn btn-default col-md-1 col-md-offset-1">取消</button>
					</div>
				</div>
			</form>
		</div>

	</div>


	<!-- 	<form action="userAction!saveUser.action" method="post"> -->
	<!-- 		<label>账号</label> -->
	<!-- 		<input type="text" name="user.username" /><br> -->
	<!-- 		<label>密码</label> -->
	<!-- 		<input type="text" name="user.password" /><br> -->
	<!-- 		<input type="submit" value="登陆"/> -->
	<!-- 	</form> -->
</body>
</html>