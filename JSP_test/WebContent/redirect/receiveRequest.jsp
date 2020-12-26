<%@page import="java.net.URLEncoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>

<%

	request.setCharacterEncoding("utf-8");
	String view = request.getParameter("view");
	
	String url = "/redirect/result.jsp";

	if(view.equals("forward")){
		request.getRequestDispatcher(url).forward(request, response);
	}else{
//		url = request.getContextPath()+url;	//(redirect방식 : null)
		url = request.getContextPath()+url+"?name="+URLEncoder.encode(request.getParameter("name"),"utf-8");	//(redirect방식이라도 파라미터가 전달된다.)
		response.sendRedirect(url);
	}
%>