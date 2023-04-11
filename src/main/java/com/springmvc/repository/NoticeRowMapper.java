package com.springmvc.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.springmvc.domain.Notice;

public class NoticeRowMapper implements RowMapper<Notice> {

	@Override
	public Notice mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Notice notice = new Notice();
		
		notice.setWnum(rs.getInt(1));
		notice.setWtname(rs.getString(2));
		notice.setWdate(rs.getString(3));
		notice.setMemId(rs.getString(4));
		notice.setWviews(rs.getInt(5));
		notice.setWtmain(rs.getString(6));
		
		return notice;
	}
	


}
