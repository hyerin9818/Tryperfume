package com.springmvc.domain;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Faq {

	private int anum;
	private String atname;
	private String memId;
	private String adate;
	private String atmain;
	private int aviews;
	
	public Faq() {
		super();		
	}

	public int getAnum() {
		return anum;
	}

	public void setAnum(int anum) {
		this.anum = anum;
	}

	public String getAtname() {
		return atname;
	}

	public void setAtname(String atname) {
		this.atname = atname;
	}

	public String getMemId() {
		return memId;
	}

	public void setMemId(String memId) {
		this.memId = memId;
	}

	public String getAdate() {
		return adate;
	}

	public void setAdate(String adate) {
		DateFormat dateFormat = new SimpleDateFormat("yyyy MMM d EEE, HH:mm:ss ");
		adate=dateFormat.format(new Date());
		this.adate = adate;
	}

	public String getAtmain() {
		return atmain;
	}

	public void setAtmain(String atmain) {
		this.atmain = atmain;
	}

	public int getAviews() {
		return aviews;
	}

	public void setAviews(int aviews) {
		this.aviews = aviews;
	}

	@Override
	public String toString() {
		return "Faq [anum=" + anum + ", atname=" + atname + ", memId=" + memId + ", adate=" + adate + ", atmain="
				+ atmain + ", aviews=" + aviews + "]";
	}

	
	
}
