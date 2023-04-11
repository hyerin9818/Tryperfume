package com.springmvc.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.springmvc.domain.Freeboard;

public class FreeboardRowMapper implements RowMapper<Freeboard> {

	@Override
	public Freeboard mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Freeboard freeboard = new Freeboard();
		
		freeboard.setFnum(rs.getInt(1));
		freeboard.setFtname(rs.getString(2));
		freeboard.setMemId(rs.getString(3));
		freeboard.setFdate(rs.getString(4));
		freeboard.setFtmain(rs.getString(5));
		freeboard.setFviews(rs.getInt(6));
		
		
		return freeboard;
	}
	


}
