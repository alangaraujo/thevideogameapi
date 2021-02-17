package br.dev.alanaraujo.thevideogameapi.api.dto;

public class CountryDto {

	private String name;

	public CountryDto() {
	}

	public CountryDto(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
