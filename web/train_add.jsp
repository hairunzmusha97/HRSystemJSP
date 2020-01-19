<%@page language="java" pageEncoding="UTF-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://"
            + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<html>
    <head>
        <title>Human resource management-Increase training information</title>
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
                font-family: Times New Roman;
            }

            .content {
                height: 100px;
                width: 600px;
                font-family: Times New Roman;
                font-size: 12pt;
                font-family: Times New Roman;
            }

            .td {
                width: 100px;
            }

            .td2 {
                width: 200px;
            }

            select {
                width: 80%;
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
                            Current position：Business management &gt;&gt; New training information
                        </td>
                        <td align="right">
                            <A HREF="train.do?method=list">Back to training information interface</A>
                        </td>
                    </tr>
                </table>
                <p>
                    &nbsp;
                </p>
                <FORM METHOD=POST ACTION="train.do?method=insert" name="form1"">


                    <table width="70%" border="1" cellpadding="0" cellspacing="0"
                           bgcolor="#EAE2F3" bordercolorlight="#A545A3"
                           bordercolordark="#FFFFFF" align="center">
                        <tr>
                            <td>
                                <table width="100%" border="0" cellspacing="2" cellpadding="3">
                                    <tr>
                                        <td bgcolor="#E7DCF1">
                                            <div align="center">
                                                <strong><font color="#990000">New training information</font> </strong>
                                            </div>
                                        </td>
                                    </tr>
                                </table>

                                <table width="100%" cellpadding="2" cellspacing="3"
                                       bgcolor="#F2EDF8">
                                    <tr>
                                        <td bgcolor="#E2D8EF" class="td">
                                            <p align="center">
                                                <strong>Training title</strong>
                                            </p>
                                        </td>
                                        <td bgcolor="#EAE2F3" class="td2">
                                            <p align="center">
                                                <input type="text" name="title" class="input">
                                            </p>
                                        </td>
                                        <td bgcolor="#E2D8EF" class="td">
                                            <p align="center">
                                                <strong>Training department</strong>
                                            </p>
                                        </td>
                                        <td bgcolor="#EAE2F3" class="td2">
                                            <p align="center">
                                                <input type="text" name="dept_name" class="input">
                                            </p>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td bgcolor="#E2D8EF" class="td">
                                            <p align="center">
                                                <strong>Starting time</strong>
                                            </p>
                                        </td>
                                        <td bgcolor="#EAE2F3" class="td2">
                                            <p align="center">
                                                <input type="text" name="stime" class="input">
                                            </p>
                                        </td>
                                        <td bgcolor="#E2D8EF" class="td">
                                            <p align="center">
                                                <strong>End Time</strong>
                                            </p>
                                        </td>
                                        <td bgcolor="#EAE2F3" class="td2">
                                            <p align="center">
                                                <input type="text" name="etime" class="input">
                                            </p>
                                        </td>
                                    </tr>

                                    <tr>
                                        <td bgcolor="#E2D8EF" class="td">
                                            <p align="center">
                                                <strong>Trainer</strong>
                                            </p>
                                        </td>
                                        <td bgcolor="#EAE2F3" class="td2">
                                            <p align="center">
                                                <input type="text" name="leader" class="input">
                                            </p>
                                        </td>
                                        <td bgcolor="#E2D8EF" class="td">
                                            <p align="center">
                                                <strong>Training number</strong>
                                            </p>
                                        </td>
                                        <td bgcolor="#EAE2F3" class="td2">
                                            <p align="center">
                                                <input type="text" name="member" class="input">
                                            </p>
                                        </td>
                                    </tr>

                                    <tr height="50%">
                                        <td bgcolor="#E2D8EF" class="td">
                                            <p align="center">
                                                <strong>Training content</strong>
                                            </p>
                                        </td>
                                        <td bgcolor="#EAE2F3" class="td2" colspan="3">
                                            <p align="center">
                                                <input type="text" name="content" class="content">
                                            </p>
                                        </td>
                                    </tr>
                                </table>
                            </td>
                        </tr>
                    </table>
                    <p align="center">
                        <input type="submit" value="Indeed &nbsp&nbsp Recognize">
                        <input type="reset" value="Weight &nbsp&nbsp Set">
                    </p>
                </FORM>
            </td>
        </table>
    </body>
</html>
