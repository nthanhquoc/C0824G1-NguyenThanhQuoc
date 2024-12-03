<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit Product</title>
</head>
<body>
<h1>Edit Product</h1>
<form action="/product?action=update" method="post">
    <input type="hidden" name="productId" value="${product.idProduct}" />
    <label>Name:</label>
    <input type="text" name="name" value="${product.productName}" required /><br/>
    <label>Price:</label>
    <input type="number" step="0.01" name="price" value="${product.price}" required /><br/>
    <label>Description:</label>
    <textarea name="description" required>${product.description}</textarea><br/>
    <button type="submit">Update</button>
</form>
</body>
</html>
