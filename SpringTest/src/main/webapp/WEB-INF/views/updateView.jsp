<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>수정이 완료되었습니다.</h1>
	<hr color="red">
	수정 NAME : ${musicDTO.name }<br>
	수정 PRICE : ${musicDTO.price }<br>	
	수정 SINGER : ${musicDTO.singer }<br>
	<hr color="red">
	<a href="input.jsp">메인 페이지로</a>
</body>
</html>