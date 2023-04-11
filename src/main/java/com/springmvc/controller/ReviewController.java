package com.springmvc.controller;


import java.io.IOException;
import java.util.List;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.springmvc.domain.Review;
import com.springmvc.service.ReviewService;

@Controller
@RequestMapping("/review")
public class ReviewController {
	
	
	
	@Autowired
	private ReviewService reviewService;
	
	@GetMapping
	public String requestReviewList(Model model) {
		List<Review> list = reviewService.gettAllReviewList();
		model.addAttribute("review",list);
		return "review";
	}
	
	@GetMapping("/reviewpage")
	public String requestReviewByNnum(@RequestParam("nnum") int nnum, Model model) {
		Review reviewByNnum = reviewService.getReviewByNnum(nnum);
		model.addAttribute("review", reviewByNnum);
		return "reviewpage";
	}
	
	@RequestMapping("/reviewwrite")
	public String write() {
		System.out.println("리뷰 추가 페이지");
		return "reviewwrite";
	}
	
	@RequestMapping("/writelist")
	public String writelist() {
		return "writelist";
	}
	
	//리뷰 글 추가
	@PostMapping("/add")
	public String writeok(Review review) throws Exception {
		
		reviewService.setNewReview(review);
		System.out.println("리뷰 추가 완료");
		return "redirect:/review";
	}
}
