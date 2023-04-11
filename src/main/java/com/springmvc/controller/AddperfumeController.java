package com.springmvc.controller;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.springmvc.domain.Perfume;
import com.springmvc.service.PerfumeService;

@Controller
@RequestMapping("/addperfume")
public class AddperfumeController {
	
	private static final org.slf4j.Logger logger=LoggerFactory.getLogger(SigninController.class);
	
	
	@Autowired
	private PerfumeService perfumeService;
	
	@GetMapping()
	public String addperfume(@ModelAttribute Perfume perfume) {
		System.out.println("향수 추가 페이지");
		return "addperfume";
	}
	
	//향수 제품 추가
	@PostMapping(value="/addperfumeok")
	public String setNewPerfume(@Valid @ModelAttribute Perfume perfume,BindingResult result,MultipartHttpServletRequest multipartRequest,
            HttpServletResponse response) throws IllegalStateException, IOException{
		
		System.out.println(perfume);
	
	  
		perfumeService.setNewPerfume(perfume);
		System.out.println("향수 추가 완료");
		
		return "addperfumeok";
		
			
			
		
	}

}
