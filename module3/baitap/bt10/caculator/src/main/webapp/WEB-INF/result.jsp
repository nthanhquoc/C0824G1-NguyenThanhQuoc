<%--
  Created by IntelliJ IDEA.
  User: nthan
  Date: 12/1/2024
  Time: 10:52 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Calculation Result</h1>
<c:if test="${not empty error}">
  <p style="color:red;">${error}</p>
</c:if>
<c:if test="${empty error}">
  <table border="1">
    <tr>
      <td>First Number:</td>
      <td>${firstNumber}</td>
    </tr>
    <tr>
      <td>Operator:</td>
      <td>${operator}</td>
    </tr>
    <tr>
      <td>Second Number:</td>
      <td>${secondNumber}</td>
    </tr>
    <tr>
      <td>Result:</td>
      <td>${result}</td>
    </tr>
  </table>
</c:if>
<a href="index.jsp">Back to Calculator</a>
</body>
</html>
