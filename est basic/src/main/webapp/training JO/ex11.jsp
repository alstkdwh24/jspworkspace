<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%	
	request.setCharacterEncoding("utf-8");
	String name=request.getParameter("name");
	String korean=request.getParameter("korean");
	String eng=request.getParameter("eng");
	String Math=request.getParameter("Math");
	double a=Double.parseDouble(korean);
	double b=Double.parseDouble(eng);
	double m=Double.parseDouble(Math);
	double d=(a+b+m)/3;
	if(d>=60){ %>
	<%=response.sendRedirect("ex12.jsp") %>
	<%}else{%>	
	<%= response.sendRedirect("ex13.jsp")%>
	<% }%>







<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	이름:<%= name %>
	국어:<%= korean %>
	영어:<%= eng %>
	수학:<%= Math %>
	편균:<%=d %>
	
</body>
</html>