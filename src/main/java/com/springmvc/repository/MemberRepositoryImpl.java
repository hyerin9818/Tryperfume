 package com.springmvc.repository;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.springmvc.domain.Member;

@Repository
public class MemberRepositoryImpl implements MemberRepository {
	
	
	private List<Member> listOfMembers=new ArrayList<Member>();
	
	private JdbcTemplate template; // 데이터베이스 연결
	
	
	
	@Autowired
	public void setJdbctemplate(DataSource dataSource) {
		this.template=new JdbcTemplate(dataSource);
	}
	

	@Override
	// 회원가입
	public void setNewMember(Member member) throws Exception {
		// TODO Auto-generated method stub
		String SQL="insert into member(memname,phonenum1,phonenum2,phonenum3,memId,memPw,email1,email2,address1,address2,address3)"
				    +"values(?,?,?,?,?,?,?,?,?,?,?)"; //쿼리문 작성
		System.out.println(member); // member 잘 들어왔는지 확인
		template.update(SQL, member.getMemname(), member.getPhonenum1(), member.getPhonenum2(), member.getPhonenum3(),
				member.getMemId(),member.getMemPw(),member.getEmail1(),member.getEmail2(),member.getAddress1(),
				member.getAddress2(),member.getAddress3()); // 쿼리문 실행
		

	}


	@Override
	//아이디 중복체크
	public int idCheck(String memId){
		// TODO Auto-generated method stub
		System.out.println(memId);
		String SQL="select count(*) from member where memId=?";
		int result=template.queryForObject(SQL, Integer.class,memId);
		
		System.out.println(result);
		return result ;
	}


	


	@Override
	//로그인
	public int login(String memId, String memPw) {
        String SQL = "SELECT count(*) FROM member WHERE memId = ? AND memPw =?";
        System.out.println(memId);//잘 받았나 확인
        System.out.println(memPw);//잘 받았나 확인
        //queryForObject() 메소드는 SELECT 구문의 실행 결과를 특정 자바 객체로 매핑하여 리턴받을 때 사용
        //검색 결과가 없거나 검색 결과가 두 개 이상이면 예외 발생
        int result=template.queryForObject(SQL, new Object[] {memId, memPw},Integer.class);
        return result;
    }


	@Override
	//마이페이지
	public Member getMemberBymemId(String memId) {
		// TODO Auto-generated method stub
		Member memberById=null;
		String SQL = "SELECT count(*) FROM member WHERE memId = ?";
        System.out.println(memId);//잘 받았나 확인
        //queryForObject() 메소드는 SELECT 구문의 실행 결과를 특정 자바 객체로 매핑하여 리턴받을 때 사용
        //검색 결과가 없거나 검색 결과가 두 개 이상이면 예외 발생
        int result=template.queryForObject(SQL, new Object[] {memId},Integer.class);
        if(result !=0) {
        	SQL="select*from member where memId=?";
        	memberById=template.queryForObject(SQL, new Object[] {memId}, new MemberRowMapper());
        	System.out.println(memberById);
        }
		return memberById;
	}


	@Override
	//회원 수정
	public void setUpdateMember(Member member) {
		System.out.println(member);
		// TODO Auto-generated method stub
		if(member.getMemId() !=null) {
			String SQL ="update member set memname=?, phonenum1=?,phonenum2=?,phonenum3=?,memId=?,memPw=?,email1=?,email2=?,address1=?,address2=?,address3=? where memId=?";
			template.update(SQL,member.getMemname(),member.getPhonenum1(),member.getPhonenum2(),member.getPhonenum3(),member.getMemId(),member.getMemPw(),
					member.getEmail1(),member.getEmail2(),member.getAddress1(),member.getAddress2(),member.getAddress3(),member.getMemId());
		}
		else if(member.getMemId()==null) {
			String SQL ="update member set memname=?, phonenum1=?,phonenum2=?,phonenum3=?,memId=?,memPw=?,email1=?,email2=?,address1=?,address2=?,address3=? where memId=?";
			template.update(SQL,member.getMemname(),member.getPhonenum1(),member.getPhonenum2(),member.getPhonenum3(),member.getMemId(),member.getMemPw(),
					member.getEmail1(),member.getEmail2(),member.getAddress1(),member.getAddress2(),member.getAddress3(),member.getMemId());
		}
		
	}


	

}
