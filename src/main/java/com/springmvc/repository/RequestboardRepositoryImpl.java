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

import com.springmvc.domain.Requestboard;
import com.springmvc.domain.Review;

@Repository
public class RequestboardRepositoryImpl implements RequestboardRepository {

	private List<Requestboard> listofRequestboard = new ArrayList<Requestboard>();
	
	private JdbcTemplate template;
	
	@Autowired
	public void setJdbctemplate(DataSource dataSource) {
		this.template = new JdbcTemplate(dataSource);
	}
	
	
	@Override
	//게시물 뿌리기
	public List<Requestboard> getAllRequestboardList() {
		String SQL = "select * from requestboard";
		List<Requestboard> listofRequestboard = template.query(SQL, new RequestboardRowMapper());
		return listofRequestboard;
	}

	

	@Override
	//게시물 추가
	public void setNewRequestboard(Requestboard requestboard) throws Exception{
		String SQL="insert into requestboard(rnum,rtname,memId,rdate,rtmain,rviews)"
				+"values(?,?,?,?,?,?)";
		
		System.out.println(requestboard);
		
		Object[] params = new Object[] {
		        null, // nnum
		        requestboard.getRtname(), // ntname
		        requestboard.getMemId(), // memId
		        requestboard.getRdate(), // ndate
		        requestboard.getRtmain(), // ntmain
		        null // views
		    };
		
		template.update(SQL,params);

	}


	@Override
	//게시물 상세 페이지
	public Requestboard getRequestboardByRnum(int rnum) {
		// TODO Auto-generated method stub
		System.out.println(rnum);
		Requestboard requestboardInfo=null;
		String SQL="select count(*) from requestboard where rnum=?";
		int rowCount=template.queryForObject(SQL, Integer.class,rnum);
		if(rowCount != 0) {
			SQL="select*from requestboard where rnum=?";
			requestboardInfo=template.queryForObject(SQL, new Object[] {rnum},new RequestboardRowMapper());
		}
			
		return requestboardInfo;

	}




}
