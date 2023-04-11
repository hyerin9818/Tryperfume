package com.springmvc.domain;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;

public class Review {
	
	private int nnum; // 게시물 번호
	private String ntname; // 제목
	private String ndate;   //작성 날짜
	private String memId; //작성자
	private String ntproduct; //리뷰 제품
	private String ntmain; //리뷰 내용
	private int views; //조회수
	
	
	public Review() {
		super();
	}
	
	public Review(int nnum, String ntname) {
		super();
		this.nnum=nnum;
		this.ntname=ntname;
	}
	
	public int getNnum() {
		return nnum;
	}
	public void setNnum(int nnum) {
		this.nnum = nnum;
	}
	public String getNtname() {
		return ntname;
	}
	public void setNtname(String ntname) {
		this.ntname = ntname;
	}
	public String getNdate() {
		return ndate;
	}
	public void setNdate(String ndate) {
		DateFormat dateFormat = new SimpleDateFormat("yyyy MMM d EEE, HH:mm:ss ");
		ndate=dateFormat.format(new Date());
		this.ndate = ndate;
	}
	public String getMemId() {
		return memId;
	}
	public void setMemId(String memId) {
		this.memId = memId;
	}
	public String getNtproduct() {
		return ntproduct;
	}
	public void setNtproduct(String ntproduct) {
		this.ntproduct = ntproduct;
	}
	public String getNtmain() {
		return ntmain;
	}
	public void setNtmain(String ntmain) {
		this.ntmain = ntmain;
	}
	public int getViews() {
		return views;
	}
	public void setViews(int views) {
		this.views = views;
	}

	@Override
	public String toString() {
		return "Review [nnum=" + nnum + ", ntname=" + ntname + ", ndate=" + ndate + ", memId=" + memId + ", ntproduct="
				+ ntproduct + ", ntmain=" + ntmain + ", views=" + views + "]";
	}
	
	
	
	
}


