package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.apache.struts2.components.Include;

public final class guide_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<link\r\n");
      out.write("\thref=\"http://cdn.bootcss.com/bootstrap/3.2.0/css/bootstrap.min.css\"\r\n");
      out.write("\trel=\"stylesheet\">\r\n");
      out.write("<link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"css/index.css\" rel=\"stylesheet\">\r\n");
      out.write("<script src=\"http://cdn.bootcss.com/jquery/2.1.1/jquery.min.js\"></script>\r\n");
      out.write("<script src=\"js/jquery-1.11.3.min.js\"></script>\r\n");
      out.write("<script src=\"http://cdn.bootcss.com/bootstrap/3.2.0/js/bootstrap.min.js\"></script>\r\n");
      out.write("<script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div class=\"navbar nav-list\" role=\"navigation\">\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<div>\r\n");
      out.write("\t\t\t\t<ul class=\"breadcrumb\">\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">首页</a></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t<div class=\"col-md-3\">\r\n");
      out.write("\t\t\t\t\t<ul id=\"main-nav\" class=\"nav nav-tabs nav-stacked\">\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"default.jsp\" data-toggle=\"tab\"> <i\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"glyphicon glyphicon-th-large\"></i> 首页\r\n");
      out.write("\t\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"\" data-toggle=\"tab\"> <i\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"glyphicon glyphicon-credit-card\"></i> 销售订单管理\r\n");
      out.write("\t\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"\" data-toggle=\"tab\"> <i\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"glyphicon glyphicon-credit-card\"></i> 发货单管理\r\n");
      out.write("\t\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"\" data-toggle=\"tab\"> <i\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"glyphicon glyphicon-credit-card\"></i> 制单界面\r\n");
      out.write("\t\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"\"> <i\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"glyphicon glyphicon-credit-card\"></i> orderbase维护\r\n");
      out.write("\t\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#mainDataList\"\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"nav-header collapsed hasdown\" data-toggle=\"collapse\"\r\n");
      out.write("\t\t\t\t\t\t\taria-expanded=\"true\" aria-controls=\"mainDataList\"> <span\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"pull-right glyphicon glyphicon-chevron-right\"></span> <i\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"glyphicon glyphicon-cog\"></i> 主数据维护\r\n");
      out.write("\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t<ul id=\"mainDataList\" class=\"nav nav-list collapse secondmenu\"\r\n");
      out.write("\t\t\t\t\t\t\t\tstyle=\"height: 0px; padding-left: 30px\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"customerreadAll.action\" target=\"contentframe\"><i\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=\"glyphicon glyphicon-user\"></i>客户管理</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\"><i class=\"glyphicon glyphicon-th-list\"></i>价格表管理</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#discountManageList\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"nav-header collapsed hasdown\" data-toggle=\"collapse\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\taria-expanded=\"true\" aria-controls=\"discountManageList\"> <span\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=\"pull-right glyphicon glyphicon-chevron-right\"></span> <i\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=\"glyphicon glyphicon-asterisk\"></i>折扣管理\r\n");
      out.write("\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<ul id=\"discountManageList\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=\"nav nav-list collapse thirdmenu\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tstyle=\"padding-left: 30px\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"normalDiscountAction!listNormalDiscount.action\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"contentframe\"> <i\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tclass=\"glyphicon glyphicon-th-list\"></i>经常性折扣\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\thref=\"specialDiscountAction!listSpecialDiscount.action\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\ttarget=\"contentframe\"><i\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tclass=\"glyphicon glyphicon-th-list\"></i>一次性折扣</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</ul></li>\r\n");
      out.write("\t\t\t\t\t\t\t</ul></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"\"><i class=\"glyphicon glyphicon-credit-card\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t系统设置 </a></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"\"> <i class=\"glyphicon glyphicon-user\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t用户管理 ");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</a></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"\"> <i class=\"glyphicon glyphicon-calendar\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t权限管理\r\n");
      out.write("\t\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"\"> <i class=\"glyphicon glyphicon-fire\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t报表管理\r\n");
      out.write("\t\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
      out.write("<script>\r\n");
      out.write("\t$(\".hasdown\").click(\r\n");
      out.write("\t\t\tfunction() {\r\n");
      out.write("\t\t\t\tvar obj = $(this).children(\"span\");\r\n");
      out.write("\t\t\t\tvar breadcrumb = $(\".breadcrumb\");\r\n");
      out.write("\t\t\t\tif (obj.hasClass(\"glyphicon-chevron-right\")) {\r\n");
      out.write("\t\t\t\t\tobj.removeClass().addClass(\r\n");
      out.write("\t\t\t\t\t\t\t\"pull-right glyphicon glyphicon-chevron-down\");\r\n");
      out.write("\t\t\t\t\tbreadcrumb.append('<li><a href=\"#\">' + $(this).text()\r\n");
      out.write("\t\t\t\t\t\t\t+ '</a></li>')\r\n");
      out.write("\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\tobj.removeClass().addClass(\r\n");
      out.write("\t\t\t\t\t\t\t\"pull-right glyphicon glyphicon-chevron-right\");\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t})\r\n");
      out.write("</script>\r\n");
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
