package com.lost.action.qna;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lost.action.Action;
import com.lost.service.QnaService;

public class QnARemoveAction implements Action{
	private QnaService qnaService;
	public void setQnaService(QnaService qnaService) {
		this.qnaService = qnaService;
	}
	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String url = "";
		
		
		int qno = Integer.parseInt(request.getParameter("qno"));
		
		
		try {
			qnaService.remove(qno);
			
			response.setContentType("text/html;charset=utf-8");
			PrintWriter out=response.getWriter();
			out.println("<script>");
			out.println("alert('삭제되었습니다');");
			out.println("window.opener.location.reload(true);window.close();");
			out.println("</script>");	
			out.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
			url=null;
		}
		
		
		return url;
	}

}
