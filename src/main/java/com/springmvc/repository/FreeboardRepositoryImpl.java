package com.springmvc.repository;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.springmvc.domain.Freeboard;
import com.springmvc.domain.Review;

@Repository
public class FreeboardRepositoryImpl implements FreeboardRepository {

	private List<Freeboard> listofFreeboard = new ArrayList<Freeboard>();
	
	private JdbcTemplate template;
	
	@Autowired
	public void setJdbctemplate(DataSource dataSource) {
		this.template = new JdbcTemplate(dataSource);
	}
	
	@Override
	public List<Freeboard> getAllFreeboardList() {
		String SQL = "select * from freeboard";
		List<Freeboard> listofFreeboard = template.query(SQL, new FreeboardRowMapper());
		return listofFreeboard;
	}

	
	@Override
	public void setNewFreeboard(Freeboard freeboard) throws Exception {
		String SQL="insert into freeboard(fnum,ftname,memId,fdate,ftmain,fviews)"
				+"values(?,?,?,?,?,?)";
		
		System.out.println(freeboard);
		
		Object[] params = new Object[] {
		        null, // nnum
		        freeboard.getFtname(), // ntname
		        freeboard.getMemId(), // memId
		        freeboard.getFdate(), // ndate
		        freeboard.getFtmain(), // ntmain
		        null // views
		    };
		
		template.update(SQL,params);
	}

	@Override
	public Freeboard getFreeboardByFnum(int fnum) {
		// TODO Auto-generated method stub
		System.out.println(fnum);
		Freeboard freeboardInfo=null;
		String SQL="select count(*) from freeboard where fnum=?";
		int rowCount=template.queryForObject(SQL, Integer.class,fnum);
		if(rowCount != 0) {
			SQL="select*from freeboard where fnum=?";
			freeboardInfo=template.queryForObject(SQL, new Object[] {fnum},new FreeboardRowMapper());
		}
			
		return freeboardInfo;
	}

}