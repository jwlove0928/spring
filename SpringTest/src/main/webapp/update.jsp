<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>수정</h2>
	<hr color="red">
	<form action="updateView.do"> <!-- 데이터 전송 후 처리결과 보여주는 페이지 경로설정 -->
		ID : <input type="text" name="id"><br>
		NAME : <input type="text" name="name"><br>
		PRICE : <input type="text" name="price"><br>
		SINGER : <input type="text" name="singer"><br>
		<input type="submit" value="수정요청"><br>
	</form>
</body>
</html>