package com.lost.action.qna;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lost.action.Action;
import com.lost.dto.QnAVO;
import com.lost.request.RegistQnARequest;
import com.lost.service.QnaService;

public class QnARegistAction implements Action{
	private QnaService qnaService;
	public void setQnaService(QnaService qnaService) {
		this.qnaService = qnaService;
	}
	
	
	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		
		
		String url = "";
	
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		String writer = request.getParameter("writer");
		
		
		QnAVO qna = new RegistQnARequest(title, content, writer).toQnAVO();
		
		
		try {
			qnaService.write(qna);
		} catch (SQLException e) {
			e.printStackTrace();
			url=null;
		}
		
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();
		out.println("<script>");
		out.println("window.opener.location.href='list.do';window.close();");
		out.println("</script>");
		out.close();
		
		
		return url;
	}
	
	
}
