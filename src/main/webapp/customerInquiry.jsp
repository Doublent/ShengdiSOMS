<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>客户查询</title>
<link href="css/bootstrap.min.css" type="text/css" rel="stylesheet">
<link href="css/customer.css" type="text/css" rel="stylesheet">



</head>
<body>
	<div class="container">
		<div class="row col-md-12">
			<div class="divI">
				<form action="customerread.action" method="post">
					<div class="row div1">
						<div class="col-md-1 texthead">客户名称</div>
						<div class="col-md-2">
							<div class="ax_text_field">
								<input type="text" name="cust_name" />
							</div>
						</div>
						<div class="col-md-1 texthead">类型</div>
						<div class="col-md-2">
							<div class="ax_text_field">
								<input type="text" name="type" />
							</div>
						</div>
						<div class="col-md-1 texthead">集团公司</div>
						<div class="col-md-5" style="width: auto;">
							<div class="ax_text_field">
								<input type="text" name="group_company" />
							</div>
						</div>
					</div>

					<div class="row div1">
						<div class="col-md-1 texthead">客户简称</div>
						<div class="col-md-2">
							<div class="ax_text_field">
								<input type="text" name="cust_code" />
							</div>
						</div>
						<div class="col-md-1 texthead">状态</div>
						<div class="col-md-2">
							<div class="ax_text_field">
								<input type="text" name="status" />
							</div>
						</div>
						<div class="col-md-1 texthead">总公司</div>
						<div class="col-md-5" style="width: auto;">
							<div class="ax_text_field">
								<input type="text" name="corporation" />
							</div>
						</div>
					</div>
					<br> <br>


					<div class="row div1">
						<div id="div2" class="ax_html_button">

							<input class="longButton" type="submit" value="查询" />
							<button class="longButton" type="button"
								onclick="location.href='addCustomer.jsp'">新建</button>
						</div>
					</div>
				</form>

				<!-- 	----------------	红线划分	----------------	-->

				<div class="row div1">
					<img class="img redline" src="images/redline.png" />
				</div>
				<div class="div1">
					<div class="tablesize"
						style="overflow: scroll; height: 300px; width: 100%">
						<table class="table table-bordered table-hover">
							<tr>
								<td class="info">序号</td>
								<td class="info">客户名称</td>
								<td class="info">客户代码</td>
								<td class="info">所属TEAM</td>
								<td class="info">业务经理</td>
								<td class="info">业务助理</td>
								<td class="info">状态</td>
								<td class="info" colspan="2">详细信息</td>
								<td class="info">客户确认</td>
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
									<td><font style="color: gray;">无</font></td>
									<td><font style="color: gray;">无</font></td>
									<td><font style="color: gray;">无</font></td>
									<td><font style="color: gray;">无</font></td>
								</tr>
							</s:if>
							<s:else>
								<s:iterator value="#request.customersInfo" status="st">
									<tr>
										<td><s:property value="#st.getIndex()+1" /></td>
										<td>${cust_name }</td>
										<td>${cust_code }</td>
										<td>${market_area }</td>
										<td>${business_manager }</td>
										<td>${business_assistant }</td>
										<td>${status }</td>

										<td><button class="shortButton"
												onclick="location.href='customercheck.action?cust_id=${cust_id}'">查看</button></td>
										<td><button class="shortButton"
												onclick="location.href='customeredit.action?cust_id=${cust_id}'">编辑</button></td>
										<td><button class="shortButton"
												onclick="location.href='customerconfirm.action?cust_id=${cust_id}'">确认</button></td>
									</tr>
								</s:iterator>
							</s:else>
						</table>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>
