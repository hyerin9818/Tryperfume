package com.springmvc.domain;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Notice{
	
	private int wnum;
	private String wtname;
	private String wdate;
	private String memId;
	private int wviews;
	private String wtmain;
	
	
	public Notice() {
		super();
	}


	public int getWnum() {
		return wnum;
	}


	public void setWnum(int wnum) {
		this.wnum = wnum;
	}


	public String getWtname() {
		return wtname;
	}


	public void setWtname(String wtname) {
		this.wtname = wtname;
	}


	public String getWdate() {
		return wdate;
	}


	public void setWdate(String wdate) {
		DateFormat dateFormat = new SimpleDateFormat("yyyy MMM d EEE, HH:mm:ss ");
		wdate=dateFormat.format(new Date());
		this.wdate = wdate;
	}


	public String getMemId() {
		return memId;
	}


	public void setMemId(String memId) {
		this.memId = memId;
	}


	public int getWviews() {
		return wviews;
	}


	public void setWviews(int wviews) {
		this.wviews = wviews;
	}


	public String getWtmain() {
		return wtmain;
	}


	public void setWtmain(String wtmain) {
		this.wtmain = wtmain;
	}


	@Override
	public String toString() {
		return "Notice [wnum=" + wnum + ", wtname=" + wtname + ", wdate=" + wdate + ", memId=" + memId + ", wviews="
				+ wviews + ", wtmain=" + wtmain + "]";
	}

	
	
}


