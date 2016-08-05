<%@ page language="java" 
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판 목록</title>
</head>
<body>
  <h1>게시물 목록</h1>
  <p><a href="add.do">새 글</a></p>
  <table border="1">
    <thead>
      <tr>
        <th>번호</th>
        <th>제목</th>
        <th>생성일</th>
        <th>조회수</th>
      </tr>
    </thead>
    <tbody>
    <c:forEach items="${list}" var="board">
      <tr>
        <td>${board.no}</td>
        <td><a href="detail.do?no=${board.no}">${board.title}</a></td>
        <td>${board.createDate}</td>
        <td>${board.viewCount}</td>
      </tr>
     </c:forEach>
    </tbody>
  </table>
</body>
</html>