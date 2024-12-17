<%--
  Created by IntelliJ IDEA.
  User: nthan
  Date: 12/17/2024
  Time: 3:00 PM
  To change this template use File | Settings | File Templates.
--%>
<html>
<head>
    <title>Danh Sách Bài Hát</title>
</head>
<body>
<h2>Danh Sách Bài Hát</h2>
<table border="1">
    <tr>
        <th>Tên Bài Hát</th>
        <th>Nghệ Sĩ</th>
        <th>Thể Loại</th>
        <th>File</th>
    </tr>
    <c:forEach var="song" items="${songs}">
        <tr>
            <td>${song.name}</td>
            <td>${song.artist}</td>
            <td>${song.genre}</td>
            <td><a href="${song.filePath}">Nghe</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
