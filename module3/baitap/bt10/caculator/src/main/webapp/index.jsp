<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<form action="result" method="post">
    <table>
        <tr>
            <td>First operand: </td>
            <td><input name="firstNumber" type="text"/></td>
        </tr>
        <tr>
            <td>Operator: </td>
            <td>
                <select name="operator">
                    <option value="Add">Addition</option>
                    <option value="Sub">Subtraction</option>
                    <option value="Multi">Multiplication</option>
                    <option value="Div">Division</option>
                </select>
            </td>
        </tr>
        <tr>
            <td>Second operand: </td>
            <td><input name="secondNumber" type="text"/></td>
        </tr>
        <tr>
            <td></td>
            <td><input type="submit" value="Calculate"/></td>
        </tr>
    </table>
</form>
</body>
</html>