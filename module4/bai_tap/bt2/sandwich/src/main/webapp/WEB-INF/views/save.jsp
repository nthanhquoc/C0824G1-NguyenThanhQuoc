<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Sandwich Condiment</title>
    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container mt-5">
    <div class="card">
        <div class="card-header">
            <h2 class="text-center">Sandwich Condiment</h2>
        </div>
        <div class="card-body">
            <form action="/" method="get">
                <div class="d-flex flex-wrap gap-3">
                    <div class="form-check">
                        <input class="form-check-input" type="checkbox" id="lett" name="condiment" value="Lettuce">
                        <label class="form-check-label" for="lett">Lettuce</label>
                    </div>
                    <div class="form-check">
                        <input class="form-check-input" type="checkbox" id="toma" name="condiment" value="Tomato">
                        <label class="form-check-label" for="toma">Tomato</label>
                    </div>
                    <div class="form-check">
                        <input class="form-check-input" type="checkbox" id="must" name="condiment" value="Mustard">
                        <label class="form-check-label" for="must">Mustard</label>
                    </div>
                    <div class="form-check">
                        <input class="form-check-input" type="checkbox" id="spro" name="condiment" value="Sprouts">
                        <label class="form-check-label" for="spro">Sprouts</label>
                    </div>
                </div>
                <hr>
                <button type="submit" id="save" name="action" value="save" class="btn btn-primary">Save</button>
            </form>

            <c:if test="${ not empty error}">
                <div class="alert alert-danger mt-3">
                        ${error}
                </div>
            </c:if>

            <c:if test="${not empty condiment}">
                <div class="mt-3">
                    <h5>Condiment saved:</h5>
                    <ul class="list-group list-group-horizontal">
                        <c:forEach var="item" items="${condiment}">
                            <li class="list-group-item">${item}</li>
                        </c:forEach>
                    </ul>
                </div>
            </c:if>
        </div>
    </div>
</div>

<!-- Bootstrap JS Bundle with Popper -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
