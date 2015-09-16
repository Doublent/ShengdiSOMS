<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>价格表配置</title>
<!-- <link href="css/bootstrap.min.css" type="text/css" rel="stylesheet" /> -->
<link href="css/PriceConfigure.css" type="text/css" rel="stylesheet" />
<script src="js/jquery-1.11.3.min.js"></script>
<!-- <script src="js/bootstrap.min.js"></script> -->
</head>
<body>
	<div class="container-fruid">
		<div class="row col-md-12">
			<div id="Content">
				<div id="contentTop">
				<div class="row divrow1"> <!-- row1 -->
					<div class="col-md-2 texthead">客户简称 </div>
					<div class="col-md-3">
						<div class="ax_text_field">
							<input id="input_code" type="text" name="customer_code"
									value="GTW" />
						</div>
					</div>
					<div class="col-md-2 texthead">类型</div>
					<div class="col-md-5">
						<div class="ax_text_field">
							 <input id="input_type" type="text" name="type" value="" />
						</div>
					</div>
				</div>
				<div class="row divrow1"> <!-- row2 -->
					<div class="col-md-2 texthead">客户名称 </div>
					<div class="col-md-3">
						<div class="ax_text_field">
							<input id="input_name" type="text" name="customer_name"
									value="" />
						</div>
					</div>
					<div class="col-md-2 texthead">启用状态</div>
					<div class="col-md-5">
						<div class="ax_text_field">
							 <input id="start_status" type="text" name="start_status"
									value="全部" />
						</div>
					</div>
				</div>
				<div class="row divrow1"> <!-- row3 -->
					<div class="col-md-2 texthead">序号</div>
					<div class="col-md-3">
						<div class="ax_text_field">
							<input id="serial_number" type="text" name="serial_number"
									value="" />
						</div>
					</div>
					<div class="col-md-2 texthead">字段名称</div>
					<div class="col-md-5">
						<div class="ax_text_field">
							 <input id="field_name" type="text" name="field_name"
									value="" />
						</div>
					</div>
				</div>
				</div>
				<br> <br>
				<div id="contentCentre">
					<div class="row">
						<div id="clickButton" class="ax_html_button">
						    <table>
						        <tr>
						            <td width="200px"></td>
						            <td><input class="longButton" type="submit" name="Query_modification"
								value="查询/修改" onclick="firm()" /></td>
								<td width="20px"></td>
								    <td> <input class="longButton"
								type="submit" name="save" value="保存" /></td>
								<td width="60px"></td>
								     <td><input
								class="longButton" type="submit" name="New_configuration"
								value="新增配置" /></td>
						        </tr>
						    </table>							 
							<script type="text/javascript">
								function firm() {//利用对话框返回的值 （true 或者 false）
									if (confirm("你确定选择要查询？")) {//如果是true ，那么就响应价格表配置的 " 查询  "方法.否则,弹出下一个提示框
										out.ptintln("查询!");
									}
									if (confirm("你确定选择修改吗?")) {//如果是true ，那么就响应价格表配置的 " 修改  "方法.否则,关闭提示框
										out.ptintln("修改!");
									}
								}
							</script>
						</div>
					</div>
				</div>
				<br>
				<div id="redline" class="row">
					<img class="img" src="images/redline.png" alt="" />
				</div>
				<div id="contentBottom">
					<div class="show">

						<div id="tablesize">
							<table class="table table-bordered table-hover">
								<tr>
									<th class="info">序号</th>
									<th class="info">PL列名</th>
									<th class="info">显示名称</th>
									<th class="info">EXCEL列</th>
									<th class="info">启用</th>
								</tr>
								<tr class="trheight">
									<td></td>
									<td></td>
									<td></td>
									<td></td>
									<td></td>
								</tr>
								<tr class="trheight">
									<td></td>
									<td></td>
									<td></td>
									<td></td>
									<td></td>
								</tr>
								<tr class="trheight">
									<td></td>
									<td></td>
									<td></td>
									<td></td>
									<td></td>
								</tr>
								<tr class="trheight">
									<td></td>
									<td></td>
									<td></td>
									<td></td>
									<td></td>
								</tr>
								<tr class="trheight">
									<td></td>
									<td></td>
									<td></td>
									<td></td>
									<td></td>
								</tr>
								<tr class="trheight">
									<td></td>
									<td></td>
									<td></td>
									<td></td>
									<td></td>
								</tr>
								<tr class="trheight">
									<td></td>
									<td></td>
									<td></td>
									<td></td>
									<td></td>
								</tr>
							</table>
						</div>

					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>