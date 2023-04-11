package com.springmvc.controller;

import java.util.List;
import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.springmvc.domain.Member;
import com.springmvc.domain.Perfume;
import com.springmvc.repository.MemberRepository;
import com.springmvc.service.MemberService;

@Controller
@RequestMapping(value="/signin")
public class SigninController {
	
	private static final org.slf4j.Logger logger=LoggerFactory.getLogger(SigninController.class);
	
	@Autowired
	private MemberService memberService;
	
	@GetMapping
    public String signin() {
		return "signin";
    }
	
	@ResponseBody
	@RequestMapping(value="/idCheckForm", method=RequestMethod.POST)
	public int idCheck(@RequestParam("memId") String memId) {
		int result=memberService.idCheck(memId);
		System.out.println(memId);
		System.out.println(result);
		return result;
	}
	
	
	//회원가입
	@RequestMapping(value="/singinok", method =RequestMethod.POST )
	public String submitNewMember(Member member) throws Exception {
		logger.info("post singinok");
		System.out.println(member);
		memberService.setNewMerber(member);
		return "singinok";
	}
	
	
	
	
	
	

}
