<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: witch
  Date: 05.08.2019
  Time: 18:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Show basket</title>
</head>
<body>

<table border="1">
    <c:forEach var="product" items="${userBasket}">
        <tr>
            <td>${product.name}</td>
            <td>${product.description}</td>
            <td>${product.price}</td>
        </tr>
    </c:forEach>

</table>
<div align="center">
    <a href="/onlineshop/userorder"> order </a>
    </div>
</body>
</html>
