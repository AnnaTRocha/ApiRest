package com.api.ApiRest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.ApiRest.controller.service.FindPeopleService;
import com.api.ApiRest.controller.service.SavePeopleService;
import com.api.ApiRest.model.People;
import com.api.ApiRest.model.resource.PeopleResource;

@RestController
@RequestMapping(value = "api")
public class PeopleController {
	
	@Autowired
	private FindPeopleService findPeople;

	@Autowired
	private SavePeopleService savePeople;
	
	@GetMapping(path = "/people-id/{id}")
	public People findPeopleById(
			@PathVariable(name = "id", required = true) Long id) {
		return findPeople.findPeopleById(id);
	}
	
	@GetMapping(path = "/people")
	private List<People> findAllPeople(){
		return findPeople.findAllPeople();
	}
	
	@PostMapping(path = "people-save")
	public void savePeople(@RequestBody PeopleResource people) {
		savePeople.savePeople(people);
	}
	
	@DeleteMapping(path = "people-delete-id/{id}")
	public void deletePeople(
			@PathVariable(name = "id", required = true) Long id) {
		findPeople.deletePeople(id);
	}

}
