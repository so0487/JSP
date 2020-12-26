package com.lost.request;

import java.util.Date;

import com.lost.dto.QnAVO;
import com.sun.org.apache.regexp.internal.recompile;

public class RegistQnARequest {
	private String title;
	private String content;
	private String writer;
	
	
	
	public RegistQnARequest() {
		super();
		// TODO Auto-generated constructor stub
	}



	public RegistQnARequest(String title, String content, String writer) {
		super();
		this.title = title;
		this.content = content;
		this.writer = writer;
	}



	@Override
	public String toString() {
		return "RegistQnARequest [title=" + title + ", content=" + content + ", writer=" + writer + "]";
	}



	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}



	public String getContent() {
		return content;
	}



	public void setContent(String content) {
		this.content = content;
	}



	public String getWriter() {
		return writer;
	}



	public void setWriter(String writer) {
		this.writer = writer;
	}
	
	
	
	public QnAVO toQnAVO() {
		QnAVO qna = new QnAVO();
		qna.setTitle(this.title);
		qna.setContent(this.content);
		qna.setWriter(this.writer);
		qna.setViewcnt(0);
		qna.setRegDate(new Date());
		qna.setUpdatedate(new Date());
		
		
		return qna;
	}
	
	
}
