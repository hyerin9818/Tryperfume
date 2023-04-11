package com.springmvc.service;

import com.springmvc.domain.Member;

public interface MemberService {
	
	//회원가입
	void setNewMerber(Member member) throws Exception;
	
	//아이디 중복검사
	public int idCheck(String memId);
	
	//로그인
	public boolean login(String memId, String memPw);
	
	//마이페이지 연동
	public Member getMemberBymemId(String memId);
	
	//회원정보 수정
	public void setUpdateMember(Member member);

}
