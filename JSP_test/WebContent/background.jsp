<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<%	request.setCharacterEncoding("utf-8");%>
<!DOCTYPE html>
<html>
<head>
<meta charset=UTF-8">
<title>Insert title here</title>
<style>
	body{background:<%=request.getParameter("color")%>;}
</style>
</head>
<body>

	<%
	String category = request.getParameter("category");
	
	if(category.equals("대덕")){%>
	
		<h1>대덕인재개발원</h1>
		<p>안녕하십니까.. 대덕인재개발원에 오신걸 환영합니다.</p>
	
	<%	
	}else if(category.equals("시청")){
	
	%>
		<h1>대전시청</h1>
		<p>반갑습니다.. 사회적거리두기 2단계를 지켜주세요.</p>
		
	<%
	}else{
	%>
		<h1>페이지가 없습니다.</h1>
	<%	
	}
	%>
	
	<script>
		alert("background color : <%=request.getParameter("color")%>");
	</script>
</body>
</html>