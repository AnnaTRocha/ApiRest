package com.api.ApiRest.model.resource;

import com.api.ApiRest.model.Address;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PeopleResource {
	
	@JsonProperty("id")
	private String id;
	
	@JsonProperty("name")
	private String name;
	
	@JsonProperty("birth_date")
	private String birthDate;
	
	@JsonProperty("address")
	private Address address;

	public PeopleResource(String id, String name, String birthDate, Address address) {
		this.id = id;
		this.name = name;
		this.birthDate = birthDate;
		this.address = address;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
}