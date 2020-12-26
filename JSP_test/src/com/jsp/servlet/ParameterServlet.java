package com.jsp.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/parameter")
public class ParameterServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url="/param.jsp";
		request.getRequestDispatcher(url).forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String url = "/requestParamReceive.jsp";



		request.setCharacterEncoding("UTF-8");




		MemberVO member = new MemberVO();
		member.setName(request.getParameter("name"));
		member.setId(request.getParameter("id"));
		member.setPw(request.getParameter("pw"));
		member.setMajor(request.getParameter("major"));
		member.setProtocol(request.getParameter("protocol"));

		member.setPhone(request.getParameterValues("phone"));
		member.setHobbys(request.getParameterValues("hobby"));
/*
		try {
			memberService.regist(member);

		} catch (SQLException e) {
			url = "500_error.jsp";
		}


*/
		request.getRequestDispatcher(url).forward(request, response);
	}


}
