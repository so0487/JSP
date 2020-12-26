<%@page import="com.jsp.dto.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>










<%
	MemberVO loginUser = new MemberVO(request.getParameter("id"),request.getParameter("pwd"));

	request.setAttribute("loginUser", loginUser);
	session.setAttribute("loginUser", loginUser);
	
	
	//session.invalidate();
	session.setMaxInactiveInterval(10);
	
	
	response.sendRedirect(request.getContextPath()+"/session/main.jsp");
	
	
	
	
	//forward방식일 때 경로 설정
	//request.getRequestDispatcher("/session/main.jsp").forward(request, response);
%>