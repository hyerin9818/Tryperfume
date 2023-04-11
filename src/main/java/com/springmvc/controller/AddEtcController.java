package com.springmvc.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.springmvc.domain.Etc;
import com.springmvc.domain.Perfume;
import com.springmvc.service.EtcService;

@Controller
@RequestMapping("/addetc")
public class AddEtcController {
	
	private static final org.slf4j.Logger logger=LoggerFactory.getLogger(SigninController.class);
	
	@Autowired
	private EtcService etcService;
	
	@GetMapping
	public String addetc(@ModelAttribute Etc etc) {
		
		System.out.println("etc 추가 페이지");
		return "addetc";
	}
	
	//향수 제품 추가
		@PostMapping(value="/addetcok")
		public String setNewEtc(@Valid @ModelAttribute Etc etc,BindingResult result,MultipartHttpServletRequest multipartRequest,
	            HttpServletResponse response) throws IllegalStateException, IOException{
			
			System.out.println(etc);
		
		  
			etcService.setNewEtc(etc);
			System.out.println("etc 추가 완료");
			
			return "addetcok";

		}
		
}