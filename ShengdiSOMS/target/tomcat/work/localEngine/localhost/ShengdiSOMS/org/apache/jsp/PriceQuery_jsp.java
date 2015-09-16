package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class PriceQuery_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=UTF-8");
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
      out.write("<title>价格表查询</title>\r\n");
      out.write("<link href=\"css/bootstrap.min.css\" type=\"text/css\" rel=\"stylesheet\" />\r\n");
      out.write("<link href=\"css/PriceQuery.css\" type=\"text/css\" rel=\"stylesheet\" />\r\n");
      out.write("<script src=\"js/jquery-1.11.3.min.js\"></script>\r\n");
      out.write("<!-- <script src=\"js/bootstrap.min.js\"></script> -->\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"container-fruid\">\r\n");
      out.write("\t\t<div class=\"row col-md-12\">\r\n");
      out.write("\t\t<div id=\"Content\">\r\n");
      out.write("\t\t\t<div id=\"contentTop\">\r\n");
      out.write("\t\t\t<div class=\"row divrow1\"> <!-- row1 -->\r\n");
      out.write("\t\t\t\t\t<div class=\"col-md-2 texthead\">客户简称 </div>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-md-3\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"ax_text_field\">\r\n");
      out.write("\t\t\t\t\t\t\t<input id=\"input_code\" type=\"text\" name=\"customer_code\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tvalue=\"GTW\" />\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-md-2 texthead\">类型</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-md-5\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"ax_text_field\">\r\n");
      out.write("\t\t\t\t\t\t\t <input id=\"input_type\" type=\"text\" name=\"type\" value=\"\" />\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"row divrow1\"> <!-- row2 -->\r\n");
      out.write("\t\t\t\t\t<div class=\"col-md-2 texthead\">工厂型号  </div>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-md-10\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"ax_text_field\">\r\n");
      out.write("\t\t\t\t\t\t\t<input id=\"Factory_model\" type=\"text\" name=\"Factory_model\"\r\n");
      out.write("\t\t\t\t\t\t\t\tvalue=\"\" />\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<br> <br>\r\n");
      out.write("\t\t\t<div id=\"contentCentre\">\r\n");
      out.write("\t\t\t\t<div class=\"row\">\t\t\t\r\n");
      out.write("\t\t\t\t\t<div id=\"clickButton\" class=\"ax_html_button\">\r\n");
      out.write("\t\t\t\t\t<table>\r\n");
      out.write("\t\t\t\t    <tr>\r\n");
      out.write("\t\t\t\t       <td width=\"200px\"></td>\r\n");
      out.write("\t\t\t\t       <td>\r\n");
      out.write("\t\t\t\t          <input class=\"longButton\" type=\"submit\" name=\"Query_modification\"\r\n");
      out.write("\t\t\t\t\t\t\tvalue=\"查询/编辑\" onclick=\"firm()\" />\r\n");
      out.write("\t\t\t\t       </td>\r\n");
      out.write("\t\t\t\t       <td width=\"10px\"></td>\r\n");
      out.write("\t\t\t\t       <td>\r\n");
      out.write("\t\t\t\t          <input class=\"longButton\" type=\"submit\"\r\n");
      out.write("\t\t\t\t\t\t\tname=\"save\" value=\"新增\" />\r\n");
      out.write("\t\t\t\t       </td>\r\n");
      out.write("\t\t\t\t        <td width=\"10px\"></td>\r\n");
      out.write("\t\t\t\t       <td>\r\n");
      out.write("\t\t\t\t          <input class=\"longButton\"\r\n");
      out.write("\t\t\t\t\t\t\ttype=\"submit\" name=\"New_configuration\" value=\"保存\" />\r\n");
      out.write("\t\t\t\t       </td>\r\n");
      out.write("\t\t\t\t         <td width=\"50px\"></td>\r\n");
      out.write("\t\t\t\t       <td>\r\n");
      out.write("\t\t\t\t          <input class=\"longButton\"\r\n");
      out.write("\t\t\t\t\t\t\ttype=\"submit\" name=\"ExportEXCEL\" value=\"导出EXCEL\" />\r\n");
      out.write("\t\t\t\t       </td>\r\n");
      out.write("\t\t\t\t        <td width=\"10px\"></td>\r\n");
      out.write("\t\t\t\t       <td>\r\n");
      out.write("\t\t\t\t          <input class=\"longButton\"\r\n");
      out.write("\t\t\t\t\t\t\ttype=\"submit\" name=\"ImportEXCEL\" value=\"导入EXCEL\" onclick=\"funurl()\" />\r\n");
      out.write("\t\t\t\t       </td>\t\t\t\t     \r\n");
      out.write("\t\t\t\t    </tr>\r\n");
      out.write("\t\t\t\t</table>\t\t\t\t\t\t\t  \t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t           <script type=\"text/javascript\">\r\n");
      out.write("\t\t\t\t                 function funurl(){\r\n");
      out.write("\t\t\t\t                \t location.href ='ImportPrice.jsp';\r\n");
      out.write("\t\t\t\t                 }\r\n");
      out.write("\t\t\t\t                 \r\n");
      out.write("\t\t\t\t\t\t\t\t\tfunction firm() {//利用对话框返回的值 （true 或者 false）\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tif (confirm(\"你确定选择要查询？\")) {//如果是true ，那么就响应价格表配置的 \" 查询  \"方法.否则,弹出下一个提示框\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tout.ptintln(\"查询!\");\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tif (confirm(\"你确定选择编辑吗?\")) {//如果是true ，那么就响应价格表配置的 \" 修改  \"方法.否则,关闭提示框\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tout.ptintln(\"编辑!\");\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t</script>\t\t\t\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<br>\r\n");
      out.write("\t\t\t<div id=\"redline\" class=\"row5\">\r\n");
      out.write("\t\t\t\t<img class=\"img\" src=\"images/redline.png\" alt=\"\" />\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div id=\"contentBottom\">\r\n");
      out.write("               <div class=\"show\">\r\n");
      out.write("               \r\n");
      out.write("               <div id=\"tablesize\">\r\n");
      out.write("\t\t\t<table class=\"table table-bordered table-hover\">\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<th class=\"info\">No.</th>\r\n");
      out.write("\t\t\t\t\t<th class=\"info\">工厂型号</th>\r\n");
      out.write("\t\t\t\t\t<th class=\"info\">有效日期从</th>\r\n");
      out.write("\t\t\t\t\t<th class=\"info\">有效日期至</th>\r\n");
      out.write("\t\t\t\t\t<th class=\"info\">基础价</th>\r\n");
      out.write("\t\t\t\t\t<th class=\"info\">加喷漆</th>\r\n");
      out.write("\t\t\t\t\t<th class=\"info\">加螺钉</th>\r\n");
      out.write("\t\t\t\t\t<th class=\"info\">螺钉价格</th>\r\n");
      out.write("\t\t\t\t</tr>\t\t\t\t\r\n");
      out.write("\t\t\t\t<tr class=\"trheight\">\r\n");
      out.write("\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr class=\"trheight\">\r\n");
      out.write("\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr class=\"trheight\">\r\n");
      out.write("\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr class=\"trheight\">\r\n");
      out.write("\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr class=\"trheight\">\r\n");
      out.write("\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr class=\"trheight\">\r\n");
      out.write("\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr class=\"trheight\">\r\n");
      out.write("\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("            </div>   \r\n");
      out.write("               </div>\r\n");
      out.write("          </div>     \r\n");
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
