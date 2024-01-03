<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 	
	String name = request.getParameter("name");
 	String age = request.getParameter("age");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>es04 화면</h3>
	
	a 링크로 넘어온 값:<%=name %><br>
	a 링크로 넘어온 값:<%=age %>
</body>
</html>