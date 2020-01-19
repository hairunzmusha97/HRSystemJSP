<%@page language="java" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="jsf_core"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://"
            + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<html>
    <head>
        <title>Human resource management system-Salary setting</title>
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
                            Current position：Payroll management &gt;&gt; Salary setting
                        </td>
                        <td align="right">
                            <a href="payment.do?act=edit">Edit salary</a>
                        </td>
                    </tr>
                </table>
                <p>
                    &nbsp;
                </p>
                <p>
                    &nbsp;
                </p>
                <CENTER>
                    <table>
                        <tr>
                            <td width="400px">
                                <div align="center">
                                    <strong><font color="#990000">Basic salary setting</font> </strong>
                                </div>
                                <TABLE table width="100%" border="1" cellpadding="0"
                                       cellspacing="0" bgcolor="#EAE2F3" bordercolorlight="#A545A3"
                                       bordercolordark="#FFFFFF">
                                    <TR class="tableheader">
                                        <TD>
                                            Department name
                                        </TD>
                                        <TD>
                                            Job title
                                        </TD>
                                        <TD>
                                            wage
                                        </TD>
                                    </TR>
                                    <c:forEach items="${requestScope.list}" var="hash">
                                        <TR>
                                            <TD>
                                                ${hash.dept_name}
                                            </TD>
                                            <TD>
                                                ${hash.job_name}
                                            </TD>
                                            <TD>
                                                ${hash.salary}
                                            </TD>
                                        </TR>
                                    </c:forEach>
                                </TABLE>
                            </td>
                            <td width="100px"></td>
                            <td width="300px">
                                <div align="center">
                                    <strong><font color="#990000">Additional salary settings</font> </strong>
                                </div>
                                <TABLE table width="100%" border="1" cellpadding="0"
                                       cellspacing="0" bgcolor="#EAE2F3" bordercolorlight="#A545A3"
                                       bordercolordark="#FFFFFF">
                                    <TR class="tableheader">
                                        <TD>
                                            Project
                                        </TD>
                                        <TD>
                                            Salary
                                        </TD>
                                    </TR>
                                    <TR>
                                        <TD>
                                            Housing assistance
                                        </TD>
                                        <TD>
                                            300
                                        </TD>
                                    </TR>

                                    <TR>
                                        <TD>
                                            Meals
                                        </TD>
                                        <TD>
                                            300
                                        </TD>
                                    </TR>

                                    <TR>
                                        <TD>
                                            Full Attendance
                                        </TD>
                                        <TD>
                                            500
                                        </TD>
                                    </TR>

                                    <TR>
                                        <TD>
                                            Overtime allowance
                                        </TD>
                                        <TD>
                                            100
                                        </TD>
                                    </TR>

                                    <TR>
                                        <TD>
                                            Late and leave early
                                        </TD>
                                        <TD>
                                            -20
                                        </TD>
                                    </TR>

                                    <TR>
                                        <TD>
                                            Unexcused absence
                                        </TD>
                                        <TD>
                                            -100
                                        </TD>
                                    </TR>

                                </TABLE>
                            </td>
                        </tr>
                    </table>
                </CENTER>
            </td>
        </table>
    </body>
</html>
