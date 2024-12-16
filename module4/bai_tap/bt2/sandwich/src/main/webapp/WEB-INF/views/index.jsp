<%--
  Created by IntelliJ IDEA.
  User: nthan
  Date: 12/16/2024
  Time: 3:03 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<!DOCTYPE html>
<html>
<head>
    <title>Choose Condiments</title>
</head>
<body>
<h1>Select Condiments for Your Sandwich</h1>
<form action="/save" method="post">
    <input type="checkbox" name="condiment" value="Lettuce"> Lettuce<br>
    <input type="checkbox" name="condiment" value="Tomato"> Tomato<br>
    <input type="checkbox" name="condiment" value="Mustard"> Mustard<br>
    <input type="checkbox" name="condiment" value="Mayo"> Mayo<br>
    <button type="submit">Submit</button>
</form>
</body>
</html>