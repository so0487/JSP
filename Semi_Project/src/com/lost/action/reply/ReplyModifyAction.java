package com.lost.action.reply;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.lost.action.Action;
import com.lost.dto.ReplyVO;
import com.lost.request.ModifyReplyRequest;
import com.lost.service.ReplyService;

public class ReplyModifyAction implements Action {
	
	private ReplyService replyService;
	public void setReplyService(ReplyService replyService) {
		this.replyService=replyService;
	}
	
	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String url="";
		
		ObjectMapper mapper=new ObjectMapper();		
		ModifyReplyRequest replyReq 
			= mapper.readValue(request.getReader(), ModifyReplyRequest.class);
		ReplyVO reply = replyReq.toReplyVO();
		
		try {
			replyService.modifyReply(reply);			
		} catch (SQLException e) {
			e.printStackTrace();			
			url=null;			
		}
		
		return url;
	}

}
