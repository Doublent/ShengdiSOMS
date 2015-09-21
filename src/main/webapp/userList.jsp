<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!-- <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd"> -->
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/style.css" rel="stylesheet">
<script src="js/jquery-1.11.3.min.js"></script>
<script src="js/bootstrap.min.js"></script>
</head>
<body>
	<div id="addUserModel" class="modal fade" tabindex="-1" role="dialog"
		aria-labelledby="addUserModelLabel">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<form action="userAction!saveUser.action" class="form-horizontal"
					role="form">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal"
							aria-hidden="true">×</button>
						<h3 id="myModalLabel">>新建用户</h3>
					</div>
					<div class="modal-body">
						<div class="form-group">
							<label class="col-md-2 col-md-offset-2 control-label">系统账号</label>
							<div class="col-md-5 ">
								<input type="text" class="form-control" name="user.username"
									placeholder="Enter username">
							</div>
						</div>
						<div class="form-group">
							<label class="col-md-2 col-md-offset-2 control-label">密码</label>
							<div class="col-md-5 ">
								<input type="password" class="form-control" name="user.password"
									placeholder="Enter password ">
							</div>
						</div>
						<div class="form-group">
							<label class="col-md-2 col-md-offset-2 control-label">姓名</label>
							<div class="col-md-5 ">
								<input type="password" class="form-control" name="user.name"
									placeholder="Enter  ">
							</div>
						</div>
						<div class="form-group">
							<label class="col-md-2 col-md-offset-2 control-label">员工号</label>
							<div class="col-md-5 ">
								<input type="password" class="form-control" name="user.user_id"
									placeholder="Enter  ">
							</div>
						</div>
						<div class="form-group">
							<label class="col-md-2 col-md-offset-2 control-label">英文名</label>
							<div class="col-md-5 ">
								<input type="password" class="form-control" name="user.en_name"
									placeholder="Enter  ">
							</div>
						</div>
						<div class="form-group">
							<label class="col-md-2 col-md-offset-2 control-label">职位</label>
							<div class="col-md-5 ">
								<input type="password" class="form-control" name="user.position"
									placeholder="Enter  ">
							</div>
						</div>
						<div class="form-group">
							<label class="col-md-2 col-md-offset-2 control-label">电话</label>
							<div class="col-md-5 ">
								<input type="password" class="form-control" name="user.phone"
									placeholder="Enter  ">
							</div>
						</div>
						<div class="form-group">
							<label class="col-md-2 col-md-offset-2 control-label">E-mail</label>
							<div class="col-md-5 ">
								<input type="password" class="form-control" name="user.email"
									placeholder="Enter  ">
							</div>
						</div>
						<div class="form-group">
							<label class="col-md-2 col-md-offset-2 control-label">
								失效日期 </label>
							<div class="col-md-5 ">
								<input type="password" class="form-control" name="user.invalid_date"
									placeholder="Enter  ">
							</div>
						</div>
					</div>
					<div class="modal-footer">
						<button class="btn" data-dismiss="modal" aria-hidden="true">关闭</button>
						<button class="btn btn-primary">Save</button>
					</div>
				</form>
			</div>
		</div>
	</div>
	<div class="container">
		<div>
			<button type="button" class="btn btn-default" data-toggle="modal"
				data-target="#addUserModel">新建用户</button>
		</div>
		<div class="line"></div>
		<table class="table table-striped table-bordered " border="1px">
			<thead>
				<tr style="height: 50px; font-size: large;">
					<th>系统账号</th>
					<th>密码</th>
					<th>姓名</th>
					<th>员工号</th>
					<th>英文名</th>
					<th>职位</th>
					<th>电话</th>
					<th>E-mail</th>
					<th>失效日期</th>
				</tr>
			</thead>
			<tbody>
				<s:iterator id="us" value="#request.users">
					<tr>
						<td><s:property value="#us.username" /></td>
						<td><s:property value="#us.password" /></td>
						<td><s:property value="#us.name" /></td>
						<td><s:property value="#us.user_id" /></td>
						<td><s:property value="#us.en_name" /></td>
						<td><s:property value="#us.position" /></td>
						<td><s:property value="#us.phone" /></td>
						<td><s:property value="#us.email" /></td>
						<td><s:property value="#us.invalid_date" /></td>
					</tr>
				</s:iterator>
			</tbody>
		</table>
	</div>
</body>
</html>