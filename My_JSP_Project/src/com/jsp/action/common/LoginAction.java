package com.jsp.action.common;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jsp.action.Action;
import com.jsp.action.ApplicationContext;
import com.jsp.exception.InvalidPasswordException;
import com.jsp.exception.NotFoundIDException;
import com.jsp.service.MemberService;

public class LoginAction implements Action {

	private MemberService memberService;
	public void setMemberService(MemberService memberService) {
		this.memberService = memberService;
	}


	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String url="redirect:/index.do";
		
		//로그인처리
		String id=request.getParameter("id");
		String pwd=request.getParameter("pwd");		
		
		HttpSession session = request.getSession();
		
		try {
			memberService.login(id, pwd);
			session.setAttribute("loginUser", memberService.getMember(id));
			
		} catch (SQLException e) {
			e.printStackTrace();
			url="/error/500_error";
			request.setAttribute("exception", e);
		} catch (NotFoundIDException | InvalidPasswordException e) {
			//e.printStackTrace();
			url="redirect:/";
			session.setAttribute("msg", e.getMessage());
		} 
		
		return url;
	}

}