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

import com.springmvc.domain.Review;

@Repository
public class ReviewRepositoryImpl implements ReviewRepository {

	private List<Review> listofReview = new ArrayList<Review>();
	
	private JdbcTemplate template;
	
	@Autowired
	public void setJdbctemplate(DataSource dataSource) {
		this.template = new JdbcTemplate(dataSource);		
	}
	
	@Override
	//글 전체 목록
	public List<Review> getAllReviewList() {
		String SQL = "select * from review";
		List<Review> listofReview = template.query(SQL, new ReviewRowMapper());
		return listofReview;
	}

		
	@Override
	//글쓰기 추가
	public void setNewReview(Review review) throws Exception {
		String SQL="insert into review(nnum,ntname,memId,ndate,ntproduct,ntmain,views)"
				+"values(?,?,?,?,?,?,?)";
		
		System.out.println(review);
		
		Object[] params = new Object[] {
		        null, // nnum
		        review.getNtname(), // ntname
		        review.getMemId(), // memId
		        review.getNdate(), // ndate
		        review.getNtproduct(), // ntproduct
		        review.getNtmain(), // ntmain
		        null // views
		    };
		
		template.update(SQL,params);
	}

	@Override
	//게시물 번호와 매핑하여 보여주기
	public Review getReviewByNnum(int nnum) {
		// TODO Auto-generated method stub
		System.out.println(nnum);
		Review reviewInfo=null;
		String SQL="select count(*) from review where nnum=?";
		int rowCount=template.queryForObject(SQL, Integer.class,nnum);
		if(rowCount != 0) {
			SQL="select*from review where nnum=?";
			reviewInfo=template.queryForObject(SQL, new Object[] {nnum},new ReviewRowMapper());
		}
			
		return reviewInfo;
	}
	
	

}
