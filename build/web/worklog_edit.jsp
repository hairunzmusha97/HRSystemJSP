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
        <title>Enterprise Information Management System-Modify work records</title>
        <meta name="pragma" content="no-cache">
        <meta name="cache-control" content="no-cache">
        <meta name="keywords" content="Enterprise Information Management">
        <meta name="description" content="Enterprise Information Management System-Modify work records">
        <meta name="Content-Type" content="text/html;charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="css/style.css">
        <base href="<%=basePath%>">

        <script language="javascript">
            function validWorklogEdit(form) {
                var year = form.year.value;
                var month = form.month.value;
                var day = form.day.value;
                var title = form.title.value;
                if (year == "") {
                    alert("Year cannot be empty！");
                    return false;
                }
                if (month == "") {
                    alert("Month cannot be empty！");
                    return false;
                }
                if (day == "") {
                    alert("Date cannot be empty！");
                    return false;
                }
                if (title == "") {
                    alert("Subject cannot be empty！");
                    return false;
                }
                return true;
            }
        </script>
    </head>

    <body bgcolor="#52BDFE">
        <table height=100% width=100%>
            <tr>
                <td colspan=2 height=100>
                    <%@include file="inc/top.jsp"%>
                </td>
            </tr>
            <tr>
                <%@include file="inc/menu.jsp"%>

                <td valign="top">
                    <TABLE width=100% bgcolor="#66FF66" class="position">
                        <TR>
                            <TD>
                                Current position：Work record &gt;&gt; Modify work records
                            </TD>
                            <TD align="right">
                                <A
                                    HREF="worklog.do?method=list&pageSize=${requestScope.pageSize}
                                    &pageNo=${requestScope.pageNo}">Back to work history page</A>
                            </TD>
                        </TR>
                        <TR>
                        <FORM METHOD=POST ACTION="worklog.do?method=update"
                              name="form1" onsubmit="return validWorklogEdit(this);">
                            <INPUT TYPE="hidden" NAME="id"
                                   value="${requestScope.id}">
                            <INPUT TYPE="hidden" NAME="pageSize" value="${requestScope.pageSize}">
                            <INPUT TYPE="hidden" NAME="pageNo" value="${requestScope.pageNo}">
                            <TABLE width="100%" bgcolor="#66FF66" height="95%">
                                <TR valign="top">
                                    <TD>
                                        Years
                                    </TD>
                                    <TD>
                                        <INPUT TYPE="text" NAME="year"
                                               value="${requestScope.year}">
                                    </TD>
                                </TR>
                                <TR valign="top">
                                    <TD>
                                        Month
                                    </TD>
                                    <TD>
                                        <INPUT TYPE="text" NAME="month"
                                               value="${requestScope.month}">
                                    </TD>
                                </TR>
                                <TR valign="top">
                                    <TD>
                                        Date
                                    </TD>
                                    <TD>
                                        <INPUT TYPE="text" NAME="day"
                                               value="${requestScope.day}">
                                    </TD>
                                </TR>
                                <TR valign="top">
                                    <TD>
                                        Record title
                                    </TD>
                                    <TD>
                                        <INPUT TYPE="text" NAME="title"
                                               value="${requestScope.title}">
                                    </TD>
                                </TR>
                                <TR valign="top">
                                    <TD>
                                        Record content
                                    </TD>
                                    <TD>
                                        <TEXTAREA NAME="description" ROWS="15" COLS="60">${requestScope.description}</TEXTAREA>
										</TD>
									</TR>
									<TR valign="top">
										<TD colspan=1 align="center" height="30%">
											<INPUT TYPE="submit" value="submit">
										</TD>
									</TR>
								</TABLE>
							</FORM>
						</TR>
					</TABLE>
				</td>
			</tr>
		</table>
	</body>
</html>
