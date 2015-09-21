<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>客户维护</title>
<link href="css/bootstrap.min.css" type="text/css" rel="stylesheet">
<link href="css/customer.css" type="text/css" rel="stylesheet">



</head>
<body>
	<div class="container-fruid">
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
							<!-- 						<input class="longButton" type="submit" value="新建" /> -->
							<!-- 						<button class="longButton"><a href="addCustomer.jsp"></a>新建</button> -->
						</div>
					</div>


				</form>


				<!-- 	----------------	红线划分	----------------	-->



				<!-- 	地址信息	-->
				<div>
					<div id="address">
						<form action="">
							<div class="divright">
								<input class="longButton" type="submit" value="保存">
							</div>
							<div class="row div1">
								<img class="img redline" src="images/redline.png" />
							</div>
							<p>
								<span style="text-decoration: underline;">地址信息</span>
							</p>
							<div class="divheight">
								<div class="col-md-2 col-md-offset-1 text">*国家</div>
								<div class="col-md-9 inputtext">
									<select style="width: auto;">
										<option selected="selected" value="1">123</option>
										<option style="width: 200px" value="2">12311</option>
										<option style="width: 200px" value="3">123</option>
										<option style="width: 200px" value="4">123</option>
										<option style="width: 200px" value="5">123</option>
										<option style="width: 200px" value="6">12311111111111111</option>
										<option style="width: 200px" value="7">123</option>
									</select>
								</div>
							</div>
							<div class="divheight">
								<div class="col-md-2 col-md-offset-1 text">*目的地</div>
								<div class="col-md-9 inputtext">
									<input type="text" value="" />
								</div>
							</div>
							<div class="divheight">
								<div class="col-md-2 col-md-offset-1 text">*地址行1</div>
								<div class="col-md-9 inputtext">
									<input class="longtext" type="text" value="" />
								</div>
							</div>
							<div class="divheight">
								<div class="col-md-2 col-md-offset-1 text">地址行2</div>
								<div class="col-md-9 inputtext">
									<input class="longtext" type="text" value="" />
								</div>
							</div>
							<div class="divheight">
								<div class="col-md-2 col-md-offset-1 text">邮编</div>
								<div class="col-md-9 inputtext">
									<input type="text" value="" />
								</div>
							</div>
							<div class="divheight">
								<div class="col-md-2 col-md-offset-1 text">*唛头</div>
								<div class="col-md-9 inputtext heighttextarea">
									<textarea name="newMessage" rows="4" cols="30"></textarea>
								</div>
							</div>
							<div class="divheight">
								<div class="col-md-2 col-md-offset-1 text">状态</div>
								<div class="col-md-9 inputtext">
									<input id="u125_input" type="text" value="" /> <input
										type="submit" value="确认">
								</div>
							</div>
							<br> <br> <br>
						</form>
					</div>
				</div>
				<br> <br>

				<!-- 	付款信息	 -->
				<div>
					<div id="address">
						<form action="">
							<div class="divright">
								<input class="longButton" type="submit" value="保存">
							</div>
							<div class="row div1">
								<img class="img redline" src="images/redline.png" />
							</div>
							<p>
								<span style="text-decoration: underline;">付款信息</span>
							</p>
							<div class="divheight">
								<div class="col-md-2 col-md-offset-1 text">所属发票组</div>
								<div class="col-md-3 inputtext">
									<input type="text" value="" />
								</div>
								<div class="col-md-2 text">*通用加价条款</div>
								<div class="col-md-4 inputtext">
									<input type="text" value="" />
								</div>
							</div>
							<div class="divheight">
								<div class="col-md-2 col-md-offset-1 text">*结算货币</div>
								<div class="col-md-3 inputtext">
									<input type="text" value="" />
								</div>
								<div class="col-md-2 text">*一般折扣</div>
								<div class="col-md-4 inputtext">
									<input type="text" value="" />
								</div>
							</div>
							<div class="divheight">
								<div class="col-md-2 col-md-offset-1 text">*付款方式</div>
								<div class="col-md-9 inputtext heighttextarea">
									<textarea name="newMessage" rows="4" cols="40"></textarea>
								</div>
							</div>
							<div class="divheight">
								<div class="col-md-2 col-md-offset-1 text">价格条款1</div>
								<div class="col-md-9 inputtext heighttextarea">
									<textarea name="newMessage" rows="4" cols="40"></textarea>
								</div>
							</div>
							<div class="divheight">
								<div class="col-md-2 col-md-offset-1 text">价格条款2</div>
								<div class="col-md-9 inputtext heighttextarea">
									<textarea name="newMessage" rows="4" cols="40"></textarea>
								</div>
							</div>
							<div class="divheight">
								<div class="col-md-2 col-md-offset-1 text">价格条款3</div>
								<div class="col-md-9 inputtext heighttextarea">
									<textarea name="newMessage" rows="4" cols="40"></textarea>
								</div>
							</div>
							<br> <br> <br> <br> <br>
						</form>
					</div>
				</div>
				<br> <br> <br> <br> <br> <br> <br>

				<!-- 	组织信息	 -->
				<div>
					<div id="address">
						<form action="">
							<div class="divright">
								<input class="longButton" type="submit" value="保存">
							</div>
							<div class="row div1">
								<img class="img redline" src="images/redline.png" />
							</div>
							<p>
								<span style="text-decoration: underline;">组织信息</span>
							</p>
							<div class="divheight">
								<div class="col-md-2 col-md-offset-1 text">*所属TEAM</div>
								<div class="col-md-9 inputtext">
									<input type="text" value="" />
								</div>
							</div>
							<div class="divheight">
								<div class="col-md-2 col-md-offset-1 text">*业务经理</div>
								<div class="col-md-9 inputtext">
									<input type="text" value="" />
								</div>
							</div>
							<div class="divheight">
								<div class="col-md-2 col-md-offset-1 text">*业务助理</div>
								<div class="col-md-9 inputtext">
									<input type="text" value="" />
								</div>
							</div>
							<br> <br>

						</form>
					</div>
				</div>
				<br> <br>

				<!-- 	联系人信息	 -->
				<div>

					<div id="address">
						<form action="">
							<div class="divright">
								<input class="longButton" type="submit" value="保存">
							</div>
							<div class="row div1">
								<img class="img redline" src="images/redline.png" />
							</div>
							<p>
								<span style="text-decoration: underline;">联系人信息</span>
							</p>
							<div class="divheight">
								<div class="col-md-2 col-md-offset-1 text">发件人邮箱</div>
								<div class="col-md-9 inputtext">
									<input class="longtext" type="text" value="" />
								</div>
							</div>
							<br>
							<div class="divheight">
								<div class="col-md-2 col-md-offset-1 text">Pre PO 收件人</div>
								<div class="col-md-9 inputtext">
									<input class="longtext" type="text" value="" />
								</div>
							</div>
							<div class="divheight">
								<div class="col-md-2 col-md-offset-1 text">PO 收件人</div>
								<div class="col-md-9 inputtext">
									<input class="longtext" type="text" value="" />
								</div>
							</div>
							<div class="divheight">
								<div class="col-md-2 col-md-offset-1 text">OC/PI收件人</div>
								<div class="col-md-9 inputtext">
									<input class="longtext" type="text" value="" />
								</div>
							</div>
							<div class="divheight">
								<div class="col-md-3 text">INV/Packing list 收件人</div>
								<div class="col-md-9 inputtext">
									<input class="longtext" type="text" value="" />
								</div>
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>
