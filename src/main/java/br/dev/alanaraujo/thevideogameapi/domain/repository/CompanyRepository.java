package br.dev.alanaraujo.thevideogameapi.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.dev.alanaraujo.thevideogameapi.domain.model.Company;

@Repository
public interface CompanyRepository extends JpaRepository <Company, Long>{

}
