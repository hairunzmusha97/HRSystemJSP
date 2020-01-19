<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="javabean.MeetingBean"%>
<%
    String method = request.getParameter("method");
    String toPage = "../meeting.jsp";

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

        MeetingBean meetingBean = new MeetingBean();
        //Perform various operations based on method parameters
        if (method.equals("list")) {//List operations
            meetingBean.list(request, username, pageSize, pageNo);
            toPage = "../meeting.jsp";
        }
        if (method.equals("delete")) {//Delete operation
            meetingBean.delete(request, username);
            meetingBean.list(request, username, pageSize, pageNo);
            toPage = "../meeting.jsp";
        }
        if (method.equals("add")) {//New operation
            toPage = "../meeting_add.jsp";
        }
        if (method.equals("insert")) {//Insert operation
            meetingBean.insert(request, username);
            meetingBean.list(request, username, pageSize, pageNo);
            toPage = "../meeting.jsp";
        }
        if (method.equals("edit")) {//Edit operation
            meetingBean.select(request, username);
            toPage = "../meeting_edit.jsp";
        }
        if (method.equals("update")) {//Update operation
            meetingBean.update(request, username);
            meetingBean.list(request, username, pageSize, pageNo);
            toPage = "../meeting.jsp";
        }
    }
%>
<jsp:forward page="<%=toPage%>" />

