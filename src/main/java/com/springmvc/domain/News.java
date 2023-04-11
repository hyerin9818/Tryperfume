package com.springmvc.domain;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

public class News {
	private int snum; // 게시판 순서
	private String stname;  //게시판 제목
	private String memId;  //글쓴이
	private String sdate;  //글 쓴 시간
	private String stmain;  //글 내용
	private int sviews;   //조회수
	
	

	public News() {
		super();
		
	}



	public int getSnum() {
		return snum;
	}



	public void setSnum(int snum) {
		this.snum = snum;
	}



	public String getStname() {
		return stname;
	}



	public void setStname(String stname) {
		this.stname = stname;
	}



	public String getMemId() {
		return memId;
	}



	public void setMemId(String memId) {
		this.memId = memId;
	}



	public String getSdate() {
		return sdate;
	}



	public void setSdate(String sdate) {
		DateFormat dateFormat = new SimpleDateFormat("yyyy MMM d EEE, HH:mm:ss ");
		sdate=dateFormat.format(new Date());
		this.sdate = sdate;
	}



	public String getStmain() {
		return stmain;
	}



	public void setStmain(String stmain) {
		this.stmain = stmain;
	}



	public int getSviews() {
		return sviews;
	}



	public void setSviews(int sviews) {
		this.sviews = sviews;
	}



	@Override
	public String toString() {
		return "News [snum=" + snum + ", stname=" + stname + ", memId=" + memId + ", sdate=" + sdate + ", stmain="
				+ stmain + ", sviews=" + sviews + "]";
	}

	

	
	
}
