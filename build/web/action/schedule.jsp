<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@page import="javabean.ScheduleBean"%>
<%
    String method = request.getParameter("method");
    String toPage = "../schedule.jsp";

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

        ScheduleBean scheduleBean = new ScheduleBean();
        //Perform various operations based on method parameters
        if (method.equals("list")) {//List operations
            scheduleBean.list(request, username, pageSize, pageNo);
            toPage = "../schedule.jsp";
        }
        if (method.equals("delete")) {//Delete operation
            scheduleBean.delete(request, username);
            scheduleBean.list(request, username, pageSize, pageNo);
            toPage = "../schedule.jsp";
        }
        if (method.equals("add")) {//New operation
            toPage = "../schedule_add.jsp";
        }
        if (method.equals("insert")) {//Insert operation
            scheduleBean.insert(request, username);
            scheduleBean.list(request, username, pageSize, pageNo);
            toPage = "../schedule.jsp";
        }
        if (method.equals("edit")) {//Edit operation
            scheduleBean.select(request, username);
            toPage = "../schedule_edit.jsp";
        }
        if (method.equals("update")) {//Update operation
            scheduleBean.update(request, username);
            scheduleBean.list(request, username, pageSize, pageNo);
            toPage = "../schedule.jsp";
        }
    }
%>
<jsp:forward page="<%=toPage%>" />

