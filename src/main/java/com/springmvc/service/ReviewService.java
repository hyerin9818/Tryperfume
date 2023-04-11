package com.springmvc.service;

import java.util.List;
import java.util.Map;
import java.util.Set;

import com.springmvc.domain.Review;

public interface ReviewService {
	List<Review> gettAllReviewList();
	Review getReviewByNnum(int nnum);
	void setNewReview(Review review) throws Exception;
	
}
