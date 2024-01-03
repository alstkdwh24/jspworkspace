<%@page import="com.example.bin_01_03.MemberVO"%>
r
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");

	String id = request.getParameter("id");
	String name= request.getParameter("name");
	String email = request.getParameter("email");
	
	//id, name, email을 자바빈에 저장
	MemberVO vo =new MemberVO(id, name, email);
	
	request.setAttribute("vo", vo);
	//
	request.getRequestDispatcher("ex03_1.jsp").forward(request,response);


%>




<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>