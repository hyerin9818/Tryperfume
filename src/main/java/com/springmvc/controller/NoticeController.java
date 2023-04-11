package com.springmvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.springmvc.domain.Notice;
import com.springmvc.domain.Review;
import com.springmvc.service.NoticeService;

@Controller
@RequestMapping("/notice")
public class NoticeController {
	
	@Autowired
	private NoticeService noticeService;
	
	@GetMapping
	public String requestNoticeList(Model model) {
		List<Notice> list = noticeService.getAllNoticeList();
		model.addAttribute("notice",list);
		return "notice";
	}
	
	@GetMapping("/noticepage")
	public String requestNoticeByWnum(@RequestParam("wnum") int wnum, Model model) {
		Notice noticeByWnum = noticeService.getNoticeByWnum(wnum);
		model.addAttribute("notice", noticeByWnum);
		return "noticepage";
	}
	//글 삭제
	@RequestMapping(value="/delect")
	public String getDeleteNotice(int wnum) {
		noticeService.sepDeleteNotice(wnum);
		return "redirect:/notice";
	}
	// 글 수정
	@GetMapping("/updatenotice")
	public String getUpdateNoticeForm(@RequestParam("wnum") int wnum,Model model) {
		System.out.println(wnum);
		Notice noticeByWnum = noticeService.getNoticeByWnum(wnum);
		model.addAttribute("notice", noticeByWnum);
		
		return "updatenoticeForm";
	}
	
	@PostMapping("/updatenotice")
	public String submitdateNoticeForm(Notice notice,Model model) throws Exception {
		
		System.out.println(notice);
		noticeService.setUpdateNotice(notice);
		model.addAttribute("notice", notice);
		
		return "redirect:/notice";
	}
		
	@RequestMapping("/noticewrite")
	public String write() {
		System.out.println("공지 추가 페이지");
		return "noticewrite";
	}
	
	@RequestMapping("/writelist")
	public String writelist() {
		return "writelist";
	}
	
	//리뷰 글 추가
	@PostMapping("/add")
	public String noticeok(Notice notice) throws Exception {
		
		noticeService.setNewNotice(notice);
		System.out.println("리뷰 추가 완료");
		return "redirect:/notice";
	}
}