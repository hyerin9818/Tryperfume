package com.springmvc.repository;

import java.nio.charset.StandardCharsets;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.web.multipart.MultipartFile;

import com.springmvc.domain.Perfume;

public class PerfumeRowMapper implements RowMapper<Perfume> {
	
	@Override
	public Perfume mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		
		Perfume perfume=new Perfume();
		perfume.setPname(rs.getString(1));
		perfume.setPbrand(rs.getString(2));
		perfume.setPmoney(rs.getInt(3));
		perfume.setPdes(rs.getString(4));
		perfume.setPsmell(rs.getString(5));
		perfume.setPgram(rs.getString(6));
		perfume.setPpicmainname(rs.getString(7));
		perfume.setPpicsub1name(rs.getString(8));
		perfume.setPpicsub2name(rs.getString(9));
		perfume.setPpicsub3name(rs.getString(10));
		perfume.setPnum(rs.getString(11));
		// TODO Auto-generated method stub
		return perfume;
	}

}
