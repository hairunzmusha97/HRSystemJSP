<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Human resource management system-Change Password</title>
        <link rel="stylesheet" type="text/css" href="css/style.css">
        <script type="text/javascript">
            function isValid(form) {
                var prepwd = form.prepwd.value;
                var newpwd = form.newpwd.value;
                var newpwd2 = form.newpwd2.value;
                if (prepwd == "") {
                    alert("The original password cannot be empty！");
                    return false;
                }
                if (newpwd == "") {
                    alert("New password cannot be empty！");
                    return false;
                }
                if (newpwd2 == "") {
                    alert("Confirm password can not be blank！");
                    return false;
                }
                if (newpwd != newpwd2) {
                    alert("Passwords entered twice are inconsistent！");
                    return false;
                }
                return true;
            }
        </script>

        <style type="text/css">
            .field {
                width: 35%;
                height: 50%;
                margin: 200px, 200px, 400px, 200px;
            }
        </style>
    </head>

    <body>
        <%@include file="inc/top.jsp"%>

        <table>
            <%@include file="inc/menu.jsp"%>

            <td class="main">
                <p class="header">
                    Current position：Change Password码
                </p>
                <center>
                    <fieldset class="field">
                        <legend>
                            Change Password：
                        </legend>
                        <form name="form1" action="user.do?act=update" method="post"
                              onsubmit="return isValid(this);">
                            <p>
                                Current password：
                                <input type="password" name="prepwd" size="20">
                            </p>
                            <p>
                                Set new password：
                                <input type="password" name="newpwd" size="20">
                            </p>
                            <p>
                                Confirm new password：
                                <input type="password" name="newpwd2" size="20">
                            </p>
                            <p>
                                <input type="submit" value="Indeed &nbsp&nbsp Recognize">
                                <input type="reset" value="Weight &nbsp&nbsp Set">
                            </p>
                        </form>
                    </fieldset>
                </center>
                <%
                    String act = request.getParameter("act");
                    if (act == null) {
                    } else if (act.equals("fail")) {
                        out.print("<p>The original password is wrong，Password change failed!</p>");
                    } else if (act.equals("success")) {
                        out.print("<p>Password reset complete!</p>");
                    }
                %>
            </td>

        </table>
    </body>
</html>