<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
 <%
 	request.setCharacterEncoding("utf-8");
 	String name=request.getParameter("name");
 	String height=request.getParameter("height");
 	String keight=request.getParameter("keight");
 	float f=0;
 	f=Float.parseFloat(height);
 	float k=Float.parseFloat(keight);
 	//물파스를 생각해
 
 
 
 
 %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>키 몸무게 BMI수치를 구하고 출력</h3>
	이름:<%=name %>
	키:<%=height %>
	몸무게:<%=keight %>
	BMI:<%=k/(f/100*f/100) %>
	<%if(k/(f/100*f/100)>=25){%>
		<%="과제충"%>
	<%} %><%else if(k/(f/100*f/100)<19){%>
	<%="저체중" %>
	<%} %><%else{ %>
	<%="정상" %>
	<%} %>
</body>
</html>