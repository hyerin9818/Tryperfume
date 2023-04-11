package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/paymentsys")
public class PaymentsController {
	
	@GetMapping
	public String paymentsys() {
		return "paymentsys";
	}
	
	@RequestMapping(value="/c_payment")
	public String c_payment() {
		System.out.println("무통장 입금 완료");
		return "c_payment";
	}
	@RequestMapping(value="/cardsystem")
	public String cardsystem() {
		System.out.println("카트 결제 시스템 이동");
		return "cardsystem";
	}
	
	
	

}
