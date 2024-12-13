<%--
  Created by IntelliJ IDEA.
  User: nthan
  Date: 12/13/2024
  Time: 3:33 PM
  To change this template use File | Settings | File Templates.
--%>
<!DOCTYPE html>
<html>
<head>
    <title>Translation Result</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
</head>
<body>
<div class="container mt-5">
    <div class="row">
        <div class="col-md-8 offset-md-2">
            <div class="card">
                <div class="card-header text-center">
                    <h1 class="h3">Translation Result</h1>
                </div>
                <div class="card-body text-center">
                    <c:if test="${not empty meaning}">
                        <p class="text-success">
                            The meaning of "<strong>${word}</strong>" is: <strong>${meaning}</strong>
                        </p>
                    </c:if>
                    <c:if test="${not empty error}">
                        <p class="text-danger">${error}</p>
                    </c:if>
                </div>
                <div class="card-footer text-center">
                    <a href="/" class="btn btn-primary">Back to Home</a>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
</html>
