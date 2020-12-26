package com.lost.dto;

import java.util.Date;

public class QnAVO {
	private int qno;          // 게시판번호
	private String title;
	private String writer;
	private String content;
	private int viewcnt;      // 조회수
	private Date regDate;     // 등록날짜
	private Date updatedate;

	private int replycnt;
	
	
	
	public int getReplycnt() {
		return replycnt;
	}
	public void setReplycnt(int replycnt) {
		this.replycnt = replycnt;
	}
	public int getQno() {
		return qno;
	}
	public void setQno(int qno) {
		this.qno = qno;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getViewcnt() {
		return viewcnt;
	}
	public void setViewcnt(int viewcnt) {
		this.viewcnt = viewcnt;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	public Date getUpdatedate() {
		return updatedate;
	}
	public void setUpdatedate(Date updatedate) {
		this.updatedate = updatedate;
	}
	
	
	
	@Override
	public String toString() {
		return "QnAVO [qno=" + qno + ", title=" + title + ", writer=" + writer + ", content=" + content + ", viewcnt="
				+ viewcnt + ", regDate=" + regDate + ", updatedate=" + updatedate + "]";
	}
	
	
	
	
	
	public QnAVO(int qno, String title, String writer, String content, int viewcnt, Date regDate, Date updatedate) {
		super();
		this.qno = qno;
		this.title = title;
		this.writer = writer;
		this.content = content;
		this.viewcnt = viewcnt;
		this.regDate = regDate;
		this.updatedate = updatedate;
	}
	
	
	
	
	public QnAVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
}
