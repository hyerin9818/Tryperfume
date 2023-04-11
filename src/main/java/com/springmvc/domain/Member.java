package com.springmvc.domain;

import java.io.Serializable;

public class Member implements Serializable{
	
	@Override
	public String toString() {
		return "Member [memname=" + memname + ", phonenum1=" + phonenum1 + ", phonenum2=" + phonenum2 + ", phonenum3="
				+ phonenum3 + ", memId=" + memId + ", memPw=" + memPw + ", email1=" + email1 + ", email2=" + email2
				+ ", address1=" + address1 + ", address2=" + address2 + ", address3=" + address3 + "]";
	}

	private static final long serialVersionUID = 1L;
	


	private String memname;  // 회원이름
	private int phonenum1;  // 회원 번호1
	private int phonenum2;  // 회원 번호2
	private int phonenum3;  // 회원 번호3
	private String memId;  // 회원 아이디
	private String memPw;  // 회원 비밀번호
	private String email1; //회원 이메일 주소 1
	private String email2;
	private String address1;
	private String address2;
	private String address3;
	


	public Member() {
		super();
	}
	
	public Member(String memId, String memPw) {
		super();
		this.memId=memId;
		this.memPw=memPw;
	}

	public String getMemname() {
		return memname;
	}

	public void setMemname(String memname) {
		this.memname = memname;
	}

	public int getPhonenum1() {
		return phonenum1;
	}

	public void setPhonenum1(int phonenum1) {
		this.phonenum1 = phonenum1;
	}

	public int getPhonenum2() {
		return phonenum2;
	}

	public void setPhonenum2(int phonenum2) {
		this.phonenum2 = phonenum2;
	}

	public int getPhonenum3() {
		return phonenum3;
	}

	public void setPhonenum3(int phonenum3) {
		this.phonenum3 = phonenum3;
	}

	public String getMemId() {
		return memId;
	}

	public void setMemId(String memId) {
		this.memId = memId;
	}

	public String getMemPw() {
		return memPw;
	}

	public void setMemPw(String memPw) {
		this.memPw = memPw;
	}

	public String getEmail1() {
		return email1;
	}

	public void setEmail1(String email1) {
		this.email1 = email1;
	}

	public String getEmail2() {
		return email2;
	}

	public void setEmail2(String email2) {
		this.email2 = email2;
	}
	
	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getAddress3() {
		return address3;
	}

	public void setAddress3(String address3) {
		this.address3 = address3;
	}

	
	
	

}
