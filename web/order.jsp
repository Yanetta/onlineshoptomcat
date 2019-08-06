<%--
  Created by IntelliJ IDEA.
  User: witch
  Date: 05.08.2019
  Time: 23:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Order</title>
</head>
<body>

<table border="10">
    <div align="center">
        Your order:
    </div>
    <c:forEach var="product" items="${userBasket}">
        <tr>
            <td>${product.name}</td>
            <td>${product.description}</td>
            <td>${product.price}</td>
        </tr>
    </c:forEach>

</table>
<div align="center">
    <form action="/onlineshop/userorder" method="post">
        Enter your phone number <input type="tel" name="phone"><br>
        Enter delivery address <input type="text" name="address"><br>
        <input type="submit" value="Confirm order">
    </form>
</div>
</body>
</html>
