<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>검색된 상품상세정보</h1>
	<hr color="red">
	상품id : ${productDTO.id }<br>
	상품명 : ${productDTO.name }<br>
	가격 : ${productDTO.price }<br>
	마일리지 : ${productDTO.point }<br>
</body>
</html>