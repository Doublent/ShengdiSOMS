package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addCustomer_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\r\n");
      out.write("<title>新建客户</title>\r\n");
      out.write("<link href=\"css/bootstrap.min.css\" type=\"text/css\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"css/customer.css\" type=\"text/css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\t\t<div class=\"row col-md-12\">\r\n");
      out.write("\t\t\t<div class=\"divI\">\r\n");
      out.write("\t\t\t\t<form action=\"customercreate.action\" method=\"post\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"row div1\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-1 texthead\">客户名称</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-2\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"ax_text_field\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" name=\"cust_name\" />\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-1 texthead\">类型</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-2\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"ax_text_field\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" name=\"type\" />\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-1 texthead\">集团公司</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-5\" style=\"width: auto;\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"ax_text_field\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" name=\"group_company\" />\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"row div1\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-1 texthead\">客户简称</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-2\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"ax_text_field\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" name=\"cust_code\" />\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-1 texthead\">状态</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-2\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"ax_text_field\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" value=\"待确认\" disabled=\"disabled\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tstyle=\"color: gray;\" /> <input type=\"hidden\" value=\"待确认\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tname=\"status\" />\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-1 texthead\">总公司</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-5\" style=\"width: auto;\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"ax_text_field\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" name=\"corporation\" />\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<br> <br>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"row div1\">\r\n");
      out.write("\t\t\t\t\t\t<div id=\"div2\" class=\"ax_html_button\">\r\n");
      out.write("\t\t\t\t\t\t\t<button class=\"longButton\" type=\"button\"\r\n");
      out.write("\t\t\t\t\t\t\t\tonclick=\"location.href='customerreadAll.action'\">查询</button>\r\n");
      out.write("\t\t\t\t\t\t\t<button class=\"longButton\" type=\"button\"\r\n");
      out.write("\t\t\t\t\t\t\t\tonclick=\"location.href='addCustomer.jsp'\">新建</button>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<!-- \t----------------\t红线划分\t----------------\t-->\r\n");
      out.write("\t\t\t\t\t<div class=\"row div1\">\r\n");
      out.write("\t\t\t\t\t\t<img class=\"img redline\" src=\"images/redline.png\" />\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<!-- \t地址信息\t-->\r\n");
      out.write("\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t<span style=\"text-decoration: underline;\">地址信息</span>\r\n");
      out.write("\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t<div class=\"divheight\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-2 col-md-offset-1 text\">*国家</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-9 inputtext\">\r\n");
      out.write("\t\t\t\t\t\t\t<select style=\"width: auto;\" name=\"country\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<option selected=\"selected\" value=\"1\">123</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option style=\"width: 200px\" value=\"2\">12311</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option style=\"width: 200px\" value=\"3\">123</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option style=\"width: 200px\" value=\"4\">123</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option style=\"width: 200px\" value=\"5\">123</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option style=\"width: 200px\" value=\"6\">12311111111111111</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option style=\"width: 200px\" value=\"7\">123</option>\r\n");
      out.write("\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"divheight\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-2 col-md-offset-1 text\">*目的地</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-9 inputtext\">\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" name=\"port_of_destination\" />\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"divheight\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-2 col-md-offset-1 text\">地址行1</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-9 inputtext\">\r\n");
      out.write("\t\t\t\t\t\t\t<input class=\"longtext\" type=\"text\" name=\"address1\" />\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"divheight\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-2 col-md-offset-1 text\">地址行2</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-9 inputtext\">\r\n");
      out.write("\t\t\t\t\t\t\t<input class=\"longtext\" type=\"text\" name=\"address2\" />\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"divheight\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-2 col-md-offset-1 text\">邮编</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-9 inputtext\">\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" name=\"postcode\" />\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"divheight\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-2 col-md-offset-1 text\">*唛头</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-9 inputtext heighttextarea\">\r\n");
      out.write("\t\t\t\t\t\t\t<textarea rows=\"4\" cols=\"30\" name=\"shipping_mark\"></textarea>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"divheight\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-2 col-md-offset-1 text\">状态</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-9 inputtext\">\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" value=\"待确认\" disabled=\"disabled\"\r\n");
      out.write("\t\t\t\t\t\t\t\tstyle=\"color: gray;\" name=\"status\" />\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<br> <br> <br>\r\n");
      out.write("\t\t\t\t\t<div class=\"row div1\">\r\n");
      out.write("\t\t\t\t\t\t<img class=\"img redline\" src=\"images/redline.png\" />\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<!-- 付款信息 -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t<span style=\"text-decoration: underline;\">付款信息</span>\r\n");
      out.write("\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t<div class=\"divheight\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-2 col-md-offset-1 text\">所属发票组</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-9 inputtext\">\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" name=\"invoice_group\" />\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"divheight\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-2 col-md-offset-1 text\">*通用加价条款</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-9 inputtext\">\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" name=\"markup_name\" />\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"divheight\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-2 col-md-offset-1 text\">*结算货币</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-9 inputtext\">\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" name=\"currency\" />\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"divheight\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-2 col-md-offset-1 text\">*一般折扣</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-9 inputtext\">\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" name=\"discount_name\" />\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"divheight\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-2 col-md-offset-1 text\">*付款方式</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-9 inputtext heighttextarea\">\r\n");
      out.write("\t\t\t\t\t\t\t<textarea rows=\"4\" cols=\"40\" name=\"payment_method\"></textarea>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"divheight\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-2 col-md-offset-1 text\">价格条款1</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-9 inputtext heighttextarea\">\r\n");
      out.write("\t\t\t\t\t\t\t<textarea rows=\"4\" cols=\"40\" name=\"price_term1\"></textarea>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"divheight\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-2 col-md-offset-1 text\">价格条款2</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-9 inputtext heighttextarea\">\r\n");
      out.write("\t\t\t\t\t\t\t<textarea rows=\"4\" cols=\"40\" name=\"price_term2\"></textarea>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"divheight\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-2 col-md-offset-1 text\">价格条款3</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-9 inputtext heighttextarea\">\r\n");
      out.write("\t\t\t\t\t\t\t<textarea rows=\"4\" cols=\"40\" name=\"price_term3\"></textarea>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<br> <br> <br> <br> <br>\r\n");
      out.write("\t\t\t\t\t<div class=\"row div1\">\r\n");
      out.write("\t\t\t\t\t\t<img class=\"img redline\" src=\"images/redline.png\" />\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<!-- 组织信息 -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t<span style=\"text-decoration: underline;\">组织信息</span>\r\n");
      out.write("\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t<div class=\"divheight\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-2 col-md-offset-1 text\">*所属TEAM</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-9 inputtext\">\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" name=\"Market_area\" />\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"divheight\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-2 col-md-offset-1 text\">*业务经理</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-9 inputtext\">\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" name=\"business_manager\" />\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"divheight\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-2 col-md-offset-1 text\">*业务助理</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-9 inputtext\">\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" name=\"business_assistant\" />\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<br> <br>\r\n");
      out.write("\t\t\t\t\t<div class=\"row div1\">\r\n");
      out.write("\t\t\t\t\t\t<img class=\"img redline\" src=\"images/redline.png\" />\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<!-- 联系人信息 -->\r\n");
      out.write("\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t<span style=\"text-decoration: underline;\">联系人信息</span>\r\n");
      out.write("\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t<div class=\"divheight\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-2 col-md-offset-1 text\">发件人邮箱</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-9 inputtext\">\r\n");
      out.write("\t\t\t\t\t\t\t<input class=\"longtext\" type=\"text\" name=\"mailFrom\" />\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t<div class=\"divheight\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-2 col-md-offset-1 text\">Pre PO 收件人</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-9 inputtext\">\r\n");
      out.write("\t\t\t\t\t\t\t<input class=\"longtext\" type=\"text\" name=\"prePO_MailTo\" />\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"divheight\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-2 col-md-offset-1 text\">PO 收件人</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-9 inputtext\">\r\n");
      out.write("\t\t\t\t\t\t\t<input class=\"longtext\" type=\"text\" name=\"po_MailTo\" />\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"divheight\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-2 col-md-offset-1 text\">OC/PI收件人</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-9 inputtext\">\r\n");
      out.write("\t\t\t\t\t\t\t<input class=\"longtext\" type=\"text\" name=\"ocpi_MailTo\" />\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"divheight\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-3 text\">INV/Packing list 收件人</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-9 inputtext\">\r\n");
      out.write("\t\t\t\t\t\t\t<input class=\"longtext\" type=\"text\" name=\"inv_Pklist_mailto\" />\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"divmiddle\">\r\n");
      out.write("\t\t\t\t\t\t<input class=\"longButton\" type=\"submit\" value=\"确认\">\r\n");
      out.write("\t\t\t\t\t\t<!-- \t\t\t\t\t\t\t\t<input class=\"longButton\" type=\"button\" value=\"取消\"> -->\r\n");
      out.write("\t\t\t\t\t\t<button class=\"longButton\" type=\"button\"\r\n");
      out.write("\t\t\t\t\t\t\tonclick=\"location.href='customerreadAll.action'\">取消</button>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
