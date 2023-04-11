package com.springmvc.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

import java.sql.*;

import org.springframework.jdbc.core.RowMapper;

import com.springmvc.domain.News;

public class NewsRowMapper implements RowMapper<News>{
	

	@Override
	public News mapRow(ResultSet rs, int rowNum) throws SQLException{
		
		News news = new News();
		
		news.setSnum(rs.getInt(1));
		news.setStname(rs.getString(2));
		news.setMemId(rs.getString(3));
		news.setSdate(rs.getString(4));
		news.setStmain(rs.getString(5));
		news.setSviews(rs.getInt(6));
		
		return news;
			
	}
	
}
