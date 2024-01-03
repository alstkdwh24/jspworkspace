

<%@page import="com.example.bin_01_03.UserVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    request.setCharacterEncoding("utf-8");
        String id = request.getParameter("id");
        String pw = request.getParameter("pw");
        String name = request.getParameter("name");
        String address = request.getParameter("address");
        String kor = request.getParameter("kor");
        String math = request.getParameter("math");
       
        //반에 저장
        int sum = Integer.parseInt(kor) + Integer.parseInt(math);
        double avg = sum/ 2.0;
        
        UserVO c=new UserVO(id, pw, name, address, kor, math, sum, avg);
        c.setSum(sum);
        c.setAvg(avg);
        
        //반을 리퀘스트에 담는다.
    	request.setAttribute("userVO",c);
        
        //포워드도 값을 넘겨준다
        request.getRequestDispatcher("result_01_03.jsp").forward(request, response);
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