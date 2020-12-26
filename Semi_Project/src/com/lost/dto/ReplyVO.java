package com.lost.dto;

import java.util.Date;

public class ReplyVO {
	private int rno;
	private int qno;
	private String replytext;
	private String replyer;
	private Date regdate;
	private Date updatedate;
	
	
	
	
	public int getRno() {
		return rno;
	}
	public void setRno(int rno) {
		this.rno = rno;
	}
	public int getQno() {
		return qno;
	}
	public void setQno(int qno) {
		this.qno = qno;
	}
	public String getReplytext() {
		return replytext;
	}
	public void setReplytext(String replytext) {
		this.replytext = replytext;
	}
	public String getReplyer() {
		return replyer;
	}
	public void setReplyer(String replyer) {
		this.replyer = replyer;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	public Date getUpdatedate() {
		return updatedate;
	}
	public void setUpdatedate(Date updatedate) {
		this.updatedate = updatedate;
	}
	
	
	
	@Override
	public String toString() {
		return "ReplyVO [rno=" + rno + ", qno=" + qno + ", replytext=" + replytext + ", replyer=" + replyer
				+ ", regdate=" + regdate + ", updatedate=" + updatedate + "]";
	}
	
	
	
	
	public ReplyVO(int rno, int qno, String replytext, String replyer, Date regdate, Date updatedate) {
		super();
		this.rno = rno;
		this.qno = qno;
		this.replytext = replytext;
		this.replyer = replyer;
		this.regdate = regdate;
		this.updatedate = updatedate;
	}
	
	
	
	
	public ReplyVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	

}
