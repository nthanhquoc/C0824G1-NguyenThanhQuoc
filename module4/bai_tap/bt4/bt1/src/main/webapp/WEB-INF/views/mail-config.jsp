<%--
  Created by IntelliJ IDEA.
  User: nthan
  Date: 12/17/2024
  Time: 2:17 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
    <title>Mail Configuration</title>
</head>
<body>
<h1>Mail Configuration</h1>

<form:form method="post" modelAttribute="mailConfig">
    <label for="language">Languages:</label>
    <form:select path="language" id="language">
        <form:options items="${languages}"/>
    </form:select>
    <br><br>
    <label for="pageSize">Page Size:</label>
    Show
    <form:select path="pageSize" id="pageSize">
        <form:options items="${pageSizes}"/>
    </form:select>
    emails per page
    <br><br>
    <label for="spamFilter">Spams filter:</label>
    <form:checkbox path="spamFilter" id="spamFilter"/>
    Enable spams filter
    <br><br>
    <label for="signature">Signature:</label><br>
    <form:textarea path="signature" id="signature" rows="4" cols="40"/>
    <br><br>
    <button type="submit">Update</button>
    <button type="reset">Cancel</button>
</form:form>

</body>
</html>
