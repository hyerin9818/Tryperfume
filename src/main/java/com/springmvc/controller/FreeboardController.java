package com.springmvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.springmvc.domain.Freeboard;
import com.springmvc.domain.Review;
import com.springmvc.service.FreeboardService;

@Controller
@RequestMapping("/freeboard")
public class FreeboardController {
	
	@Autowired
	private FreeboardService freeboardService;
	
	@GetMapping
	public String requestFreeboardList(Model model) {
		List<Freeboard> list = freeboardService.gettAllFreeboardList();
		model.addAttribute("freeboard",list);
		return "freeboard";
	}
	
	@GetMapping("/freeboardpage")
	public String requestFreeboardByntname(@RequestParam("fnum") int fnum, Model model) {
		Freeboard freeboardByFnum = freeboardService.getFreeboardByFnum(fnum);
		model.addAttribute("freeboard", freeboardByFnum);
		return "freeboardpage";
	}
	@RequestMapping("/freeboardwrite")
	public String write() {
		return "freeboardwrite";
	}
	
	@RequestMapping("/writelist")
	public String writelist() {
		return "writelist";
	}
	
	@PostMapping("/add")
	public String writeok(Freeboard freeboard) throws Exception {
		
		freeboardService.setNewFreeboard(freeboard);
		System.out.println("리뷰 추가 완료");
		return "redirect:/freeboard";
	}
}
