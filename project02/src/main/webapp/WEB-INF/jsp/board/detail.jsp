<%@ page language="java" 
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판 상세정보</title>
</head>
<body>
  <h1>게시물 상세정보</h1>
  <form action="update.do" method="post">
  <input id="fNo" type="hidden" name="no" value="${ board.no }">
  <table border="1">
    <tbody>
      <tr>
        <th>번호</th><td>${ board.no }</td>
      </tr>
        <tr>
        <th>제목</th><td><input name="title" type="text" value="${ board.title }"></td>
        </tr>
        <tr>
        <th>내용</th><td><textarea name="content" rows="5" cols="60">${ board.content }</textarea></td>
        </tr>
        <tr>
        <th>생성일</th><td>${ board.createDate }</td>
        </tr>
        <tr>
        <th>조회수</th><td>${ board.viewCount }</td>
      </tr>
    </tbody>
  </table>
  <p>
    <button id="updateBtn" type="submit">변경</button>
    <button id="delBtn" type="button">삭제</button>
  </p>
  </form>
  
  <script type="text/javascript">
  var delBtn = document.getElementById("delBtn");
  delBtn.onclick = function(event){
	  var fNo = document.getElementById("fNo");
	  location.href = "delete.do?no=" + fNo.value;
  }
  </script>
</body>
</html>