<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>价格表查询</title>
<link href="css/bootstrap.min.css" type="text/css" rel="stylesheet" />
<link href="css/PriceQuery.css" type="text/css" rel="stylesheet" />
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
					<div class="col-md-2 texthead">工厂型号  </div>
					<div class="col-md-10">
						<div class="ax_text_field">
							<input id="Factory_model" type="text" name="Factory_model"
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
				       <td>
				          <input class="longButton" type="submit" name="Query_modification"
							value="查询/编辑" onclick="firm()" />
				       </td>
				       <td width="10px"></td>
				       <td>
				          <input class="longButton" type="submit"
							name="save" value="新增" />
				       </td>
				        <td width="10px"></td>
				       <td>
				          <input class="longButton"
							type="submit" name="New_configuration" value="保存" />
				       </td>
				         <td width="50px"></td>
				       <td>
				          <input class="longButton"
							type="submit" name="ExportEXCEL" value="导出EXCEL" />
				       </td>
				        <td width="10px"></td>
				       <td>
				          <input class="longButton"
							type="submit" name="ImportEXCEL" value="导入EXCEL" onclick="funurl()" />
				       </td>				     
				    </tr>
				</table>							  													
				           <script type="text/javascript">
				                 function funurl(){
				                	 location.href ='ImportPrice.jsp';
				                 }
				                 
									function firm() {//利用对话框返回的值 （true 或者 false）
										if (confirm("你确定选择要查询？")) {//如果是true ，那么就响应价格表配置的 " 查询  "方法.否则,弹出下一个提示框
											out.ptintln("查询!");
										}
										if (confirm("你确定选择编辑吗?")) {//如果是true ，那么就响应价格表配置的 " 修改  "方法.否则,关闭提示框
											out.ptintln("编辑!");
										}
									}
						</script>			
					</div>
				</div>
			</div>
			<br>
			<div id="redline" class="row5">
				<img class="img" src="images/redline.png" alt="" />
			</div>
			<div id="contentBottom">
               <div class="show">
               
               <div id="tablesize">
			<table class="table table-bordered table-hover">
				<tr>
					<th class="info">No.</th>
					<th class="info">工厂型号</th>
					<th class="info">有效日期从</th>
					<th class="info">有效日期至</th>
					<th class="info">基础价</th>
					<th class="info">加喷漆</th>
					<th class="info">加螺钉</th>
					<th class="info">螺钉价格</th>
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