package com.lost.action.qna;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lost.action.Action;
import com.lost.dto.QnAVO;
import com.lost.service.QnaService;

public class QnADetailAction implements Action{
	private QnaService qnaService;
	public void setQnaService(QnaService qnaService) {
		this.qnaService = qnaService;
	}

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String url = "qna/detailQnA";
		
		int qno = Integer.parseInt(request.getParameter("qno"));
		
		try {
			QnAVO qna = qnaService.getQnA(qno);
			request.setAttribute("qna", qna);
		} catch (SQLException e) {
			e.printStackTrace();
			url=null;
		}
		
		
		return url;
	}
}
