<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="jsf_core"%>
<%
    request.setCharacterEncoding("utf8");
    response.setCharacterEncoding("utf8");
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Human resource management system-View users</title>
        <link rel="stylesheet" type="text/css" href="css/style.css">

        <style type="text/css">
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
                            Current position：Payroll management &gt;&gt; Personal salary
                        </td>
                    </tr>
                </table>
                <CENTER>
                    <div>
                        <strong><font color="#990000">User personal salary information </font> </strong>
                    </div>
                    <TABLE table width="80%" border="1" cellpadding="0" cellspacing="0"
                           bgcolor="#EAE2F3" bordercolorlight="#A545A3"
                           bordercolordark="#FFFFFF">
                        <TR class="tableheader">
                            <td>
                                Numbering
                            </td>
                            <TD>
                                Name
                            </TD>
                            <TD>
                                Month
                            </TD>
                            <TD>
                                Basic wage
                            </TD>
                            <td>
                                Extra pay
                            </td>
                            <td>
                                Bonus
                            </td>
                            <td>
                                Fine
                            </td>
                            <td>
                                Gross Salary
                            </td>
                            <td>
                                Operating
                            </td>
                        </TR>
                        <c:forEach items="${requestScope.list}" var="hash">
                            <TR>
                                <TD>
                                    ${hash.employee_id}
                                </TD>
                                <TD>
                                    ${hash.name}
                                </TD>
                                <TD>
                                    ${hash.month}
                                </TD>
                                <TD>
                                    ${hash.basic_salary}
                                </TD>
                                <TD>
                                    ${hash.extra_salary}
                                </TD>
                                <TD>
                                    ${hash.bonus}
                                </TD>
                                <TD>
                                    ${hash.forfeit}
                                </TD>
                                <td>
                                    ${hash.basic_salary}
                                </td>
                                <td>
                                    <a href="user.do?act=edit&userid=${hash.userid}">Modify extra salary</a>&nbsp&nbsp
                                </TD>
                            </TR>
                        </c:forEach>
                    </TABLE>
                </CENTER>
            </td>
        </table>
    </body>
</html>