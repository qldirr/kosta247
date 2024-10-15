<%@page import="kosta.bean.BoardDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");
%>    
<!-- 액션태그 데이터 받기 =>Board -->
<jsp:useBean id="board" class="kosta.bean.Board"/>
<jsp:setProperty property="*" name="board"/>

<!-- DAO -> updateBoard(Board board) =>데이터 수정완료 update 구문 -->
<%
	BoardDao dao = BoardDao.getInstance();
	int re = dao.updateBoard(board);
	
	if(re != -1){
		response.sendRedirect("list.jsp");
	}else{
		out.println("수정실패");
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