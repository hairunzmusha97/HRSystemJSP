<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@page import="javabean.AddressBean"%>
<%
    String method = request.getParameter("method");
    String toPage = "../address.jsp";

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

        AddressBean addressBean = new AddressBean();

        //Perform various operations based on method parameters
        if (method.equals("list")) {//List operations
            addressBean.list(request, username, pageSize, pageNo);
            toPage = "../address.jsp";
        }
        if (method.equals("delete")) {//Delete operation
            addressBean.delete(request, username);
            addressBean.list(request, username, pageSize, pageNo);
            toPage = "../address.jsp";
        }
        if (method.equals("add")) {//New operation
            toPage = "../address_add.jsp";
        }
        if (method.equals("insert")) {//Insert operation
            addressBean.insert(request, username);
            addressBean.list(request, username, pageSize, pageNo);
            toPage = "../address.jsp";
        }
        if (method.equals("edit")) {//Edit operation
            addressBean.select(request, username);
            toPage = "../address_edit.jsp";
        }
        if (method.equals("update")) {//Update operation
            addressBean.update(request, username);
            addressBean.list(request, username, pageSize, pageNo);
            toPage = "../address.jsp";
        }
    }
%>
<jsp:forward page="<%=toPage%>" />


