<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	//처리하는 영역
	//아이디가 aaa123, 비밀번호가 1234 이라면 로그인 성공가정 ok페이지로 넘겨줍니다.
	
	request.setCharacterEncoding("utf-8");

	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	String remember= request.getParameter("remember");
	
	
	if(id.equals("aaa123") && pw.equals("1234")){//로그인 성공
		
		
		
		
		//로그인 성공시 아이디를 저장하는 쿠키
		Cookie c = new Cookie("user_id", id);
		c.setMaxAge(1800); //30분
		response.addCookie(c);
		
			
		if(remember != null){ //아이디 기억하기 쿠키 생성
			Cookie c2 = new Cookie("rememberMe", id);
		c2.setMaxAge(30); //30초
		response.addCookie(c2);
		}
		
		response.sendRedirect("ex01_ok.jsp"); //성공페이지	
		}
	 else{
		response.sendRedirect("ex01.jsp");
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