<%@page import="java.util.Random"%>
<%@page import="java.util.Set"%>
<%@page import="java.util.HashSet"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>  
<%
	/*
	1. 정수를 저장하는 HashSet을 생성합니다.
	2. 1~45까지 랜덤하게 생성되는 로또번호를 set에 저장
	3. 화면에 출력할때는 "이번 번호는 x번 입니다" 반복으로 출력
	4. header, footer는 include해주세요.
	*/
	Set<Integer> set = new HashSet<>();
	Random ran = new Random();
	
	while(set.size() < 6 ) {
		set.add( ran.nextInt(45) + 1 );
	}
%>    
	
	<%@ include file="include_header.jsp" %>
		
	<% for(int value : set) { %>
		이번 번호는 <%=value %>번 입니다<br>
	<% } %>
	
	<%@ include file="include_footer.jsp" %>
	