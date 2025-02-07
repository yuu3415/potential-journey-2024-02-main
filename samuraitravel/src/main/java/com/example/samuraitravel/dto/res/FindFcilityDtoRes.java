package com.example.samuraitravel.dto.res;

import org.springframework.data.domain.Page;

import com.example.samuraitravel.entity.House;

public class FindFcilityDtoRes {

	private Page<House> pageHouse;
	private String keyword;

	public Page<House> getPageHouse() {
		return pageHouse;
	}

	public void setPageHouse(Page<House> pageHouse) {
		this.pageHouse = pageHouse;
	}

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

}
