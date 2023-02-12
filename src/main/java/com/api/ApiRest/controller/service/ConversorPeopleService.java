package com.api.ApiRest.controller.service;

import org.springframework.stereotype.Component;

import com.api.ApiRest.controller.Util;
import com.api.ApiRest.model.Address;
import com.api.ApiRest.model.People;
import com.api.ApiRest.model.resource.PeopleResource;

@Component
public class ConversorPeopleService {
	
	public People conversor(PeopleResource peopleResource) {
		
		People people = new People();
		people.setId(Long.parseLong(peopleResource.getId()));
		people.setName(peopleResource.getName());
		people.setBirthDate(Util.conversorStringToDate(peopleResource.getBirthDate()));
		people.setAddress(peopleResource.getAddress());
		return people;
		
	}
	
}
