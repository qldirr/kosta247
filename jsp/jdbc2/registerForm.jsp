<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="registerProc.jsp" method="post">
		이름: <input type="text" name="name"><br>
		주소: <input type="text" name="address"><br>
		<input type="checkbox" name="hobby" value="야구">야구</input>	
		<input type="checkbox" name="hobby" value="독서">독서</input>	
		<input type="checkbox" name="hobby" value="영화">영화</input>	<br>
		<input type="submit" value="전송">
	</form>
</body>
</html>