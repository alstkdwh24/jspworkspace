<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    Cookie c=new Cookie("als","민상");
   	c.setMaxAge(5);
    response.addCookie(c);
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>쿠키삭제 완료</h3>
	<a href="example02.jsp">쿠키 확인하기</a>
</body>
</html>