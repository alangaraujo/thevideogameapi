package br.dev.alanaraujo.thevideogameapi.api.mapper;

import org.modelmapper.ModelMapper;

import br.dev.alanaraujo.thevideogameapi.api.dto.CompanyDto;
import br.dev.alanaraujo.thevideogameapi.domain.model.Company;

public class CompanyMapper {

	private static final ModelMapper MAPPER = new ModelMapper();
	
	public static CompanyDto companyDto(Company company) {
		return MAPPER.map(company, CompanyDto.class);
	}
}
