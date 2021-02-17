package br.dev.alanaraujo.thevideogameapi.api.controller;

import static br.dev.alanaraujo.thevideogameapi.api.mapper.CompanyMapper.companyToDto;

import java.util.ArrayList;
import java.util.List;

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
	
	@Autowired
	private CompanyService companyService;
	
	@GetMapping
	public ResponseEntity<List<CompanyDto>> findAll() {
		
		List<CompanyDto> companyDto = new ArrayList<>();
		List<Company> companies = companyService.findAll();
		
		companies.forEach(value -> companyDto.add(companyToDto(value)));
		
		return ResponseEntity.ok(companyDto);
	}

}
