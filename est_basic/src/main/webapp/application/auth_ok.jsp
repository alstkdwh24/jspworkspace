<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
 <%
 	//세션에 저장된 auth와, 사용자가 입력한 code를 비교해서
 	 //이 값이 같다면, 인증여부를 저장하는 용도의 세션을 하나 생성을 하고
 	 //reverve.jsp로 이동합니다.
 	 
 	 //같지 않다면, 다시 인증페이지로 돌려보내주세요.
 
 	 String codee=request.getParameter("code");
 	String ran= (String)session.getAttribute("auth");			
 if(codee.equals(ran)){
	 session.setAttribute("authYN",true);
	 response.sendRedirect("reserve.jsp");
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