package com.example.samuraitravel.controller;

import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.samuraitravel.dto.FindFacilityDto;
import com.example.samuraitravel.dto.req.FindFcilityDtoReq;
import com.example.samuraitravel.dto.res.FindFcilityDtoRes;
import com.example.samuraitravel.repository.HouseRepository;
import com.example.samuraitravel.service.FindFacility;
import com.example.samuraitravel.service.impl.FindFacilityImpl;

@Controller
@RequestMapping("/admin/houses")
public class AdminHouseController {
	private final HouseRepository houseRepository;

	public AdminHouseController(HouseRepository houseRepository) {
		this.houseRepository = houseRepository;
	}

	@GetMapping
	public String index(Model model,
			@PageableDefault(page = 0, size = 10, sort = "id", direction = Direction.ASC) Pageable pageable,
			@RequestParam(name = "keyword", required = false) String keyword) {

		FindFacilityDto dto = new FindFacilityDto();
		dto.setRequest(new FindFcilityDtoReq());
		dto.setResponse(new FindFcilityDtoRes());

		dto.request.setKeyword(keyword);
		dto.request.setPageable(pageable);

		FindFacility search = new FindFacilityImpl(houseRepository);

		dto = search.excecute(dto);

		model.addAttribute("housePage", dto.response.getPageHouse());
		model.addAttribute("keyword", keyword);

		return "/admin/houses/index";
	}

}
