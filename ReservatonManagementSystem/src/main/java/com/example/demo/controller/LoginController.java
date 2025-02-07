package com.example.demo.controller;


import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.bean.MemberRegistrationBean;
import com.example.demo.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
public class LoginController {

	private final UserRepository repository;
	private final MemberRegistrationBean memberRegistrationBean;
	
	@GetMapping("/login")
	public String login() {
		
		return "ComLgn01D01";
	}
	
	@GetMapping("/menu")
	public String success(Authentication loginUser,Model model) {
		model.addAttribute("username", loginUser.getName());
		model.addAttribute("authority",loginUser.getAuthorities());
		
		memberRegistrationBean.setTitle("メンバー面接管理");
		
		model.addAttribute("title",memberRegistrationBean.getTitle());
		
		return "ComMen01D01";
	}
}
