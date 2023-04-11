package com.springmvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.springmvc.domain.Etc;
import com.springmvc.service.EtcService;

@Controller
@RequestMapping("/etcs")
public class EtcController {
	
	@Autowired
	private EtcService etcService;
	
	@GetMapping
	public String requestEtcList(Model model) {
		List<Etc> list=etcService.getAllEtcList();
		model.addAttribute("etc",list);
		return "etcs";
	}
	
	@GetMapping("/etc")
	public String requestEtcByEname(@RequestParam("ename") String ename,Model model) {
		Etc etcByEname=etcService.getEtcByEname(ename);
		model.addAttribute("etc", etcByEname);
		return "etc";
	}
	//제품 삭제
	@RequestMapping(value="/delete")
	public String getDeleteEtc(String ename) {
		etcService.setDeleteEtc(ename);
		return "redirect:/etcs";
	}
	//제품 수정
	@GetMapping("/updateetc")
	public String getUpdateEtcForm(@RequestParam("ename") String ename,Model model) {
		System.out.println(ename);
		Etc etcByEname=etcService.getEtcByEname(ename);
		model.addAttribute("etc", etcByEname);
		
		return "updateetcForm";
	}
	
	@PostMapping("/updateetc")
	public String submitdateEtcForm(Etc etc,Model model) {
		
		System.out.println(etc);
		etcService.setUpdateEtc(etc);
		model.addAttribute("etc", etc);
		
		return "redirect:/etcs";
	}
	@GetMapping("/paymentsys")
	public String paymentsys(Model model) {
		List<Etc> list=etcService.getAllEtcList();
		model.addAttribute("etc",list);
		return "paymentsys";
	}
	@GetMapping("/addcart")
	public String addcart(@RequestParam("ename") String ename,Model model) {
		System.out.println(ename);
		Etc etcByEname=etcService.getEtcByEname(ename);
		model.addAttribute("etc", etcByEname);
		return "addcart";
	}
	
}
