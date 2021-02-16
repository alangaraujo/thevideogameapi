package br.dev.alanaraujo.thevideogameapi.api.dto;

public class CompanyDto {
	
	private String name;
	
	private CityDto city;
	
	public CompanyDto() {
	}
	
	public CompanyDto(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public CityDto getCity() {
		return city;
	}

	public void setCity(CityDto city) {
		this.city = city;
	}

}
