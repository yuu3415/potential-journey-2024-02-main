package com.example.demo.config;


import org.springframework.boot.autoconfigure.security.servlet.PathRequest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import com.example.demo.repository.UserRepository;

import lombok.RequiredArgsConstructor;


@RequiredArgsConstructor
@Configuration
public class SecurityConfig {

	private final UserRepository userRepository;
	
	@Bean
	PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Bean
	SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
		http.authorizeHttpRequests(auth -> auth
				.requestMatchers(PathRequest.toStaticResources().atCommonLocations())
				.permitAll()
				.anyRequest().authenticated()
				)
		.formLogin(login -> login
				.loginPage("/login")
				.defaultSuccessUrl("/menu",true)
				.permitAll()
				)
		.logout(logout -> logout
				.logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
				.permitAll()
				)
		.rememberMe(Customizer.withDefaults());
		
		return http.build();
	}
	
	@Bean
	UserDetailsService userDetailsService() {
		return userId->{
			var user = userRepository.findByUserId(Integer.parseInt(userId)).orElseThrow(
					()->new UsernameNotFoundException(userId+"not found"));
			
			return new User(user.getLastName(),user.getPassword(),
					AuthorityUtils.createAuthorityList("ADMIN"));
		};
	}
	
}
