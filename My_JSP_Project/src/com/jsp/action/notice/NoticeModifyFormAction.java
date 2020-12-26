package com.jsp.action.notice;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.action.Action;
import com.jsp.dto.NoticeVO;
import com.jsp.service.NoticeService;

public class NoticeModifyFormAction implements Action {
	
	private NoticeService noticeService;
	public void setNoticeService(NoticeService noticeService) {
		this.noticeService = noticeService;
	}
	
	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String url="/notice/modify";
		
		try {
			int nno = Integer.parseInt(request.getParameter("nno"));
		
			NoticeVO notice=noticeService.getNotice(nno);
		
			request.setAttribute("notice", notice);
		}catch(Exception e) {
			e.printStackTrace();
			url=null;
		}
		
		return url;
	}

}
