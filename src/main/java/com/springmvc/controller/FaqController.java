package com.springmvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.springmvc.domain.Faq;
import com.springmvc.domain.Review;
import com.springmvc.service.FaqService;

@Controller
@RequestMapping("/faq")
public class FaqController {
	
	@Autowired
	private FaqService faqService;
	
	@GetMapping
	public String requestFaqList(Model model) {
		List<Faq> list = faqService.getAllFaqList();
		model.addAttribute("faq",list);
		return "faq";
	}
	
	@GetMapping("/faqpage")
	public String requestFaqByAnum(@RequestParam("anum") int anum, Model model) {
		Faq faqByAnum = faqService.getFaqByAnum(anum);
		model.addAttribute("faq", faqByAnum);
		return "faqpage";
	}
	@RequestMapping(value="/delete")
	public String getDeleteFaqForm(int anum) {
		faqService.setDeleteFaq(anum);
		return "redirect:/faq";
	}
	@GetMapping("/updatefaq")
	public String getUpdateFaqForm(@RequestParam("anum")int anum,Model model) {
		System.out.println(anum);
		Faq faqByAnum = faqService.getFaqByAnum(anum);
		model.addAttribute("faq", faqByAnum);
		
		return "updatefaqForm";
		
	}
	@PostMapping("/updatefaq")
	public String submitdateFaqForm(Faq faq, Model model){
		System.out.println(faq);
		faqService.setUpdateFaq(faq);
		model.addAttribute("faq",faq);
		
		return "redirect:/faq";
	}
	
	@RequestMapping("/faqwrite")
	public String write() {
		System.out.println("추가 페이지");
		return "faqwrite";
	}
	
	@RequestMapping("/writelist")
	public String writelist() {
		return "writelist";
	}
	
	//리뷰 글 추가
	@PostMapping("/add")
	public String writeok(Faq faq) throws Exception {
		
		faqService.setNewFaq(faq);
		System.out.println("추가 완료");
		return "redirect:/faq";
	}
	
	
}
