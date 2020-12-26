package com.lost.action.qna;

import java.io.IOException;
import java.net.URLEncoder;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lost.action.Action;
import com.lost.dto.QnAVO;
import com.lost.request.ModifyQnARequest;
import com.lost.service.QnaService;

public class QnAModifyAction implements Action{
	private QnaService qnaService;
	public void setQnaService(QnaService qnaService) {
		this.qnaService = qnaService;
	}
	
	
	
	
	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		//파라미터에 저장
		int qno = Integer.parseInt(request.getParameter("qno"));
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		String writer = request.getParameter("writer");

		String page = request.getParameter("page");
		String perPageNum = request.getParameter("perPageNum");
		String searchType = request.getParameter("searchType");
		String keyword = request.getParameter("keyword");
		
		// 화면결정
		String url = "redirect:/qna/detail.do?qno="+qno;		
		
		
		
		
		// url 파라메터를 String 으로 만들경우 한글깨짐방지
		url += "&page=" + page + "&perPageNum=" + perPageNum + "&searchType=" 
			  + searchType + "&keyword="+ URLEncoder.encode(keyword, "utf-8");
		
		QnAVO qna = new ModifyQnARequest(qno, title, content, writer).toQnAVO();
		

		// 서비스를 의뢰 (결과 할당)
		try {
			qnaService.modify(qna);
		} catch (SQLException e) {
			e.printStackTrace();
			url=null;
		}
		// request.setAttribut() 없음.
		
		// 화면리턴		
		return url;
	}
	
	
}
