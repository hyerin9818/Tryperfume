package com.springmvc.domain;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Requestboard {
	private int rnum;
	private String rtname;
	private String memId;
	private String rdate;
	private String rtmain;
	private int rviews;
	
	
	public Requestboard() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "Requestboard [rnum=" + rnum + ", rtname=" + rtname + ", memId=" + memId + ", rdate=" + rdate
				+ ", rtmain=" + rtmain + ", rviews=" + rviews + "]";
	}


	public int getRnum() {
		return rnum;
	}


	public void setRnum(int rnum) {
		this.rnum = rnum;
	}


	public String getRtname() {
		return rtname;
	}


	public void setRtname(String rtname) {
		this.rtname = rtname;
	}


	public String getMemId() {
		return memId;
	}


	public void setMemId(String memId) {
		this.memId = memId;
	}


	public String getRdate() {
		return rdate;
	}


	public void setRdate(String rdate) {
		DateFormat dateFormat = new SimpleDateFormat("yyyy MMM d EEE, HH:mm:ss ");
		rdate=dateFormat.format(new Date());
		this.rdate = rdate;
	}


	public String getRtmain() {
		return rtmain;
	}


	public void setRtmain(String rtmain) {
		this.rtmain = rtmain;
	}


	public int getRviews() {
		return rviews;
	}


	public void setRviews(int rviews) {
		this.rviews = rviews;
	}


	
	
}
