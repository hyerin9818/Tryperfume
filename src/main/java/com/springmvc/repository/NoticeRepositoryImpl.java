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

import com.springmvc.domain.Notice;
import com.springmvc.domain.Review;

@Repository
public class NoticeRepositoryImpl implements NoticeRepository {

	private List<Notice> listofNotice = new ArrayList<Notice>();
	
	private JdbcTemplate template;
	
	@Autowired
	public void setJdbctemplate(DataSource dataSource) {
		this.template = new JdbcTemplate(dataSource);
	}
	
	@Override
	public List<Notice> getAllNoticeList() {
		String SQL = "select * from notice";
		List<Notice> listofNotice = template.query(SQL, new NoticeRowMapper());
		return listofNotice;
	}

	
	
	@Override
	public void setNewNotice(Notice notice) throws Exception{
		String SQL="insert into notice(wnum,wtname,memId,wdate,wtmain,wviews)"
				+"values(?,?,?,?,?,?)";
		
		System.out.println(notice);
		
		Object[] params = new Object[] {
		        null, // nnum
		        notice.getWtname(), // ntname
		        notice.getMemId(), // memId
		        null, // ndate
		        notice.getWtmain(), // ntmain
		        null // views
		    };
		
		template.update(SQL,params);
	}

	@Override
	public Notice getNoticeByWnum(int wnum) {
		// TODO Auto-generated method stub
		System.out.println(wnum);
		Notice noticeInfo=null;
		String SQL="select count(*) from notice where wnum=?";
		int rowCount=template.queryForObject(SQL, Integer.class,wnum);
		if(rowCount != 0) {
			SQL="select*from notice where wnum=?";
			noticeInfo=template.queryForObject(SQL, new Object[] {wnum},new NoticeRowMapper());
		}
		
			
		return noticeInfo;
	}

	@Override
	public void setUpdateNotice(Notice notice){
		// TODO Auto-generated method stub
		System.out.println(notice);
		if(notice.getWtname() != null) {
			String SQL="update notice set wtname=?, wdate=?,memId=?,wviews=?,wtmain=? where wtname=?";
			template.update(SQL,notice.getWtname(),null,notice.getMemId(),null,notice.getWtmain(),notice.getWtname());
		}
		else if(notice.getWtname() == null) {
			String SQL="update notice set wtname=?, wdate=?,memId=?,wviews=?,wtmain=? where wtname=?";
			template.update(SQL,notice.getWtname(),null,notice.getMemId(),null,notice.getWtmain(),notice.getWnum());
		}


		
	}

	@Override
	public void setDeleteNotice(int wnum) {
		// TODO Auto-generated method stub
		System.out.println(wnum);
		String SQL="delete from notice where wnum=?";
		this.template.update(SQL,wnum);
		
	}

}

