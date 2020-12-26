package com.lost.request;

import java.util.Date;

import com.lost.dto.ReplyVO;

public class RegistReplyRequest {
	private int qno;
	private String replyer;
	private String replytext;
	
	
	
	
	public int getQno() {
		return qno;
	}
	public void setQno(int qno) {
		this.qno = qno;
	}
	public String getReplyer() {
		return replyer;
	}
	public void setReplyer(String replyer) {
		this.replyer = replyer;
	}
	public String getReplytext() {
		return replytext;
	}
	public void setReplytext(String replytext) {
		this.replytext = replytext;
	}
	
	
	
	@Override
	public String toString() {
		return "RegistReplyRequest [qno=" + qno + ", replyer=" + replyer + ", replytext=" + replytext + "]";
	}
	
	
	
	
	
	
	public RegistReplyRequest(int qno, String replyer, String replytext) {
		super();
		this.qno = qno;
		this.replyer = replyer;
		this.replytext = replytext;
	}
	
	
	
	
	
	public RegistReplyRequest() {
		super();
	}
	
	
	
	
	
	public ReplyVO toReplyVO() {
		
		ReplyVO reply= new ReplyVO();
		
		reply.setQno(qno);
		reply.setReplyer(replyer);
		reply.setReplytext(replytext);
		reply.setRegdate(new Date());
		reply.setUpdatedate(new Date());
		
		return reply;
	}
	
	
	
	
	
}
