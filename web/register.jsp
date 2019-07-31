<%--
  Created by IntelliJ IDEA.
  User: witch
  Date: 24.07.2019
  Time: 22:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register</title>
</head>
<body>
<%
    String error = (String) request.getAttribute("error");
    if (error != null) {
        response.getWriter().write(error);
    }
%>

<%--make radiobutton for role--%>
<div align="center">
    <form action="/onlineshop/admin/register" method="post">
        Email <input name="email" type="email" value=<%=request.getParameter("email")== null ? "" : request.getParameter("email")%>><br>
        Password <input name="password" type="password"> <br>
        Repeat password <input name="repeatPassword" type="password"> <br>
        Set user role "user" <input name="setUserRole" type="radio" value="user"> <br>
        Set user role "admin" <input name="setUserRole" type="radio" value="admin"> <br>
        <button type="submit">Register</button><br>
        <a href="/onlineshop/admin/users">All users</a>
    </form>
</div>
</body>
</html>
