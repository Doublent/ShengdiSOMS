package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class checkCustomer_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fiterator_0026_005fvalue_005fstatus;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fiterator_0026_005fvalue;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fs_005fiterator_0026_005fvalue_005fstatus = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005fiterator_0026_005fvalue = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fs_005fiterator_0026_005fvalue_005fstatus.release();
    _005fjspx_005ftagPool_005fs_005fiterator_0026_005fvalue.release();
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
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\r\n");
      out.write("<title>查看客户</title>\r\n");
      out.write("<link href=\"css/bootstrap.min.css\" type=\"text/css\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"css/customer.css\" type=\"text/css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\t\t<div class=\"row col-md-12\">\r\n");
      out.write("\t\t\t<div class=\"divI\">\r\n");
      out.write("\t\t\t\t<!-- \t\t\t\t<form action=\"customercreate.action\" method=\"post\"> -->\r\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_s_005fiterator_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<!-- 联系人信息 -->\r\n");
      out.write("\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t<span style=\"text-decoration: underline;\">联系人信息</span>\r\n");
      out.write("\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_s_005fiterator_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
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

  private boolean _jspx_meth_s_005fiterator_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:iterator
    org.apache.struts2.views.jsp.IteratorTag _jspx_th_s_005fiterator_005f0 = (org.apache.struts2.views.jsp.IteratorTag) _005fjspx_005ftagPool_005fs_005fiterator_0026_005fvalue_005fstatus.get(org.apache.struts2.views.jsp.IteratorTag.class);
    _jspx_th_s_005fiterator_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005fiterator_005f0.setParent(null);
    // /checkCustomer.jsp(19,4) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fiterator_005f0.setValue("#request.customersInfo");
    // /checkCustomer.jsp(19,4) name = status type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fiterator_005f0.setStatus("st");
    int _jspx_eval_s_005fiterator_005f0 = _jspx_th_s_005fiterator_005f0.doStartTag();
    if (_jspx_eval_s_005fiterator_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fiterator_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fiterator_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fiterator_005f0.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t<form action=\"customerread.action\" method=\"post\">\r\n");
        out.write("\t\t\t\t\t\t<div class=\"row div1\">\r\n");
        out.write("\t\t\t\t\t\t\t<div class=\"col-md-1 texthead\">客户名称</div>\r\n");
        out.write("\t\t\t\t\t\t\t<div class=\"col-md-2\">\r\n");
        out.write("\t\t\t\t\t\t\t\t<div class=\"ax_text_field\">\r\n");
        out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"cust_name\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cust_name }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" />\r\n");
        out.write("\t\t\t\t\t\t\t\t</div>\r\n");
        out.write("\t\t\t\t\t\t\t</div>\r\n");
        out.write("\t\t\t\t\t\t\t<div class=\"col-md-1 texthead\">类型</div>\r\n");
        out.write("\t\t\t\t\t\t\t<div class=\"col-md-2\">\r\n");
        out.write("\t\t\t\t\t\t\t\t<div class=\"ax_text_field\">\r\n");
        out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"type\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${type }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" />\r\n");
        out.write("\t\t\t\t\t\t\t\t</div>\r\n");
        out.write("\t\t\t\t\t\t\t</div>\r\n");
        out.write("\t\t\t\t\t\t\t<div class=\"col-md-1 texthead\">集团公司</div>\r\n");
        out.write("\t\t\t\t\t\t\t<div class=\"col-md-5\" style=\"width: auto;\">\r\n");
        out.write("\t\t\t\t\t\t\t\t<div class=\"ax_text_field\">\r\n");
        out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"group_company\"\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\tvalue=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${group_company }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" />\r\n");
        out.write("\t\t\t\t\t\t\t\t</div>\r\n");
        out.write("\t\t\t\t\t\t\t</div>\r\n");
        out.write("\t\t\t\t\t\t</div>\r\n");
        out.write("\r\n");
        out.write("\t\t\t\t\t\t<div class=\"row div1\">\r\n");
        out.write("\t\t\t\t\t\t\t<div class=\"col-md-1 texthead\">客户简称</div>\r\n");
        out.write("\t\t\t\t\t\t\t<div class=\"col-md-2\">\r\n");
        out.write("\t\t\t\t\t\t\t\t<div class=\"ax_text_field\">\r\n");
        out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"cust_code\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cust_code }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" />\r\n");
        out.write("\t\t\t\t\t\t\t\t</div>\r\n");
        out.write("\t\t\t\t\t\t\t</div>\r\n");
        out.write("\t\t\t\t\t\t\t<div class=\"col-md-1 texthead\">状态</div>\r\n");
        out.write("\t\t\t\t\t\t\t<div class=\"col-md-2\">\r\n");
        out.write("\t\t\t\t\t\t\t\t<div class=\"ax_text_field\">\r\n");
        out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${status }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" name=\"status\" />\r\n");
        out.write("\t\t\t\t\t\t\t\t</div>\r\n");
        out.write("\t\t\t\t\t\t\t</div>\r\n");
        out.write("\t\t\t\t\t\t\t<div class=\"col-md-1 texthead\">总公司</div>\r\n");
        out.write("\t\t\t\t\t\t\t<div class=\"col-md-5\" style=\"width: auto;\">\r\n");
        out.write("\t\t\t\t\t\t\t\t<div class=\"ax_text_field\">\r\n");
        out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"corporation\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${corporation }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" />\r\n");
        out.write("\t\t\t\t\t\t\t\t</div>\r\n");
        out.write("\t\t\t\t\t\t\t</div>\r\n");
        out.write("\t\t\t\t\t\t</div>\r\n");
        out.write("\t\t\t\t\t\t<br> <br>\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("\t\t\t\t\t\t<div class=\"row div1\">\r\n");
        out.write("\t\t\t\t\t\t\t<div id=\"div2\" class=\"ax_html_button\">\r\n");
        out.write("\t\t\t\t\t\t\t\t<input class=\"longButton\" type=\"submit\" value=\"查询\" />\r\n");
        out.write("\t\t\t\t\t\t\t\t<!-- \t\t\t\t\t\t\t<button class=\"longButton\" type=\"button\" -->\r\n");
        out.write("\t\t\t\t\t\t\t\t<!-- \t\t\t\t\t\t\t\tonclick=\"location.href='customerInquiry.jsp'\">查询</button> -->\r\n");
        out.write("\t\t\t\t\t\t\t\t<button class=\"longButton\" type=\"button\"\r\n");
        out.write("\t\t\t\t\t\t\t\t\tonclick=\"location.href='addCustomer.jsp'\">新建</button>\r\n");
        out.write("\t\t\t\t\t\t\t</div>\r\n");
        out.write("\t\t\t\t\t\t</div>\r\n");
        out.write("\r\n");
        out.write("\t\t\t\t\t</form>\r\n");
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
        out.write("\t\t\t\t\t\t\t\t<option selected=\"selected\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${country }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("</option>\r\n");
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
        out.write("\t\t\t\t\t\t\t<input type=\"text\" name=\"port_of_destination\" readonly=\"readonly\"\r\n");
        out.write("\t\t\t\t\t\t\t\tvalue=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${port_of_destination }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" />\r\n");
        out.write("\t\t\t\t\t\t</div>\r\n");
        out.write("\t\t\t\t\t</div>\r\n");
        out.write("\t\t\t\t\t<div class=\"divheight\">\r\n");
        out.write("\t\t\t\t\t\t<div class=\"col-md-2 col-md-offset-1 text\">地址行1</div>\r\n");
        out.write("\t\t\t\t\t\t<div class=\"col-md-9 inputtext\">\r\n");
        out.write("\t\t\t\t\t\t\t<input class=\"longtext\" type=\"text\" name=\"address1\"\r\n");
        out.write("\t\t\t\t\t\t\t\treadonly=\"readonly\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${address1 }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" />\r\n");
        out.write("\t\t\t\t\t\t</div>\r\n");
        out.write("\t\t\t\t\t</div>\r\n");
        out.write("\t\t\t\t\t<div class=\"divheight\">\r\n");
        out.write("\t\t\t\t\t\t<div class=\"col-md-2 col-md-offset-1 text\">地址行2</div>\r\n");
        out.write("\t\t\t\t\t\t<div class=\"col-md-9 inputtext\">\r\n");
        out.write("\t\t\t\t\t\t\t<input class=\"longtext\" type=\"text\" name=\"address2\"\r\n");
        out.write("\t\t\t\t\t\t\t\treadonly=\"readonly\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${address2 }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" />\r\n");
        out.write("\t\t\t\t\t\t</div>\r\n");
        out.write("\t\t\t\t\t</div>\r\n");
        out.write("\t\t\t\t\t<div class=\"divheight\">\r\n");
        out.write("\t\t\t\t\t\t<div class=\"col-md-2 col-md-offset-1 text\">邮编</div>\r\n");
        out.write("\t\t\t\t\t\t<div class=\"col-md-9 inputtext\">\r\n");
        out.write("\t\t\t\t\t\t\t<input type=\"text\" name=\"postcode\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${postcode }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\"\r\n");
        out.write("\t\t\t\t\t\t\t\treadonly=\"readonly\" />\r\n");
        out.write("\t\t\t\t\t\t</div>\r\n");
        out.write("\t\t\t\t\t</div>\r\n");
        out.write("\t\t\t\t\t<div class=\"divheight\">\r\n");
        out.write("\t\t\t\t\t\t<div class=\"col-md-2 col-md-offset-1 text\">*唛头</div>\r\n");
        out.write("\t\t\t\t\t\t<div class=\"col-md-9 inputtext heighttextarea\">\r\n");
        out.write("\t\t\t\t\t\t\t<textarea rows=\"4\" cols=\"30\" name=\"shipping_mark\"\r\n");
        out.write("\t\t\t\t\t\t\t\treadonly=\"readonly\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${shipping_mark }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("</textarea>\r\n");
        out.write("\t\t\t\t\t\t</div>\r\n");
        out.write("\t\t\t\t\t</div>\r\n");
        out.write("\t\t\t\t\t<div class=\"divheight\">\r\n");
        out.write("\t\t\t\t\t\t<div class=\"col-md-2 col-md-offset-1 text\">状态</div>\r\n");
        out.write("\t\t\t\t\t\t<div class=\"col-md-9 inputtext\">\r\n");
        out.write("\t\t\t\t\t\t\t<input type=\"text\" name=\"status\" readonly=\"readonly\"\r\n");
        out.write("\t\t\t\t\t\t\t\tvalue=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${status }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" />\r\n");
        out.write("\t\t\t\t\t\t</div>\r\n");
        out.write("\t\t\t\t\t</div>\r\n");
        out.write("\t\t\t\t\t<br>\r\n");
        out.write("\t\t\t\t\t<br>\r\n");
        out.write("\t\t\t\t\t<br>\r\n");
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
        out.write("\t\t\t\t\t\t\t<input type=\"text\" name=\"invoice_group\" readonly=\"readonly\"\r\n");
        out.write("\t\t\t\t\t\t\t\tvalue=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${invoice_group }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" />\r\n");
        out.write("\t\t\t\t\t\t</div>\r\n");
        out.write("\t\t\t\t\t</div>\r\n");
        out.write("\t\t\t\t\t<div class=\"divheight\">\r\n");
        out.write("\t\t\t\t\t\t<div class=\"col-md-2 col-md-offset-1 text\">*通用加价条款</div>\r\n");
        out.write("\t\t\t\t\t\t<div class=\"col-md-9 inputtext\">\r\n");
        out.write("\t\t\t\t\t\t\t<input type=\"text\" name=\"markup_name\" readonly=\"readonly\"\r\n");
        out.write("\t\t\t\t\t\t\t\tvalue=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${markup_name }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" />\r\n");
        out.write("\t\t\t\t\t\t</div>\r\n");
        out.write("\t\t\t\t\t</div>\r\n");
        out.write("\t\t\t\t\t<div class=\"divheight\">\r\n");
        out.write("\t\t\t\t\t\t<div class=\"col-md-2 col-md-offset-1 text\">*结算货币</div>\r\n");
        out.write("\t\t\t\t\t\t<div class=\"col-md-9 inputtext\">\r\n");
        out.write("\t\t\t\t\t\t\t<input type=\"text\" name=\"currency\" readonly=\"readonly\"\r\n");
        out.write("\t\t\t\t\t\t\t\tvalue=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${currency }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" />\r\n");
        out.write("\t\t\t\t\t\t</div>\r\n");
        out.write("\t\t\t\t\t</div>\r\n");
        out.write("\t\t\t\t\t<div class=\"divheight\">\r\n");
        out.write("\t\t\t\t\t\t<div class=\"col-md-2 col-md-offset-1 text\">*一般折扣</div>\r\n");
        out.write("\t\t\t\t\t\t<div class=\"col-md-9 inputtext\">\r\n");
        out.write("\t\t\t\t\t\t\t<input type=\"text\" name=\"discount_name\" readonly=\"readonly\"\r\n");
        out.write("\t\t\t\t\t\t\t\tvalue=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${discount_name }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" />\r\n");
        out.write("\t\t\t\t\t\t</div>\r\n");
        out.write("\t\t\t\t\t</div>\r\n");
        out.write("\t\t\t\t\t<div class=\"divheight\">\r\n");
        out.write("\t\t\t\t\t\t<div class=\"col-md-2 col-md-offset-1 text\">*付款方式</div>\r\n");
        out.write("\t\t\t\t\t\t<div class=\"col-md-9 inputtext heighttextarea\">\r\n");
        out.write("\t\t\t\t\t\t\t<textarea rows=\"4\" cols=\"40\" name=\"payment_method\"\r\n");
        out.write("\t\t\t\t\t\t\t\treadonly=\"readonly\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${payment_method }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("</textarea>\r\n");
        out.write("\t\t\t\t\t\t</div>\r\n");
        out.write("\t\t\t\t\t</div>\r\n");
        out.write("\t\t\t\t\t<div class=\"divheight\">\r\n");
        out.write("\t\t\t\t\t\t<div class=\"col-md-2 col-md-offset-1 text\">价格条款1</div>\r\n");
        out.write("\t\t\t\t\t\t<div class=\"col-md-9 inputtext heighttextarea\">\r\n");
        out.write("\t\t\t\t\t\t\t<textarea rows=\"4\" cols=\"40\" name=\"price_term1\"\r\n");
        out.write("\t\t\t\t\t\t\t\treadonly=\"readonly\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${price_term1 }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("</textarea>\r\n");
        out.write("\t\t\t\t\t\t</div>\r\n");
        out.write("\t\t\t\t\t</div>\r\n");
        out.write("\t\t\t\t\t<div class=\"divheight\">\r\n");
        out.write("\t\t\t\t\t\t<div class=\"col-md-2 col-md-offset-1 text\">价格条款2</div>\r\n");
        out.write("\t\t\t\t\t\t<div class=\"col-md-9 inputtext heighttextarea\">\r\n");
        out.write("\t\t\t\t\t\t\t<textarea rows=\"4\" cols=\"40\" name=\"price_term2\"\r\n");
        out.write("\t\t\t\t\t\t\t\treadonly=\"readonly\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${price_term2 }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("</textarea>\r\n");
        out.write("\t\t\t\t\t\t</div>\r\n");
        out.write("\t\t\t\t\t</div>\r\n");
        out.write("\t\t\t\t\t<div class=\"divheight\">\r\n");
        out.write("\t\t\t\t\t\t<div class=\"col-md-2 col-md-offset-1 text\">价格条款3</div>\r\n");
        out.write("\t\t\t\t\t\t<div class=\"col-md-9 inputtext heighttextarea\">\r\n");
        out.write("\t\t\t\t\t\t\t<textarea rows=\"4\" cols=\"40\" name=\"price_term3\"\r\n");
        out.write("\t\t\t\t\t\t\t\treadonly=\"readonly\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${price_term3 }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("</textarea>\r\n");
        out.write("\t\t\t\t\t\t</div>\r\n");
        out.write("\t\t\t\t\t</div>\r\n");
        out.write("\t\t\t\t\t<br>\r\n");
        out.write("\t\t\t\t\t<br>\r\n");
        out.write("\t\t\t\t\t<br>\r\n");
        out.write("\t\t\t\t\t<br>\r\n");
        out.write("\t\t\t\t\t<br>\r\n");
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
        out.write("\t\t\t\t\t\t\t<input type=\"text\" name=\"Market_area\" readonly=\"readonly\"\r\n");
        out.write("\t\t\t\t\t\t\t\tvalue=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${Market_area }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" />\r\n");
        out.write("\t\t\t\t\t\t</div>\r\n");
        out.write("\t\t\t\t\t</div>\r\n");
        out.write("\t\t\t\t\t<div class=\"divheight\">\r\n");
        out.write("\t\t\t\t\t\t<div class=\"col-md-2 col-md-offset-1 text\">*业务经理</div>\r\n");
        out.write("\t\t\t\t\t\t<div class=\"col-md-9 inputtext\">\r\n");
        out.write("\t\t\t\t\t\t\t<input type=\"text\" name=\"business_manager\" readonly=\"readonly\"\r\n");
        out.write("\t\t\t\t\t\t\t\tvalue=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${business_manager }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" />\r\n");
        out.write("\t\t\t\t\t\t</div>\r\n");
        out.write("\t\t\t\t\t</div>\r\n");
        out.write("\t\t\t\t\t<div class=\"divheight\">\r\n");
        out.write("\t\t\t\t\t\t<div class=\"col-md-2 col-md-offset-1 text\">*业务助理</div>\r\n");
        out.write("\t\t\t\t\t\t<div class=\"col-md-9 inputtext\">\r\n");
        out.write("\t\t\t\t\t\t\t<input type=\"text\" name=\"business_assistant\" readonly=\"readonly\"\r\n");
        out.write("\t\t\t\t\t\t\t\tvalue=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${business_assistant }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" />\r\n");
        out.write("\t\t\t\t\t\t</div>\r\n");
        out.write("\t\t\t\t\t</div>\r\n");
        out.write("\t\t\t\t\t<br>\r\n");
        out.write("\t\t\t\t\t<br>\r\n");
        out.write("\t\t\t\t\t<div class=\"row div1\">\r\n");
        out.write("\t\t\t\t\t\t<img class=\"img redline\" src=\"images/redline.png\" />\r\n");
        out.write("\t\t\t\t\t</div>\r\n");
        out.write("\r\n");
        out.write("\t\t\t\t");
        int evalDoAfterBody = _jspx_th_s_005fiterator_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005fiterator_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005fiterator_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fiterator_0026_005fvalue_005fstatus.reuse(_jspx_th_s_005fiterator_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fiterator_0026_005fvalue_005fstatus.reuse(_jspx_th_s_005fiterator_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005fiterator_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:iterator
    org.apache.struts2.views.jsp.IteratorTag _jspx_th_s_005fiterator_005f1 = (org.apache.struts2.views.jsp.IteratorTag) _005fjspx_005ftagPool_005fs_005fiterator_0026_005fvalue.get(org.apache.struts2.views.jsp.IteratorTag.class);
    _jspx_th_s_005fiterator_005f1.setPageContext(_jspx_page_context);
    _jspx_th_s_005fiterator_005f1.setParent(null);
    // /checkCustomer.jsp(257,4) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fiterator_005f1.setValue("#request.custContactors");
    int _jspx_eval_s_005fiterator_005f1 = _jspx_th_s_005fiterator_005f1.doStartTag();
    if (_jspx_eval_s_005fiterator_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fiterator_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fiterator_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fiterator_005f1.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t<div class=\"divheight\">\r\n");
        out.write("\t\t\t\t\t\t<div class=\"col-md-2 col-md-offset-1 text\">发件人邮箱</div>\r\n");
        out.write("\t\t\t\t\t\t<div class=\"col-md-9 inputtext\">\r\n");
        out.write("\t\t\t\t\t\t\t<input class=\"longtext\" type=\"text\" name=\"mailFrom\"\r\n");
        out.write("\t\t\t\t\t\t\t\treadonly=\"readonly\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${mailFrom }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" />\r\n");
        out.write("\t\t\t\t\t\t</div>\r\n");
        out.write("\t\t\t\t\t</div>\r\n");
        out.write("\t\t\t\t\t<br>\r\n");
        out.write("\t\t\t\t\t<div class=\"divheight\">\r\n");
        out.write("\t\t\t\t\t\t<div class=\"col-md-2 col-md-offset-1 text\">Pre PO 收件人</div>\r\n");
        out.write("\t\t\t\t\t\t<div class=\"col-md-9 inputtext\">\r\n");
        out.write("\t\t\t\t\t\t\t<input class=\"longtext\" type=\"text\" name=\"prePO_MailTo\"\r\n");
        out.write("\t\t\t\t\t\t\t\treadonly=\"readonly\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${prePO_MailTo }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" />\r\n");
        out.write("\t\t\t\t\t\t</div>\r\n");
        out.write("\t\t\t\t\t</div>\r\n");
        out.write("\t\t\t\t\t<div class=\"divheight\">\r\n");
        out.write("\t\t\t\t\t\t<div class=\"col-md-2 col-md-offset-1 text\">PO 收件人</div>\r\n");
        out.write("\t\t\t\t\t\t<div class=\"col-md-9 inputtext\">\r\n");
        out.write("\t\t\t\t\t\t\t<input class=\"longtext\" type=\"text\" name=\"po_MailTo\"\r\n");
        out.write("\t\t\t\t\t\t\t\treadonly=\"readonly\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${po_MailTo }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" />\r\n");
        out.write("\t\t\t\t\t\t</div>\r\n");
        out.write("\t\t\t\t\t</div>\r\n");
        out.write("\t\t\t\t\t<div class=\"divheight\">\r\n");
        out.write("\t\t\t\t\t\t<div class=\"col-md-2 col-md-offset-1 text\">OC/PI收件人</div>\r\n");
        out.write("\t\t\t\t\t\t<div class=\"col-md-9 inputtext\">\r\n");
        out.write("\t\t\t\t\t\t\t<input class=\"longtext\" type=\"text\" name=\"ocpi_MailTo\"\r\n");
        out.write("\t\t\t\t\t\t\t\treadonly=\"readonly\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ocpi_MailTo }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" />\r\n");
        out.write("\t\t\t\t\t\t</div>\r\n");
        out.write("\t\t\t\t\t</div>\r\n");
        out.write("\t\t\t\t\t<div class=\"divheight\">\r\n");
        out.write("\t\t\t\t\t\t<div class=\"col-md-3 text\">INV/Packing list 收件人</div>\r\n");
        out.write("\t\t\t\t\t\t<div class=\"col-md-9 inputtext\">\r\n");
        out.write("\t\t\t\t\t\t\t<input class=\"longtext\" type=\"text\" name=\"inv_Pklist_mailto\"\r\n");
        out.write("\t\t\t\t\t\t\t\treadonly=\"readonly\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${inv_Pklist_mailto }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" />\r\n");
        out.write("\t\t\t\t\t\t</div>\r\n");
        out.write("\t\t\t\t\t</div>\r\n");
        out.write("\t\t\t\t");
        int evalDoAfterBody = _jspx_th_s_005fiterator_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005fiterator_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005fiterator_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fiterator_0026_005fvalue.reuse(_jspx_th_s_005fiterator_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fiterator_0026_005fvalue.reuse(_jspx_th_s_005fiterator_005f1);
    return false;
  }
}
