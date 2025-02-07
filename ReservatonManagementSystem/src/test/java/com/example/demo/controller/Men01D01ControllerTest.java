package com.example.demo.controller;

import static org.hamcrest.CoreMatchers.containsString;
import static org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestPostProcessors.csrf;
import static org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestPostProcessors.testSecurityContext;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import java.sql.SQLException;
import java.time.LocalDate;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.web.servlet.MockMvc;

import com.example.demo.entity.MsMember;
import com.example.demo.repository.MemberRepositoryInsert;
import com.example.demo.repository.MemberRepositorySearch;

import jakarta.transaction.Transactional;



@SpringBootTest
@AutoConfigureMockMvc
@Transactional
class Men01D01ControllerTest {
	
	@Autowired
	MockMvc mockMvc;

	@Test
	@DisplayName("登録エラーがある時、エラー表示することを期待します") 
	@WithMockUser(username = "test",authorities = "ADMIN")
	void whenThereIsRegistrationError_expwctToSeeErrors()  throws Exception{
		
		var member=new MsMember();
		
		mockMvc
			.perform(
					post("/register/excecute")
					.flashAttr("user", member)
					.with(csrf())
				)
			.andExpect(model().hasErrors())
			.andExpect(content().string(containsString("must not be blank")))
			.andExpect(view().name("members/Mem01D01"));
		
					
	}
	
	
	@Test
	@DisplayName("ユーザーを登録するとき、成功することを期待します") 
	@WithMockUser(username = "test",authorities = "ADMIN")
	void whenRegisteringUser_expectToSucceed()  throws Exception{
		
		var member=new MsMember();
		member.setFirstName("test");
		member.setLastName("test");
		member.setAddress("test");
		member.setPhoneNumber("00000");
		member.setBirthdate(LocalDate.of(2022,05, 05));
		member.setEmail("aa@a.com");
		
		mockMvc
			.perform(
					post("/register/excecute")
					.flashAttr("user", member)
					.with(csrf())
				)
			.andExpect(model().hasNoErrors())
			.andExpect(status().isOk())
			.andExpect(content().string(containsString("正常に会員情報が登録されました")))
			.andExpect(view().name("members/Mem01D02"));
					
	}
	
	
	@Test
	@DisplayName("/register/viewにゲットリクエストした際にユーザー登録画面に遷移することを期待します") 
	@WithMockUser(username = "test",authorities = "ADMIN")
	void whenRegisteringUserView()  throws Exception{
		
		var member=new MsMember();		
		mockMvc
			.perform(
					get("/register/view")
					.flashAttr("user", member)
				)
			.andExpect(model().hasNoErrors())
			.andExpect(status().isOk())
			.andExpect(content().string(containsString("会員新規登録")))
			.andExpect(view().name("members/Mem01D01"));
					
	}
	
	
	@Test
	@DisplayName("ユーザー登録のメールアドレスが入力されていない時、エラーメッセージを返すことを期待します") 
	@WithMockUser(username = "test",authorities = "ADMIN")
	void whenRegisteringUser_noEmailException()  throws Exception{
		
		var member=new MsMember();
		member.setFirstName("test");
		member.setLastName("test");
		member.setAddress("test");
		member.setPhoneNumber("00000");
		member.setBirthdate(LocalDate.of(2022,05, 05));
		
		mockMvc
			.perform(
					post("/register/excecute")
					.flashAttr("user", member)
					.with(csrf())
				)
			.andExpect(model().hasErrors())
			.andExpect(content().string(containsString("must not be blank")))
			.andExpect(view().name("members/Mem01D01"));
					
	}
	
	
	@Test
	@DisplayName("ユーザー登録の誕生日が入力されていない時、エラーメッセージを返すことを期待します") 
	@WithMockUser(username = "test",authorities = "ADMIN")
	void whenRegisteringUser_noBirthdateException()  throws Exception{
		
		var member=new MsMember();
		member.setFirstName("test");
		member.setLastName("test");
		member.setAddress("test");

		member.setEmail("aa@a.com");
		
		mockMvc
			.perform(
					post("/register/excecute")
					.flashAttr("user", member)
					.with(csrf())
				)
			.andExpect(model().hasErrors())
			.andExpect(content().string(containsString("must not be blank")))
			.andExpect(view().name("members/Mem01D01"));
					
	}
	
	
	@Test
	@DisplayName("ユーザー登録の電話番号が入力されていない時、エラーメッセージを返すことを期待します") 
	@WithMockUser(username = "test",authorities = "ADMIN")
	void whenRegisteringUser_noPhoneNumberException()  throws Exception{
		
		var member=new MsMember();
		member.setFirstName("test");
		member.setLastName("test");
		member.setAddress("test");
		member.setBirthdate(LocalDate.of(2022,05, 05));
		member.setEmail("aa@a.com");
		
		mockMvc
			.perform(
					post("/register/excecute")
					.flashAttr("user", member)
					.with(csrf())
				)
			.andExpect(model().hasErrors())
			.andExpect(content().string(containsString("must not be blank")))
			.andExpect(view().name("members/Mem01D01"));
					
	}
	
	
	@Test
	@DisplayName("ユーザー登録の住所が入力されていない時、エラーメッセージを返すことを期待します") 
	@WithMockUser(username = "test",authorities = "ADMIN")
	void whenRegisteringUser_noAddressException()  throws Exception{
		
		var member=new MsMember();
		member.setFirstName("test");
		member.setLastName("test");
		member.setPhoneNumber("000000");
		member.setBirthdate(LocalDate.of(2022,05, 05));
		member.setEmail("aa@a.com");
		
		mockMvc
			.perform(
					post("/register/excecute")
					.flashAttr("user", member)
					.with(csrf())
				)
			.andExpect(model().hasErrors())
			.andExpect(content().string(containsString("must not be blank")))
			.andExpect(view().name("members/Mem01D01"));
					
	}
	
	@Test
	@DisplayName("ユーザー登録の名が入力されていない時、エラーメッセージを返すことを期待します") 
	@WithMockUser(username = "test",authorities = "ADMIN")
	void whenRegisteringUser_noLastNameException()  throws Exception{
		
		var member=new MsMember();
		member.setFirstName("test");
		member.setPhoneNumber("000000");
		member.setAddress("test");
		member.setBirthdate(LocalDate.of(2022,05, 05));
		member.setEmail("aa@a.com");
		
		mockMvc
			.perform(
					post("/register/excecute")
					.flashAttr("user", member)
					.with(csrf())
				)
			.andExpect(model().hasErrors())
			.andExpect(content().string(containsString("must not be blank")))
			.andExpect(view().name("members/Mem01D01"));
					
	}
	
	
	@Test
	@DisplayName("ユーザー登録の姓が入力されていない時、エラーメッセージを返すことを期待します") 
	@WithMockUser(username = "test",authorities = "ADMIN")
	void whenRegisteringUser_noFirstNameException()  throws Exception{
		
		var member=new MsMember();
		member.setPhoneNumber("000000");
		member.setLastName("test");
		member.setAddress("test");
		member.setBirthdate(LocalDate.of(2022,05, 05));
		member.setEmail("aa@a.com");
		
		mockMvc
			.perform(
					post("/register/excecute")
					.flashAttr("user", member)
					.with(csrf())
				)
			.andExpect(model().hasErrors())
			.andExpect(content().string(containsString("must not be blank")))
			.andExpect(view().name("members/Mem01D01"));
					
	}
	
	
	@MockBean
	@Autowired
	private MemberRepositoryInsert memberRepository;
	
	@Test
	@DisplayName("DB接続でSQLExceptionが発生した時、エラー画面に遷移されることを期待します。瞬断を想定") 
	@WithMockUser(username = "test",authorities = "ADMIN")
	void whenThereIsRegistrationNoDBConect()  throws Exception{
		
		var member=new MsMember();
		member.setFirstName("test");
		member.setLastName("test");
		member.setAddress("test");
		member.setPhoneNumber("00000");
		member.setBirthdate(LocalDate.of(2022,05, 05));
		member.setEmail("aa@a.com");
		
		Mockito.when(memberRepository.save(member)).thenThrow(new RuntimeException("DB接続エラー。瞬断を想定"));
	
		
		mockMvc
		.perform(
				post("/register/excecute")
				.flashAttr("user", member)
				
				.with(csrf())
				)
		.andExpect(status().isInternalServerError());

}}
