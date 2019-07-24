<%@page import="com.itbank.mvcSpring.MusicDTO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>전체 검색</h1>
	<%
		List<MusicDTO> list = (List<MusicDTO>)request.getAttribute("list");
		for(int i = 0; i< list.size(); i++){
			MusicDTO dto = list.get(i);
	%>
		ID : <%=dto.getId() %> <br>
		NAME : <%=dto.getName() %> <br>
		PRICE : <%=dto.getPrice() %> <br>
		SINGER : <%=dto.getSinger() %> <br>
		<hr color="red">
	<%
		}
	%>
</body>
</html>