<%--
  Created by IntelliJ IDEA.
  User: witch
  Date: 24.07.2019
  Time: 23:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<div align="center">
    <form action="addproduct" method="post">
        Product name <input name="productName" type="text"/> <br>
        Product description <input name="productDescription" type="text"> <br>
        Product price <input name="productPrice" type="text"> <br>
        <button type="submit">Add</button>
    </form>
</div>
<div align="center">
    <a href="products">Products</a>
</div>
</body>
</html>
