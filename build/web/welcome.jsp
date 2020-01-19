<%@page language="java" contentType="text/html; charset=UTF-8"
        pageEncoding="UTF-8"%>
<%@page import="java.lang.*"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Human resource management system-Home</title>
        <link rel="stylesheet" type="text/css" href="css/style.css">
        <%
            int ischeck = (Integer) session.getAttribute("ischeck");
            int isleave = (Integer) session.getAttribute("isleave");
        %>


        <script type="text/javascript">
            function checkCome() {
                var date = new Date();
                var hour = date.getHours();
                var ischeck =<%=ischeck%>;
                if (ischeck == 1) {
                    alert("You have checked in today，Cannot sign in repeatedly！");
                    return false;
                } else if (hour > "9") {
                    alert("You are late！");
                }
                return true;
            }

            function checkLeave() {
                var date = new Date();
                var hour = date.getHours();
                var isleave =<%=isleave%>;
                if (isleave == 1) {
                    alert("You have checked out today，Cannot be checked out repeatedly！");
                    return false;
                } else if (hour < "17") {
                    confirm("Not yet off work，Are you sure you want to check out？");
                }
                return true;
            }
        </script>

        <style type="text/css">
            .main { /*	background-image: url(images/main.jpg);
                    background-position: center;
                    background-repeat: no-repeat;*/

            }

            .welcome {
                width: 100%;
                font-size: 40px;
                color: red;
                margin-left: 350px;
                margin-top: 50px;
            }

            .table {
                margin-top: 50px;
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
                            Current position：Home
                        </td>
                    </tr>
                </table>
                <p>
                    &nbsp;
                </p>
                <p>
                    &nbsp;
                </p>

                <p class="welcome">
                    Welcome to Human Resource Management System!
                </p>

                <p>
                    &nbsp;
                </p>
                <div id="time" align="center">
                    <script>
                        document.getElementById('time').innerHTML = new Date().toLocaleString()
                                + ' Week' + 'Day one two three four five six'.charAt(new Date().getDay());
                        setInterval(
                                "document.getElementById('time').innerHTML=new Date().toLocaleString()+' week'+'Day one two three four five six'.charAt(new Date().getDay());",
                                1000);
                    </script>
                </div>
                <table align="center" class="table">
                    <tr>
                        <td rowspan="2">
                            <font color="red"><%=session.getAttribute("userid")%>,</font>
                        </td>
                        <td>
                            &nbsp;&nbsp;today
                            <%
                                if (ischeck == 0) {
                            %>
                            <font color="red">Not checked in！</font>
                                <%
                                } else if (ischeck == 1) {
                                %>
                            <font color="red">Checked in！</font>
                                <%
                                    }
                                %>
                        </td>
                    <form action="check.do?method=come" method="post"
                          onsubmit="return checkCome();">
                        <td>
                            &nbsp;&nbsp;
                            <input type="submit" value="&nbsp;Sign in&nbsp;">
                        </td>
                    </form>
                    </tr>

                    <tr>
                        <td>
                            &nbsp;&nbsp;today
                            <%
                                if (isleave == 0) {
                            %>
                            <font color="red">Not checked out！</font>
                                <%
                                } else if (isleave == 1) {
                                %>
                            <font color="red">Checked out！</font>
                                <%
                                    }
                                %>
                        </td>

                    <input type="hidden" id="ischeck" value="<%=ischeck%>">
                    <input type="hidden" id="isleave" value="<%=isleave%>">
                    <form action="check.do?method=leave" method="post"
                          onsubmit="return checkLeave();">
                        <td>
                            &nbsp;&nbsp;
                            <input type="submit" value="&nbsp;Sign out &nbsp;">
                        </td>
                    </form>
                    </tr>

                </table>
            </td>
        </table>
    </body>
</html>
