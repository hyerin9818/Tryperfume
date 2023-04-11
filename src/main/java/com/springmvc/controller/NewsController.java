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
import com.springmvc.domain.Review;
import com.springmvc.service.NewsService;

@Controller
@RequestMapping("/news")
public class NewsController {
	
	@Autowired
	private NewsService newsService;
	
	@GetMapping
	public String requestNewsList(Model model) {
		List<News> list = newsService.gettAllNewsList();
		model.addAttribute("news",list);
		return "news";
	}
	
	@GetMapping("/newspage")
	public String requestNewsBySnum(@RequestParam("snum") int snum, Model model) {
		News newsBySnum = newsService.getNewsBySnum(snum);
		model.addAttribute("news", newsBySnum);
		return "newspage";
	}
	
	@RequestMapping(value="/delect")
	public String getDeleteNews(int snum) {
		newsService.setDeleteNews(snum);
		return "redirect:/news";
	}
	
	@GetMapping("/updatenews")
	public String getUpdateNewsForm(@RequestParam("snum")int snum,Model model) {
		News newsBySnum = newsService.getNewsBySnum(snum);
		model.addAttribute("news", newsBySnum);
		
		return "updatenewsForm";
	}
	
	@PostMapping("/updatenews")
	public String submitdateNewsForm(News news,Model model) {
		System.out.println(news);
		newsService.setUpdateNews(news);
		model.addAttribute("news", news);
		
		return "redirect:/news";
	}
	
	@RequestMapping("/newswrite")
	public String write() {
		System.out.println("추가 페이지");
		return "newswrite";
	}
	
	@RequestMapping("/writelist")
	public String writelist() {
		return "writelist";
	}
	
	//리뷰 글 추가
	@PostMapping("/add")
	public String writeok(News news) throws Exception {
		
		newsService.setNewNews(news);
		System.out.println("추가 완료");
		return "redirect:/news";
	}

}
