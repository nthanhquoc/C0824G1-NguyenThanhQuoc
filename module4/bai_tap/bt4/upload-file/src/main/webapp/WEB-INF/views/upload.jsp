<%--
  Created by IntelliJ IDEA.
  User: nthan
  Date: 12/17/2024
  Time: 2:59 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
    <title>Upload Bài Hát</title>
</head>
<body>
<h2>Upload Bài Hát</h2>

<form:form action="upload" method="post" enctype="multipart/form-data" modelAttribute="song">
    <label for="songName">Tên Bài Hát:</label>
    <form:input path="songName" /><br/>

    <label for="artist">Nghệ sĩ:</label>
    <form:input path="artist" /><br/>

    <label for="genre">Thể Loại:</label>
    <form:select path="genre">
        <form:options items="${genres}" />
    </form:select><br/>

    <label for="file">Chọn File:</label>
    <input type="file" name="file" id="file"/><br/>

    <input type="submit" value="Upload"/>
</form:form>

<p style="color:red">${message}</p>
</body>
</html>
