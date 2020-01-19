<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<td class="menu">
    <ul>
        <li>
            <A HREF="welcome.jsp">First page</A>
        </li>
    </ul>

    <ul>
        Personal management
        <li>
            <A HREF="user.do?act=info&userid=${sessionScope.userid}">Profile</A>
        </li>
        <li>
            <A HREF="check.do?method=list">Attendance Management</A>
        </li>
    </ul>

    <ul>
        Payroll management
        <li>
            <A HREF="payment.do?act=usersalary">Personal salary</A>
        </li>
        <li>
            <A HREF="payment.do?act=jobsalary">Salary setting</A>
        </li>
    </ul>
    <ul>
        Business management
        <li>
            <A HREF="train.do?method=list">Training management</A>
        </li>
        <li>
            <A HREF="meeting.do?method=list">Department management</A>
        </li>
    </ul>

    <ul>
        System Management
        <li>
            <A HREF="repwd.jsp">change Password</A>
        </li>
        <li>
            <A HREF="user_add.jsp">Increase user</A>
        </li>
        <li>
            <A HREF="user.do?act=list">View users</A>
        </li>
    </ul>
    <ul>
        <li>
            <A HREF="logout.do">Drop out</A>
        </li>
    </ul>
</td>