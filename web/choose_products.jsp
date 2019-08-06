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
    <title>Choose_products</title>
</head>
<body>
<table border="1">
    <c:forEach var="product" items="${allProducts}">
        <tr>
            <td>${product.name}</td>
            <td>${product.description}</td>
            <td>${product.price}</td>
            <td>
                <div align="center">
                    <a href="/onlineshop/userbasket?name=${product.name}">Add to basket</a>
<%--                    <form action="/onlineshop/chooseproducts" method="post">--%>
                            <%--                        <input name="addproducttobasket" type="text" value=${product.name}> <br>--%>
<%--                        <button name="add" type="submit" value=${session.setAttribute("product")}>Add in Basket</button>--%>
<%--                    </form>--%>
                </div>
            </td>
        </tr>
    </c:forEach>
</table>
<div align="center">
    <a href="/onlineshop/showbasket">Your Basket</a>
</div>
</body>
</html>
