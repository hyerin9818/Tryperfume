package com.springmvc.service;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springmvc.domain.Member;
import com.springmvc.repository.MemberRepository;

@Service
public class MemberServiceImpl implements MemberService {
	
	@Autowired
	private MemberRepository memberRepository;
	
	@Override
	//회원 가입, member 테이블에 데이터넣기
	public void setNewMerber(Member member) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(member);
		memberRepository.setNewMember(member);
	}

	@Override
	public int idCheck(String memId) {
		// TODO Auto-generated method stub
		int result =memberRepository.idCheck(memId);
		System.out.println(memId);
		System.out.println(result);
		return result;
	}

	@Override
	//로그인하기, 데이터베이스에 입력한 값이 있으면 1이 나옴
	public boolean login(String memId, String memPw) {
        int result=memberRepository.login(memId, memPw);
        
        System.out.println(memId);
        System.out.println(memPw);
        System.out.println(result);
        return (result==1); //조회결과가 1이면 true 반환
    }

	@Override
	//마이페이지에 해당되는 아이디가 있음 해당 멤버 데이터가 보여짐
	public Member getMemberBymemId(String memId) {
		// TODO Auto-generated method stub
		System.out.println(memId);
		Member memberById=memberRepository.getMemberBymemId(memId);
		System.out.println(memberById);
		return memberById;
	}

	@Override
	//해당 아이디가 있는 경우 회원 수정이 가능하도록 설정
	public void setUpdateMember(Member member) {
		// TODO Auto-generated method stub
		System.out.println(member);
		memberRepository.setUpdateMember(member);
	}

}
