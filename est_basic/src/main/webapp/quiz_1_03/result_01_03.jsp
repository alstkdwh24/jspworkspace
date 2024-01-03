<%@page import="com.example.bin_01_03.UserVO"%>


<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
UserVO c =(UserVO)request.getAttribute("userVO");
%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>	
	<%=c.getId() %>
	<%=c.getPw() %>
 	<%=c.getName() %>
	<%=c.getAddress() %>
	<%=c.getKor() %>
	<%=c.getMath() %>
	<%=c.getSum() %>
	<%=c.getAvg() %>


</body>
</html>