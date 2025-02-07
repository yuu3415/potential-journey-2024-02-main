package com.example.samuraitravel.dto.req;

import org.springframework.data.domain.Pageable;
import org.springframework.ui.Model;

public class FindFcilityDtoReq {

	private Model model;
	private String keyword;
	private Pageable pageable;

	public Model getModel() {
		return model;
	}

	public void setModel(Model model) {
		this.model = model;
	}

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public Pageable getPageable() {
		return pageable;
	}

	public void setPageable(Pageable pageable) {
		this.pageable = pageable;
	}

}
