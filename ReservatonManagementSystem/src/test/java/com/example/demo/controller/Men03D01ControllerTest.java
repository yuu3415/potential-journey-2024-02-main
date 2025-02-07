package com.example.demo.controller;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.jupiter.api.Assertions.assertEquals;
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
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.web.servlet.MockMvc;

import com.example.demo.bean.MemberUpdateBean;
import com.example.demo.entity.MsMember;
import com.example.demo.repository.MemberRepositoryUpdate;

import jakarta.transaction.Transactional;

@SpringBootTest
@AutoConfigureMockMvc
@Transactional
class Men03D01ControllerTest {

	@Autowired
	MockMvc mockMvc;

	@Test
	@DisplayName("/updateにゲットリクエストが飛んだ時に更新画面が出力されることを期待")
	@WithMockUser(username = "test", authorities = "ADMIN")
	void showUpdateView() throws Exception {

		mockMvc.perform(get("/update")).andExpect(model().hasNoErrors()).andExpect(status().isOk())
				.andExpect(content().string(containsString("会員情報更新")))
				.andExpect(content().string(containsString("会員番号"))).andExpect(content().string(containsString("検索")))

				.andExpect(view().name("/members/Mem03D01"));

	}

	@Test
	@DisplayName("検索フォームに数値入力した時、検索結果を出力することを期待します") // ここでは電話番号に数字以外が記入されたらエラーを返すというもの
	@WithMockUser(username = "test", authorities = "ADMIN")
	void whenThereIsUpdate_Search() throws Exception {

		MemberUpdateBean member = new MemberUpdateBean();
		member.setMemberCode(352);

		mockMvc.perform(post("/update/search").flashAttr("member", member).with(csrf()))
				.andExpect(model().hasNoErrors()).andExpect(content().string(containsString("会員番号")))
				.andExpect(content().string(containsString("352"))).andExpect(content().string(containsString("佐竹")))
				.andExpect(content().string(containsString("優")))

				.andExpect(view().name("/members/Mem03D01"));

	}

	@Test
	@DisplayName("検索フォームに文字列のみを入力した時、エラーメッセージを出力することを期待します") // ここでは電話番号に数字以外が記入されたらエラーを返すというもの
	@WithMockUser(username = "test", authorities = "ADMIN")
	void whenThereIsUpdate_SearchExpectAllWords() throws Exception {

		mockMvc.perform(post("/update/search").param("memberCode", "ああああ").with(csrf())).andExpect(model().hasErrors())
				.andExpect(content().string(containsString("会員番号は必須入力です。半角数値で入力してください")))

				.andExpect(view().name("/members/Mem03D01"));

	}

	@Test
	@DisplayName("検索フォームに文字列を含む入力をした時、エラーメッセージを出力することを期待します") // ここでは電話番号に数字以外が記入されたらエラーを返すというもの
	@WithMockUser(username = "test", authorities = "ADMIN")
	void whenThereIsUpdate_SearchExpectContainlWords() throws Exception {

		mockMvc.perform(post("/update/search").param("memberCode", "1234ああ").with(csrf()))
				.andExpect(model().hasErrors()).andExpect(content().string(containsString("会員番号は必須入力です。半角数値で入力してください")))

				.andExpect(view().name("/members/Mem03D01"));

	}

	@Test
	@DisplayName("検索フォームの入力が空白の時、エラーメッセージを出力することを期待します") // ここでは電話番号に数字以外が記入されたらエラーを返すというもの
	@WithMockUser(username = "test", authorities = "ADMIN")
	void whenThereIsUpdate_SearchExpectEmpty() throws Exception {

		mockMvc.perform(post("/update/search").param("memberCode", "").with(csrf())).andExpect(model().hasErrors())
				.andExpect(content().string(containsString("会員番号は必須入力です。半角数値で入力してください")))

				.andExpect(view().name("/members/Mem03D01"));

	}

	@Autowired
	private MemberRepositoryUpdate memberRepositoryUpdate;

	@Test
	@DisplayName("DB接続でSQLExceptionが発生した時、ステータスコード500が返されることを期待します。瞬断を想定")
	@WithMockUser(username = "test", authorities = "ADMIN")
	void whenThereIsSearchNoDBConect() throws Exception {

		Mockito.when(memberRepositoryUpdate.findByMemberCode(352)).thenThrow(new SQLException("DB接続エラー。瞬断を想定"));

		mockMvc.perform(post("/update/search").param("memberCode", "352")

				.with(csrf())).andExpect(status().isInternalServerError());

	}

	@Test
	@DisplayName("検索フォームの入力が存在しない番号の時、該当のアカウントがいないというメッセージを出力することを期待します") // ここでは電話番号に数字以外が記入されたらエラーを返すというもの
	@WithMockUser(username = "test", authorities = "ADMIN")
	void whenThereIsUpdate_SearchExpectNoresult() throws Exception {

		mockMvc.perform(post("/update/search").param("memberCode", "1111").with(csrf()))
				.andExpect(model().hasNoErrors()).andExpect(content().string(containsString("該当の会員は存在しません")))

				.andExpect(view().name("/members/Mem03D01"));

	}

	@Test
	@DisplayName("更新フォームの入力が正常な時、「会員情報が正常に更新されました。」というメッセージを出力することを期待します") // ここでは電話番号に数字以外が記入されたらエラーを返すというもの
	@WithMockUser(username = "test", authorities = "ADMIN")
	void whenThereIsUpdate_Success() throws Exception {

		mockMvc.perform(
				post("/update/update").param("memberCode", "352").param("firstName", "test").param("lastName", "test")
						.param("phoneNumber", "9999").param("birthdate", "2000-01-01").param("address", "test")
						.param("email", "test@test.com").param("registrationDate", "").param("updateDate", "")

						.with(csrf()))
				.andExpect(model().hasNoErrors()).andExpect(content().string(containsString("会員情報が正常に更新されました。")))

				.andExpect(view().name("/members/Mem03D01"));

	}

	@Test
	void memberSearch() throws Exception {
		MsMember member = memberRepositoryUpdate.findByMemberCode(352);

		assertEquals("佐竹", member.getFirstName());
	}

	@Test
	@DisplayName("更新フォームの入力が正常な時、「会員情報が正常に更新されました。」というメッセージを出力することを期待します") // ここでは電話番号に数字以外が記入されたらエラーを返すというもの
	@WithMockUser(username = "test", authorities = "ADMIN")
	void whenThereIsUpdate_ExpectFirstName() throws Exception {

		mockMvc.perform(post("/update/update").param("memberCode", "352").param("lastName", "test")
				.param("phoneNumber", "9999").param("birthdate", "2000-01-01").param("address", "test")
				.param("email", "test@test.com").param("registrationDate", "").param("updateDate", "")

				.with(csrf())).andExpect(model().hasErrors()).andExpect(view().name("/members/Mem03D01"));

	}

}
