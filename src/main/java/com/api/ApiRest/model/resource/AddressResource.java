package com.api.ApiRest.model.resource;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AddressResource {
	
	@JsonProperty("id")
	private String id;
	
	@JsonProperty("city")
	private String city;
	
	@JsonProperty("cep")
	private String cep;
	
	@JsonProperty("number")
	private String number;
	
	public AddressResource(String city, String cep, String number) {
		this.city = city;
		this.cep = cep;
		this.number = number;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}
}
