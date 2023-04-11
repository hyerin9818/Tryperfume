package com.springmvc.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import com.springmvc.domain.Etc;

public class EtcRowMapper implements RowMapper<Etc> {

	@Override
	public Etc mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Etc etc=new Etc();
		etc.setEname(rs.getString(1));
		etc.setCate(rs.getString(2));
		etc.setEbrand(rs.getString(3));
		etc.setEmoney(rs.getInt(4));
		etc.setEdes(rs.getString(5));
		etc.setEsmell(rs.getString(6));
		etc.setEgram(rs.getString(7));
		etc.setEpicmainname(rs.getString(8));
		etc.setEpicsub1name(rs.getString(9));
		etc.setEpicsub2name(rs.getString(10));
		etc.setEpicsub3name(rs.getString(11));
		etc.setEnumber(rs.getString(12));
		return etc;
	}
	


}
