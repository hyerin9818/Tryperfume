package com.springmvc.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

import com.springmvc.domain.Member;

public class MemberRowMapper implements RowMapper<Member> {

	@Override
	public Member mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		
		Member member=new Member();
		member.setMemname(rs.getString(1));
		member.setPhonenum1(rs.getInt(2));
		member.setPhonenum2(rs.getInt(3));
		member.setPhonenum3(rs.getInt(4));
		member.setMemId(rs.getString(5));
		member.setMemPw(rs.getString(6));
		member.setEmail1(rs.getString(7));
		member.setEmail2(rs.getString(8));
		member.setAddress1(rs.getString(9));
		member.setAddress2(rs.getString(10));
		member.setAddress3(rs.getString(11));
		return member;
	}

	
}
