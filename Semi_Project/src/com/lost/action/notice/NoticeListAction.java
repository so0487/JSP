package com.lost.action.notice;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.plaf.synth.SynthScrollPaneUI;

import com.lost.action.Action;
import com.lost.request.SearchCriteria;
import com.lost.service.NoticeService;

public class NoticeListAction implements Action {
	
	private NoticeService noticeService;
	public void setNoticeService(NoticeService noticeService) {
		this.noticeService = noticeService;
	}
	
	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String url = "/notice/list";
		
		String page = request.getParameter("page");
		String perPageNum = request.getParameter("perPageNum");
		String searchType = request.getParameter("searchType");
		String keyword = request.getParameter("keyword");
		
		
		
		SearchCriteria cri = new SearchCriteria(page,perPageNum,searchType,keyword);
		
		
		Map<String,Object> dataMap=null;
		
		try {
			dataMap=noticeService.getNoticeList(cri);
			request.setAttribute("dataMap", dataMap);
		} catch (SQLException e) {
			e.printStackTrace();
			url=null;
		}		
		
		return url;
	}

}
