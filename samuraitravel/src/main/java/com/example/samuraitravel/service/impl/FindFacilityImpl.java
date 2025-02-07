package com.example.samuraitravel.service.impl;

import org.springframework.data.domain.Page;

import com.example.samuraitravel.dto.FindFacilityDto;
import com.example.samuraitravel.entity.House;
import com.example.samuraitravel.repository.HouseRepository;
import com.example.samuraitravel.service.FindFacility;

public class FindFacilityImpl implements FindFacility {
	private final HouseRepository houseRepository;

	public FindFacilityImpl(HouseRepository houseRepository) {
		this.houseRepository = houseRepository;
	}

	@Override
	public FindFacilityDto excecute(FindFacilityDto dto) {
		init(dto);
		main(dto);
		close(dto);
		return dto;

	}

	@Override
	public void init(FindFacilityDto dto) {

	}

	@Override
	public void main(FindFacilityDto dto) {
		Page<House> housePage;

		if (dto.request.getKeyword() != null && !dto.request.getKeyword().isEmpty()) {
			housePage = houseRepository.findByNameLike("%" + dto.request.getKeyword() + "%", dto.request.getPageable());

		} else {
			housePage = houseRepository.findAll(dto.request.getPageable());
		}

		dto.response.setPageHouse(housePage);

	}

	@Override
	public void close(FindFacilityDto dto) {
		dto.response.setKeyword(dto.request.getKeyword());

	}

}
