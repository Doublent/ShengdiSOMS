<%@ page import="org.apache.struts2.components.Include"%>
<%@page language="java" contentType="text/html;charset=UTF-8"
	pageEncoding="utf-8"%>
<!-- <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd"> -->
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
<script src="js/jquery-1.11.3.min.js"></script>
<script src="http://cdn.bootcss.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
<script src="js/bootstrap.min.js"></script>
</head>
<body>
	<div class="navbar nav-list" role="navigation">
		<div class="container">
			<div>
				<ul class="breadcrumb">
					<li><a href="">首页</a></li>
				</ul>
			</div>

			<div class="row">
				<div class="col-md-3">
					<ul id="main-nav" class="nav nav-tabs nav-stacked">
						<li><a href="login.jsp" target="contentframe"> <i
								class="glyphicon glyphicon-th-large"></i> 首页
						</a></li>
						<li><a href="#"> <i
								class="glyphicon glyphicon-credit-card"></i> 销售订单管理
						</a></li>
						<li><a href="#"> <i
								class="glyphicon glyphicon-credit-card"></i> 发货单管理
						</a></li>
						<li><a href="#"> <i
								class="glyphicon glyphicon-credit-card"></i> 制单界面
						</a></li>
						<li><a href="#"> <i
								class="glyphicon glyphicon-credit-card"></i> orderbase维护
						</a></li>
						<li><a href="#mainDataList"
							class="nav-header collapsed hasdown" data-toggle="collapse"
							aria-expanded="true" aria-controls="mainDataList"> <span
								class="pull-right glyphicon glyphicon-chevron-right"></span> <i
								class="glyphicon glyphicon-cog"></i> 主数据维护
						</a>
							<ul id="mainDataList" class="nav nav-list collapse secondmenu"
								style="height: 0px; padding-left: 30px">
								<li><a href="customerreadAllByServicePersonnel.action" target="contentframe"><i
										class="glyphicon glyphicon-user"></i>客户管理</a></li>
								<li><a href="priceManagementAction!listAll.action" target="contentframe"><i class="glyphicon glyphicon-th-list"></i>价格表管理</a></li>
								<li><a href="#discountManageList"
									class="nav-header collapsed hasdown" data-toggle="collapse"
									aria-expanded="true" aria-controls="discountManageList"> <span
										class="pull-right glyphicon glyphicon-chevron-right"></span> <i
										class="glyphicon glyphicon-asterisk"></i>折扣管理
								</a>
									<ul id="discountManageList"
										class="nav nav-list collapse thirdmenu"
										style="padding-left: 30px">
										<li><a
											href="normalDiscountAction!listNormalDiscount.action"
											target="contentframe"> <i
												class="glyphicon glyphicon-th-list"></i>经常性折扣
										</a></li>
										<li><a
											href="specialDiscountAction!listSpecialDiscount.action"
											target="contentframe"><i
												class="glyphicon glyphicon-th-list"></i>一次性折扣</a></li>
									</ul></li>
							</ul></li>
						<li>
                            <a href="#systemSettings" class="nav-header collapsed hasdown" data-toggle="collapse">
                                <span class="pull-right glyphicon glyphicon-chevron-right"></span>
                                <i class="glyphicon glyphicon-credit-card"></i>系统设置</a>
                             <ul id="systemSettings" class="nav nav-list collapse secondmenu" style="height: 0px;padding-left: 30px">
                                <li><a href="#"><i class="glyphicon glyphicon-user"></i>orderbase配置</a></li>
                                <li><a href="#"><i class="glyphicon glyphicon-th-list"></i>客户订单配置</a></li>
                                 <li><a href="priceAllocationAction!list.action" target="contentframe"><i 
                                 		class="glyphicon glyphicon-asterisk"></i>价格表配置</a></li>
                                  <li><a href="#"><i class="glyphicon glyphicon-th-list"></i>订单检测规则</a></li>
                            </ul>
                        </li>
						
						
						
						
						
						<li><a href="#userManager" data-toggle="collapse"
							aria-expanded="true" class="nav-header collapsed hasdown"
							aria-controls="userManager"><span
								class="pull-right glyphicon glyphicon-chevron-right"></span> <i
								class="glyphicon glyphicon-user"></i> 用户管理 </a>
							<ul id="userManager" class="nav nav-list collapse secondmenu"
								style="height: 0px; padding-left: 30px">
								<li><a href="userAction!listUser.action" target="contentframe"><i
										class="glyphicon glyphicon-user"></i>账号管理</a></li>
								<li><a href="#"><i class="glyphicon glyphicon-th-list"></i>角色权限管理</a></li>
							</ul>
						<li><a href="#"> <i
								class="glyphicon glyphicon-credit-card"></i> 报表管理
						</a></li>
					</ul>
				</div>
			</div>
		</div>
	</div>
</body>
<script>
	$(".hasdown").click(
			function() {
				var obj = $(this).children("span");
				var breadcrumb = $(".breadcrumb");
				if (obj.hasClass("glyphicon-chevron-right")) {
					obj.removeClass().addClass(
							"pull-right glyphicon glyphicon-chevron-down");
// 					breadcrumb.append('<li><a href="#">' + $(this).text()
// 							+ '</a></li>');
				} else {
					obj.removeClass().addClass(
							"pull-right glyphicon glyphicon-chevron-right");
				}
			})
</script>
</html>