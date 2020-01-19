<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Human resource management system-Increase user</title>
        <link rel="stylesheet" type="text/css" href="css/style.css">
        <script type="text/javascript">
            function isValid(form) {
                var userid = form.userid.value;
                var name = form.name.value;
                if (userid == "") {
                    alert("User account cannot be empty！");
                    return false;
                }
                if (name == "") {
                    alert("Employee name cannot be empty！");
                    return false;
                }
                return true;
            }

            var XMLHttpReq = false;//Set a variable

            function checkUsername() {
                var username = document.getElementById("username").value;
                if (username == "") {
                    alert("Please enter user name！");
                } else {
                    send('ajax.do?username=' + username);
                }
            }
            function send(url) {
                //Send request function
                createXMLHttpRequest();
                XMLHttpReq.open("GET", url, true);
                XMLHttpReq.onreadystatechange = parse; //Specifying the response function
                XMLHttpReq.send(null); //send request
            }

            //Create an XMLHttpRequest object

            function createXMLHttpRequest() {
                if (window.XMLHttpRequest) {
                    XMLHttpReq = new XMLHttpRequest();
                } else if (window.ActiveXObject) {
                    try {
                        XMLHttpReq = new ActiveXObject("Msxml2.XMLHTTP");
                    } catch (e) {
                        try {
                            XMLHttpReq = new ActiveXObject("Microsoft.XMLHTTP");
                        } catch (e) {
                        }
                    }
                }

            }

            function parse() {
                if (XMLHttpReq.readyState == 4) {
                    if (XMLHttpReq.status == 200) {
                        var res = XMLHttpReq.responseXML.getElementsByTagName("content")[0].firstChild.data;
                        if (res == "ok") {
                            document.getElementById("status").innerHTML = "The username can be used!";
                        } else {
                            document.getElementById("status").innerHTML = res;
                            window.alert(res);
                        }
                    } else {
                        window.alert("The requested page has an exception！");
                    }
                }
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
                    Current position：increase user
                </p>
                <center>
                    <fieldset class="field">
                        <legend>
                            New users：
                        </legend>
                        <form name="form1" action="user.do?act=addinfo" method="post"
                              onsubmit="return isValid(this);">
                            <p>
                                User account：
                                <input type="text" name="userid" size="20">
                            </p>
                            <p>
                                Name：
                                <input type="text" name="name" size="20">
                            </p>
                            <p>
                                Authority：
                                <input type="radio" name="type" value="0" checked="true">
                                Administrator
                                <input type="radio" name="type" value="1">
                                Manager
                                <input type="radio" name="type" value="2">
                                Employee
                            </p>
                            <p>
                                <input type="submit" value="Fill in user details">
                            </p>
                        </form>
                    </fieldset>
                </center>
            </td>

        </table>
    </body>
</html>