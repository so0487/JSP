<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	
<!-- 	<form action="background.jsp" method="post"> -->
<!-- 	<form action="background" method="post"> -->
	<form action="background" method="get">
		배경색 : 
		<select name="color">
			<option value="">선택하세요</option>
			<option value="red">빨간색</option>
			<option value="orange">주황색</option>
			<option value="gray">회색</option>
			<option value="yellow">노란색</option>
			<option value="green">초록색</option>
			<option value="purple">보라색</option>
		</select>
		
		카테고리 : 
		<select name="category">
			<option value="">선택하세요</option>
			<option value="대덕">대덕인재개발원</option>
			<option value="시청">시청</option>
		</select>
		
		
		<input type="submit" value="페이지이동"/>
	</form>
	
</body>
</html>