<%@page import="java.util.Set"%>
<%@page import="java.util.HashSet"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

 /*1. 정수를 저장하는 HashSet을 생성합니다.
 2.1~45까지 랜덤하게 생성되는 로또번호를 set에 저장 
 3. 화면에 출력
 4.header,fooret는 include 해주세요*/
  	
  	
  	
  	
  	
  	
  	<section>
 	<%Set<Integer> set=new HashSet<>();%>
 	<%for(int j =0; j<=6;j++)%><%{%>

 			<%set.add((int)(Math.random()*45)+1);%>
		 
		<%}%>
	<%@ include file="include_header2.jsp" %>
	<% for(int s: set) {%>
	
	<%=s%>번 입니다.<br>
	<%} %>     
 	</section>
 	<%@ include file="include_footer2.jsp" %>
 	
 	
 	