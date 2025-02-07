package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.MsUser;

public interface UserRepository extends JpaRepository<MsUser, Integer>{
	Optional<MsUser> findByUserId(int userId);  
}
