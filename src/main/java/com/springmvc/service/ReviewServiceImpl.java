package com.springmvc.service;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springmvc.domain.Review;
import com.springmvc.repository.ReviewRepository;

@Service
public class ReviewServiceImpl implements ReviewService {

	@Autowired
	private ReviewRepository reviewRepository;
	
	
	@Override
	//리뷰 데이터 불러오기
	public List<Review> gettAllReviewList() {
		return reviewRepository.getAllReviewList();
	}

	

	@Override
	//리뷰 데이터 추가
	public void setNewReview(Review review) throws Exception{
		System.out.println(review);
		reviewRepository.setNewReview(review);

	}



	@Override
	//리뷰 상세 페이지 매핑
	public Review getReviewByNnum(int nnum) {
		// TODO Auto-generated method stub
		System.out.println(nnum);
		Review reviewByNnum=reviewRepository.getReviewByNnum(nnum);
		return reviewByNnum;
	}

}
