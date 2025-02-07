package com.example.demo.repository;

import java.sql.SQLException;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.MsMember;

public interface MemberRepositoryUpdate extends JpaRepository<MsMember, Integer> {

	MsMember findByMemberCode(Integer memberCode) throws SQLException;

}
