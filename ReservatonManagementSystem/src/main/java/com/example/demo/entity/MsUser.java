package com.example.demo.entity;

import java.net.PasswordAuthentication;
import java.time.LocalDateTime;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class MsUser {
	
	@Id
	private int userId;
	
	private String password;
	
	private String lastName;
	
	private String firstName;
	
	private String roleCode;
	
	private String phoneNumber;
	
	private LocalDateTime registrationDate;
	
	private LocalDateTime updateDate;
	
	private LocalDateTime lastLoginDate;

}
