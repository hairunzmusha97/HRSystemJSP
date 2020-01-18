package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.sun.java.swing.plaf.windows.resources.windows;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");

    String path = request.getContextPath();
			String basePath = request.getScheme() + "://"
					+ request.getServerName() + ":" + request.getServerPort()
					+ path + "/";

      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.0 Transitional//EN\">\r\n");
      out.write("<html>\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<title>人力资源管理系统-登录窗口</title>\r\n");
      out.write("\r\n");
      out.write("\t\t<meta name=\"pragma\" content=\"no-cache\">\r\n");
      out.write("\t\t<meta name=\"cache-control\" content=\"no-cache\">\r\n");
      out.write("\t\t<meta name=\"keywords\" content=\"人力，资源，管理\">\r\n");
      out.write("\t\t<meta name=\"description\" content=\"人力资源管理系统-登录窗口\">\r\n");
      out.write("\t\t<meta name=\"Content-Type\" content=\"text/html;charset=UTF-8\">\r\n");
      out.write("\r\n");
      out.write("\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\">\r\n");
      out.write("\t\t<base href=\"");
      out.print(basePath);
      out.write("\">\r\n");
      out.write("\r\n");
      out.write("\t\t<style type=\"text/css\">\r\n");
      out.write("body {\r\n");
      out.write("\tbackground-image: url(images/login.jpg);\r\n");
      out.write("\tbackground-attachment: fixed;\r\n");
      out.write("\tbackground-repeat: no-repeat;\r\n");
      out.write("\tbackground-position: center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("table {\r\n");
      out.write("\tmargin-left: 57%;\r\n");
      out.write("\tmargin-top: 23%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("input {\r\n");
      out.write("\tfont-family: \"微软雅黑\";\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("\t\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t\tfunction isValid(form){\r\n");
      out.write("\t\t\t\tvar username=form.username.value;\r\n");
      out.write("\t\t\t\tvar password=form.password.value;\r\n");
      out.write("\t\t\t\tif(username==\"\"){\r\n");
      out.write("\t\t\t\t\talert(\"用户名不能为空！\");\r\n");
      out.write("\t\t\t\t\treturn false;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\tif(password==\"\"){\r\n");
      out.write("\t\t\t\t\talert(\"密码不能为空！\");\r\n");
      out.write("\t\t\t\t\treturn false;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\treturn true;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t</script>\r\n");
      out.write("\t</head>\r\n");
      out.write("\r\n");
      out.write("\t<body>\r\n");
      out.write("\r\n");
      out.write("\t\t<form name=\"form1\" action=\"login.do\" method=\"post\"\r\n");
      out.write("\t\t\tonsubmit=\"return isValid(this);\">\r\n");
      out.write("\t\t\t<table>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" name=\"userid\" size=\"25\">\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t&nbsp\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<input type=\"password\" name=\"password\" size=\"25\">\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"submit\" value=\"登&nbsp&nbsp录\">\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"reset\" value=\"重&nbsp&nbsp置\">\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t</body>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
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
