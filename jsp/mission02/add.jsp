<%@page import="kosta.bean.Product"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%> 
    <%
    	request.setCharacterEncoding("utf-8");
    %> 
    
    <jsp:useBean id="product" class="kosta.bean.Product"/>
    <jsp:setProperty property="*" name="product"/>
    
    <%
    	
    	//String product = request.getParameter("product");
    	
    	List<Product> list = (List)session.getAttribute("productList");
    	
    	if(list == null){
    		list = new ArrayList<Product>();
    		session.setAttribute("productList", list);
    	}
        	
    	list.add(product);
    %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<a href="javascript:history.back()">뒤로가기</a>
	<%=product %>
</body>
</html>