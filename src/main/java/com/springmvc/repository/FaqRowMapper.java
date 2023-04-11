package com.springmvc.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.springmvc.domain.Faq;

public class FaqRowMapper implements RowMapper<Faq> {
	
	@Override
	public Faq mapRow(ResultSet rs, int rowNum) throws SQLException{
		
		Faq faq = new Faq();
		
		faq.setAnum(rs.getInt(1));		
		faq.setAtname(rs.getString(2));
		faq.setMemId(rs.getString(3));
		faq.setAdate(rs.getString(4));
		faq.setAtmain(rs.getString(5));
		faq.setAviews(rs.getInt(6));
		
		return faq;
	}

}
