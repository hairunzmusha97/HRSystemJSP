package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import java.util.*;

public final class user_005fedit_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
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

      out.write('\r');
      out.write('\n');

    String path = request.getContextPath();
    String basePath = request.getScheme() + "://"
		    + request.getServerName() + ":" + request.getServerPort()
		    + path + "/";

      out.write('\r');
      out.write('\n');

    request.setCharacterEncoding("utf8");
    response.setCharacterEncoding("utf8");

      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.0 Transitional//EN\">\r\n");
      out.write("<html>\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<title>人力资源管理系统-修改用户信息</title>\r\n");
      out.write("\t\t<meta name=\"pragma\" content=\"no-cache\">\r\n");
      out.write("\t\t<meta name=\"cache-control\" content=\"no-cache\">\r\n");
      out.write("\t\t<meta name=\"Content-Type\" content=\"text/html;charset=UTF-8\">\r\n");
      out.write("\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\">\r\n");
      out.write("\t\t<base href=\"");
      out.print(basePath);
      out.write("\">\r\n");
      out.write("\t\t<style type=\"text/css\">\r\n");
      out.write(".input {\r\n");
      out.write("\theight: 100%;\r\n");
      out.write("\twidth: 100%;\r\n");
      out.write("\tfont-family: 微软雅黑;\r\n");
      out.write("\tfont-size: 12pt;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("\t</head>\r\n");
      out.write("\r\n");
      out.write("\t<body>\r\n");
      out.write("\t\t");
      out.write("\r\n");
      out.write("<table height=130 width=\"100%\" background=\"images/logo.jpg\">\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t<table>\r\n");
      out.write("\t\t\t");
      out.write("\r\n");
      out.write("<td class=\"menu\">\r\n");
      out.write("\t<ul>\r\n");
      out.write("\t\t<li>\r\n");
      out.write("\t\t\t<A HREF=\"welcome.jsp\">首页面</A>\r\n");
      out.write("\t\t</li>\r\n");
      out.write("\t</ul>\r\n");
      out.write("\r\n");
      out.write("\t<ul>\r\n");
      out.write("\t\t个人管理\r\n");
      out.write("\t\t<li>\r\n");
      out.write("\t\t\t<A HREF=\"user.do?act=info&userid=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.userid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">个人档案</A>\r\n");
      out.write("\t\t</li>\r\n");
      out.write("\t\t<li>\r\n");
      out.write("\t\t\t<A HREF=\"check.do?method=list\">考勤管理</A>\r\n");
      out.write("\t\t</li>\r\n");
      out.write("\t</ul>\r\n");
      out.write("\r\n");
      out.write("\t<ul>\r\n");
      out.write("\t\t薪资管理\r\n");
      out.write("\t\t<li>\r\n");
      out.write("\t\t\t<A HREF=\"payment.do?act=usersalary\">个人工资</A>\r\n");
      out.write("\t\t</li>\r\n");
      out.write("\t\t<li>\r\n");
      out.write("\t\t\t<A HREF=\"payment.do?act=jobsalary\">薪资设定</A>\r\n");
      out.write("\t\t</li>\r\n");
      out.write("\t</ul>\r\n");
      out.write("\t<ul>\r\n");
      out.write("\t\t企业管理\r\n");
      out.write("\t\t<li>\r\n");
      out.write("\t\t\t<A HREF=\"train.do?method=list\">培训管理</A>\r\n");
      out.write("\t\t</li>\r\n");
      out.write("\t\t<li>\r\n");
      out.write("\t\t\t<A HREF=\"meeting.do?method=list\">部门管理</A>\r\n");
      out.write("\t\t</li>\r\n");
      out.write("\t</ul>\r\n");
      out.write("\r\n");
      out.write("\t<ul>\r\n");
      out.write("\t\t系统管理\r\n");
      out.write("\t\t<li>\r\n");
      out.write("\t\t\t<A HREF=\"repwd.jsp\">修改密码</A>\r\n");
      out.write("\t\t</li>\r\n");
      out.write("\t\t<li>\r\n");
      out.write("\t\t\t<A HREF=\"user_add.jsp\">增加用户</A>\r\n");
      out.write("\t\t</li>\r\n");
      out.write("\t\t<li>\r\n");
      out.write("\t\t\t<A HREF=\"user.do?act=list\">查看用户</A>\r\n");
      out.write("\t\t</li>\r\n");
      out.write("\t</ul>\r\n");
      out.write("\t<ul>\r\n");
      out.write("\t\t<li>\r\n");
      out.write("\t\t\t<A HREF=\"logout.do\">退出</A>\r\n");
      out.write("\t\t</li>\r\n");
      out.write("\t</ul>\r\n");
      out.write("</td>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t<td class=\"main\">\r\n");
      out.write("\t\t\t\t<table class=\"header\">\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t当前位置：系统管理&gt;&gt;修改用户信息\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t<td align=\"right\">\r\n");
      out.write("\t\t\t\t\t\t\t<A HREF=\"user.do?act=list\">返回查看用户页面</A>\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t&nbsp;\r\n");
      out.write("\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t<FORM METHOD=POST ACTION=\"user.do?act=updateinfo\" name=\"form1\"\">\r\n");
      out.write("\t\t\t\t\t<INPUT TYPE=\"hidden\" NAME=\"id\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<table width=\"70%\" border=\"1\" cellpadding=\"0\" cellspacing=\"0\"\r\n");
      out.write("\t\t\t\t\t\tbgcolor=\"#EAE2F3\" bordercolorlight=\"#A545A3\"\r\n");
      out.write("\t\t\t\t\t\tbordercolordark=\"#FFFFFF\" align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<table width=\"100%\" border=\"0\" cellspacing=\"2\" cellpadding=\"3\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td bgcolor=\"#E7DCF1\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<strong><font color=\"#990000\">员工个人信息</font> </strong>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t</table>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<table width=\"100%\" cellpadding=\"2\" cellspacing=\"3\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tbgcolor=\"#F2EDF8\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td bgcolor=\"#E2D8EF\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<p align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<strong>姓名</strong>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td bgcolor=\"#EAE2F3\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<p align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"name\" class=\"input\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvalue=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td bgcolor=\"#E2D8EF\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<p align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<strong>性别</strong>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td bgcolor=\"#EAE2F3\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<p align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"sex\" class=\"input\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvalue=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.sex}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td bgcolor=\"#E2D8EF\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<p align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<strong>生日</strong>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td bgcolor=\"#EAE2F3\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<p align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"birthday\" class=\"input\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvalue=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.birthday}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td bgcolor=\"#E2D8EF\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<p align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<strong>年龄</strong>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td bgcolor=\"#EAE2F3\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<p align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"age\" class=\"input\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvalue=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.age}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td bgcolor=\"#E2D8EF\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<p align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<strong>籍贯</strong>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td bgcolor=\"#EAE2F3\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<p align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"native\" class=\"input\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvalue=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.native}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td bgcolor=\"#E2D8EF\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<p align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<strong>政治面貌</strong>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td bgcolor=\"#EAE2F3\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<p align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"politicalface\" class=\"input\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvalue=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.politicalface}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td bgcolor=\"#E2D8EF\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<p align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<strong>移动电话</strong>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td bgcolor=\"#EAE2F3\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<p align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"mobile\" class=\"input\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvalue=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.mobile}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td bgcolor=\"#E2D8EF\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<p align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<strong>固定电话</strong>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td bgcolor=\"#EAE2F3\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<p align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"fphone\" class=\"input\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvalue=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.fphone}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td bgcolor=\"#E2D8EF\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<p align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<strong>文化水平</strong>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td bgcolor=\"#EAE2F3\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<p align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"education\" class=\"input\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvalue=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.education}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td bgcolor=\"#E2D8EF\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<p align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<strong>专业</strong>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td bgcolor=\"#EAE2F3\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<p align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"profession\" class=\"input\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvalue=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.profession}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td bgcolor=\"#E2D8EF\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<p align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<strong>身份证号</strong>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td bgcolor=\"#EAE2F3\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<p align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"identify_id\" class=\"input\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvalue=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.identify_id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td bgcolor=\"#E2D8EF\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<p align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<strong>E-mail</strong>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td bgcolor=\"#EAE2F3\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<p align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"email\" class=\"input\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvalue=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.email}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td bgcolor=\"#E2D8EF\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<p align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<strong>地址</strong>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td bgcolor=\"#EAE2F3\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<p align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"address\" class=\"input\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvalue=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.address}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td bgcolor=\"#E2D8EF\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<p align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<strong>婚姻</strong>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td bgcolor=\"#EAE2F3\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<p align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"marry\" class=\"input\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvalue=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.marry}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td bgcolor=\"#E2D8EF\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<p align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<strong>所属部门</strong>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td bgcolor=\"#EAE2F3\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<p align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"dept_id\" class=\"input\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvalue=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.dept_id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td bgcolor=\"#E2D8EF\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<p align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<strong>所属职位</strong>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td bgcolor=\"#EAE2F3\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<p align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"job_id\" class=\"input\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvalue=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.job_id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t<p align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"submit\" value=\"确&nbsp&nbsp认\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"reset\" value=\"重&nbsp&nbsp置\">\r\n");
      out.write("\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t</FORM>\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t</body>\r\n");
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
