<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- a태그로 jspTag폴더의 quiz01로 상대경로, 절대경로 -->
	
	<!-- img태그로 html폴더안에 있는 테스트1.jpg 상대경로, 절대경로  -->
	<!-- a태그로 TestServlet로 상대경로, 절대경로 (맵핑경로 확인)-->
	<a href="../01.jsp">상대경로</a>
	<a href="http://localhost:8181/est_basic/JSPtage/script01.jsp">절대경로</a>
	
	<img alt="제목" src="../../HTML/img/다운로드.jpg"> <!--다시한번 해보기 -->
	<img alt="제목" src="/est basic/src/main/webapp/HTML/img/다운로드 (2).jpg">
	
	<!--a태그로 TestServlet로 상대경로, 절대경로 (맵핑결로 확인) -->
	<a href="../../apple">서블릿</a>
	<a href="/estbasic/apple"></a>
</body>
</html>