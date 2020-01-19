<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="javabean.NoticeBean"%>
<%
    String method = request.getParameter("method");
    String toPage = "../notice.jsp";

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

        NoticeBean noticeBean = new NoticeBean();

        //Perform various operations based on method parameters
        if (method.equals("list")) {//List operations
            noticeBean.list(request, username, pageSize, pageNo);
            toPage = "../notice.jsp";
        }
        if (method.equals("delete")) {//Delete operation
            noticeBean.delete(request, username);
            noticeBean.list(request, username, pageSize, pageNo);
            toPage = "../notice.jsp";
        }
        if (method.equals("add")) {//New operation
            toPage = "../notice_add.jsp";
        }
        if (method.equals("insert")) {//Insert operation
            noticeBean.insert(request, username);
            noticeBean.list(request, username, pageSize, pageNo);
            toPage = "../notice.jsp";
        }
        if (method.equals("edit")) {//Edit operation
            noticeBean.select(request, username);
            toPage = "../notice_edit.jsp";
        }
        if (method.equals("update")) {//Update operation
            noticeBean.update(request, username);
            noticeBean.list(request, username, pageSize, pageNo);
            toPage = "../notice.jsp";
        }
    }
%>
<jsp:forward page="<%=toPage%>" />
