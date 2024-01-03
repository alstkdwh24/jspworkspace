<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
request.setCharacterEncoding("utf-8");
String name=request.getParameter("name");
String korean=request.getParameter("korean");
String eng=request.getParameter("eng");
String math=request.getParameter("math");
int b= Integer.parseInt(korean);
int c= Integer.parseInt(eng);
int d= Integer.parseInt(math);
	double a=(b+c+d)/3;
%>
<%if(a>=60){%>
 <%response.sendRedirect("es02_1.jsp"); %>
 <%}else{%>
 <%response.sendRedirect("es01_2.jsp"); %>
 <%} %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 
</body>
</html>