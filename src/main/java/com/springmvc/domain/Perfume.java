package com.springmvc.domain;

import org.springframework.web.multipart.MultipartFile;

public class Perfume {
	@Override
	public String toString() {
		return "Perfume [pname=" + pname + ", pbrand=" + pbrand + ", pmoney=" + pmoney + ", pdes=" + pdes + ", psmell="
				+ psmell + ", pgram=" + pgram + ", ppicmain=" + ppicmain + ", ppicsub1=" + ppicsub1 + ", ppicsub2="
				+ ppicsub2 + ", ppicsub3=" + ppicsub3 + ", ppicmainname=" + ppicmainname + ", ppicsub1name="
				+ ppicsub1name + ", ppicsub2name=" + ppicsub2name + ", ppicsub3name=" + ppicsub3name + "]";
	}

	private String pname;  //제품 이픔
	private String pbrand; //제품 브랜드
	private int pmoney;   //제품 가격
	private String pdes;  //제품 설명
	private String psmell;  //제품 향기
	private String pgram;  //제품 용량
	private MultipartFile ppicmain;  //제품 메인 사진
	private MultipartFile ppicsub1;  //제품 설명사진1
	private MultipartFile ppicsub2;  //제품 설명사진2
	private MultipartFile ppicsub3;  //제품 설명사진3
	private String ppicmainname;
	private String ppicsub1name;
	private String ppicsub2name;
	private String ppicsub3name;
	private String pnum; // 상품 넘버
	
	public String getPnum() {
		return pnum;
	}

	public void setPnum(String pnum) {
		this.pnum = pnum;
	}

	public String getPpicmainname() {
		return ppicmainname;
	}

	public void setPpicmainname(String ppicmainname) {
		this.ppicmainname = ppicmainname;
	}

	public String getPpicsub1name() {
		return ppicsub1name;
	}

	public void setPpicsub1name(String ppicsub1name) {
		this.ppicsub1name = ppicsub1name;
	}

	public String getPpicsub2name() {
		return ppicsub2name;
	}

	public void setPpicsub2name(String ppicsub2name) {
		this.ppicsub2name = ppicsub2name;
	}

	public String getPpicsub3name() {
		return ppicsub3name;
	}

	public void setPpicsub3name(String ppicsub3name) {
		this.ppicsub3name = ppicsub3name;
	}

	//기본 생성자
	public Perfume() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Perfume(String pname,String pbrand,int pmoney) {
		super();
		this.pname=pname;
		this.pbrand=pbrand;
		this.pmoney=pmoney;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getPbrand() {
		return pbrand;
	}

	public void setPbrand(String pbrand) {
		this.pbrand = pbrand;
	}

	public int getPmoney() {
		return pmoney;
	}

	public void setPmoney(int pmoney) {
		this.pmoney = pmoney;
	}

	public String getPdes() {
		return pdes;
	}

	public void setPdes(String pdes) {
		this.pdes = pdes;
	}

	public String getPsmell() {
		return psmell;
	}

	public void setPsmell(String psmell) {
		this.psmell = psmell;
	}

	public String getPgram() {
		return pgram;
	}

	public void setPgram(String pgram) {
		this.pgram = pgram;
	}

	public MultipartFile getPpicmain() {
		return ppicmain;
	}

	public void setPpicmain(MultipartFile ppicmain) {
		this.ppicmain = ppicmain;
	}

	public MultipartFile getPpicsub1() {
		return ppicsub1;
	}

	public void setPpicsub1(MultipartFile ppicsub1) {
		this.ppicsub1 = ppicsub1;
	}

	public MultipartFile getPpicsub2() {
		return ppicsub2;
	}

	public void setPpicsub2(MultipartFile ppicsub2) {
		this.ppicsub2 = ppicsub2;
	}

	public MultipartFile getPpicsub3() {
		return ppicsub3;
	}

	public void setPpicsub3(MultipartFile ppicsub3) {
		this.ppicsub3 = ppicsub3;
	}

	
	
	

}
