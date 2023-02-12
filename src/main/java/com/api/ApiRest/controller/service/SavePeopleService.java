package com.api.ApiRest.controller.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.ApiRest.model.repository.PeopleRepository;
import com.api.ApiRest.model.resource.PeopleResource;

@Service
public class SavePeopleService {

	@Autowired
	private PeopleRepository peopleRepository;
	
	@Autowired
	private ConversorPeopleService service;
	
	public void savePeople(PeopleResource people) {
		peopleRepository.saveAndFlush(service.conversor(people));
	}
	
}
