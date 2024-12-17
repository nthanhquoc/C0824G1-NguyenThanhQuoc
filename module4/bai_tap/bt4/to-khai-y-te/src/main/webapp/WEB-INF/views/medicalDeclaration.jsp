<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Medical Declaration Form</title>
</head>
<body>
<h1>Medical Declaration Form</h1>
<form:form method="post" modelAttribute="medicalDeclaration">
    <!-- Full Name -->
    <label for="fullName">Full Name:</label>
    <form:input path="fullName" id="fullName" />
    <br/><br/>

    <!-- Year of Birth -->
    <label for="yearBob">Year of Birth:</label>
    <form:select path="yearBob" id="yearBob">
        <form:options items="${yearBob}" />
    </form:select>
    <br/><br/>

    <!-- Gender -->
    <label>Gender:</label>
    <c:forEach var="g" items="${gender}">
        <form:radiobutton path="gender" value="${g}" /> ${g}
    </c:forEach>
    <br/><br/>

    <!-- Nationality -->
    <label for="nationality">Nationality:</label>
    <form:select path="nationality" id="nationality">
        <form:options items="${nationality}" />
    </form:select>
    <br/><br/>

    <!-- Passport Number -->
    <label for="passportNumber">Passport Number:</label>
    <form:input path="passportNumber" id="passportNumber" />
    <br/><br/>

    <!-- Travel Information -->
    <label>Travel Information:</label>
    <c:forEach var="g" items="${information}">
        <form:radiobutton path="information" value="${g}" /> ${g}
    </c:forEach>
    <br/><br/>

    <!-- Submit Button -->
    <input type="submit" value="Submit" />
</form:form>
</body>
</html>
