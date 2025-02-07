package com.example.demo.bean;

import java.time.LocalDate;


import org.springframework.stereotype.Component;

import jakarta.validation.constraints.NotBlank;


@Component
public class MemberRegistrationBean {

	private String firstName;
	private String lastName;
	private String address;
	private String phoneNumber;
	private LocalDate birtdate;
	
	private String message;
	
	private String title;
	
	public MemberRegistrationBean() {
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
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


	public LocalDate getBirtday() {
		return birtdate;
	}


	public void setBirtday(LocalDate birtday) {
		this.birtdate = birtday;
	}
	
	
}


