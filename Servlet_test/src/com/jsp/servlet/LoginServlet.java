package com.jsp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//로그인 화면 전송
		
		String url = "/WEB-INF/views/loginForm.jsp";
		
		
		System.out.println(request.getParameter("jenny"));
		
		request.getRequestDispatcher(url).forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//로그인 처리 전송
		
		
		request.setCharacterEncoding("utf-8");
		
		
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		
		
		
		//memberService.login(id,pwd)
		
		
		
		String message="";
		String page = "history.go(-1)";
		
		if(id.equals("mini")) {
			if(pwd.equals("mini")) {
				//로그인 성공
				message="로그인 성공";
				page="location.href='main';";
			}else {
				//패스워드 불일치
				message="패스워드가 일치하지 않습니다.";
			}
		}else {
			//ID가 존재하지 않는다.
			message="아이디가 존재하지 않습니다.";
		}
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		out.println("<script>");
		out.println("alert('"+message+"');");
		out.println(page);
		out.println("</script>");
		
		
	}

}
