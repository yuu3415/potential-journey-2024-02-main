package com.example.demo.controller.member;


import java.sql.SQLException;
import java.util.List;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.bean.MemberSearchBean;
import com.example.demo.entity.MsMember;
import com.example.demo.repository.MemberRepositorySearch;


import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
public class Men02D01Controller {
	
	private final MemberRepositorySearch memberRepository;
	private final MemberSearchBean memberSearchBean;
	
	@GetMapping("/search")
	public String showMemberSearchPage(Model model) {
		//初期化（null）とモデルにセット(クラスごとセット)
		model.addAttribute("user",new MemberSearchBean());

		
		//@ModelAttributeで行ってしまうと忘れてしまうが画面を表示するだけでもインプットとモデルのどの値が対応しているのかを示すためにもバインドを行う必要がある。
		
		memberSearchBean.setTitle("会員情報検索");
		
		model.addAttribute("title",memberSearchBean.getTitle());
		
		
		return "/members/Mem02D01";
	}
	
	@PostMapping("/search/excecute")
	public String excecuteSearch(@Validated @ModelAttribute("user")  MemberSearchBean memberSearchBean, BindingResult result, Model model  ) throws SQLException  {
									
		memberSearchBean.setTitle("会員情報検索");
		
		model.addAttribute("title",memberSearchBean.getTitle());
		
		if (result.hasErrors()) {
			//エラーの時の処理
			return "/members/Mem02D01";
		}
		
		Integer memberCode=memberSearchBean.getMemberCode();
		if (memberSearchBean.getMemberCode()==null) {
			memberCode=0;
		}
		
		String firstName=memberSearchBean.getFirstName();
		if (memberSearchBean.getFirstName().isEmpty()) {
			firstName=null;
		}
		
		String lastName=memberSearchBean.getLastName();
		if (memberSearchBean.getLastName().isEmpty()) {
			lastName=null;
		}
		
		String address=memberSearchBean.getAddress();
		if (memberSearchBean.getAddress().isEmpty()) {
			address=null;
		}
		
		String phoneNumber=memberSearchBean.getPhoneNumber();
		if (memberSearchBean.getPhoneNumber().isEmpty()) {
			phoneNumber=null;
		}
		
		List<MsMember> searchResultList = null;
		try {
			searchResultList = memberRepository.findByDynamicCriteria(memberCode, firstName, lastName, address,phoneNumber);
		} catch (SQLException e) {
			
			throw new SQLException("DB接続エラー。瞬断を想定");
		}

		model.addAttribute("searchResults",searchResultList);
		
		return "/members/Mem02D01";
		
	}
	
	@GetMapping("/search/excecute/{memberCode}")  //GetMappingだと処理が入る  Postで送ることができなかった→確認したい GETは可能
	public String showMemberDetailPage(@PathVariable @ModelAttribute("searchResults") Integer memberCode,Model model) {
		
		memberSearchBean.setTitle("会員情報検索");
		
		model.addAttribute("title",memberSearchBean.getTitle());
		
		memberSearchBean.setFirstName(null);
		memberSearchBean.setLastName(null);
		memberSearchBean.setAddress(null);
		memberSearchBean.setPhoneNumber(null);
		
	   model.addAttribute("detail",memberSearchBean);
	   
	    MsMember searchMember=memberRepository.findByMemberCode(memberCode);
	    
	    model.addAttribute("member",searchMember);
	  
		
		return "/members/Mem02D02";
		
	}

}
