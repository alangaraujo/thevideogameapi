package br.dev.alanaraujo.thevideogameapi.api.dto;

public class StateDto {
	
	private String name;

	private CountryDto country;
	
	public StateDto() {
	}

	public StateDto(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public CountryDto getCountry() {
		return country;
	}

	public void setCountry(CountryDto country) {
		this.country = country;
	}

}
