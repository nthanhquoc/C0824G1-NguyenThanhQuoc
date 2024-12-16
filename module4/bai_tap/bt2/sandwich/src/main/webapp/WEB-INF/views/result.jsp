<%--
  Created by IntelliJ IDEA.
  User: nthan
  Date: 12/16/2024
  Time: 3:05 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Your Selected Condiments</title>
</head>
<body>
<h1>Your Selected Condiments</h1>
<ul>
    <c:forEach var="condiment" items="${condiments}">
        <li>${condiment}</li>
    </c:forEach>
</ul>
</body>
</html>
