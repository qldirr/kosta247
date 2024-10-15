<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>글목록</h1>
	<a href="insert_form.jsp">글쓰기</a>
	<table border="1" width="800">
		<tr>
			<th>글번호</th>
			<th>제목</th>
			<th>작성자</th>
			<th>등록일</th>
			<th>조회수</th>
		</tr>	
		<c:forEach var="board" items="${list }">
		<tr>	
			<td>${board.seq }</td>
			<td><a href="/board/detailAction.do?seq=${board.seq }">${board.title }</a></td>
			<td>${board.writer }</td>
			<td>
			    <fmt:parseDate var="dt" value="${board.regdate }" pattern="yyyy-MM-dd"/>
			 	<fmt:formatDate value="${dt }" pattern="yyyy/MM/dd"/>				
			</td>
			<td>${board.hitcount }</td>
		</tr>
		</c:forEach>
	</table>
	<br><br>
	
	<form action="list.jsp" method="get">
		<input type="checkbox" name="area" value="title">제목
		<input type="checkbox" name="area" value="writer">작성자
		<input type="text" name="searchKey" size="10">
		<input type="submit" value="검색">
	</form>
	
	
</body>
</html>











