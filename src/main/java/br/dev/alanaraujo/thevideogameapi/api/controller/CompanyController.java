package br.dev.alanaraujo.thevideogameapi.api.controller;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.dev.alanaraujo.thevideogameapi.api.dto.CompanyDto;
import br.dev.alanaraujo.thevideogameapi.domain.model.Company;
import br.dev.alanaraujo.thevideogameapi.domain.service.CompanyService;

@RestController
@RequestMapping(path = "/company")
public class CompanyController {
	
	private static final ModelMapper MAPPER = new ModelMapper();
	
	@Autowired
	private CompanyService companyService;
	
	@SuppressWarnings("rawtypes")
	@GetMapping
	public ResponseEntity findAll() {
		
		List<CompanyDto> companyDto = new ArrayList<>();
		List<Company> companies = companyService.findAll();
		
		companies.forEach(value -> companyDto.add(MAPPER.map(value, CompanyDto.class)));
		
		return ResponseEntity.ok(companyDto);
	}

}
