<%@page language="java" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="jsf_core"%>
<%@taglib prefix="emis" uri="emis"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://"
            + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<html>
    <head>
        <title>Human resource management system-Training management</title>
        <meta name="pragma" content="no-cache">
        <meta name="cache-control" content="no-cache">

        <meta name="Content-Type" content="text/html;charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="css/style.css">
        <base href="<%=basePath%>">
    </head>

    <body>
        <%@include file="inc/top.jsp"%>

        <table>
            <%@include file="inc/menu.jsp"%>

            <td class="main">
                <table class="header">
                    <tr>
                        <td>
                            Current position：Business management &gt;&gt; Training management
                        </td>
                        <TD align="right">
                            <A HREF="train.do?method=add">New training announcements</A>
                        </TD>
                    </tr>
                </table>
                <p>
                    &nbsp;
                </p>
                <p>
                    &nbsp;
                </p>

                <CENTER>
                    <div>
                        <strong><font color="#990000">Training Information</font> </strong>
                    </div>
                    <%
                        int count = 0;
                    %>
                    <TABLE table width="80%" border="1" cellpadding="0" cellspacing="0"
                           bgcolor="#EAE2F3" bordercolorlight="#A545A3"
                           bordercolordark="#FFFFFF">
                        <TR class="tableheader">
                            <td>
                                Numbering
                            </td>
                            <TD>
                                Training title
                            </TD>
                            <TD>
                                Training start time
                            </TD>
                            <td>
                                Training end time
                            </td>
                            <td>
                                Training department
                            </td>
                            <td>
                                Training publisher
                            </td>
                            <TD>
                                Training number
                            </TD>
                            <TD>
                                Operating
                            </TD>
                        </TR>

                        <c:forEach items="${requestScope.list}" var="hash">
                            <TR valign="top">
                                <td><%=++count%></td>
                                <TD>
                                    ${hash.title}
                                </TD>
                                <TD>
                                    ${hash.stime}
                                </TD>
                                <TD>
                                    ${hash.etime}
                                </TD>
                                <TD>
                                    ${hash.dept_name}
                                </TD>
                                <TD>
                                    ${hash.realeaser}
                                </TD>
                                <TD>
                                    ${hash.member}
                                </TD>
                                <TD>
                                    <a href="train.do?method=info&id=${hash.id}">Check the detail information</a>
                                    <a href="train.do?method=edit&id=${hash.id}">Modify</a>
                                    <a href="train.do?method=delete&id=${hash.id}">delete</a>
                                </TD>
                            </TR>
                        </c:forEach>
                    </TABLE>
            </td>
        </tr>
    </table>
</body>
</html>

