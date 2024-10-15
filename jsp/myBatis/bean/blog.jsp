<%@page import="kosta.bean.Blog"%>
<%@page import="kosta.bean.BoardDao2"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%
 	BoardDao2 dao = BoardDao2.getInstance();
 	Blog blog = dao.selectBlog("1");
 %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>블러그 내용</h1>
	<ul>
		<li>id : <%= blog.getId() %></li>
		<li>title : <%= blog.getTitle() %></li>
		<li>content : <%= blog.getContent() %></li>
		<li>author_id : <%= blog.getAuthor().getAuthor_id() %></li>
		<li>author name : <%= blog.getAuthor().getName() %></li>
		<li>author address : <%= blog.getAuthor().getAddress() %></li>		
	</ul>
</body>
</html>










