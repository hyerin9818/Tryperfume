package com.springmvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.springmvc.domain.News;
import com.springmvc.domain.Requestboard;
import com.springmvc.domain.Review;
import com.springmvc.service.RequestboardService;

@Controller
@RequestMapping("/requestboard")
public class RequestBoardController {

	@Autowired
	private RequestboardService requestboardService;
	
	@GetMapping
	public String requestRequestboardList(Model model) {
		List<Requestboard> list = requestboardService.getAllRequestboardList();
		model.addAttribute("requestboard",list);
		return "requestboard";
	}
	
	@GetMapping("/requestboardpage")
	public String requestNewsBynewsname(@RequestParam("rnum") int rnum, Model model) {
		Requestboard requestboardByNtname = requestboardService.getRequestboardByRnum(rnum);
		model.addAttribute("requestboard", requestboardByNtname);
		return "requestboardpage";
	}
	@RequestMapping("/requestboardwrite")
	public String write() {
		System.out.println("입고요청 추가 페이지");
		return "requestboardwrite";
	}
	
	@RequestMapping("/writelist")
	public String writelist() {
		return "writelist";
	}
	
	@PostMapping("/add")
	public String writeok(Requestboard requestboard) throws Exception {
		
		System.out.println(requestboard);
		requestboardService.setNewRequestboard(requestboard);
		System.out.println(" 추가 완료");
		return "redirect:/requestboard";
	}
}
