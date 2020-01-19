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
        <title>Human resource management system-Personal information</title>
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
                <p class="header">
                    current position：Personal information
                </p>
                <p>
                    &nbsp
                </p>
                <p>
                    &nbsp
                </p>
                <table width="70%" border="1" cellpadding="0" cellspacing="0"
                       bgcolor="#EAE2F3" bordercolorlight="#A545A3"
                       bordercolordark="#FFFFFF" align="center">
                    <tr>
                        <td>
                            <table width="100%" border="0" cellspacing="2" cellpadding="3">
                                <tr>
                                    <td bgcolor="#E7DCF1">
                                        <div align="center">
                                            <strong><font color="#990000">Personal information of employees</font> </strong>
                                        </div>
                                    </td>
                                </tr>
                            </table>

                            <table width="100%" cellpadding="2" cellspacing="3"
                                   bgcolor="#F2EDF8">
                                <tr>
                                    <td bgcolor="#E2D8EF">
                                        <p align="center">
                                            <strong>Name</strong>
                                        </p>
                                    </td>
                                    <td bgcolor="#EAE2F3">
                                        <p align="center">
                                            ${requestScope.name}
                                        </p>
                                    </td>
                                    <td bgcolor="#E2D8EF">
                                        <p align="center">
                                            <strong>Gender</strong>
                                        </p>
                                    </td>
                                    <td bgcolor="#EAE2F3">
                                        <p align="center">
                                            ${requestScope.sex}
                                        </p>
                                    </td>
                                </tr>
                                <tr>
                                    <td bgcolor="#E2D8EF">
                                        <p align="center">
                                            <strong>Birthday</strong>
                                        </p>
                                    </td>
                                    <td bgcolor="#EAE2F3">
                                        <p align="center">
                                            ${requestScope.birthday}
                                        </p>
                                    </td>
                                    <td bgcolor="#E2D8EF">
                                        <p align="center">
                                            <strong>Age</strong>
                                        </p>
                                    </td>
                                    <td bgcolor="#EAE2F3">
                                        <p align="center">
                                            ${requestScope.age}
                                        </p>
                                    </td>
                                </tr>

                                <tr>
                                    <td bgcolor="#E2D8EF">
                                        <p align="center">
                                            <strong>Hometown</strong>
                                        </p>
                                    </td>
                                    <td bgcolor="#EAE2F3">
                                        <p align="center">
                                            ${requestScope.native}
                                        </p>
                                    </td>
                                    <td bgcolor="#E2D8EF">
                                        <p align="center">
                                            <strong>Political status</strong>
                                        </p>
                                    </td>
                                    <td bgcolor="#EAE2F3">
                                        <p align="center">
                                            ${requestScope.politicalface}
                                        </p>
                                    </td>
                                </tr>

                                <tr>
                                    <td bgcolor="#E2D8EF">
                                        <p align="center">
                                            <strong>Mobile phone</strong>
                                        </p>
                                    </td>
                                    <td bgcolor="#EAE2F3">
                                        <p align="center">
                                            ${requestScope.mobile}
                                        </p>
                                    </td>
                                    <td bgcolor="#E2D8EF">
                                        <p align="center">
                                            <strong>Fixed telephone</strong>
                                        </p>
                                    </td>
                                    <td bgcolor="#EAE2F3">
                                        <p align="center">
                                            ${requestScope.fphone}
                                        </p>
                                    </td>
                                </tr>

                                <tr>
                                    <td bgcolor="#E2D8EF">
                                        <p align="center">
                                            <strong>Cultural level</strong>
                                        </p>
                                    </td>
                                    <td bgcolor="#EAE2F3">
                                        <p align="center">
                                            ${requestScope.education}
                                        </p>
                                    </td>
                                    <td bgcolor="#E2D8EF">
                                        <p align="center">
                                            <strong>Profession</strong>
                                        </p>
                                    </td>
                                    <td bgcolor="#EAE2F3">
                                        <p align="center">
                                            ${requestScope.profession}
                                        </p>
                                    </td>
                                </tr>

                                <tr>
                                    <td bgcolor="#E2D8EF">
                                        <p align="center">
                                            <strong>ID</strong>
                                        </p>
                                    </td>
                                    <td bgcolor="#EAE2F3">
                                        <p align="center">
                                            ${requestScope.identify_id}
                                        </p>
                                    </td>
                                    <td bgcolor="#E2D8EF">
                                        <p align="center">
                                            <strong>E-mail</strong>
                                        </p>
                                    </td>
                                    <td bgcolor="#EAE2F3">
                                        <p align="center">
                                            ${requestScope.email}
                                        </p>
                                    </td>
                                </tr>

                                <tr>
                                    <td bgcolor="#E2D8EF">
                                        <p align="center">
                                            <strong>Address</strong>
                                        </p>
                                    </td>
                                    <td bgcolor="#EAE2F3">
                                        <p align="center">
                                            ${requestScope.address}
                                        </p>
                                    </td>
                                    <td bgcolor="#E2D8EF">
                                        <p align="center">
                                            <strong>Marriage</strong>
                                        </p>
                                    </td>
                                    <td bgcolor="#EAE2F3">
                                        <p align="center">
                                            ${requestScope.marry}
                                        </p>
                                    </td>
                                </tr>

                                <tr>
                                    <td bgcolor="#E2D8EF">
                                        <p align="center">
                                            <strong>Department</strong>
                                        </p>
                                    </td>
                                    <td bgcolor="#EAE2F3">
                                        <p align="center">
                                            ${requestScope.dept_id}
                                        </p>
                                    </td>
                                    <td bgcolor="#E2D8EF">
                                        <p align="center">
                                            <strong>Position</strong>
                                        </p>
                                    </td>
                                    <td bgcolor="#EAE2F3">
                                        <p align="center">
                                            ${requestScope.job_id}
                                        </p>
                                    </td>
                                </tr>
                            </table>

                        </td>
                    </tr>
                </table>
            </td>
        </table>
    </body>
</html>
