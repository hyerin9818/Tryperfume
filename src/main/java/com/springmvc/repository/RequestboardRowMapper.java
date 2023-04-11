package com.springmvc.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.springmvc.domain.Requestboard;

public class RequestboardRowMapper implements RowMapper<Requestboard>{
	

	@Override
	public Requestboard mapRow(ResultSet rs, int rowNum) throws SQLException{
		
		Requestboard requestboard = new Requestboard();
		
		requestboard.setRnum(rs.getInt(1));
		requestboard.setRtname(rs.getString(2));
		requestboard.setMemId(rs.getString(3));
		requestboard.setRdate(rs.getString(4));
		requestboard.setRtmain(rs.getString(5));
		requestboard.setRviews(rs.getInt(6));
		
		return requestboard;
			
	}
	
}
