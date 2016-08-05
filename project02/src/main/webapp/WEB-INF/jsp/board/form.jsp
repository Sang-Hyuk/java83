<%@ page language="java" 
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판 새 글 등록</title>
</head>

<body>
  <h1>새 글 등록</h1>
  <form action="add.do" method="post">
  <table border="1">
    <tbody>
        <tr>
        <th>제목</th><td><input name="title" type="text" value=""></td>
        </tr>
        <tr>
        <th>내용</th><td><textarea name="content" rows="5" cols="60"></textarea></td>
        </tr>
    </tbody>
  </table>
  <p><button type="submit">등록</button></p>
  </form>
</body>
</html>