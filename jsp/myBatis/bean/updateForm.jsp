<%@page import="kosta.bean.Board"%>
<%@page import="kosta.bean.BoardDao2"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%
	 int seq = Integer.parseInt(request.getParameter("seq"));//NumberFormatException
	
	BoardDao2 dao = BoardDao2.getInstance();
	Board board = dao.detailBoard(seq);
 %>   
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>글수정폼</h1>
	<form action="updateProc.jsp" method="post">
		<!-- seq 전달 -->
		<input type="hidden" name="seq" value="<%= board.getSeq() %>">
		작성자: <%= board.getWriter() %><br>
		제목: <input type="text" name="title" value="<%= board.getTitle() %>"><br>
		내용: <textarea rows="6" cols="70" name="contents"><%= board.getContents() %></textarea>
		<input type="submit" value="수정완료">
	</form>
</body>
</html>






