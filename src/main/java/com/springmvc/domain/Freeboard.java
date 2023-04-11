package com.springmvc.domain;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Freeboard {
	private int fnum;
	private String ftname;
	private String memId;
	private String fdate;
	private String ftmain;
	private int fviews;
	
	
	@Override
	public String toString() {
		return "Freeboard [fnum=" + fnum + ", ftname=" + ftname + ", memId=" + memId + ", fdate=" + fdate + ", ftmain="
				+ ftmain + ", fviews=" + fviews + "]";
	}


	public int getFnum() {
		return fnum;
	}


	public void setFnum(int fnum) {
		this.fnum = fnum;
	}


	public String getFtname() {
		return ftname;
	}


	public void setFtname(String ftname) {
		this.ftname = ftname;
	}


	public String getMemId() {
		return memId;
	}


	public void setMemId(String memId) {
		this.memId = memId;
	}


	public String getFdate() {
		return fdate;
	}


	public void setFdate(String fdate) {
		DateFormat dateFormat = new SimpleDateFormat("yyyy MMM d EEE, HH:mm:ss ");
		fdate=dateFormat.format(new Date());
		this.fdate = fdate;
	}


	public String getFtmain() {
		return ftmain;
	}


	public void setFtmain(String ftmain) {
		this.ftmain = ftmain;
	}


	public int getFviews() {
		return fviews;
	}


	public void setFviews(int fviews) {
		this.fviews = fviews;
	}


	public Freeboard() {
		super();
	}


	
	
}
