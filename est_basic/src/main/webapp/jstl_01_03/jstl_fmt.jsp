<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"  %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>fmt모듈</h3>
	formatDate, parseDate, formatNumber, parseNumber
	<br>
	parse는 형 변환입니다
	<br>
	format은 출력형식변환
	
	<hr>
	
	<h3>formatDate - 날짜를 문자로</h3>
	
	<c:set var="a" value="<%=new Date() %>"/>
	<fmt:formatDate var="result" value="${a}" pattern="yyyy년MM월dd일"/>
	<fmt:formatDate var="result2" value="${a}" pattern="yyyy-MM-dd HH:mm:ss"/>
	${result }
	
	<h3>parseDate - 문자를 날짜로</h3>
	
	<fmt:parseDate var="result3" value="2023-01-04" pattern="yyyy-MM-dd"/>
	
	${result3 }
	
	<h3>formatNumber - 숫자를 문자로</h3><!-- 형변환이다. -->
	<fmt:formatNumber value="20000" pattern="000,000,000.00번"/>
	
	<h3>parseNumber - 문자를 숫자로</h3>
	
	<fmt:parseNumber value="10000번" pattern="00000번"/>
	<fmt:parseNumber var="x" value="3,300원" pattern="0,000원"/>
	<br>
	${x }<br>
	${x+ 1000 -x}
	
	
	
	
	<hr>
	
	<h2>아래값들을 2020년05월03일 형식으로 변경해서 출력</h2>
	<c:set var="TIME_A" value="2020-05-03"/>
	<c:set var="TIME_C" value="2020-05-03 21:30:22"/>
	<c:set var="TIME_D" value="<%=new Date() %>"/>
	<fmt:parseDate var="good" value="${TIME_A}" pattern="yyyy-MM-dd"/>
	<fmt:formatDate var="good1" value="${good}" pattern="yyyy년MM월dd일"/>
	${good1}<br>
	<fmt:parseDate var="good2" value="${TIME_C}" pattern="yyyy-MM-dd"/>
	<fmt:formatDate var="good3" value="${good2}" pattern="yyyy년MM월dd일"/>
	${good3 }<br>
	<fmt:formatDate var="good4" value="${TIME_D}" pattern="yyyy년MM월dd일"/>
	${good4 }
	
	<!-- 문자와 날짜형식 숫자형식 변환을 하는 것이라고 생각하면 된다. -->
</body>
</html>