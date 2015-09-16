package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>销售订单管理系统</title>\r\n");
      out.write("    <link href=\"http://cdn.bootcss.com/bootstrap/3.2.0/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"css/index.css\" rel=\"stylesheet\">\r\n");
      out.write("    <script src=\"http://cdn.bootcss.com/jquery/2.1.1/jquery.min.js\"></script>\r\n");
      out.write("<!--     <script src=\"http://cdn.bootcss.com/bootstrap/3.2.0/js/bootstrap.min.js\"></script> -->\r\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <img src=\"images/logo.png\">\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <div id=\"title\" class=\"container\">\r\n");
      out.write("        <h2>销售订单管理系统</h2>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"navbar nav-list\" role=\"navigation\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div>\r\n");
      out.write("                <ul class=\"breadcrumb\">\r\n");
      out.write("                    <li><a href=\"#\">首页</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-md-3\">\r\n");
      out.write("                    <ul id=\"main-nav\" class=\"nav nav-tabs nav-stacked\">\r\n");
      out.write("                        <li class=\"active\">\r\n");
      out.write("                            <a href=\"#welcome\" data-toggle=\"tab\">\r\n");
      out.write("                                <i class=\"glyphicon glyphicon-th-large\"></i>\r\n");
      out.write("                                首页\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"#salesManagement\" data-toggle=\"collapse\" class=\"nav-header collapsed hasdown\">\r\n");
      out.write("                                <span class=\"pull-right glyphicon glyphicon-chevron-right\"></span>\r\n");
      out.write("                                <i class=\"glyphicon glyphicon-credit-card\"></i>\r\n");
      out.write("                                销售订单管理\r\n");
      out.write("                            </a>\r\n");
      out.write("                            <ul id=\"salesManagement\" class=\"nav nav-list collapse secondmenu\" style=\"height: 0px;padding-left: 30px\">\r\n");
      out.write("                                 <li><a href=\"#salesManagement\"><i class=\"glyphicon glyphicon-th-list\"></i>Item 1.1</a></li>\r\n");
      out.write("                                <li><a href=\"#salesManagement\"><i class=\"glyphicon glyphicon-th-list\"></i>Item 1.2</a></li>\r\n");
      out.write("                                  <li><a href=\"#salesManagement\"><i class=\"glyphicon glyphicon-th-list\"></i>Item 1.3</a></li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"#invoiceManagement\" data-toggle=\"collapse\" class=\"nav-header collapsed hasdown\">\r\n");
      out.write("                                <span class=\"pull-right glyphicon glyphicon-chevron-right\"></span>\r\n");
      out.write("                                <i class=\"glyphicon glyphicon-credit-card\"></i>\r\n");
      out.write("                                发货单管理\r\n");
      out.write("                            </a>\r\n");
      out.write("                            <ul id=\"invoiceManagement\" class=\"nav nav-list collapse secondmenu\" style=\"height: 0px;padding-left: 30px\">\r\n");
      out.write("                                 <li><a href=\"#invoiceManagement\"><i class=\"glyphicon glyphicon-asterisk\"></i>输入文本...</a></li>\r\n");
      out.write("                                 <li><a href=\"#invoiceManagement\"><i class=\"glyphicon glyphicon-asterisk\"></i>输入文本...</a></li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"#systemInterface\" data-toggle=\"collapse\" class=\"nav-header collapsed hasdown\">\r\n");
      out.write("                                <span class=\"pull-right glyphicon glyphicon-chevron-right\"></span>\r\n");
      out.write("                                <i class=\"glyphicon glyphicon-credit-card\"></i>\r\n");
      out.write("                                制单界面\r\n");
      out.write("                            </a>\r\n");
      out.write("                            <ul id=\"systemInterface\" class=\"nav nav-list collapse secondmenu\" style=\"height: 0px;padding-left: 30px\">\r\n");
      out.write("                                 <li><a href=\"#systemInterface\"><i class=\"glyphicon glyphicon-asterisk\"></i>输入文本...</a></li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"#orderbaseMaintain\" class=\"nav-header collapsed hasdown\" data-toggle=\"collapse\">\r\n");
      out.write("                                <span class=\"pull-right glyphicon glyphicon-chevron-right\"></span>\r\n");
      out.write("                                <i class=\"glyphicon glyphicon-credit-card\"></i>\r\n");
      out.write("       Orderbase维护\r\n");
      out.write("                            </a>\r\n");
      out.write("                            <ul id=\"orderbaseMaintain\" class=\"nav nav-list collapse secondmenu\" style=\"height: 0px;padding-left: 30px\">\r\n");
      out.write("                                 <li><a href=\"#orderbaseMaintain\"><i class=\"glyphicon glyphicon-th-list\"></i>Orderbase查询</a></li>\r\n");
      out.write("                                <li><a href=\"#orderbaseMaintain\"><i class=\"glyphicon glyphicon-th-list\"></i>Orderbase编辑</a></li>\r\n");
      out.write("                                  <li><a href=\"#orderbaseMaintain\"><i class=\"glyphicon glyphicon-th-list\"></i>Orderbase导入</a></li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"#mainDataList\" class=\"nav-header collapsed hasdown\" data-toggle=\"collapse\">\r\n");
      out.write("                                <span class=\"pull-right glyphicon glyphicon-chevron-right\"></span>\r\n");
      out.write("                                <i class=\"glyphicon glyphicon-cog\"></i>\r\n");
      out.write("                                主数据维护\r\n");
      out.write("                            </a>\r\n");
      out.write("                            <ul id=\"mainDataList\" class=\"nav nav-list collapse secondmenu\" style=\"height: 0px;padding-left: 30px\">\r\n");
      out.write("                                <li><a href=\"#\"><i class=\"glyphicon glyphicon-user\"></i>客户管理</a></li>\r\n");
      out.write("                                <li><a href=\"#PriceQuery\" data-toggle=\"tab\"><i class=\"glyphicon glyphicon-th-list\"></i>价格表管理</a></li>\r\n");
      out.write("                                <li>\r\n");
      out.write("                                    <a href=\"#discountManageList\" class=\"nav-header collapsed hasdown\" data-toggle=\"collapse\">\r\n");
      out.write("                                        <span class=\"pull-right glyphicon glyphicon-chevron-right\"></span>\r\n");
      out.write("                                        <i class=\"glyphicon glyphicon-asterisk\"></i>折扣管理\r\n");
      out.write("                                    </a>\r\n");
      out.write("                                    <ul id=\"discountManageList\" class=\"nav nav-list collapse thirdmenu\" style=\"padding-left: 30px\">\r\n");
      out.write("                                        <li><a href=\"#\"><i class=\"glyphicon glyphicon-th-list\"></i>经常性折扣</a></li>\r\n");
      out.write("                                        <li><a href=\"#\"><i class=\"glyphicon glyphicon-th-list\"></i>一次性折扣</a></li>\r\n");
      out.write("                                    </ul>\r\n");
      out.write("                                </li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </li>\r\n");
      out.write("                     <li>\r\n");
      out.write("                            <a href=\"#systemSettings\" class=\"nav-header collapsed hasdown\" data-toggle=\"collapse\">\r\n");
      out.write("                                <span class=\"pull-right glyphicon glyphicon-chevron-right\"></span>\r\n");
      out.write("                                <i class=\"glyphicon glyphicon-credit-card\"></i>\r\n");
      out.write("                                系统设置\r\n");
      out.write("                            </a>\r\n");
      out.write("                             <ul id=\"systemSettings\" class=\"nav nav-list collapse secondmenu\" style=\"height: 0px;padding-left: 30px\">\r\n");
      out.write("                                <li><a href=\"#\"><i class=\"glyphicon glyphicon-user\"></i>orderbase配置</a></li>\r\n");
      out.write("                                <li><a href=\"#\"><i class=\"glyphicon glyphicon-th-list\"></i>客户订单配置</a></li>\r\n");
      out.write("                                 <li><a href=\"#PriceConfigure\" data-toggle=\"tab\"><i class=\"glyphicon glyphicon-asterisk\"></i>价格表配置</a></li>\r\n");
      out.write("                                  <li><a href=\"#\"><i class=\"glyphicon glyphicon-th-list\"></i>订单检测规则</a></li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </li>\r\n");
      out.write("\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"#userManagement\" class=\"nav-header collapsed hasdown\" data-toggle=\"collapse\">\r\n");
      out.write("                                <span class=\"pull-right glyphicon glyphicon-chevron-right\"></span>\r\n");
      out.write("                                <i class=\"glyphicon glyphicon-user\"></i>\r\n");
      out.write("                                用户管理\r\n");
      out.write("                                ");
      out.write("\r\n");
      out.write("                            </a>\r\n");
      out.write("                            <ul id=\"userManagement\" class=\"nav nav-list collapse secondmenu\" style=\"height: 0px;padding-left: 30px\">\r\n");
      out.write("                                <li><a href=\"#userManagement\"><i class=\"glyphicon glyphicon-user\"></i>用户管理</a></li>\r\n");
      out.write("                                <li><a href=\"#userManagement\"><i class=\"glyphicon glyphicon-th-list\"></i>修改密码</a></li>                                                          \r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </li>\r\n");
      out.write("\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"#authorityManagement\" class=\"nav-header collapsed hasdown\" data-toggle=\"collapse\">\r\n");
      out.write("                                <span class=\"pull-right glyphicon glyphicon-chevron-right\"></span>\r\n");
      out.write("                                <i class=\"glyphicon glyphicon-calendar\"></i>\r\n");
      out.write("                                权限管理\r\n");
      out.write("                            </a>\r\n");
      out.write("                            <ul id=\"authorityManagement\" class=\"nav nav-list collapse secondmenu\" style=\"height: 0px;padding-left: 30px\">\r\n");
      out.write("                                <li><a href=\"#authorityManagement\"><i class=\"glyphicon glyphicon-user\"></i>角色维护</a></li>\r\n");
      out.write("                                <li><a href=\"#authorityManagement\"><i class=\"glyphicon glyphicon-th-list\"></i>权限分配</a></li>                                                          \r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"#reportManagement\" class=\"nav-header collapsed hasdown\" data-toggle=\"collapse\">\r\n");
      out.write("                                <span class=\"pull-right glyphicon glyphicon-chevron-right\"></span>\r\n");
      out.write("                                <i class=\"glyphicon glyphicon-fire\"></i>\r\n");
      out.write("                                报表管理\r\n");
      out.write("                            </a>\r\n");
      out.write("                            <ul id=\"reportManagement\" class=\"nav nav-list collapse secondmenu\" style=\"height: 0px;padding-left: 30px\">\r\n");
      out.write("                                <li><a href=\"#reportManagement\"><i class=\"glyphicon glyphicon-asterisk\"></i>报表查询</a></li>\r\n");
      out.write("                                <li><a href=\"#reportManagement\"><i class=\"glyphicon glyphicon-th-list\"></i>报表配置</a></li>                                                          \r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div id=\"right\" class=\"tab-content col-md-9\">\r\n");
      out.write("                    <div class=\"tab-pane active\" id=\"welcome\">\r\n");
      out.write("                        <h2>welcome</h2>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"tab-pane\" id=\"PriceConfigure\">\r\n");
      out.write("                        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "PriceConfigure.jsp", out, false);
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"tab-pane\" id=\"PriceQuery\">\r\n");
      out.write("                        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "PriceQuery.jsp", out, false);
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("<script>\r\n");
      out.write("    $(\".hasdown\").click(function(){\r\n");
      out.write("        var obj = $(this).children(\"span\");\r\n");
      out.write("        var breadcrumb = $(\".breadcrumb\");\r\n");
      out.write("        if(obj.hasClass(\"glyphicon-chevron-right\")) {\r\n");
      out.write("            obj.removeClass().addClass(\"pull-right glyphicon glyphicon-chevron-down\");\r\n");
      out.write("            breadcrumb.append('<li><a href=\"#\">'+$(this).text()+'</a></li>')\r\n");
      out.write("        }\r\n");
      out.write("        else {\r\n");
      out.write("            obj.removeClass().addClass(\"pull-right glyphicon glyphicon-chevron-right\");\r\n");
      out.write("\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("    })\r\n");
      out.write("</script>\r\n");
      out.write("</html>\r\n");
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
