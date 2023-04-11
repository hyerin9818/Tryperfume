package com.springmvc.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.springmvc.domain.Review;

public class ReviewRowMapper implements RowMapper<Review> {
	
	@Override
	public Review mapRow(ResultSet rs, int rowNum) throws SQLException{
		
		Review review = new Review();
		
		review.setNnum(rs.getInt(1));
		review.setNtname(rs.getString(2));
		review.setMemId(rs.getString(3));
		review.setNdate(rs.getString(4));
		review.setNtproduct(rs.getString(5));
		review.setNtmain(rs.getString(6));
		review.setViews(rs.getInt(7));
		
		return review;
	}
}
