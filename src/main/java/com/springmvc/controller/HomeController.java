package com.springmvc.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping("/")
	public String home() {
		return "home";
	}
	@RequestMapping("/home")
		public String rehome(){
			return "home";
		}
	
	
	@RequestMapping("/myperfume")
	public String myperfumes() {
		return "myperfume";
	}
	
	@RequestMapping("/notice")
	public String notice() {
		return "notice";
	}
	@RequestMapping("/news")
	public String news() {
		return "news";
	}
	@RequestMapping("/faq")
	public String faq() {
		return "faq";
	}
	@RequestMapping("/review")
	public String review() {
		return "review";
	}
	@RequestMapping("/freeboard")
	public String freeboard() {
		return "freeboard";
	}
	@RequestMapping("/requestboard")
	public String requestboard() {
		return "requestboard";
	}
	@RequestMapping("/addcart")
	public String addcart() {
		return "addcart";
	}
	@RequestMapping("/managerpage")
	public String managerpage() {
		return "managerpage";
	}
	
	
}
