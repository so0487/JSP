package com.lost.dto;

import java.util.Date;

public class NoticeVO {
	private int nno;
	private String title;
	private String writer;
	private String content;
	private int viewcnt;
	private Date regDate;
	
	
	public int getNno() {
		return nno;
	}
	public void setNno(int nno) {
		this.nno = nno;
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
	
	@Override
	public String toString() {
		return "NoticeVO [nno=" + nno + ", title=" + title + ", writer=" + writer + ", content=" + content
				+ ", viewcnt=" + viewcnt + ", regDate=" + regDate + "]";
	}
	
	
	public NoticeVO(int nno, String title, String writer, String content, int viewcnt, Date regDate) {
		super();
		this.nno = nno;
		this.title = title;
		this.writer = writer;
		this.content = content;
		this.viewcnt = viewcnt;
		this.regDate = regDate;
	}
	
	
	public NoticeVO() {
		super();
	}
	
	
}
