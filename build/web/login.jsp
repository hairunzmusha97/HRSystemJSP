<%@page language="java" pageEncoding="UTF-8"%>
<%@page import="com.sun.java.swing.plaf.windows.resources.windows"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://"
            + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<html>
    <head>
        <title>Human resource management system-Login</title>

        <meta name="pragma" content="no-cache">
        <meta name="cache-control" content="no-cache">
        <meta name="keywords" content="Manpower，Resources，Management">
        <meta name="description" content="Human resource management system-Login">
        <meta name="Content-Type" content="text/html;charset=UTF-8">

        <link rel="stylesheet" type="text/css" href="css/style.css">
        <base href="<%=basePath%>">

        <style type="text/css">
            body {
                background-image: url(images/login.jpg);
                background-attachment: fixed;
                background-repeat: no-repeat;
                background-position: center;
            }

            table {
                margin-left: 57%;
                margin-top: 23%;
            }

            input {
                font-family: "Times New Roman";
            }
        </style>

        <script type="text/javascript">
            function isValid(form) {
                var username = form.username.value;
                var password = form.password.value;
                if (username == "") {
                    alert("Username can not be empty！");
                    return false;
                }
                if (password == "") {
                    alert("Password can not be blank！");
                    return false;
                }
                return true;
            }
        </script>
    </head>

    <body>

        <form name="form1" action="login.do" method="post"
              onsubmit="return isValid(this);">
            <table>
                <tr>
                <input type="text" name="userid" size="25">
                </tr>
                <tr>
                    &nbsp
                </tr>
                <tr>
                <input type="password" name="password" size="25">
                </tr>
                <tr>
                    <td>
                        <input type="submit" value="Board &nbsp&nbsp Record">
                    </td>
                    <td>
                        <input type="reset" value="Weight &nbsp&nbsp Set">
                    </td>
                </tr>
            </table>
        </form>
    </body>

</html>

