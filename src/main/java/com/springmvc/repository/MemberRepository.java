package com.springmvc.repository;

import java.util.List;

import com.springmvc.domain.Etc;
import com.springmvc.domain.Member;

public interface MemberRepository {
	
	//회원가입
	public void setNewMember(Member merber) throws Exception;
	
	//아이디 중복체크
	public int idCheck(String memId);
	
	//로그인
	public int login(String memId, String memPw);
	
	//마이페이지 연동
	public Member getMemberBymemId(String memId);
	
	//회원정보 수정
	public void setUpdateMember(Member member);
	
	
	
	
	
}
