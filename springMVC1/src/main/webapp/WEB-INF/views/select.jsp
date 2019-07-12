<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>검색결과</h1>
	
	id : ${bbsDTO.id }<br>
	title : ${bbsDTO.title }<br>
	content : ${bbsDTO.content }<br>
	writer : ${bbsDTO.writer }
	
	<form action="update">
		수정할ID : <input type="text" name="id" value="${bbsDTO.id }">
		수정할TITLE : <input type="text" name="title" value="${bbsDTO.title}">
		<input type="submit" value="수정">
	</form>
	
</body>
</html>