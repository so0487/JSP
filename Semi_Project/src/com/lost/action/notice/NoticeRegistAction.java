package com.lost.action.notice;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lost.action.Action;
import com.lost.dto.NoticeVO;
import com.lost.service.NoticeService;

public class NoticeRegistAction implements Action {
	
	private NoticeService noticeService;
	public void setNoticeService(NoticeService noticeService) {
		this.noticeService = noticeService;
	}
	
	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String url="";
		
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		String writer = request.getParameter("writer");
		
		NoticeVO notice = new NoticeVO();
		notice.setTitle(title);
		notice.setContent(content);
		notice.setWriter(writer);
		
		try {
			noticeService.write(notice);
			
			response.setContentType("text/html;charset=utf-8");
			PrintWriter out=response.getWriter();
			out.println("<script>");
			out.println("window.opener.location.href='"+request.getContextPath()+"/common/notice.do';window.close();");
			out.println("</script>");
			out.close();
		} catch (SQLException e) {
			e.printStackTrace();
			url=null;
		}
		
		return url;
	}

}
