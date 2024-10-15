<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>글목록</h1>
	<a href="board_insert">글쓰기</a>
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
			<td><a href="board_detail${board.seq }">${board.title }</a></td>
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
	<!-- 페이지 처리 부분 -->
	
	<!-- 이전영역 -->
	<c:if test="${listModel.startPage >=6 }">
		<a href="/board/listAction.do?pageNum=${listModel.startPage - 1 }">[이전]</a>
	</c:if>
	
	<!-- 페이지목록 출력 -->
	
	<c:forEach var="pageNo" begin="${listModel.startPage }" end="${listModel.endPage }">
		<c:if test="${listModel.requestPage == pageNo }"><b></c:if>
			<a href="/board/listAction.do?pageNum=${pageNo }">[${pageNo }]</a>
		<c:if test="${listModel.requestPage == pageNo }"></b></c:if>	
	</c:forEach>
	
	<!-- 이후영역 -->
	<c:if test="${listModel.endPage < listModel.totalPageCount }">
		<a href="/board/listAction.do?pageNum=${listModel.endPage + 1 }">[이후]</a>
	</c:if>
	
	<br><br>
	
	<form action="/board/listAction.do" method="get">
		<input type="checkbox" name="area" value="title">제목
		<input type="checkbox" name="area" value="writer">작성자
		<input type="text"  name="searchKey" size="10">
		<input type="submit" value="검색">
	</form>
	
	
	
	
	
</body>
</html>











