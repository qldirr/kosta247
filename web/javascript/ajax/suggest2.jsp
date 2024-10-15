<%@page import="net.sf.json.JSONArray"%>
<%@page import="kosta.Member"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Collections"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<%!
	/* String[] keywords ={
		"Ajax", "Ajax마스터", "Ajax교재",	
		"자바", "자바박사", "자바강사", "자바서버페이지"
	};/*

	/*
	public List search(String keyword){
		if(keyword == null || keyword.equals("")){
			return Collections.EMPTY_LIST;
		}
		List result = new ArrayList();
		for(int i=0;i<keywords.length;i++){
			if(keywords[i].startsWith(keyword)){
				result.add(keywords[i].trim());
			}
		}
		return result;
	} */

%>    


<%
	/* request.setCharacterEncoding("utf-8");
	String keyword = request.getParameter("keyword");
	
	List keywordList = search(keyword); */
	
// 	for(int i=0;i<keywordList.size();i++){
// 		out.print((String)keywordList.get(i));
// 		if(i<keywordList.size()-1){
// 			out.print(",");
// 		}
// 	}
	
	List list = new ArrayList();
	list.add(new Member("홍길동", "서울"));
	list.add(new Member("박길동", "부산"));
	list.add(new Member("조길동", "대구"));
 

	String json = JSONArray.fromObject(list).toString();
	out.print(json);
%>






















