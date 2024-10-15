<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>글세부보기</h1>
	<ul>
		<li>${board.seq }</li>
		<li>${board.title }</li>
		<li>${board.writer }</li>
		<li>${board.contents }</li>
	</ul>
	<br><br>
	
	<a href="updateForm.jsp?seq=${board.seq }">글수정</a>
	<a href="delete.jsp?seq=${board.seq }">글삭제</a>
</body>
</html>










