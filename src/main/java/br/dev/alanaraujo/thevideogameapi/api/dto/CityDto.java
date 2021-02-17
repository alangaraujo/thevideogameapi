package br.dev.alanaraujo.thevideogameapi.api.dto;

public class CityDto {

	private String name;
	
	private StateDto state;
	
	public CityDto() {
	}

	public CityDto(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public StateDto getState() {
		return state;
	}

	public void setState(StateDto state) {
		this.state = state;
	}
	
}
