<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    //쿠키사용
    Cookie[] arr = request.getCookies();
	String user_id = "";
    if(arr != null){
    	
    	for(Cookie c : arr){ //모든  쿠키 검사 - 찾아야할 쿠키 user_id
    		if(c.getName().equals("user_id")){ //로그인을 거친 사람
    			user_id = c.getValue();
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

	<h3>로그인 성공</h3>
	<%=user_id %>님 어서오세요.
	</form>
</body>
</html>