<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    //세션은 - 서버와 클라이언트에서 정보를 유지하기 위한 수단
    //서버에서 생성하고, 서버에서 관리함
	
    session.setAttribute("user_id", "xxx123");
    session.setAttribute("user_name", "이순신");
    //세션 유효시간 1시간
    session.setMaxInactiveInterval(3600);
    
   
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


	<a href="session_get.jsp">세션확인하기</a>
</body>
</html>
/*
	1. 아이디, 비밀번호, nick을 받습니다.
	2. 아이디 비밀번호가 동일하면 로그인 성공이라고 간주하고 (user_id, id)의 세션생성
	(user_nick, 닉네임)을 세션을 생성
	
	session_welcome로 이동해서 화면에 "id님 환영합니다"를 출력합니다.
	틀린경우는 로그인페이지로 리다이렉트 처리해주세요.
	
	session_welcome\페이지에서는 a태그를 이용해서 로그아웃 기능을 만들어주세요
	session_logout페이지에서는 세션을 삭제하고 리다이렉트를 하시면 됩니다. 	
	*/