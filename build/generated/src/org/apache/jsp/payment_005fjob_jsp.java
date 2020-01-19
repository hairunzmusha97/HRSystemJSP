package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import java.util.*;

public final class payment_005fjob_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/WEB-INF/c.tld");
    _jspx_dependants.add("/inc/top.jsp");
    _jspx_dependants.add("/inc/menu.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");

    String path = request.getContextPath();
    String basePath = request.getScheme() + "://"
            + request.getServerName() + ":" + request.getServerPort()
            + path + "/";

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.0 Transitional//EN\">\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <title>Human resource management system-Salary setting</title>\r\n");
      out.write("        <meta name=\"pragma\" content=\"no-cache\">\r\n");
      out.write("        <meta name=\"cache-control\" content=\"no-cache\">\r\n");
      out.write("        <meta name=\"Content-Type\" content=\"text/html;charset=UTF-8\">\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\">\r\n");
      out.write("        <base href=\"");
      out.print(basePath);
      out.write("\">\r\n");
      out.write("\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("<table height=130 width=\"100%\" background=\"images/logo.jpg\">\r\n");
      out.write("    <tr>\r\n");
      out.write("        <td></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <table>\r\n");
      out.write("            ");
      out.write("\r\n");
      out.write("<td class=\"menu\">\r\n");
      out.write("    <ul>\r\n");
      out.write("        <li>\r\n");
      out.write("            <A HREF=\"welcome.jsp\">首页面</A>\r\n");
      out.write("        </li>\r\n");
      out.write("    </ul>\r\n");
      out.write("\r\n");
      out.write("    <ul>\r\n");
      out.write("        个人管理\r\n");
      out.write("        <li>\r\n");
      out.write("            <A HREF=\"user.do?act=info&userid=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.userid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">个人档案</A>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li>\r\n");
      out.write("            <A HREF=\"check.do?method=list\">考勤管理</A>\r\n");
      out.write("        </li>\r\n");
      out.write("    </ul>\r\n");
      out.write("\r\n");
      out.write("    <ul>\r\n");
      out.write("        薪资管理\r\n");
      out.write("        <li>\r\n");
      out.write("            <A HREF=\"payment.do?act=usersalary\">个人工资</A>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li>\r\n");
      out.write("            <A HREF=\"payment.do?act=jobsalary\">薪资设定</A>\r\n");
      out.write("        </li>\r\n");
      out.write("    </ul>\r\n");
      out.write("    <ul>\r\n");
      out.write("        企业管理\r\n");
      out.write("        <li>\r\n");
      out.write("            <A HREF=\"train.do?method=list\">培训管理</A>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li>\r\n");
      out.write("            <A HREF=\"meeting.do?method=list\">部门管理</A>\r\n");
      out.write("        </li>\r\n");
      out.write("    </ul>\r\n");
      out.write("\r\n");
      out.write("    <ul>\r\n");
      out.write("        系统管理\r\n");
      out.write("        <li>\r\n");
      out.write("            <A HREF=\"repwd.jsp\">修改密码</A>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li>\r\n");
      out.write("            <A HREF=\"user_add.jsp\">增加用户</A>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li>\r\n");
      out.write("            <A HREF=\"user.do?act=list\">查看用户</A>\r\n");
      out.write("        </li>\r\n");
      out.write("    </ul>\r\n");
      out.write("    <ul>\r\n");
      out.write("        <li>\r\n");
      out.write("            <A HREF=\"logout.do\">退出</A>\r\n");
      out.write("        </li>\r\n");
      out.write("    </ul>\r\n");
      out.write("</td>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <td class=\"main\">\r\n");
      out.write("                <table class=\"header\">\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td>\r\n");
      out.write("                            Current position：Payroll management &gt;&gt; Salary setting\r\n");
      out.write("                        </td>\r\n");
      out.write("                        <td align=\"right\">\r\n");
      out.write("                            <a href=\"payment.do?act=edit\">Edit salary</a>\r\n");
      out.write("                        </td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                </table>\r\n");
      out.write("                <p>\r\n");
      out.write("                    &nbsp;\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    &nbsp;\r\n");
      out.write("                </p>\r\n");
      out.write("                <CENTER>\r\n");
      out.write("                    <table>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td width=\"400px\">\r\n");
      out.write("                                <div align=\"center\">\r\n");
      out.write("                                    <strong><font color=\"#990000\">基本工资设定</font> </strong>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <TABLE table width=\"100%\" border=\"1\" cellpadding=\"0\"\r\n");
      out.write("                                       cellspacing=\"0\" bgcolor=\"#EAE2F3\" bordercolorlight=\"#A545A3\"\r\n");
      out.write("                                       bordercolordark=\"#FFFFFF\">\r\n");
      out.write("                                    <TR class=\"tableheader\">\r\n");
      out.write("                                        <TD>\r\n");
      out.write("                                            部门名称\r\n");
      out.write("                                        </TD>\r\n");
      out.write("                                        <TD>\r\n");
      out.write("                                            职称\r\n");
      out.write("                                        </TD>\r\n");
      out.write("                                        <TD>\r\n");
      out.write("                                            工资\r\n");
      out.write("                                        </TD>\r\n");
      out.write("                                    </TR>\r\n");
      out.write("                                    ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                </TABLE>\r\n");
      out.write("                            </td>\r\n");
      out.write("                            <td width=\"100px\"></td>\r\n");
      out.write("                            <td width=\"300px\">\r\n");
      out.write("                                <div align=\"center\">\r\n");
      out.write("                                    <strong><font color=\"#990000\">额外薪资设定</font> </strong>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <TABLE table width=\"100%\" border=\"1\" cellpadding=\"0\"\r\n");
      out.write("                                       cellspacing=\"0\" bgcolor=\"#EAE2F3\" bordercolorlight=\"#A545A3\"\r\n");
      out.write("                                       bordercolordark=\"#FFFFFF\">\r\n");
      out.write("                                    <TR class=\"tableheader\">\r\n");
      out.write("                                        <TD>\r\n");
      out.write("                                            项目\r\n");
      out.write("                                        </TD>\r\n");
      out.write("                                        <TD>\r\n");
      out.write("                                            薪资\r\n");
      out.write("                                        </TD>\r\n");
      out.write("                                    </TR>\r\n");
      out.write("                                    <TR>\r\n");
      out.write("                                        <TD>\r\n");
      out.write("                                            住房补助\r\n");
      out.write("                                        </TD>\r\n");
      out.write("                                        <TD>\r\n");
      out.write("                                            300\r\n");
      out.write("                                        </TD>\r\n");
      out.write("                                    </TR>\r\n");
      out.write("\r\n");
      out.write("                                    <TR>\r\n");
      out.write("                                        <TD>\r\n");
      out.write("                                            三餐补助\r\n");
      out.write("                                        </TD>\r\n");
      out.write("                                        <TD>\r\n");
      out.write("                                            300\r\n");
      out.write("                                        </TD>\r\n");
      out.write("                                    </TR>\r\n");
      out.write("\r\n");
      out.write("                                    <TR>\r\n");
      out.write("                                        <TD>\r\n");
      out.write("                                            全勤补助\r\n");
      out.write("                                        </TD>\r\n");
      out.write("                                        <TD>\r\n");
      out.write("                                            500\r\n");
      out.write("                                        </TD>\r\n");
      out.write("                                    </TR>\r\n");
      out.write("\r\n");
      out.write("                                    <TR>\r\n");
      out.write("                                        <TD>\r\n");
      out.write("                                            加班补助\r\n");
      out.write("                                        </TD>\r\n");
      out.write("                                        <TD>\r\n");
      out.write("                                            100\r\n");
      out.write("                                        </TD>\r\n");
      out.write("                                    </TR>\r\n");
      out.write("\r\n");
      out.write("                                    <TR>\r\n");
      out.write("                                        <TD>\r\n");
      out.write("                                            迟到早退\r\n");
      out.write("                                        </TD>\r\n");
      out.write("                                        <TD>\r\n");
      out.write("                                            -20\r\n");
      out.write("                                        </TD>\r\n");
      out.write("                                    </TR>\r\n");
      out.write("\r\n");
      out.write("                                    <TR>\r\n");
      out.write("                                        <TD>\r\n");
      out.write("                                            无故缺勤\r\n");
      out.write("                                        </TD>\r\n");
      out.write("                                        <TD>\r\n");
      out.write("                                            -100\r\n");
      out.write("                                        </TD>\r\n");
      out.write("                                    </TR>\r\n");
      out.write("\r\n");
      out.write("                                </TABLE>\r\n");
      out.write("                            </td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                    </table>\r\n");
      out.write("                </CENTER>\r\n");
      out.write("            </td>\r\n");
      out.write("        </table>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.list}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("hash");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                        <TR>\r\n");
          out.write("                                            <TD>\r\n");
          out.write("                                                ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${hash.dept_name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\r\n");
          out.write("                                            </TD>\r\n");
          out.write("                                            <TD>\r\n");
          out.write("                                                ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${hash.job_name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\r\n");
          out.write("                                            </TD>\r\n");
          out.write("                                            <TD>\r\n");
          out.write("                                                ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${hash.salary}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\r\n");
          out.write("                                            </TD>\r\n");
          out.write("                                        </TR>\r\n");
          out.write("                                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
