<%@page import="java.net.URLDecoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>

<%
	Cookie[]cookies = request.getCookies();
	if(cookies!=null && cookies.length>0){
		for(int i=0;i<cookies.length; i++){
			System.out.println("name : "+cookies[i].getName());
			System.out.println("pastID : "+cookies[i].getValue());
			
			if(cookies[i].getName().equals("loginUser")){
				pageContext.setAttribute("loginUser", cookies[i].getValue());
			}
			if(cookies[i].getName().equals("pastID")){
				pageContext.setAttribute("pastID", URLDecoder.decode(cookies[i].getValue(),"utf-8"));
			}
		}
	}

%>


<h1> loginUser : ${loginUser eq null ? 'loginUser는 존재하지 않습니다':loginUser}</h1>
<h1>pastID : ${pastID}</h1>