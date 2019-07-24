<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>메인 페이지</h1>
	<hr color="red">
	<h2>등록</h2>
	<form action="inputView.do"> <!-- 데이터 전송 후 처리결과 보여주는 페이지 경로설정 -->
		ID : <input type="text" name="id"><br>
		NAME : <input type="text" name="name"><br>
		PRICE : <input type="text" name="price"><br>
		SINGER : <input type="text" name="singer"><br>
		<input type="submit" value="등록요청"><br>
	</form>
	<a href="update.jsp">수정</a>
	<a href="delete.jsp">삭제</a>
	<a href="select.jsp">검색</a>
	<a href="selectAllView.do">전체검색</a>
</body>
</html>