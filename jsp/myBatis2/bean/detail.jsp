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
	<h1>글세부보기</h1>
	<ul>
		<li><%= board.getSeq() %></li>
		<li><%= board.getTitle() %></li>
		<li><%= board.getWriter() %></li>
		<li><%= board.getContents() %></li>
	</ul>
	<br><br>
	
	<a href="updateForm.jsp?seq=<%= board.getSeq() %>">글수정</a>
	<a href="delete.jsp?seq=<%= board.getSeq() %>">글삭제</a>
</body>
</html>










