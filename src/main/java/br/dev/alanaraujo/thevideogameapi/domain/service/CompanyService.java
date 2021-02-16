package br.dev.alanaraujo.thevideogameapi.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.dev.alanaraujo.thevideogameapi.domain.model.Company;
import br.dev.alanaraujo.thevideogameapi.domain.repository.CompanyRepository;

@Service
public class CompanyService {

	@Autowired
	private CompanyRepository companyRepository;
	
	public List<Company> findAll() {
		return companyRepository.findAll();
	}
}
