package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.MsMember;

public interface MemberRepositoryInsert extends JpaRepository<MsMember,Integer>  {
	
}
