package com.jsp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/index")
public class indexServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public indexServlet() {
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//System.out.println("잠을 깨시오~~");
		
		response.setContentType("text/html;charset=utf-8");			//html코드
//		response.setContentType("text/plain;charset=utf-8");		//html코드가 포함 된 text
//		response.setContentType("application/dfdf;charset=utf-8");	//다운로드 파일
		PrintWriter out = response.getWriter();
//		out.println("<h1>잠을 깨시오~~</h1>");
		out.println("<script>");
		out.println("alert('수고수고');");
		out.println("</script>");
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
