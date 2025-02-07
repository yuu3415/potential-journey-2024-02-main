package com.example.demo.controller;



import static org.hamcrest.CoreMatchers.*;
import static org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestPostProcessors.csrf;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import java.sql.SQLException;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.web.servlet.MockMvc;

import com.example.demo.bean.MemberSearchBean;
import com.example.demo.repository.MemberRepositorySearch;

import jakarta.transaction.Transactional;



@SpringBootTest
@AutoConfigureMockMvc
@Transactional
class Men02D01ControllerTest {
	
	@Autowired
	MockMvc mockMvc;

	@Test
	@DisplayName("検索結果が0件の時、「検索結果は0件です」と出力することを期待します")  //検索結果が0の時はsearchResultにnullを詰めるためエラーにはならない
	@WithMockUser(username = "test",authorities = "ADMIN")
	void whenThereIsSearchhas0_expwctToSeeStrings()  throws Exception{
		
		var member=new MemberSearchBean();
		member.setMemberCode(1234567890);
		
		mockMvc
			.perform(
					post("/search/excecute")
					.flashAttr("user", member)
					.with(csrf())
				)
			.andExpect(content().string(containsString("検索結果は0件です")))
			.andExpect(view().name("/members/Mem02D01"));
					
		
		
	}
	
	
	@Test
	@DisplayName("社員番号に数値以外を入力した時、エラーが発生し、「社員番号に入力できるのは数値だけです」を出力することを期待します")   //ここでは電話番号に数字以外が記入されたらエラーを返すというもの
	@WithMockUser(username = "test",authorities = "ADMIN")
	void whenThereIsSearchError_expwctToSeeErrorsmemberCode()  throws Exception{
		
//		var member=new MemberSearchBean();
//		member.setMemberCode("あああああ");  //そもそもがInteger型なので文字列をセットすることができない→どのようにテストを行う？
		
		
//		var member=new MemberSearchBean();
//		String str = "ああああ";
//		Integer memberCode = Integer.parseInt(str);
//		member.setMemberCode(memberCode);
		
		
		mockMvc
			.perform(
					post("/search/excecute")
					.param("memberCode", "ああああ")
					.with(csrf())
				)
			.andExpect(model().hasErrors())
			.andExpect(content().string(containsString("社員番号に入力できるのは数値だけです")))
			.andExpect(view().name("/members/Mem02D01"));
					
		
		
	}
	
	
	
	@Test
	@DisplayName("電話番号に数値以外を入力した時、エラーが発生し、「電話番号に入力できるのは数値だけです」を出力することを期待します")   //ここでは電話番号に数字以外が記入されたらエラーを返すというもの
	@WithMockUser(username = "test",authorities = "ADMIN")
	void whenThereIsSearchError_expwctToSeeErrorsphoneNumber()  throws Exception{
		
		var member=new MemberSearchBean();
		member.setPhoneNumber("あああああ");
		
		mockMvc
			.perform(
					post("/search/excecute")
					.flashAttr("user", member)
					.with(csrf())
				)
			.andExpect(model().hasErrors())
			.andExpect(content().string(containsString("電話番号に入力できるのは数値だけです")))
			.andExpect(view().name("/members/Mem02D01"));
					
		
		
	}
	
	
	@Test
	@DisplayName("電話番号と社員番号に数値以外を入力した時、エラーが発生し、「社員番号に入力できるのは数値だけです」と「電話番号に入力できるのは数値だけです」を出力することを期待します")   //ここでは電話番号に数字以外が記入されたらエラーを返すというもの
	@WithMockUser(username = "test",authorities = "ADMIN")
	void whenThereIsSearchError_expwctToSeeErrorsmemberCodeAndphoneNumber()  throws Exception{
		
//		var member=new MemberSearchBean();
//		member.setPhoneNumber("あああああ");
//		member.setMemberCode("ああああ");
		
		mockMvc
			.perform(
					post("/search/excecute")
					.param("phoneNumber", "ああああ")
					.param("memberCode", "ああああ")
					.with(csrf())
				)
			.andExpect(model().hasErrors())
			.andExpect(content().string(containsString("電話番号に入力できるのは数値だけです")))
			.andExpect(content().string(containsString("社員番号に入力できるのは数値だけです")))
			.andExpect(view().name("/members/Mem02D01"));
					
		
		
	}
	
	
	@Test
	@DisplayName("社員番号→352、姓→佐竹、名→優、住所→茅ヶ崎、電話番号→0801234を指定した時に指定した社員の情報の出力を期待")
	@WithMockUser(username = "test",authorities = "ADMIN")
	void whenTereIsSearchResult_AllSelect() throws Exception{
		
		mockMvc
		.perform(
				post("/search/excecute")
				.param("firstName", "佐竹")
				.param("lastName", "優")
				.param("address", "茅ヶ崎")
				.param("phoneNumber", "0801234")
				.param("memberCode", "352")
				.with(csrf())
			)
		.andExpect(model().hasNoErrors())
		.andExpect(content().string(containsString("会員番号")))
		.andExpect(content().string(containsString("352")))
		.andExpect(content().string(containsString("氏名")))
		.andExpect(content().string(containsString("佐竹優")))
		.andExpect(content().string(containsString("住所")))
		.andExpect(content().string(containsString("茅ヶ崎")))
		.andExpect(content().string(containsString("電話番号")))
		.andExpect(content().string(containsString("0801234")))
		.andExpect(view().name("/members/Mem02D01"));
	}
	
	
	@Test
	@DisplayName("検索入力が空白の場合、会員一覧を出力することを期待")  //検索結果が0の時はsearchResultにnullを詰めるためエラーにはならない
	@WithMockUser(username = "test",authorities = "ADMIN")
	void whenThereIsSearchhasnull_expwctToSeelist()  throws Exception{
		
		var member=new MemberSearchBean();
		
		
		mockMvc
			.perform(
					post("/search/excecute")
					.flashAttr("user", member)
					.with(csrf())
				)
			.andExpect(content().string(containsString("検索結果")))
			.andExpect(status().isOk())
			.andExpect(view().name("/members/Mem02D01"));
					
		
		
	}
	
	@Test
	@DisplayName("検索結果から会員番号を押下した際に詳細情報を表示する事を期待") 
	@WithMockUser(username = "test",authorities = "ADMIN")
	void whenThereIsSearchNumber_expwctToSeeMember()  throws Exception{
		
		Integer memberCode=352;
		
		
		mockMvc
			.perform(
					get("/search/excecute/352")
					.flashAttr("searchResults", memberCode)
				)
			.andExpect(model().hasNoErrors())
			.andExpect(content().string(containsString("会員番号")))
			.andExpect(content().string(containsString("352")))
			.andExpect(content().string(containsString("姓")))
			.andExpect(content().string(containsString("佐竹")))
			.andExpect(content().string(containsString("名")))
			.andExpect(content().string(containsString("優")))
			.andExpect(content().string(containsString("住所")))
			.andExpect(content().string(containsString("茅ヶ崎")))
			.andExpect(content().string(containsString("電話番号")))
			.andExpect(content().string(containsString("0801234")))
			.andExpect(content().string(containsString("誕生日")))
			.andExpect(content().string(containsString("2024-03-02")))
			.andExpect(content().string(containsString("会員情報詳細")))
			.andExpect(status().isOk())
			.andExpect(view().name("/members/Mem02D02"));
					
		
		
	}
	
	@Test
	@DisplayName("/searchにゲットリクエストが飛んだ時に検索画面が出力されることを期待") 
	@WithMockUser(username = "test",authorities = "ADMIN")
	void showSearchView()  throws Exception{
		
		mockMvc
		.perform(
				get("/search"))
		.andExpect(model().hasNoErrors())
		.andExpect(status().isOk())
		.andExpect(content().string(containsString("会員番号")))
		.andExpect(content().string(containsString("姓")))
		.andExpect(content().string(containsString("名")))
		.andExpect(content().string(containsString("電話番号")))

		.andExpect(view().name("/members/Mem02D01"));
	
		
	}	
	
	@Test
	@DisplayName("姓に部分一致した竹を入力し、氏名い→佐竹のアカウントが出力される事を期待") 
	@WithMockUser(username = "test",authorities = "ADMIN")
	void whenThereIsSearchFirstName()  throws Exception{
		
		mockMvc
		.perform(
				post("/search/excecute")
				.param("firstName", "竹")
				.with(csrf())
				)
		.andExpect(model().hasNoErrors())
		.andExpect(status().isOk())
		.andExpect(content().string(containsString("氏名")))
		.andExpect(content().string(containsString("佐竹")))

		.andExpect(view().name("/members/Mem02D01"));
	
		
	}	
	
	@Test
	@DisplayName("名に部分一致したoを入力し、氏名→hoge hogeのアカウントが出力される事を期待") 
	@WithMockUser(username = "test",authorities = "ADMIN")
	void whenThereIsSearchLastName()  throws Exception{
		
		mockMvc
		.perform(
				post("/search/excecute")
				.param("lastName", "o")
				.with(csrf())
				)
		.andExpect(model().hasNoErrors())
		.andExpect(status().isOk())
		.andExpect(content().string(containsString("氏名")))
		.andExpect(content().string(containsString("hoge hoge")))

		.andExpect(view().name("/members/Mem02D01"));
	
		
	}	
	
	@Test
	@DisplayName("住所に部分一致した茅を入力し、住所→茅ヶ崎のアカウントが出力される事を期待") 
	@WithMockUser(username = "test",authorities = "ADMIN")
	void whenThereIsSearchAddress()  throws Exception{
		
		mockMvc
		.perform(
				post("/search/excecute")
				.param("address", "茅")
				.with(csrf())
				)
		.andExpect(model().hasNoErrors())
		.andExpect(status().isOk())
		.andExpect(content().string(containsString("住所")))
		.andExpect(content().string(containsString("茅ヶ崎")))

		.andExpect(view().name("/members/Mem02D01"));
	
		
	}	
	
	
	@Test
	@DisplayName("電話番号に完全一致した0801234を入力し、電話番号→0801234のアカウントが出力される事を期待") 
	@WithMockUser(username = "test",authorities = "ADMIN")
	void whenThereIsSearchPhoneNumberFullMatch()  throws Exception{
		
		mockMvc
		.perform(
				post("/search/excecute")
				.param("phoneNumber", "0801234")
				.with(csrf())
				)
		.andExpect(model().hasNoErrors())
		.andExpect(status().isOk())
		.andExpect(content().string(containsString("電話番号")))
		.andExpect(content().string(containsString("0801234")))

		.andExpect(view().name("/members/Mem02D01"));
	
		
	}	
	
	@Test
	@DisplayName("電話番号に部分一致した080を入力し、「検索結果は0件です」と出力することを期待します") 
	@WithMockUser(username = "test",authorities = "ADMIN")
	void whenThereIsSearchPhoneNumberPartialMatch()  throws Exception{
		
		mockMvc
		.perform(
				post("/search/excecute")
				.param("phoneNumber", "080")
				.with(csrf())
				)
		.andExpect(model().hasNoErrors())
		.andExpect(status().isOk())
		.andExpect(content().string(containsString("電話番号")))
		.andExpect(content().string(containsString("検索結果は0件です")))

		.andExpect(view().name("/members/Mem02D01"));
	
		
	}	
	
	
	
	@MockBean
	@Autowired
	private MemberRepositorySearch memberRepositorySearch;
	
	@Test
	@DisplayName("DB接続でSQLExceptionが発生した時、エラー画面に遷移されることを期待します。瞬断を想定") 
	@WithMockUser(username = "test",authorities = "ADMIN")
	void whenThereIsSearchNoDBConect()  throws Exception{
		
		Mockito.when(memberRepositorySearch.findByDynamicCriteria(0, null, null, null, null))
						.thenThrow(new SQLException("DB接続エラー。瞬断を想定"));
		

		mockMvc
		.perform(
				post("/search/excecute")
				.param("memberCode", "")
				.param("phoneNumber", "")
				.param("firstName", "")
				.param("lastName", "")
				.param("address", "")
				
				.with(csrf())
				)
		.andExpect(status().isInternalServerError());
//		.andExpect(model().hasErrors());

//		Exception exception=result.getResolvedException();
//		assertThat(exception.getClass()).isEqualTo(RuntimeException.class);
	
		
	}	
	
}
