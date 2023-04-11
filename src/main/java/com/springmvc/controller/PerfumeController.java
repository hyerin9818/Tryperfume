package com.springmvc.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.mysql.cj.Session;
import com.springmvc.domain.Perfume;
import com.springmvc.service.PerfumeService;

@Controller
@RequestMapping("/perfumes")
public class PerfumeController {
	
	@Autowired
	private PerfumeService perfumeService;
	
	@GetMapping
	    public String requestPerfumeList(Model model) { 
	        List<Perfume> list = perfumeService.getAllPerfumeList();
	        model.addAttribute("perfume", list);  
	        return "perfumes"; 
	    } 
	
	@GetMapping(value="/perfume") 
    public String requestPerfumeByPname(@RequestParam("pname") String pname, Model model) {  
        Perfume perfumeByPname = perfumeService.getPerfumeByPname(pname);
        model.addAttribute("perfume", perfumeByPname );
        
        return "perfume";
    }
	
	//제품 삭제
	@RequestMapping(value="/delete")
	public String getDeletePerfume(String pname) {
		perfumeService.setDeletePerfume(pname);
		return "redirect:/perfumes";
	}
	//제품 수정
	@GetMapping("/updateperfume")
	public String getUpdatePerfumeForm(@RequestParam("pname") String pname,Model model) {
		System.out.println(pname);
		Perfume perfumeByPname = perfumeService.getPerfumeByPname(pname);
        model.addAttribute("perfume", perfumeByPname );
        
        return "updateperfumeForm";
        
	}
	
	@PostMapping("/updateperfume")
	public String submitdatePerfumeForm(Perfume perfume,Model model) {
		
		System.out.println(perfume);
		perfumeService.setUpdatePerfume(perfume);
		model.addAttribute("perfume", perfume);
		
		return "redirect:/perfumes";
	}
	
	@GetMapping(value="/addcart")
	public String addcart() {
		
		return "addcart";
	}
	
	@GetMapping(value="/paymentsys")
	public String payment() {
		
		return "paymentsys";
	}
	
}
