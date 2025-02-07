package com.example.demo.controller.member;

import java.sql.SQLException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.bean.MemberRegistrationBean;
import com.example.demo.entity.MsMember;
import com.example.demo.repository.MemberRepositoryInsert;

import lombok.RequiredArgsConstructor;



@RequiredArgsConstructor
@Controller
public class Men01D01Controller {

	private final MemberRepositoryInsert memberRepository; 
	private final MemberRegistrationBean memberRegistrationBean;
	
	@GetMapping("/register/view")  //登録画面への遷移
	public String process( @ModelAttribute("user") MsMember member, Model model) {
		
		memberRegistrationBean.setTitle("会員新規登録");
		
		model.addAttribute("title",memberRegistrationBean.getTitle());
	
		
		return "members/Mem01D01";
		
		
		
	}
	
	@PostMapping("/register/excecute") 
	public String touroku(@Validated @ModelAttribute("user")MsMember member,
					BindingResult result ,Model model) throws SQLException{
		
		if (result.hasErrors()) {
			
			memberRegistrationBean.setTitle("会員新規登録");
			
			model.addAttribute("title",memberRegistrationBean.getTitle());
			
			return "members/Mem01D01";
		}
		
		try {
			memberRepository.save(member);
		} catch (Exception e) {
			
			throw new SQLException("DB接続エラー。瞬断を想定");
		}
		
		
		
		memberRegistrationBean.setMessage("正常に会員情報が登録されました");
		
		memberRegistrationBean.setTitle("会員情報登録完了");
		
 		model.addAttribute("title",memberRegistrationBean.getTitle());
 		
 		model.addAttribute("memberRegistrationBean",memberRegistrationBean);
		
		
		
		return "members/Mem01D02";
	}
	
}
