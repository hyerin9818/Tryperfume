package com.springmvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.springmvc.domain.Member;
import com.springmvc.service.MemberService;

@Controller
public class LoginController {
	
	private static final org.slf4j.Logger logger=LoggerFactory.getLogger(LoginController.class);
	
	@Autowired
	private MemberService memberService;
	
	 //생성자를 통해 memberService 주입
    public void MemberController(MemberService memberService) {
        this.memberService = memberService;
     }
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	//로그인에서 폼으로 넘어갈때
	@PostMapping("/loginok")
	    public String loginok(@RequestParam("memId") String memId, @RequestParam("memPw") String memPw,Model model, HttpServletRequest req, RedirectAttributes rttr) {
	        boolean result=memberService.login(memId, memPw);
	        System.out.println(result);
	        HttpSession session=req.getSession();
	        if (result) {
	        	session.setAttribute("memId", memId);
	        	System.out.println(session.getAttribute("memId"));
	        	model.addAttribute("memId", memId);
	        	 return "loginok";
	        } else {
	            // 로그인 실패시 에러 메시지 출력
	            model.addAttribute("error", "아이디 또는 비밀번호가 일치하지 않습니다.");
	            return "login";
	        }
	    }
	//폼에서 메인 화면으로 넘어갈때
	@PostMapping("/home")
    public String home(@RequestParam("memId") String memId,@RequestParam("memPw") String memPw,Model model) {
        System.out.println(memId);
        boolean result=memberService.login(memId,memPw);
        System.out.println(result);
        if(result) {
        	model.addAttribute("memId",memId);
        	System.out.println(memId);
        	return "redirect:/home";
        }
        else {
        	return "home";
        }
		
    }
	//로그아웃
	@RequestMapping(value="/logout")
	public String logout(HttpServletRequest request) throws Exception{
		HttpSession session=request.getSession();
		System.out.println(session);
		//세션 초기화
		session.invalidate();
		return "redirect:/home";
	}
	
	//a태그 시에는 GetMapping 사용
	@GetMapping("/mypage")
	public String mypage(@RequestParam("memId") String memId,Model model) {
		System.out.println(memId);
		Member memberById=memberService.getMemberBymemId(memId);
        model.addAttribute("member",memberById);
        return "mypage";
        
	}
	//정보 수정
	@GetMapping("/updatemember")
	public String getUpdateMemberForm(@RequestParam("memId") String memId,Model model) {
		System.out.println(memId);
		Member memberById=memberService.getMemberBymemId(memId);
		System.out.println(memberById);
        model.addAttribute("member",memberById);
        return "updatememberForm";
        
	}
	
	@PostMapping("/updatemember")
	public String submitUpdateMemberForm(@RequestParam("memId") String memId,Member member,Model model) {
		System.out.println(member);
		memberService.setUpdateMember(member);
		Member memberById=memberService.getMemberBymemId(memId);
		model.addAttribute("member", member);
		model.addAttribute("member", memberById);
		return "mypage";
	}
	
	
	
	
	

}
