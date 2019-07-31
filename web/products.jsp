<%@ page import="java.io.PrintWriter" %>
<%@ page import="model.Product" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: witch
  Date: 26.07.2019
  Time: 2:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Title</title>
</head>
<body>

<table border="10">
    <c:forEach var="product" items="${allProducts}">
        <tr>
            <td>${product.name}</td>
            <td>${product.description}</td>
            <td>${product.price}</td>
        </tr>
    </c:forEach>
</table>
<%--<%--%>
<%--    PrintWriter printWriter = response.getWriter();--%>
<%--    printWriter.write("<table border = \"1\">\n" +--%>
<%--            "<tr>\n" +--%>
<%--            " <td>Name</td>\n" +--%>
<%--            " <td>Description</td>\n" +--%>
<%--            " <td>price</td>\n" +--%>
<%--            "<tr>");--%>
<%--    List<Product> allProducts = (List<Product>) request.getAttribute("allProducts");--%>
<%--    for (Product product : allProducts) {--%>
<%--        printWriter.write("<tr>");--%>
<%--        printWriter.write("<td>" + product.getName() + "</td>");--%>
<%--        printWriter.write("<td>" + product.getDescription() + "</td>");--%>
<%--        printWriter.write("<td>" + product.getPrice() + "</td>");--%>
<%--        printWriter.write("</tr>");--%>
<%--    }--%>
<%--    printWriter.write("</table>");--%>
<%--%>--%>
<div align="center">
    <a href="addproduct">Add product</a>
</div>

<%--<div align="center">--%>
<%--    <a href="admin/users">Users</a>--%>
<%--</div>--%>
</body>
</html>
