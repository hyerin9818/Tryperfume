package com.springmvc.repository;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.springmvc.domain.News;
import com.springmvc.domain.Review;

@Repository
public class NewsRepositoryImpl implements NewsRepository {

	private List<News> listofNews = new ArrayList<News>();
	
	private JdbcTemplate template;
	
	@Autowired
	public void setJdbctemplate(DataSource dataSource) {
		this.template = new JdbcTemplate(dataSource);
	}
	
	
	@Override
	public List<News> gettAllNewsList() {
		String SQL = "select * from news";
		List<News> listofNews = template.query(SQL, new NewsRowMapper());
		return listofNews;
	}

	

	@Override
	public void setNewNews(News news) throws Exception{
		String SQL="insert into news(snum,stname,memId,sdate,stmain,sviews)"
				+"values(?,?,?,?,?,?)";
		
		System.out.println(news);
		
		Object[] params = new Object[] {
		        null, // nnum
		        news.getStname(), // ntname
		        news.getMemId(), // memId
		        null, // ndate
		        news.getStmain(), // ntmain
		        null // views
		    };
		
		template.update(SQL,params);

	}


	@Override
	public News getNewsBySnum(int snum) {
		// TODO Auto-generated method stub
		System.out.println(snum);
		News newsInfo=null;
		String SQL="select count(*) from news where snum=?";
		int rowCount=template.queryForObject(SQL, Integer.class,snum);
		if(rowCount != 0) {
			SQL="select*from news where snum=?";
			newsInfo=template.queryForObject(SQL, new Object[] {snum},new NewsRowMapper());
		}
			
		return newsInfo;
	}


	@Override
	public void setUpdateNews(News news) {
		// TODO Auto-generated method stub
		System.out.println(news);
			String SQL="update news set stname=?,memId=?,sdate=?,stmain=?,sviews=? where stname=?";
			template.update(SQL,news.getStname(),news.getMemId(),null,news.getStmain(),null,news.getStname());
		
		
	}


	@Override
	public void setDeleteNews(int snum) {
		// TODO Auto-generated method stub
		System.out.println(snum);
		String SQL="delete from news where snum=?";
		this.template.update(SQL,snum);
		
	}

}
