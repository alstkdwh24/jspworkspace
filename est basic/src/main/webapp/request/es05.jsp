<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>태그로 학생 나열</h3>
	<%for(int i=0;i<=30; i++){%>
	<a href="es06.jsp?number=<%=i %>"><%=i %>번 으로 이동하기 </a><br>
	
	
	<%} %>

</body>
</html>