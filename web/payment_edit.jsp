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

        <style type="text/css">
            .input {
                height: 100%;
                width: 100%;
                font-family: Times New Roman;
                font-size: 12pt;
            }
        </style>
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
                            <a href="payment.do?act=jobsalary">Go back to the last page</a>
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
                    <FORM METHOD=POST ACTION="payment.do?act=updatesalary" name="form1"">
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
                                                Wage
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
                                                    <input type="text" name="name" class="input"
                                                           value=${hash.salary}>
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
                                                <input type="text" name="name" class="input" value="300"}>
                                            </TD>
                                        </TR>

                                        <TR>
                                            <TD>
                                                Meals
                                            </TD>
                                            <TD>
                                                <input type="text" name="name" class="input" value="300"}>
                                            </TD>
                                        </TR>

                                        <TR>
                                            <TD>
                                                Full Attendance
                                            </TD>
                                            <TD>
                                                <input type="text" name="name" class="input" value="500"}>
                                            </TD>
                                        </TR>
                                        <TR>
                                            <TD>
                                                Overtime allowance
                                            </TD>
                                            <TD>
                                                <input type="text" name="name" class="input" value="100"}>
                                            </TD>
                                        </TR>
                                        <TR>
                                            <TD>
                                                Late and leave early
                                            </TD>
                                            <TD>
                                                <input type="text" name="name" class="input" value="-20"}>
                                            </TD>
                                        </TR>

                                        <TR>
                                            <TD>
                                                Unexcused absence
                                            </TD>
                                            <TD>
                                                <input type="text" name="name" class="input" value="-100"}>
                                            </TD>
                                        </TR>
                                    </TABLE>

                                </td>
                            </tr>
                        </table>
                        <p align="center">
                            <input type="submit" value="Indeed &nbsp&nbsp Rcognize">
                            <input type="reset" value="Weight &nbsp&nbsp Set">
                        </p>
                    </form>
                </CENTER>
            </td>
        </table>
    </body>
</html>
