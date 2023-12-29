<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
   <%
   
   //rememberme 쿠키를 얻느느다.
   Cookie [] arr = request.getCookies();
   String id="";
   if(arr !=null){
	   
	   for(Cookie c : arr){
		   if(c.getName().equals("rememberMe")){
				id = c.getValue();	   
		   }
	   }
   }
   %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>쿠키를 통한 로그인</h3>
	
	<!-- 
	1. 아이디 기억하기를 체크하고, 로그인에 성공하면, 아이디 기억하기 쿠키를 하나 생성합니다.
	2. 이 쿠키는 사용하는 곳이 바로 여기입니다.
	3. 아이디 기억하기 쿠키를 찾아서 있다면, input의 값을 아이디로 채워넣어주시면 됩니다.
	 -->
	
	
	<form action="ex01_result.jsp" method="post">
		아이디:<input type="text" name="id">
		비밀번호:<input type="password" name="pw">
		아이디기억하기:<input type="checkbox" name="remember">
		<input type="submit" value="로그린">
	</form>
</body>
</html>