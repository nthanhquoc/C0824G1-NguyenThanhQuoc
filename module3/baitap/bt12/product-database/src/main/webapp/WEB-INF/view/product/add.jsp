<%--
  Created by IntelliJ IDEA.
  User: nthan
  Date: 12/3/2024
  Time: 1:31 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post">
    <div class="mb-3">
        <label for="inputName" class="form-label">id</label>
        <input type="number" class="form-control" name="productId" id="inputName">
    </div>
    <div class="mb-3">
        <label for="inputEmail" class="form-label">name</label>
        <input type="text" class="form-control" name="name" id="inputEmail" >
    </div>
    <div class="mb-3">
        <label for="inputPoint" class="form-label">price</label>
        <input type="number" class="form-control" name="price" id="inputPoint" >
    </div>
    <div class="mb-3">
        <label for="inputDOB" class="form-label">description</label>
        <input type="text" class="form-control" name="description" id="inputDOB" >
    </div>
    
    <button type="submit" class="btn btn-primary">Submit</button>
</form>
</body>
</html>
