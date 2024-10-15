<%@page import="kosta.bean.Board"%>
<%@page import="kosta.bean.BoardDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%
 	int seq = Integer.parseInt(request.getParameter("seq"));//NumberFormatException
 	
 	BoardDao dao = BoardDao.getInstance();
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
</body>
</html>










