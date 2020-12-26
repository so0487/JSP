package com.lost.action.notice;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lost.action.Action;
import com.lost.dto.NoticeVO;
import com.lost.service.NoticeService;

public class NoticeDetailAction implements Action{

	private NoticeService noticeService;
	public void setNoticeService(NoticeService noticeService) {
		this.noticeService = noticeService;
	}
	
	
	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String url = "/notice/noticeDetail";
		
		int nno = Integer.parseInt(request.getParameter("nno"));
		
		try {
			NoticeVO notice = noticeService.getNotice(nno);
			request.setAttribute("notice", notice);
		} catch (SQLException e) {
			e.printStackTrace();
			url = null;
		}
		
		return url;
	}
	
}
