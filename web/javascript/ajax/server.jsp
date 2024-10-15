<%@page import="net.sf.json.JSONArray"%>
<%@page import="kosta.Member"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>


	<%
		List list = new ArrayList();
	
		list.add(new Member("홍길동", "서울"));
		list.add(new Member("박찬호", "경기도"));
		list.add(new Member("류현진", "LA"));
		
		String json = JSONArray.fromObject(list).toString();
		out.print(json);
	%>













