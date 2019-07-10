<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>상품 정보</h1>
	<table border="1">
		<tr>
			<td>상품id</td>
			<td>${productDTO.id }</td>
		</tr>
		<tr>
			<td>상품명</td>
			<td>${productDTO.name }</td>
		</tr>
		<tr>
			<td>가격</td>
			<td>${productDTO.price }</td>
		</tr>
		<tr>
			<td>마일리지</td>
			<td>${productDTO.point }</td>
		</tr>
	</table>
</body>
</html>