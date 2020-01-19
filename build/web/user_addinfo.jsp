<%@page language="java" pageEncoding="UTF-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://"
            + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>

<%
    request.setCharacterEncoding("utf8");
    response.setCharacterEncoding("utf8");
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<html>
    <head>
        <title>Human resource management system-Increase user information</title>
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

            .td {
                width: 100px;
            }

            .td2 {
                width: 200px;
            }
            select {
                width:80%;
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
                            Current Position：System Management &gt;&gt; Increase user information
                        </td>
                        <td align="right">
                            <A HREF="user_add.jsp">Back to add user interface</A>
                        </td>
                    </tr>
                </table>
                <p>
                    &nbsp;
                </p>
                <FORM METHOD=POST ACTION="user.do?act=insertinfo" name="form1"">
                    <INPUT TYPE="hidden" NAME="userid" value=${requestScope.userid}>
                    <INPUT TYPE="hidden" NAME="type" value=${requestScope.type}>

                    <table width="70%" border="1" cellpadding="0" cellspacing="0"
                           bgcolor="#EAE2F3" bordercolorlight="#A545A3"
                           bordercolordark="#FFFFFF" align="center">
                        <tr>
                            <td>
                                <table width="100%" border="0" cellspacing="2" cellpadding="3">
                                    <tr>
                                        <td bgcolor="#E7DCF1">
                                            <div align="center">
                                                <strong><font color="#990000">Add employee personal information</font> </strong>
                                            </div>
                                        </td>
                                    </tr>
                                </table>

                                <table width="100%" cellpadding="2" cellspacing="3"
                                       bgcolor="#F2EDF8">
                                    <tr>
                                        <td bgcolor="#E2D8EF" class="td">
                                            <p align="center">
                                                <strong>Name</strong>
                                            </p>
                                        </td>
                                        <td bgcolor="#EAE2F3" class="td2">
                                            <p align="center">
                                                <input type="text" name="name" class="input"
                                                       value=${requestScope.name}>
                                            </p>
                                        </td>
                                        <td bgcolor="#E2D8EF" class="td">
                                            <p align="center">
                                                <strong>gender</strong>
                                            </p>
                                        </td>
                                        <td bgcolor="#EAE2F3" class="td2">
                                            <p align="center">
                                                <input type="text" name="sex" class="input">
                                            </p>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td bgcolor="#E2D8EF" class="td">
                                            <p align="center">
                                                <strong>Birthday</strong>
                                            </p>
                                        </td>
                                        <td bgcolor="#EAE2F3" class="td2">
                                            <p align="center">
                                                <input type="text" name="birthday" class="input">
                                            </p>
                                        </td>
                                        <td bgcolor="#E2D8EF" class="td">
                                            <p align="center">
                                                <strong>Age</strong>
                                            </p>
                                        </td>
                                        <td bgcolor="#EAE2F3" class="td2">
                                            <p align="center">
                                                <input type="text" name="age" class="input">
                                            </p>
                                        </td>
                                    </tr>

                                    <tr>
                                        <td bgcolor="#E2D8EF" class="td">
                                            <p align="center">
                                                <strong>Hometown</strong>
                                            </p>
                                        </td>
                                        <td bgcolor="#EAE2F3" class="td2">
                                            <p align="center">
                                                <input type="text" name="native" class="input">
                                            </p>
                                        </td>
                                        <td bgcolor="#E2D8EF" class="td">
                                            <p align="center">
                                                <strong>Political status</strong>
                                            </p>
                                        </td>
                                        <td bgcolor="#EAE2F3" class="td2">
                                            <p align="center">
                                                <input type="text" name="politicalface" class="input">
                                            </p>
                                        </td>
                                    </tr>

                                    <tr>
                                        <td bgcolor="#E2D8EF" class="td">
                                            <p align="center">
                                                <strong>Mobile phone</strong>
                                            </p>
                                        </td>
                                        <td bgcolor="#EAE2F3" class="td2">
                                            <p align="center">
                                                <input type="text" name="mobile" class="input">
                                            </p>
                                        </td>
                                        <td bgcolor="#E2D8EF" class="td">
                                            <p align="center">
                                                <strong>Fixed Telephone</strong>
                                            </p>
                                        </td>
                                        <td bgcolor="#EAE2F3" class="td2">
                                            <p align="center">
                                                <input type="text" name="fphone" class="input">
                                            </p>
                                        </td>
                                    </tr>

                                    <tr>
                                        <td bgcolor="#E2D8EF" class="td">
                                            <p align="center">
                                                <strong>Cultural level</strong>
                                            </p>
                                        </td>
                                        <td bgcolor="#EAE2F3" class="td2">
                                            <p align="center">
                                                <input type="text" name="education" class="input">
                                            </p>
                                        </td>
                                        <td bgcolor="#E2D8EF" class="td">
                                            <p align="center">
                                                <strong>Profession</strong>
                                            </p>
                                        </td>
                                        <td bgcolor="#EAE2F3" class="td2">
                                            <p align="center">
                                                <input type="text" name="profession" class="input">
                                            </p>
                                        </td>
                                    </tr>

                                    <tr>
                                        <td bgcolor="#E2D8EF" class="td">
                                            <p align="center">
                                                <strong>ID</strong>
                                            </p>
                                        </td>
                                        <td bgcolor="#EAE2F3" class="td2">
                                            <p align="center">
                                                <input type="text" name="identify_id" class="input">
                                            </p>
                                        </td>
                                        <td bgcolor="#E2D8EF" class="td">
                                            <p align="center">
                                                <strong>E-mail</strong>
                                            </p>
                                        </td>
                                        <td bgcolor="#EAE2F3" class="td2">
                                            <p align="center">
                                                <input type="text" name="email" class="input">
                                            </p>
                                        </td>
                                    </tr>

                                    <tr>
                                        <td bgcolor="#E2D8EF" class="td">
                                            <p align="center">
                                                <strong>Address</strong>
                                            </p>
                                        </td>
                                        <td bgcolor="#EAE2F3" class="td2">
                                            <p align="center">
                                                <input type="text" name="address" class="input">
                                            </p>
                                        </td>
                                        <td bgcolor="#E2D8EF" class="td">
                                            <p align="center">
                                                <strong>Maariage</strong>
                                            </p>
                                        </td>
                                        <td bgcolor="#EAE2F3" class="td2">
                                            <p align="center">
                                                <input type="text" name="marry" class="input">
                                            </p>
                                        </td>
                                    </tr>

                                    <tr>
                                        <td bgcolor="#E2D8EF" class="td">
                                            <p align="center">
                                                <strong>Department</strong>
                                            </p>
                                        </td>
                                        <td bgcolor="#EAE2F3" class="td2">
                                            <p align="center">
                                                <select name="dept_id">
                                                    <option value="1">
                                                        Technical department
                                                    </option>
                                                    <option value="2">
                                                        Development department
                                                    </option>
                                                    <option value="3">
                                                        Personnel Department
                                                    </option>
                                                    <option value="4">
                                                        Sales
                                                    </option>
                                                    <option value="5">
                                                        Production department
                                                    </option>
                                                    <option value="6">
                                                        General department
                                                    </option>
                                                </select>
                                            </p>
                                        </td>
                                        <td bgcolor="#E2D8EF" class="td">
                                            <p align="center">
                                                <strong>Position</strong>
                                            </p>
                                        </td>
                                        <td bgcolor="#EAE2F3" class="td2">
                                            <p align="center">
                                                <select name="job_id">
                                                    <option value="1">
                                                        Manager
                                                    </option>
                                                    <option value="2">
                                                        Employee
                                                    </option>
                                                </select>
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
