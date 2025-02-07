package com.example.samuraitravel.dto;

import com.example.samuraitravel.dto.req.FindFcilityDtoReq;
import com.example.samuraitravel.dto.res.FindFcilityDtoRes;

public class FindFacilityDto {

	public FindFcilityDtoReq request;

	public FindFcilityDtoRes response;

	public FindFcilityDtoReq getRequest() {
		return request;
	}

	public void setRequest(FindFcilityDtoReq request) {
		this.request = request;
	}

	public FindFcilityDtoRes getResponse() {
		return response;
	}

	public void setResponse(FindFcilityDtoRes response) {
		this.response = response;
	}

}
