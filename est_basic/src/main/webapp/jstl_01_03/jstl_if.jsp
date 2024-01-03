<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
  <% request.setCharacterEncoding("utf-8");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 변수선언 -->
	<c:set var="a" value="홍길동"/>

	
	<!-- 출력 -->
	<c:out value="${a}"/>
	 
	 
	 <!-- if -->
	 
	 <c:if test="${ param.name eq '홍길동' }">
	 	<b>홍길동 입니다.</b>
	 </c:if>
	 <c:if test= "${param.name eq '이순신' }">
	 	<b> 이순신 입니다.</b>
	 </c:if>
	 <%--
	  //String name = request.getParameter("name");
	 
	 	//--%>
	 	<%--
	 	//if(name.equals("홍길동")){--%>
	 		<b>홍길동입니다.</b>
	 	<%-- }--%>
	 	
	 	<c:if test="${param.name eq '홍길동' and param.age >=20 }">
	 	 <b>성인입니다</b>
	 	</c:if>
</body>
</html>