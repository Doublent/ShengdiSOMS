<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>查看客户</title>
<link href="css/bootstrap.min.css" type="text/css" rel="stylesheet">
<link href="css/customer.css" type="text/css" rel="stylesheet">
<script src="js/jquery-2.1.1.min.js"></script>

</head>
<body>
	<div class="container">
		<div class="row col-md-12">
			<div class="divI">
				<!-- 				<form action="customercreate.action" method="post"> -->
				<s:iterator value="#request.customersInfo" status="st">
					<form action="customerread.action" method="post">
						<div class="row div1">
							<div class="col-md-1 texthead">客户名称</div>
							<div class="col-md-2">
								<div class="ax_text_field">
									<input type="text" name="cust_name" value="${cust_name }" />
								</div>
							</div>
							<div class="col-md-1 texthead">类型</div>
							<div class="col-md-2">
								<div class="ax_text_field">
									<input type="text" name="type" value="${type }" />
								</div>
							</div>
							<div class="col-md-1 texthead">集团公司</div>
							<div class="col-md-5" style="width: auto;">
								<div class="ax_text_field">
									<input type="text" name="group_company"
										value="${group_company }" />
								</div>
							</div>
						</div>

						<div class="row div1">
							<div class="col-md-1 texthead">客户简称</div>
							<div class="col-md-2">
								<div class="ax_text_field">
									<input type="text" name="cust_code" value="${cust_code }" />
								</div>
							</div>
							<div class="col-md-1 texthead">状态</div>
							<div class="col-md-2">
								<div class="ax_text_field">
									<input type="text" value="${status }" name="status" />
								</div>
							</div>
							<div class="col-md-1 texthead">总公司</div>
							<div class="col-md-5" style="width: auto;">
								<div class="ax_text_field">
									<input type="text" name="corporation" value="${corporation }" />
								</div>
							</div>
						</div>
						<br> <br>


						<div class="row div1">
							<div id="div2" class="ax_html_button">
								<input class="longButton" type="submit" value="查询" />
								<!-- 							<button class="longButton" type="button" -->
								<!-- 								onclick="location.href='customerInquiry.jsp'">查询</button> -->
								<button class="longButton" type="button"
									onclick="location.href='customeraddCustomer.action'">新建</button>
							</div>
						</div>

					</form>

					<!-- 	----------------	红线划分	----------------	-->
					<div class="row div1">
						<img class="img redline" src="images/redline.png" />
					</div>


					<!-- 	地址信息	-->
					<p>
						<span style="text-decoration: underline;">地址信息</span>
					</p>
					<div class="divheight">
						<div class="col-md-2 col-md-offset-1 text">*国家</div>
						<div class="col-md-9 inputtext">
							<select style="width: 200px;" name="country">
								
								<option value="Afghanistan">Afghanistan</option>
								<option value="Albania">Albania</option>
								<option value="Argentina">Argentina</option>
								<option value="Australia">Australia</option>
								<option value="Austria">Austria</option>
								<option value="Bahrain">Bahrain</option>
								<option value="Belgium">Belgium</option>
								<option value="Brazil">Brazil</option>
								<option value="Bulgaria">Bulgaria</option>
								<option value="Chile">Chile</option>
								<option value="China">China</option>
								<option value="Colombia">Colombia</option>
								<option value="Croatia">Croatia</option>
								<option value="Cyprus">Cyprus</option>
								<option value="Czech Republic">Czech Republic</option>
								<option value="Denmark">Denmark</option>
								<option value="Ecuador">Ecuador</option>
								<option value="Egypt">Egypt</option>
								<option value="El Salvador">El Salvador</option>
								<option value="Estonia">Estonia</option>
								<option value="Faroe Islands">Faroe Islands</option>
								<option value="Fiji">Fiji</option>
								<option value="Finland">Finland</option>
								<option value="FYROM">FYROM</option>
								<option value="Germany">Germany</option>
								<option value="Ghana">Ghana</option>
								<option value="Greece">Greece</option>
								<option value="Guatemala">Guatemala</option>
								<option value="Guernsey">Guernsey</option>
								<option value="Honduras">Honduras</option>
								<option value="Hong Kong">Hong Kong</option>
								<option value="Hungary">Hungary</option>
								<option value="Iceland">Iceland</option>
								<option value="India">India</option>
								<option value="Indonesia">Indonesia</option>
								<option value="Ireland">Ireland</option>
								<option value="Italy">Italy</option>
								<option value="Jamaica">Jamaica</option>
								<option value="Jersey">Jersey</option>
								<option value="Kenya">Kenya</option>
								<option value="Kuwait">Kuwait</option>
								<option value="Latvia">Latvia</option>
								<option value="Lithuania">Lithuania</option>
								<option value="France">France</option>
								<option value="Luxembourg">Luxembourg</option>
								<option value="Malaysia">Malaysia</option>
								<option value="Malta">Malta</option>
								<option value="Mexico">Mexico</option>
								<option value="Netherlands">Netherlands</option>
								<option value="New Zealand">New Zealand</option>
								<option value="Nicaragua">Nicaragua</option>
								<option value="Norway">Norway</option>
								<option value="Paraguay">Paraguay</option>
								<option value="Peru">Peru</option>
								<option value="Poland">Poland</option>
								<option value="Portugal">Portugal</option>
								<option value="Romania">Romania</option>
								<option value="Serbia">Serbia</option>
								<option value="Singapore">Singapore</option>
								<option value="Slovenia">Slovenia</option>
								<option value="South Africa">South Africa</option>
								<option value="Spain">Spain</option>
								<option value="Sri Lanka">Sri Lanka</option>
								<option value="Sweden">Sweden</option>
								<option value="Switzerland">Switzerland</option>
								<option value="Turkey">Turkey</option>
								<option value="United Kingdom">United Kingdom</option>
								<option value="Uruguay">Uruguay</option>
								<option selected value="USA">USA</option>
								<option selected="selected">${country }</option>
							</select>
						</div>
					</div>
					<div class="divheight">
						<div class="col-md-2 col-md-offset-1 text">*目的地</div>
						<div class="col-md-9 inputtext">
							<input type="text" name="port_of_destination" readonly="readonly"
								value="${port_of_destination }" />
						</div>
					</div>
					<div class="divheight">
						<div class="col-md-2 col-md-offset-1 text">地址行1</div>
						<div class="col-md-9 inputtext">
							<input class="longtext" type="text" name="address1"
								readonly="readonly" value="${address1 }" />
						</div>
					</div>
					<div class="divheight">
						<div class="col-md-2 col-md-offset-1 text">地址行2</div>
						<div class="col-md-9 inputtext">
							<input class="longtext" type="text" name="address2"
								readonly="readonly" value="${address2 }" />
						</div>
					</div>
					<div class="divheight">
						<div class="col-md-2 col-md-offset-1 text">邮编</div>
						<div class="col-md-9 inputtext">
							<input type="text" name="postcode" value="${postcode }"
								readonly="readonly" />
						</div>
					</div>
					<div class="divheight">
						<div class="col-md-2 col-md-offset-1 text">*唛头</div>
						<div class="col-md-9 inputtext heighttextarea">
							<textarea rows="4" cols="30" name="shipping_mark"
								readonly="readonly">${shipping_mark }</textarea>
						</div>
					</div>
					<div class="divheight">
						<div class="col-md-2 col-md-offset-1 text">状态</div>
						<div class="col-md-9 inputtext">
							<input type="text" name="status" readonly="readonly"
								value="${status }" />
						</div>
					</div>
					<br>
					<br>
					<br>
					<div class="row div1">
						<img class="img redline" src="images/redline.png" />
					</div>
					<!-- 付款信息 -->

					<p>
						<span style="text-decoration: underline;">付款信息</span>
					</p>
					<div class="divheight">
						<div class="col-md-2 col-md-offset-1 text">所属发票组</div>
						<div class="col-md-2 inputtext">
							<input type="text" name="invoice_group" readonly="readonly"
								value="${invoice_group }" />
						</div>
<!-- 					</div> -->
<!-- 					<div class="divheight"> -->
						<div class="col-md-2 col-md-offset-1 text">*通用加价条款</div>
						<div class="col-md-4 inputtext">
<%-- 							<input type="text" name="markup_name" readonly="readonly" value="${markup_name }" /> --%>
							<select name="markup_name" >
									<option value="${markup_name }">${markup_name }</option>
									<s:iterator value="#request.normalDiscount">
										<option value="${discount_name }">${discount_name }</option>
									</s:iterator>
								</select>
						</div>
					</div>
					<div class="divheight">
						<div class="col-md-2 col-md-offset-1 text">*结算货币</div>
						<div class="col-md-2 inputtext">
							<input type="text" name="currency" readonly="readonly"
								value="${currency }" />
						</div>
<!-- 					</div> -->
<!-- 					<div class="divheight"> -->
						<div class="col-md-2 col-md-offset-1 text">*一般折扣</div>
						<div class="col-md-4 inputtext">
<%-- 							<input type="text" name="discount_name" readonly="readonly" value="${discount_name }" /> --%>
							<select name="discount_name">
									<option value="${discount_name }">${discount_name }</option>
									<s:iterator value="#request.normalDiscount">
										<option value="${discount_name }">${discount_name }</option>
									</s:iterator>
							</select>
						</div>
					</div>
					<div class="divheight">
						<div class="col-md-2 col-md-offset-1 text">*付款方式</div>
						<div class="col-md-9 inputtext heighttextarea">
							<textarea rows="4" cols="40" name="payment_method"
								readonly="readonly">${payment_method }</textarea>
						</div>
					</div>
					<div class="divheight">
						<div class="col-md-2 col-md-offset-1 text">价格条款1</div>
						<div class="col-md-9 inputtext heighttextarea">
							<textarea rows="4" cols="40" name="price_term1"
								readonly="readonly">${price_term1 }</textarea>
						</div>
					</div>
					<div class="divheight">
						<div class="col-md-2 col-md-offset-1 text">价格条款2</div>
						<div class="col-md-9 inputtext heighttextarea">
							<textarea rows="4" cols="40" name="price_term2"
								readonly="readonly">${price_term2 }</textarea>
						</div>
					</div>
					<div class="divheight">
						<div class="col-md-2 col-md-offset-1 text">价格条款3</div>
						<div class="col-md-9 inputtext heighttextarea">
							<textarea rows="4" cols="40" name="price_term3"
								readonly="readonly">${price_term3 }</textarea>
						</div>
					</div>
					<br>
					<br>
					<br>
					<br>
					<br>
					<div class="row div1">
						<img class="img redline" src="images/redline.png" />
					</div>
					<!-- 组织信息 -->

					<p>
						<span style="text-decoration: underline;">组织信息</span>
					</p>
					<div class="divheight">
						<div class="col-md-2 col-md-offset-1 text">*所属TEAM</div>
						<div class="col-md-9 inputtext">
							<input type="text" name="Market_area" readonly="readonly"
								value="${Market_area }" />
						</div>
					</div>
					<div class="divheight">
						<div class="col-md-2 col-md-offset-1 text">*业务经理</div>
						<div class="col-md-9 inputtext">
							<input type="text" name="business_manager" readonly="readonly"
								value="${business_manager }" />
						</div>
					</div>
					<div class="divheight">
						<div class="col-md-2 col-md-offset-1 text">*业务助理</div>
						<div class="col-md-9 inputtext">
							<input type="text" name="business_assistant" readonly="readonly"
								value="${business_assistant }" />
						</div>
					</div>
					<br>
					<br>
					<div class="row div1">
						<img class="img redline" src="images/redline.png" />
					</div>

				</s:iterator>

				<!-- 联系人信息 -->
				<p>
					<span style="text-decoration: underline;">联系人信息</span>
				</p>
				<s:iterator value="#request.custContactors">
					<div class="divheight">
						<div class="col-md-2 col-md-offset-1 text">发件人邮箱</div>
						<div class="col-md-9 inputtext">
							<input class="longtext" type="text" name="mailFrom"
								readonly="readonly" value="${mailFrom }" />
						</div>
					</div>
					<br>
					<div class="divheight">
						<div class="col-md-2 col-md-offset-1 text">Pre PO 收件人</div>
						<div class="col-md-9 inputtext">
							<input class="longtext" type="text" name="prePO_MailTo"
								readonly="readonly" value="${prePO_MailTo }" />
						</div>
					</div>
					<div class="divheight">
						<div class="col-md-2 col-md-offset-1 text">PO 收件人</div>
						<div class="col-md-9 inputtext">
							<input class="longtext" type="text" name="po_MailTo"
								readonly="readonly" value="${po_MailTo }" />
						</div>
					</div>
					<div class="divheight">
						<div class="col-md-2 col-md-offset-1 text">OC/PI收件人</div>
						<div class="col-md-9 inputtext">
							<input class="longtext" type="text" name="ocpi_MailTo"
								readonly="readonly" value="${ocpi_MailTo }" />
						</div>
					</div>
					<div class="divheight">
						<div class="col-md-3 text">INV/Packing list 收件人</div>
						<div class="col-md-9 inputtext">
							<input class="longtext" type="text" name="inv_Pklist_mailto"
								readonly="readonly" value="${inv_Pklist_mailto }" />
						</div>
					</div>
				</s:iterator>
			</div>
		</div>
	</div>
</body>
</html>