<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
<%
	request.setCharacterEncoding("utf-8");
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	String remember=request.getParameter("remember");
	
	if(id.equals("alsals") && pw.equals("123456")){
		Cookie c= new Cookie("user_id", id);
		c.setMaxAge(2000);
		response.addCookie(c);
		if(remember !=null){
			Cookie c1=new Cookie("remember",id);
			c1.setMaxAge(30);
			response.addCookie(c1);
			
		}
		response.sendRedirect("example02.jsp");
	}else{
		response.sendRedirect("example01.jsp");
	}
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