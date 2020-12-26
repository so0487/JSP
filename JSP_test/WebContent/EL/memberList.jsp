<%@page import="com.jsp.dto.MemberVO"%>
<%@page import="java.util.ArrayList"%>

<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>



<%
	List<MemberVO> memberList = new ArrayList<MemberVO>();
	for (int i = 1; i < 11; i++) {
		MemberVO member = new MemberVO("mimi" + i,"mimi" + i);

		memberList.add(member);
	}

	pageContext.setAttribute("memberList", memberList);
%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1">
		<tr>
			<th>아이디</th>
			<th>패스워드</th>
		</tr>
		<c:forEach items="${memberList }" var="member">
			<tr>
				<td>${member.id}</td>
				<td>${member.pwd}</td>
			</tr>

		</c:forEach>

	</table>
</body>
</html>