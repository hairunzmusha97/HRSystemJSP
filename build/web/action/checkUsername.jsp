<%@ page language="java" pageEncoding="UTF-8"%>
<%@page import="javabean.UserBean"%>
<%
    response.setContentType("text/xml");
    response.setHeader("Cache-Control", "no-cache");
    String username = request.getParameter("username");

    UserBean userBean = new UserBean();
    boolean isExist = userBean.isExist(username);

    if (isExist) {
        out.println("<content>This user name already exists!</content>");
    } else {
        out.println("<content>ok</content>");
    }
%>