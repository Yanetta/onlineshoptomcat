<%@ page import="model.User" %>
<%@ page import="java.util.List" %>
<%@ page import="java.io.PrintWriter" %><%--
  Created by IntelliJ IDEA.
  User: witch
  Date: 25.07.2019
  Time: 20:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>All users</title>
</head>
<body>
<table border="3">
    <c:forEach var="user" items="${allUsers}">
        <tr>
            <td>${user.email}</td>
            <td>${user.password}</td>
            <td>${user.role}</td>
            <td>
                <div align="center">
                    <form action="/onlineshop/admin/deleteuser" method="post">
                        delete this user with Id  <input name="deleteuser" type="deleteuser" value=${user.id}> <br>
                        <button type="submit">delete</button><br>
                    </form>
                </div></td>
            <td>
                <div align="center">
                    <form action="edituser" method="post">
                        <button type="submit">edit</button><br>
                    </form>
                </div></td>
        </tr>
    </c:forEach>
</table>

<%--    <%--%>
<%--        PrintWriter printWriter = response.getWriter();--%>
<%--        printWriter.write("<table border = \"1\">\n" +--%>
<%--                "<tr>\n" +--%>
<%--                " <td>Email</td>\n" +--%>
<%--                " <td>Password</td>\n" +--%>
<%--                "<tr>");--%>
<%--        List<User> allUsers = (List<User>) request.getAttribute("allUsers");--%>
<%--        for (User user : allUsers) {--%>
<%--            printWriter.write("<tr>");--%>
<%--            printWriter.write("<td>" + user.getEmail() + "</td>");--%>
<%--            printWriter.write("<td>" + user.getPassword() + "</td>");--%>
<%--            printWriter.write("</tr>");--%>
<%--        }--%>
<%--        printWriter.write("</table>");--%>
<%--    %>--%>

    <div align="center">
        <a href="/onlineshop/admin/register">Register new user</a>
    </div>
    <div align="center">
        <a href="/onlineshop/products">Products</a>
    </div>

</body>
</html>
