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
	
	<h3>댓글목록</h3>
	<table border="1">
		<tr>
			<td>댓글번호</td>
			<td>댓글제목</td>
			<td>댓글작성자</td>
			<td>댓글내용</td>
			<td>댓글일자</td>
		</tr>
			
	</table>
	<br>
	
	<form action="/board/insertReplyAction.do" method="post">
		<input type="hidden" name="seq" value="${board.seq }">
		댓글제목 : <input type="text" name="r_title"><br>
		댓글제목 : <input type="text" name="r_writer"><br>
		댓글제목 : <input type="text" name="r_contents"><br>
		<input type="submit" value="댓글쓰기">
	</form>
	
	<br>
	<a href="updateForm.jsp?seq=${board.seq }">글수정</a>
	<a href="delete.jsp?seq=${board.seq }">글삭제</a>
</body>
</html>










