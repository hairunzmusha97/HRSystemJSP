package org.apache.jsp.inc;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class menu_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
}
