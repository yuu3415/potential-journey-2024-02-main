package com.example.demo.repository;

import java.sql.SQLException;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entity.MsMember;

public interface MemberRepositorySearch extends JpaRepository<MsMember,Integer> {
	
	@Query("SELECT m " +
		       "FROM MsMember m " +
		       "WHERE (?1 = 0 OR m.memberCode = ?1) " +
		       "AND (?2 IS NULL OR m.firstName LIKE %?2%) " +
		       "AND (?3 IS NULL OR m.lastName LIKE  %?3%) " +    //条件などで詰まってしまった時は簡単な条件にして通るか確認→エラーが起きている部分を絞っていく。
		       "AND (?4 IS NULL OR m.address LIKE %?4%) " +
		       "AND (?5 IS NULL OR m.phoneNumber = ?5)")
//	@Query("select m from MsMember m WHERE (?1 = 0 OR m.memberCode = ?1) AND (?2 IS NULL OR m.firstName LIKE %?2%)")    CONCATを使用したところエラーが発生。JPQLは％を使用するだけで良い可能性有
	List<MsMember> findByDynamicCriteria(Integer memberCode,String firstName,String lastName,String address,String phoneNumber) throws SQLException;
	
	MsMember findByMemberCode(Integer memberCode);

}
