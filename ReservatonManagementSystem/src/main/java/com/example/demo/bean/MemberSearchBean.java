package com.example.demo.bean;

import org.springframework.stereotype.Component;


import jakarta.validation.constraints.Pattern;

@Component
public class MemberSearchBean {
	
	
//	@Digits //検索処理でひらがななどが入力された際にエラーを返す
//(fraction = 0, integer = 20)

	private Integer memberCode;
	
	private String firstName;
	
	private String lastName;
	
	private String address;
	
	@Pattern(regexp = "^$|[0-9]+")   //検索処理でひらがななどが入力された際にエラーを返す
   private String phoneNumber;
	
	private String title;
	
	
	public MemberSearchBean() {
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public Integer getMemberCode() {
		return memberCode;
	}


	public void setMemberCode(Integer memberCode) {
		this.memberCode = memberCode;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	

}
