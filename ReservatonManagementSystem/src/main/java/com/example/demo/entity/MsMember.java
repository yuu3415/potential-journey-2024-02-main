package com.example.demo.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;


import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Component
public class MsMember {
	
	
	@Id
	@GeneratedValue
//	@NotNull  GeceratedValueで作成するため最初から値が入っているわけではない。NotNullにするとエラーが返ってきてしまうのでコメントアウト//検索処理の際にひらがななどが入力されたらエラーを返す
	
	private Integer memberCode;
	
	@NotBlank
	private String lastName;
	
	@NotBlank
	private String firstName;
	
	@NotBlank
	private String address;
	
	@NotBlank
	private String phoneNumber;
	
	@NotNull
//	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate birthdate;
	
	@NotBlank
	private String email;
	
	private LocalDateTime registrationDate;
	
	private LocalDateTime updateDate;
}
