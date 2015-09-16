<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>价格表导入</title>
<link href="css/bootstrap.min.css" type="text/css" rel="stylesheet" />
<link href="css/ImportPrice.css" type="text/css" rel="stylesheet" />
<script src="js/jquery-1.11.3.min.js"></script>
<!-- <script src="js/bootstrap.min.js"></script> -->
</head>
<body>
	<div class="">
		<div id="rightdiv" class="">
			<div id="Content">
				<div id="contentTop">
					<div class="row divrow1"> <!-- row1 -->
					<div class="col-md-2 col-md-offset-1 texthead">客户简称 </div>
					<div class="col-md-3">
						<div class="ax_text_field">
							<input id="input_code" type="text" name="customer_code"
									value="GTW" />
						</div>
					</div>
					<div class="col-md-2 texthead">类型</div>
					<div class="col-md-3">
						<div class="ax_text_field">
							 <input id="input_type" type="text" name="type" value="" />
						</div>
					</div>
				</div>
				<div class="row divrow1"> <!-- row2 -->
					<div class="col-md-2 col-md-offset-1 texthead">工厂型号  </div>
					<div class="col-md-8">
						<div class="ax_text_field">
							<input id="Factory_model" type="text" name="Factory_model"
								value="" />
						</div>
					</div>
				</div>
				</div>
				<br> <br>
				<div id="contentCentre1">
					<div class="row4">
						<div id="clickButton" class="ax_html_button">
						  <table>
						      <tr>
						         <td width="200px"></td>
						         <td>
						            <input class="longButton" type="submit" name="Query_modification"
								value="查询" /> 
						         </td>
						         <td width="10px"></td>
						         <td>
						            <input class="longButton" type="submit"
								name="save" value="新增" />
						         </td>
						         <td width="50px"></td>
						         <td>
						             <input class="longButton"
								type="submit" name="ExportEXCEL" value="导出EXCEL" />
						         </td>
						         <td width="10px"></td>
						         <td>
						             <input
								class="showbutton" type="submit" name="ImportEXCEL"
								value="导入EXCEL" />
						         </td>
						      </tr>
						  </table>							
							<script type="text/javascript">
								$("input.showbutton").click(function() {
									$("div.showdiv").show(2000);
								} // 设置隐藏与显示,2000ms后显示
								);
							</script>
						</div>
					</div>
				</div>
				<br>
				<div class="redline" class="row5">
					<img class="img" src="images/redline.png" alt="" />
				</div>
				<br>
				<div id="contentCentre2" class="showdiv">
					<div class="row"> <!-- row6 -->
					    <div class="col-md-1 col-md-offset-1">导入文件</div>
						<div class="col-md-3 ">
							<div class="ax_text_field">
								 <input id="input_code" type="text" name="ImportFile"
									size="49" /> 
							</div>
						</div>
						<div class="col-md-1">
						        <input class="longButton" type="submit"
									name="choose" value="选择" />
						</div>
						<div class="col-md-6"></div>
					</div>
					<div class="row"> <!-- row7 -->
						<div class="col-md-2 col-md-offset-5">
							<div class="ax_text_field">
								<input class="longButton" type="submit" name="Import" value="导入" />
							</div>
						</div>
						<div class="col-md-5"></div>
					</div>
					<div class="row"> <!-- row8 -->
						<div class="col-md-2 col-md-offset-5">
							<div class="ax_text_field">
								<input class="longButton" type="submit" name="Confirm"
									value="确认" />
							</div>
						</div>
						<div class="col-md-5"></div>
					</div>
				</div>
				<br>
				<div class="redline" class="row9">
					<img class="img" src="images/redline.png" alt="" />
				</div>
				<br>
				<div id="contentBottom">
					<div class="row10">导入明细</div>
					<br>
					<div class="show">

						<div id="tablesize">
							<table class="table table-bordered table-hover">
								<tr>
									<th class="info">No.</th>
									<th class="info">YH NO.</th>
									<th class="info">有效日期从</th>
									<th class="info">有效日期至</th>
									<th class="info">基础价</th>
									<th class="info">加螺钉</th>
									<th class="info">加喷漆</th>
									<th class="info">导入状态</th>
									<th class="info">备注</th>
								</tr>
								<tr class="trheight">
									<td></td>
									<td></td>
									<td></td>
									<td></td>
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