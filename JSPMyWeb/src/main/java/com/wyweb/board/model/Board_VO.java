package com.wyweb.board.model;

public class Board_VO {
	
	private int bno;
	private String writer;
	private String title;
	private String content;
	private String hit;
	private String regdate;
	
	
	public Board_VO() {
	
	}


	public Board_VO(int bno, String writer, String title, String content, String hit, String regdate) {
		super();
		this.bno = bno;
		this.writer = writer;
		this.title = title;
		this.content = content;
		this.hit = hit;
		this.regdate = regdate;
	}
	
	@Override
	public String toString() {
		return "Board_VO [bno=" + bno + ", writer=" + writer + ", title=" + title + ", content=" + content + ", hit="
				+ hit + ", regdate=" + regdate + "]";
	}


	public int getBno() {
		return bno;
	}


	public void setBno(int bno) {
		this.bno = bno;
	}


	public String getWriter() {
		return writer;
	}


	public void setWriter(String writer) {
		this.writer = writer;
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


	public String getHit() {
		return hit;
	}


	public void setHit(String hit) {
		this.hit = hit;
	}


	public String getRegdate() {
		return regdate;
	}


	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	
	
	

}
