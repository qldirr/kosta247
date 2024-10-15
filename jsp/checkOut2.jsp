<%@page import="kosta.bean.Product"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<%
	List<Product> list = (List)session.getAttribute("productList");
	request.setAttribute("list", list);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>	
	
	<c:choose>
		<c:when test="${list == null }">
			<b>선택한 상품이 없습니다.</b>
		</c:when>
		<c:otherwise>
			<c:set var="total" value="${0 }"/>
			<c:forEach var="product" items="${list }">
				<c:set var="total" value="${total + (product.price * product.amount) }"/>
				<li>${product.fruit } : ${product.price } * ${product.amount }
						= ${product.price * product.amount }원
				</li>			
			</c:forEach>
			<br>
			주문한 총 금액 : ${total }원	
		</c:otherwise>
	</c:choose>


</body>
</html>