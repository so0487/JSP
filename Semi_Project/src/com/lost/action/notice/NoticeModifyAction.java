package com.lost.action.notice;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lost.action.Action;
import com.lost.dto.NoticeVO;
import com.lost.service.NoticeService;

public class NoticeModifyAction implements Action {

	private NoticeService noticeService;

	public void setNoticeService(NoticeService noticeService) {
		this.noticeService = noticeService;
	}

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String url = "redirect:/common/noticeDetail.do?nno=";

		// 파라메터 저장
		int nno = Integer.parseInt(request.getParameter("nno"));
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		String writer = request.getParameter("writer");
		
		url+=nno;

		NoticeVO notice = new NoticeVO();
		notice.setNno(nno);
		notice.setTitle(title);
		notice.setContent(content);
		notice.setWriter(writer);
		
		try {
			noticeService.modify(notice);
		} catch (SQLException e) {
			e.printStackTrace();
			url=null;
		}
		
		return url;
	}

}

