package com.springmvc.repository;

import java.util.List;
import java.util.Map;
import java.util.Set;

import com.springmvc.domain.Review;

public interface ReviewRepository {
	List<Review> getAllReviewList();
	Review getReviewByNnum(int nnum);
	void setNewReview(Review review) throws Exception;
}

