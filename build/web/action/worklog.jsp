<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="javabean.WorklogBean"%>
<%
    String method = request.getParameter("method");
    String toPage = "../worklog.jsp";

    //Jump to login page when not logged in
    if (session.getAttribute("username") == null) {
        toPage = "../login.jsp";
    } else {
        String username = (String) session.getAttribute("username");//Current login username

        //Get paging parameters
        String pageSize = request.getParameter("pageSize");
        String pageNo = request.getParameter("pageNo");

        if (pageSize == null) {
            pageSize = "20";
        }
        if (pageNo == null) {
            pageNo = "1";
        }
        //Save pagination parameters，Pass to next page
        request.setAttribute("pageSize", pageSize);
        request.setAttribute("pageNo", pageNo);

        WorklogBean worklogBean = new WorklogBean();
        //Perform various operations based on method parameters
        if (method.equals("list")) {//List operations
            worklogBean.list(request, username, pageSize, pageNo);
            toPage = "../worklog.jsp";
        }
        if (method.equals("delete")) {//Delete operation
            worklogBean.delete(request, username);
            worklogBean.list(request, username, pageSize, pageNo);
            toPage = "../worklog.jsp";
        }
        if (method.equals("add")) {//New operation
            toPage = "../worklog_add.jsp";
        }
        if (method.equals("insert")) {//Insert operation
            worklogBean.insert(request, username);
            worklogBean.list(request, username, pageSize, pageNo);
            toPage = "../worklog.jsp";
        }
        if (method.equals("edit")) {//Edit operation
            worklogBean.select(request, username);
            toPage = "../worklog_edit.jsp";
        }
        if (method.equals("update")) {//Update operation
            worklogBean.update(request, username);
            worklogBean.list(request, username, pageSize, pageNo);
            toPage = "../worklog.jsp";
        }
    }
%>
<jsp:forward page="<%=toPage%>" />
