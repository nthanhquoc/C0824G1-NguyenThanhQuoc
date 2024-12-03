<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: nthan
  Date: 12/3/2024
  Time: 11:34 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<button class="btn btn-primary" type="button" onclick="window.location.href='/product?action=add'">Create</button>
    <table>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Price</th>
            <th>Description</th>
        </tr>
        <c:forEach var="product" items="${products}" varStatus="c">
            <tr>
                <td>${product.idProduct}</td>
                <td>${product.productName}</td>
                <td>${product.price}</td>
                <td>${product.description}</td>
                <td><button onclick="window.location.href='/product?action=update&idProduct=${product.idProduct}'">Edit</button></td>
                <td><button onclick="window.location.href='/product?action=remove&idProduct=${product.idProduct}'">Remove</button></td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
