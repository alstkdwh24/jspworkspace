<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!--	1. form태그를 이용해서 post형식으로 이름, 국어, 영어, 수학점수을 받습니다.
	2. quiz01_result.jsp로 데이터를 넘겨서 평균을 구합니다.
	3. 60점 이상 이하여부에 따라서 합격, 불합격페이지로 리다이렉트
	-->
    
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="ex11.jsp" method="post">
	<h3>이름, 국어, 영어, 수학 </h3>
	이름:<input type="text" name="name">
	국어:<input type="number" name="korean">
	영어:<input type="number" name="eng">
	수학:<input type="number" name="Math">
	<input type="submit" value="제출하다">
	</form>
</body>
</html>