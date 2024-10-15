<%@page import="kosta.bean.BoardDao2"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");
%>    
<!-- form 모든 데이터 => 객체로서 변환 -->
<jsp:useBean id="board" class="kosta.bean.Board"/>
<jsp:setProperty property="*" name="board"/>

<%
	BoardDao2 dao = BoardDao2.getInstance();
	int re = dao.insertBoard(board);
	
	if(re != -1){
		response.sendRedirect("list.jsp");
	}else{
		out.println("글쓰기 실패");
	}
	
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>