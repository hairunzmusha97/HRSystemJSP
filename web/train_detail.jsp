<%@page language="java" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="jsf_core"%>
<%@taglib prefix="emis" uri="emis"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://"
            + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>
<%
    boolean isSign = false;
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<html>
    <head>
        <title>Human resource management-Training Information</title>
        <meta name="pragma" content="no-cache">
        <meta name="cache-control" content="no-cache">
        <meta name="Content-Type" content="text/html;charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="css/style.css">
        <base href="<%=basePath%>">

        <script type="text/javascript">
            function success() {
                alert("Successful Registration！");
            }
        </script>

    </head>

    <body>
        <%@include file="inc/top.jsp"%>

        <table>
            <%@include file="inc/menu.jsp"%>

            <td class="main">
                <table class="header">
                    <tr>
                        <td>
                            Current Position：Business Management &gt;&gt; Training details
                        </td>
                        <td align="right">
                            <A HREF="train.do?method=list">Back to training information interface</A>
                        </td>
                    </tr>
                </table>
                <p>
                    &nbsp;
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
                                            <strong><font color="#990000">Training details</font> </strong>
                                        </div>
                                    </td>
                                </tr>
                            </table>

                            <table width="100%" cellpadding="2" cellspacing="3"
                                   bgcolor="#F2EDF8">
                                <tr>
                                    <td bgcolor="#E2D8EF">
                                        <p align="center">
                                            <strong>Training title</strong>
                                        </p>
                                    </td>
                                    <td bgcolor="#EAE2F3">
                                        <p align="center">
                                            ${requestScope.title}
                                        </p>
                                    </td>
                                    <td bgcolor="#E2D8EF">
                                        <p align="center">
                                            <strong>Training department</strong>
                                        </p>
                                    </td>
                                    <td bgcolor="#EAE2F3">
                                        <p align="center">
                                            ${requestScope.dept_name}
                                        </p>
                                    </td>
                                </tr>
                                <tr>
                                    <td bgcolor="#E2D8EF">
                                        <p align="center">
                                            <strong>Starting time</strong>
                                        </p>
                                    </td>
                                    <td bgcolor="#EAE2F3">
                                        <p align="center">
                                            ${requestScope.stime}
                                        </p>
                                    </td>
                                    <td bgcolor="#E2D8EF">
                                        <p align="center">
                                            <strong>End Time</strong>
                                        </p>
                                    </td>
                                    <td bgcolor="#EAE2F3">
                                        <p align="center">
                                            ${requestScope.etime}
                                        </p>
                                    </td>
                                </tr>

                                <tr>
                                    <td bgcolor="#E2D8EF">
                                        <p align="center">
                                            <strong>Trainer</strong>
                                        </p>
                                    </td>
                                    <td bgcolor="#EAE2F3">
                                        <p align="center">
                                            ${requestScope.leader}
                                        </p>
                                    </td>
                                    <td bgcolor="#E2D8EF">
                                        <p align="center">
                                            <strong>Training number</strong>
                                        </p>
                                    </td>
                                    <td bgcolor="#EAE2F3">
                                        <p align="center">
                                            ${requestScope.member}
                                        </p>
                                    </td>
                                </tr>

                                <tr>
                                    <td bgcolor="#E2D8EF">
                                        <p align="center">
                                            <strong>Training reported</strong>
                                        </p>
                                    </td>
                                    <td bgcolor="#EAE2F3">
                                        <p align="center">
                                            ${requestScope.now_member}
                                        </p>
                                    </td>

                                    <td bgcolor="#E2D8EF">
                                        <p align="center">
                                            <strong>Training left</strong>
                                        </p>
                                    </td>
                                    <td bgcolor="#EAE2F3">
                                        <p align="center">
                                            <%
                                                int member = Integer.parseInt((String) request
                                                        .getAttribute("member"));
                                                int now_member = Integer.parseInt((String) request
                                                        .getAttribute("now_member"));
                                                int rest = member - now_member;
                                            %>
                                            <%=rest%>
                                        </p>
                                    </td>
                                </tr>

                                <tr height="50%">
                                    <td bgcolor="#E2D8EF">
                                        <p align="center">
                                            <strong>Training content</strong>
                                        </p>
                                    </td>
                                    <td bgcolor="#EAE2F3" colspan="3">
                                        <p align="center">
                                            ${requestScope.content}
                                        </p>
                                    </td>
                                </tr>

                            </table>

                            <p align="center">
                                <input type="submit" value="Sign up for training" onclick="success()">
                            </p>

                        </td>
                    </tr>
                </table>
            </td>
        </table>
    </body>
</html>
