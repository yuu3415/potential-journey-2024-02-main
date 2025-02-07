package com.example.samuraitravel.service;

import com.example.samuraitravel.dto.FindFacilityDto;

public interface FindFacility {

	FindFacilityDto excecute(FindFacilityDto dto);

	void init(FindFacilityDto dto);

	void main(FindFacilityDto dto);

	void close(FindFacilityDto dto);

}
