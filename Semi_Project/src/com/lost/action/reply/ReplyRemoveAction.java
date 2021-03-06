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
import com.lost.request.DeleteReplyRequest;
import com.lost.request.PageMaker;
import com.lost.request.SearchCriteria;
import com.lost.service.ReplyService;

public class ReplyRemoveAction implements Action {
	
	private ReplyService replyService;
	public void setReplyService(ReplyService replyService) {
		this.replyService = replyService;
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
		DeleteReplyRequest removeReq 
			= mapper.readValue(request.getReader(), DeleteReplyRequest.class);
		
		try {
			replyService.removeReply(removeReq.getRno());
			
			PageMaker pageMaker = new PageMaker();
			pageMaker.setCri(new SearchCriteria());
			pageMaker.setTotalCount(replyDAO.countReply(removeReq.getBno()));	
			
			int realEndPage = pageMaker.getRealEndPage();	
			
			response.setContentType("text/plain;charset=utf-8");
			PrintWriter out=response.getWriter();
			
			int page = removeReq.getPage();
			if(page>realEndPage){page=realEndPage;}
			
			out.print(page);
			out.close();
			
		}catch(SQLException e) {
			e.printStackTrace();
			url=null;			
		}
		
		return url;
	}

}




