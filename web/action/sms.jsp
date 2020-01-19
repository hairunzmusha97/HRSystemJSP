<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="javabean.SmsBean"%>
<%
    String method = request.getParameter("method");
    String toPage = "../sms.jsp";

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

        SmsBean smsBean = new SmsBean();
        //Perform various operations based on method parameters
        if (method.equals("list")) {//List operations
            smsBean.list(request, username, pageSize, pageNo);
            toPage = "../sms.jsp";
        }
        if (method.equals("delete")) {//Delete operation
            smsBean.delete(request, username);
            smsBean.list(request, username, pageSize, pageNo);
            toPage = "../sms.jsp";
        }
        if (method.equals("add")) {//New operation
            toPage = "../sms_add.jsp";
        }
        if (method.equals("insert")) {//Insert operation
            smsBean.insert(request, username);
            smsBean.list(request, username, pageSize, pageNo);
            toPage = "../sms.jsp";
        }
        if (method.equals("read")) {//Update operation
            smsBean.read(request, username);
            smsBean.list(request, username, pageSize, pageNo);
            toPage = "../sms.jsp";
        }
    }
%>
<jsp:forward page="<%=toPage%>" />