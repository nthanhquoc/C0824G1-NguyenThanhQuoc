<%--
  Created by IntelliJ IDEA.
  User: nthan
  Date: 12/16/2024
  Time: 2:37 PM
  To change this template use File | Settings | File Templates.
--%>
<!DOCTYPE html>
<html>
<head>
    <title>Calculator</title>
</head>
<body>
<h1>Calculator</h1>
<form action="calculate" method="get">
    <input type="number" name="num1" placeholder="Enter number 1" required />
    <input type="number" name="num2" placeholder="Enter number 2" required />
    <br/><br/>
    <button type="submit" name="operation" value="add">Addition(+)</button>
    <button type="submit" name="operation" value="subtract">Subtraction(-)</button>
    <button type="submit" name="operation" value="multiply">Multiplication(X)</button>
    <button type="submit" name="operation" value="divide">Division(/)</button>
</form>

<c:if test="${not empty result}">
    <h2>Result: ${result}</h2>
</c:if>
</body>
</html>