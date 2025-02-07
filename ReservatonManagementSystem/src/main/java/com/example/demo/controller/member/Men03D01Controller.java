package com.example.demo.controller.member;


import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.bean.MemberUpdateBean;
import com.example.demo.bean.MemberUpdateBean.MemberCodeValid;
import com.example.demo.entity.MsMember;
import com.example.demo.repository.MemberRepositoryUpdate;

import groovyjarjarantlr4.v4.parse.ANTLRParser.throwsSpec_return;
import lombok.RequiredArgsConstructor;


@RequiredArgsConstructor  //Lombokの機能
@Controller
public class Men03D01Controller {
	
//	@Autowired  springbootの機能  必須？？理解できていないのでコメントアウト @RequiredArgsConstructorが自動ですべてコンストラクタインジェクションを行ってくれて、＠AutowiredでDI注入する場合はコンストラクターを作成し、＠Autowiredアノテーションをつけて作成していく
	private final MemberRepositoryUpdate memberRepository;
//	private final MessageSource messageSource;   message.properiesを作成したら使用
	
	@GetMapping("/update")
	public String showUpdateView(Model model) {
		
		model.addAttribute("title","会員情報更新");
		
		model.addAttribute("member",new MemberUpdateBean());
		
		
		return "/members/Mem03D01";
		
	}
	
	
	@PostMapping("/update/search")
	public String searchMember(@Validated(MemberCodeValid.class) @ModelAttribute("member")  MemberUpdateBean memberUpdateBean,BindingResult result,Model model) throws SQLException {  //	ModelAttributeで手順書の途中の「MemberUpdateBeanを初期化し、modelにセットする」という作業を行っている？
		

		model.addAttribute("title","会員情報更新");
		
		if (result.hasErrors()) {
			//バリデーションエラーの時の処理
			return "/members/Mem03D01";
		}
		
  		
		
		
//		model.addAttribute("member",memberUpdateBean);  同じものを上書きしている
		
		Integer memberCode=memberUpdateBean.getMemberCode();
		
		MsMember member;
		try {
			member = memberRepository.findByMemberCode(memberCode);
		} catch (SQLException e) {
			
			throw new SQLException("DB接続エラー。瞬断を想定");

		}
		
		if (member==null) {
			
			Boolean searchReslutBoolean=false;
			
			model.addAttribute("searchResultBoolean",searchReslutBoolean);
			
			return "/members/Mem03D01";
		}
		
		memberUpdateBean.setMemberCode(member.getMemberCode());     //検索結果（エンティティ）をモデル（Bean）にセット
		memberUpdateBean.setFirstName(member.getFirstName());
		memberUpdateBean.setLastName(member.getLastName());
		memberUpdateBean.setAddress(member.getAddress());
		memberUpdateBean.setPhoneNumber(member.getPhoneNumber());
		memberUpdateBean.setEmail(member.getEmail());
		memberUpdateBean.setBirthdate(member.getBirthdate());
		memberUpdateBean.setRegistrationDate(member.getRegistrationDate());
		memberUpdateBean.setUpdateDate(member.getUpdateDate());
		
		
//		model.addAttribute("memberUpdateBean",memberUpdateBean);  使用していない
		model.addAttribute("searchResult",memberUpdateBean);
		
		
		return "/members/Mem03D01";
		
	}
	
	
	@PostMapping("/update/update")
	public String updateMember(@Validated @ModelAttribute("searchResult") MemberUpdateBean memberUpdateBean,BindingResult result,Model model) throws SQLException {
		
		model.addAttribute("title","会員情報更新");
		model.addAttribute("member",memberUpdateBean);
		
		if (result.hasErrors()) {
			//バリデーションエラーの時の処理
			return "/members/Mem03D01";
		}
		Integer memberCode=memberUpdateBean.getMemberCode();
		
		MsMember member;
		try {
			member = memberRepository.findByMemberCode(memberCode);
		} catch (SQLException e) {
			throw new SQLException();
		}
	    
		if (memberUpdateBean.getMemberCode() !=null) {
			member.setMemberCode(memberUpdateBean.getMemberCode()); 
		}
		                                                                    //更新項目をセットする
		if (!memberUpdateBean.getFirstName().isEmpty()) {
			member.setFirstName(memberUpdateBean.getFirstName()); 
		}
		if (!memberUpdateBean.getLastName().isEmpty()) {
			member.setLastName(memberUpdateBean.getLastName()); 
		}
		if (!memberUpdateBean.getAddress().isEmpty()) {
			member.setAddress(memberUpdateBean.getAddress()); 
		}
		if (!memberUpdateBean.getPhoneNumber().isEmpty()) {
			member.setPhoneNumber(memberUpdateBean.getPhoneNumber()); 
		}
		if (memberUpdateBean.getRegistrationDate() !=null) {
			member.setRegistrationDate(memberUpdateBean.getRegistrationDate()); 
		}
		if (memberUpdateBean.getUpdateDate() !=null) {
			member.setUpdateDate(memberUpdateBean.getUpdateDate()); 
		}
		
		
		memberRepository.save(member);
		
		model.addAttribute("memberUpdateBean",memberUpdateBean);
		model.addAttribute("searchResult",memberUpdateBean);
		model.addAttribute("resultMsg","会員情報が正常に更新されました");
		
		
		
		return "/members/Mem03D01";
		
	}
	

}
