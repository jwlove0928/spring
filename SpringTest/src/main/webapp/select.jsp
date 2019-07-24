<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>검색</h2>
	<form action="selectView.do"> <!-- 데이터 전송 후 처리결과 보여주는 페이지 경로설정 -->
		ID : <input type="text" name="id"><br>
		<input type="submit" value="검색요청"><br>
	</form>
</body>
</html>