package com.jsp.action.reply;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.jsp.action.Action;
import com.jsp.request.SearchCriteria;
import com.jsp.service.ReplyService;

public class ReplyListAction implements Action {

	private ReplyService replyService;

	public void setReplyService(ReplyService replyService) {
		this.replyService = replyService;
	}

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String url = "";

		int bno = Integer.parseInt(request.getParameter("bno"));
		int page = Integer.parseInt(request.getParameter("page"));

		SearchCriteria cri = new SearchCriteria();
		cri.setPage(page);
		cri.setPerPageNum(10);

		try {
			Map<String, Object> dataMap = replyService.getReplyList(bno, cri);
		
			
			ObjectMapper mapper = new ObjectMapper();

			response.setContentType("application/json;charset=utf-8");
			PrintWriter out = response.getWriter();

			out.println(mapper.writeValueAsString(dataMap));

			out.close();

		} catch (SQLException e) {
			e.printStackTrace();
			url = null;
		}

		return url;
	}

}
