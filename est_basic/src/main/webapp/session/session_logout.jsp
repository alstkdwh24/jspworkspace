<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    //여기에서 세션이 없다. ->인증이 안된 사람
    //세션갓을 얻는다.
    session.invalidate();
    response.sendRedirect("session_login");
   %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<a href="session_login.jsp">세션 확인하기</a>
</body>
</html>