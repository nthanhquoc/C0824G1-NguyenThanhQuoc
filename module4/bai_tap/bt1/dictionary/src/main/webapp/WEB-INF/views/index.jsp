<%--
  Created by IntelliJ IDEA.
  User: nthan
  Date: 12/13/2024
  Time: 2:53 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <title>Dictionary</title>
</head>
<body>
<h1 class="text-center mt-3">English - Vietnamese Dictionary</h1>
<form action="/translate" method="get" class="container mt-5">
    <div class="mb-3">
        <label for="word" class="form-label">Enter an English word:</label>
        <input type="text" id="word" name="word" class="form-control" required>
    </div>
    <button type="submit" class="btn btn-primary">Translate</button>
</form>
</body>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
</html>
