<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="search">
		검색할 상품id : <input type="text" name="id"><br>
		<input type="submit" value="상품검색">
	</form>
	<hr color="red">
	<form action="searchTable">
		검색할 테이블용 상품id : <input type="text" name="id"><br>
		<input type="submit" value="테이블용 상품검색">
	</form>
</body>
</html>