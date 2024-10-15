<%@ page language="java" contentType="text/plain; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<%
	request.setCharacterEncoding("utf-8");
	String name = request.getParameter("name");
%>  

	안녕하세요. <%= name %>  회원님!!!