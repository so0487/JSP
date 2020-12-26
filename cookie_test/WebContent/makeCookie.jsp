<%@page import="java.net.URLEncoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>


<%	
	Cookie cookie1 = new Cookie("loginUser","mimi");
	Cookie cookie2 = new Cookie("pastID",URLEncoder.encode("미미","utf-8"));
	
	
	response.addCookie(cookie1);
	response.addCookie(cookie2);
	
	



%>



<h1>쿠키를 생성했습니다.</h1>