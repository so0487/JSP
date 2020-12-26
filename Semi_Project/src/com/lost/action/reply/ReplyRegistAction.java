package com.lost.action.reply;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.lost.action.Action;
import com.lost.dao.ReplyDAO;
import com.lost.request.PageMaker;
import com.lost.request.RegistReplyRequest;
import com.lost.request.SearchCriteria;
import com.lost.service.ReplyService;

public class ReplyRegistAction implements Action {
	
	private ReplyService replyService;
	public void setReplyService(ReplyService replyService) {
		this.replyService= replyService;
	}
	
	private ReplyDAO replyDAO;
	public void setReplyDAO(ReplyDAO replyDAO) {
		this.replyDAO=replyDAO;
	}
	
	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String url="";
		
		ObjectMapper mapper=new ObjectMapper();
		
		RegistReplyRequest replyReq 
		= mapper.readValue(request.getReader(), RegistReplyRequest.class);
		
		response.setContentType("text/plain;charset=utf-8");
		PrintWriter out=response.getWriter();
		
		try {
			replyService.registReply(replyReq.toReplyVO());
			
			
			PageMaker pageMaker = new PageMaker();
			pageMaker.setCri(new SearchCriteria());
			pageMaker.setTotalCount(replyDAO.countReply(replyReq.toReplyVO().getQno()));	
			
			int realEndPage = pageMaker.getRealEndPage();				
			out.println("SUCCESS,"+realEndPage);
			
		} catch (SQLException e) {
			out.print("FAIL,1");
			e.printStackTrace();
			url=null;			
		}finally {
			if(out!=null)out.close();
		}	
		
		return url;
	}

}








