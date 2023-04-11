package com.springmvc.domain;

import org.springframework.web.multipart.MultipartFile;

public class Etc {
	
	
	
	@Override
	public String toString() {
		return "Etc [enumber=" + enumber + ", ename=" + ename + ", cate=" + cate + ", ebrand=" + ebrand + ", emoney="
				+ emoney + ", edes=" + edes + ", esmell=" + esmell + ", egram=" + egram + ", epicmain=" + epicmain
				+ ", epicsub1=" + epicsub1 + ", epicsub2=" + epicsub2 + ", epicsub3=" + epicsub3 + ", epicmainname="
				+ epicmainname + ", epicsub1name=" + epicsub1name + ", epicsub2name=" + epicsub2name + ", epicsub3name="
				+ epicsub3name + "]";
	}
	
	private String ename;  //제품 이름
	private String cate;   //제품 카테고리
	private String ebrand; //제품 브랜드
	private int emoney;    //제품 가격
	private String edes;   //제품 설명 
	private String esmell; //제품 향기
	private String egram;  //제품 용량
	private MultipartFile epicmain;  //제품 메인사진
	private MultipartFile epicsub1;  //제품 설명사진1
	private MultipartFile epicsub2;  //제품 설명사진2
	private MultipartFile epicsub3;  //제품 설명사진3
	private String epicmainname;
	private String epicsub1name;
	private String epicsub2name;
	private String epicsub3name;
	private String enumber; // 제품 넘버
	
	
	//기본 생성자
	public Etc() {
		super();
	}
	
	public Etc(String ename,String cate,String ebrand) {
		super();
		this.ename=ename;
		this.cate=cate;
		this.ebrand=ebrand;
	}
	
	//Getter & Setter 작성
	public String getEnumber() {
		return enumber;
	}

	public void setEnumber(String enumber) {
		this.enumber = enumber;
	}
	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getCate() {
		return cate;
	}

	public void setCate(String cate) {
		this.cate = cate;
	}

	public String getEbrand() {
		return ebrand;
	}

	public void setEbrand(String ebrand) {
		this.ebrand = ebrand;
	}

	public int getEmoney() {
		return emoney;
	}

	public void setEmoney(int emoney) {
		this.emoney = emoney;
	}

	public String getEdes() {
		return edes;
	}

	public void setEdes(String edes) {
		this.edes = edes;
	}

	public String getEsmell() {
		return esmell;
	}

	public void setEsmell(String esmell) {
		this.esmell = esmell;
	}

	public String getEgram() {
		return egram;
	}

	public void setEgram(String egram) {
		this.egram = egram;
	}

	public MultipartFile getEpicmain() {
		return epicmain;
	}

	public void setEpicmain(MultipartFile epicmain) {
		this.epicmain = epicmain;
	}

	public MultipartFile getEpicsub1() {
		return epicsub1;
	}

	public void setEpicsub1(MultipartFile epicsub1) {
		this.epicsub1 = epicsub1;
	}

	public MultipartFile getEpicsub2() {
		return epicsub2;
	}

	public void setEpicsub2(MultipartFile epicsub2) {
		this.epicsub2 = epicsub2;
	}

	public MultipartFile getEpicsub3() {
		return epicsub3;
	}

	public String getEpicmainname() {
		return epicmainname;
	}

	public void setEpicmainname(String epicmainname) {
		this.epicmainname = epicmainname;
	}

	public String getEpicsub1name() {
		return epicsub1name;
	}

	public void setEpicsub1name(String epicsub1name) {
		this.epicsub1name = epicsub1name;
	}

	public String getEpicsub2name() {
		return epicsub2name;
	}

	public void setEpicsub2name(String epicsub2name) {
		this.epicsub2name = epicsub2name;
	}

	public String getEpicsub3name() {
		return epicsub3name;
	}

	public void setEpicsub3name(String epicsub3name) {
		this.epicsub3name = epicsub3name;
	}

	public void setEpicsub3(MultipartFile epicsub3) {
		this.epicsub3 = epicsub3;
	}
}
