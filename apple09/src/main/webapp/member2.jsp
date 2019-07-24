<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="insert.do">
		아이디 : <input type="text" name="id"><br>
		패스워드 : <input type="text" name="pw"><br>
		이름 : <input type="text" name="name"><br>
		전화번호 : <input type="text" name="tel"><br>
		<input type="submit" value="서버로 전송">
	</form>
	<br>
	<hr color="red">
	<h1>아이디 검색</h1>
	<form action="select.do">
		아이디 : <input type="text" name="id"><br>
		<input type="submit" value="서버로 전송">
	</form>
	<hr color="blue">
	<a href="selectAll.do">전체 검색</a>
</body>
</html>