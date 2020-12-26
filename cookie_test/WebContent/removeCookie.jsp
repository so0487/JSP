<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<%
	Cookie cookie = new Cookie("loginUser","mimi");
//	cookie.setMaxAge(10);
	cookie.setMaxAge(0);
	
	response.addCookie(cookie);
%>