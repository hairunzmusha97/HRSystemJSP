package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import java.util.*;

public final class information_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(4);
    _jspx_dependants.add("/WEB-INF/c.tld");
    _jspx_dependants.add("/WEB-INF/emis.tld");
    _jspx_dependants.add("/inc/top.jsp");
    _jspx_dependants.add("/inc/menu.jsp");
  }

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
      out.write("        <title>Human resource management system-Personal information</title>\r\n");
      out.write("        <meta name=\"pragma\" content=\"no-cache\">\r\n");
      out.write("        <meta name=\"cache-control\" content=\"no-cache\">\r\n");
      out.write("        <meta name=\"Content-Type\" content=\"text/html;charset=UTF-8\">\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\">\r\n");
      out.write("        <base href=\"");
      out.print(basePath);
      out.write("\">\r\n");
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
      out.write("            <A HREF=\"welcome.jsp\">First page</A>\r\n");
      out.write("        </li>\r\n");
      out.write("    </ul>\r\n");
      out.write("\r\n");
      out.write("    <ul>\r\n");
      out.write("        Personal management\r\n");
      out.write("        <li>\r\n");
      out.write("            <A HREF=\"user.do?act=info&userid=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.userid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">Profile</A>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li>\r\n");
      out.write("            <A HREF=\"check.do?method=list\">Attendance Management</A>\r\n");
      out.write("        </li>\r\n");
      out.write("    </ul>\r\n");
      out.write("\r\n");
      out.write("    <ul>\r\n");
      out.write("        Payroll management\r\n");
      out.write("        <li>\r\n");
      out.write("            <A HREF=\"payment.do?act=usersalary\">Personal salary</A>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li>\r\n");
      out.write("            <A HREF=\"payment.do?act=jobsalary\">Salary setting</A>\r\n");
      out.write("        </li>\r\n");
      out.write("    </ul>\r\n");
      out.write("    <ul>\r\n");
      out.write("        Business management\r\n");
      out.write("        <li>\r\n");
      out.write("            <A HREF=\"train.do?method=list\">Training management</A>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li>\r\n");
      out.write("            <A HREF=\"meeting.do?method=list\">Department management</A>\r\n");
      out.write("        </li>\r\n");
      out.write("    </ul>\r\n");
      out.write("\r\n");
      out.write("    <ul>\r\n");
      out.write("        System Management\r\n");
      out.write("        <li>\r\n");
      out.write("            <A HREF=\"repwd.jsp\">change Password</A>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li>\r\n");
      out.write("            <A HREF=\"user_add.jsp\">Increase user</A>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li>\r\n");
      out.write("            <A HREF=\"user.do?act=list\">View users</A>\r\n");
      out.write("        </li>\r\n");
      out.write("    </ul>\r\n");
      out.write("    <ul>\r\n");
      out.write("        <li>\r\n");
      out.write("            <A HREF=\"logout.do\">Drop out</A>\r\n");
      out.write("        </li>\r\n");
      out.write("    </ul>\r\n");
      out.write("</td>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <td class=\"main\">\r\n");
      out.write("                <p class=\"header\">\r\n");
      out.write("                    current position：Personal information\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    &nbsp\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    &nbsp\r\n");
      out.write("                </p>\r\n");
      out.write("                <table width=\"70%\" border=\"1\" cellpadding=\"0\" cellspacing=\"0\"\r\n");
      out.write("                       bgcolor=\"#EAE2F3\" bordercolorlight=\"#A545A3\"\r\n");
      out.write("                       bordercolordark=\"#FFFFFF\" align=\"center\">\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td>\r\n");
      out.write("                            <table width=\"100%\" border=\"0\" cellspacing=\"2\" cellpadding=\"3\">\r\n");
      out.write("                                <tr>\r\n");
      out.write("                                    <td bgcolor=\"#E7DCF1\">\r\n");
      out.write("                                        <div align=\"center\">\r\n");
      out.write("                                            <strong><font color=\"#990000\">Personal information of employees</font> </strong>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </td>\r\n");
      out.write("                                </tr>\r\n");
      out.write("                            </table>\r\n");
      out.write("\r\n");
      out.write("                            <table width=\"100%\" cellpadding=\"2\" cellspacing=\"3\"\r\n");
      out.write("                                   bgcolor=\"#F2EDF8\">\r\n");
      out.write("                                <tr>\r\n");
      out.write("                                    <td bgcolor=\"#E2D8EF\">\r\n");
      out.write("                                        <p align=\"center\">\r\n");
      out.write("                                            <strong>Name</strong>\r\n");
      out.write("                                        </p>\r\n");
      out.write("                                    </td>\r\n");
      out.write("                                    <td bgcolor=\"#EAE2F3\">\r\n");
      out.write("                                        <p align=\"center\">\r\n");
      out.write("                                            ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("                                        </p>\r\n");
      out.write("                                    </td>\r\n");
      out.write("                                    <td bgcolor=\"#E2D8EF\">\r\n");
      out.write("                                        <p align=\"center\">\r\n");
      out.write("                                            <strong>Gender</strong>\r\n");
      out.write("                                        </p>\r\n");
      out.write("                                    </td>\r\n");
      out.write("                                    <td bgcolor=\"#EAE2F3\">\r\n");
      out.write("                                        <p align=\"center\">\r\n");
      out.write("                                            ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.sex}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("                                        </p>\r\n");
      out.write("                                    </td>\r\n");
      out.write("                                </tr>\r\n");
      out.write("                                <tr>\r\n");
      out.write("                                    <td bgcolor=\"#E2D8EF\">\r\n");
      out.write("                                        <p align=\"center\">\r\n");
      out.write("                                            <strong>Birthday</strong>\r\n");
      out.write("                                        </p>\r\n");
      out.write("                                    </td>\r\n");
      out.write("                                    <td bgcolor=\"#EAE2F3\">\r\n");
      out.write("                                        <p align=\"center\">\r\n");
      out.write("                                            ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.birthday}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("                                        </p>\r\n");
      out.write("                                    </td>\r\n");
      out.write("                                    <td bgcolor=\"#E2D8EF\">\r\n");
      out.write("                                        <p align=\"center\">\r\n");
      out.write("                                            <strong>Age</strong>\r\n");
      out.write("                                        </p>\r\n");
      out.write("                                    </td>\r\n");
      out.write("                                    <td bgcolor=\"#EAE2F3\">\r\n");
      out.write("                                        <p align=\"center\">\r\n");
      out.write("                                            ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.age}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("                                        </p>\r\n");
      out.write("                                    </td>\r\n");
      out.write("                                </tr>\r\n");
      out.write("\r\n");
      out.write("                                <tr>\r\n");
      out.write("                                    <td bgcolor=\"#E2D8EF\">\r\n");
      out.write("                                        <p align=\"center\">\r\n");
      out.write("                                            <strong>Hometown</strong>\r\n");
      out.write("                                        </p>\r\n");
      out.write("                                    </td>\r\n");
      out.write("                                    <td bgcolor=\"#EAE2F3\">\r\n");
      out.write("                                        <p align=\"center\">\r\n");
      out.write("                                            ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.native}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("                                        </p>\r\n");
      out.write("                                    </td>\r\n");
      out.write("                                    <td bgcolor=\"#E2D8EF\">\r\n");
      out.write("                                        <p align=\"center\">\r\n");
      out.write("                                            <strong>Political status</strong>\r\n");
      out.write("                                        </p>\r\n");
      out.write("                                    </td>\r\n");
      out.write("                                    <td bgcolor=\"#EAE2F3\">\r\n");
      out.write("                                        <p align=\"center\">\r\n");
      out.write("                                            ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.politicalface}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("                                        </p>\r\n");
      out.write("                                    </td>\r\n");
      out.write("                                </tr>\r\n");
      out.write("\r\n");
      out.write("                                <tr>\r\n");
      out.write("                                    <td bgcolor=\"#E2D8EF\">\r\n");
      out.write("                                        <p align=\"center\">\r\n");
      out.write("                                            <strong>Mobile phone</strong>\r\n");
      out.write("                                        </p>\r\n");
      out.write("                                    </td>\r\n");
      out.write("                                    <td bgcolor=\"#EAE2F3\">\r\n");
      out.write("                                        <p align=\"center\">\r\n");
      out.write("                                            ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.mobile}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("                                        </p>\r\n");
      out.write("                                    </td>\r\n");
      out.write("                                    <td bgcolor=\"#E2D8EF\">\r\n");
      out.write("                                        <p align=\"center\">\r\n");
      out.write("                                            <strong>Fixed telephone</strong>\r\n");
      out.write("                                        </p>\r\n");
      out.write("                                    </td>\r\n");
      out.write("                                    <td bgcolor=\"#EAE2F3\">\r\n");
      out.write("                                        <p align=\"center\">\r\n");
      out.write("                                            ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.fphone}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("                                        </p>\r\n");
      out.write("                                    </td>\r\n");
      out.write("                                </tr>\r\n");
      out.write("\r\n");
      out.write("                                <tr>\r\n");
      out.write("                                    <td bgcolor=\"#E2D8EF\">\r\n");
      out.write("                                        <p align=\"center\">\r\n");
      out.write("                                            <strong>Cultural level</strong>\r\n");
      out.write("                                        </p>\r\n");
      out.write("                                    </td>\r\n");
      out.write("                                    <td bgcolor=\"#EAE2F3\">\r\n");
      out.write("                                        <p align=\"center\">\r\n");
      out.write("                                            ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.education}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("                                        </p>\r\n");
      out.write("                                    </td>\r\n");
      out.write("                                    <td bgcolor=\"#E2D8EF\">\r\n");
      out.write("                                        <p align=\"center\">\r\n");
      out.write("                                            <strong>Profession</strong>\r\n");
      out.write("                                        </p>\r\n");
      out.write("                                    </td>\r\n");
      out.write("                                    <td bgcolor=\"#EAE2F3\">\r\n");
      out.write("                                        <p align=\"center\">\r\n");
      out.write("                                            ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.profession}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("                                        </p>\r\n");
      out.write("                                    </td>\r\n");
      out.write("                                </tr>\r\n");
      out.write("\r\n");
      out.write("                                <tr>\r\n");
      out.write("                                    <td bgcolor=\"#E2D8EF\">\r\n");
      out.write("                                        <p align=\"center\">\r\n");
      out.write("                                            <strong>ID</strong>\r\n");
      out.write("                                        </p>\r\n");
      out.write("                                    </td>\r\n");
      out.write("                                    <td bgcolor=\"#EAE2F3\">\r\n");
      out.write("                                        <p align=\"center\">\r\n");
      out.write("                                            ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.identify_id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("                                        </p>\r\n");
      out.write("                                    </td>\r\n");
      out.write("                                    <td bgcolor=\"#E2D8EF\">\r\n");
      out.write("                                        <p align=\"center\">\r\n");
      out.write("                                            <strong>E-mail</strong>\r\n");
      out.write("                                        </p>\r\n");
      out.write("                                    </td>\r\n");
      out.write("                                    <td bgcolor=\"#EAE2F3\">\r\n");
      out.write("                                        <p align=\"center\">\r\n");
      out.write("                                            ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.email}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("                                        </p>\r\n");
      out.write("                                    </td>\r\n");
      out.write("                                </tr>\r\n");
      out.write("\r\n");
      out.write("                                <tr>\r\n");
      out.write("                                    <td bgcolor=\"#E2D8EF\">\r\n");
      out.write("                                        <p align=\"center\">\r\n");
      out.write("                                            <strong>Address</strong>\r\n");
      out.write("                                        </p>\r\n");
      out.write("                                    </td>\r\n");
      out.write("                                    <td bgcolor=\"#EAE2F3\">\r\n");
      out.write("                                        <p align=\"center\">\r\n");
      out.write("                                            ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.address}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("                                        </p>\r\n");
      out.write("                                    </td>\r\n");
      out.write("                                    <td bgcolor=\"#E2D8EF\">\r\n");
      out.write("                                        <p align=\"center\">\r\n");
      out.write("                                            <strong>Marriage</strong>\r\n");
      out.write("                                        </p>\r\n");
      out.write("                                    </td>\r\n");
      out.write("                                    <td bgcolor=\"#EAE2F3\">\r\n");
      out.write("                                        <p align=\"center\">\r\n");
      out.write("                                            ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.marry}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("                                        </p>\r\n");
      out.write("                                    </td>\r\n");
      out.write("                                </tr>\r\n");
      out.write("\r\n");
      out.write("                                <tr>\r\n");
      out.write("                                    <td bgcolor=\"#E2D8EF\">\r\n");
      out.write("                                        <p align=\"center\">\r\n");
      out.write("                                            <strong>Department</strong>\r\n");
      out.write("                                        </p>\r\n");
      out.write("                                    </td>\r\n");
      out.write("                                    <td bgcolor=\"#EAE2F3\">\r\n");
      out.write("                                        <p align=\"center\">\r\n");
      out.write("                                            ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.dept_id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("                                        </p>\r\n");
      out.write("                                    </td>\r\n");
      out.write("                                    <td bgcolor=\"#E2D8EF\">\r\n");
      out.write("                                        <p align=\"center\">\r\n");
      out.write("                                            <strong>Position</strong>\r\n");
      out.write("                                        </p>\r\n");
      out.write("                                    </td>\r\n");
      out.write("                                    <td bgcolor=\"#EAE2F3\">\r\n");
      out.write("                                        <p align=\"center\">\r\n");
      out.write("                                            ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.job_id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("                                        </p>\r\n");
      out.write("                                    </td>\r\n");
      out.write("                                </tr>\r\n");
      out.write("                            </table>\r\n");
      out.write("\r\n");
      out.write("                        </td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                </table>\r\n");
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
}
