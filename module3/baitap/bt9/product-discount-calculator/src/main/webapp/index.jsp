<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Product Discount-Calculator</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
</head>
<body>
<div class="container mt-5">
    <h2 class="text-center mb-4">Discount Calculator</h2>
    <form class="mx-auto" style="max-width: 50%" action="./display-discount" method="post">
        <div class="mb-3">
            <input type="text" class="form-control" id="productDescription" name="productDescription"
                   placeholder="Product Description" required>
        </div>
        <div class="mb-3">
            <input type="number" class="form-control" id="listPrice" name="listPrice"
                   placeholder="List Price (VND)" required>
        </div>
        <div class="mb-3">
            <input type="number" class="form-control" id="discountPercent" name="discountPercent"
                   placeholder="Discount Percent (%)" required>
        </div>
        <button type="submit" class="btn btn-primary w-100">Calculate</button>
    </form>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
        crossorigin="anonymous"></script>
</body>
</html>