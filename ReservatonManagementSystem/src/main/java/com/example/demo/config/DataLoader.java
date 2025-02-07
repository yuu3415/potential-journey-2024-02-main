package com.example.demo.config;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import com.example.demo.entity.MsUser;
import com.example.demo.repository.UserRepository;

import groovyjarjarantlr4.v4.parse.ANTLRParser.finallyClause_return;
import lombok.RequiredArgsConstructor;
import lombok.var;

@RequiredArgsConstructor
@Component
public class DataLoader implements ApplicationRunner{

	private final PasswordEncoder passwordEncoder;
	private final UserRepository userRepository;
	
	@Override
	public void run(ApplicationArguments args)throws Exception{
		var user=new MsUser();
		user.setUserId(3415);
		user.setPassword(passwordEncoder.encode("password"));
		user.setLastName("優");
		user.setFirstName("佐竹");
		user.setRoleCode("ADMIN");
		user.setPhoneNumber("08012341234");
		
		
		if (userRepository.findByUserId(user.getUserId()).isEmpty()) {
			userRepository.save(user);
		}
		
		
	}
	
}
