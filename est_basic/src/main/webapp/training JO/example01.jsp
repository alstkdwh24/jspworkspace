<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	Cookie c=new Cookie("als","조민");
	c.setMaxAge(30);
	response.addCookie(c);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>아이야 연대기</h3>
	쿠키생성완료
	<a href="example02.jsp"></a>
</body>
</html>