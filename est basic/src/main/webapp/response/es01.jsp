<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
	<!--<h3>과제</h3>

	1. form태그를 이용해서 post형식으로 이름, 국어, 영어, 수학점수을 받습니다.
	2. quiz01_result.jsp로 데이터를 넘겨서 평균을 구합니다.
	3. 60점 이상 이하여부에 따라서 합격, 불합격페이지로 리다이렉트
	-->


<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	<style>
	/*
		css문법이 들어갈 수도 있습니다.
		클래스는 . 선택자로 지칭합니다
		id는 # 선택자로 지칭합니다.
	*/
	
		.wrap-content{
			display: flex;
			justify-content:center;
			align-items:center;
			height: 100vh;
		}
		.form.content{
			height: 200px;
			box-shadow: 0px 8px 16px rgba(0, 0, 0, 0.1);
			padding: 30px;
		}
	</style>
	



</head>
<body class="wrap-content">
	
	<!-- 
	디자인 태그에는 id(호ㅘ면에서 고유)라는 속성과 class(화면ㅇ에서 여러개 있어도 됩니다)라는 속성이 있습니다
	
	디자인을 하는 방법에는 3가지 방법이 있습니다
	1.css파일을 만들고 import를 해서 사용하는 방법 (외부 스타일 시트)
	2. head태그에 선택자를 만들고 이용해서 디자인을 하는 방법 (내부 스타일 시트)
	3. 태그자체에 직접 디자인하는 방법 (인라인 시트)
	 -->
	<form action="es02.jsp" method="post" class="form-content"><br>
		<h3 style="text-align: center;">과제</h3>
		이름: <input type="text" name="name" class="form-content"><br>
		국어: <input type="number" name="korean" class="form-content"><br>
		영어: <input type="number" name="eng" class="form-content"><br>
		수학: <input type="number" name="math" class="form-content"><br>
		<input type="submit" value="제출하기" style="display:black; color:red; width:100%;">
	</form>
</body>
</html>