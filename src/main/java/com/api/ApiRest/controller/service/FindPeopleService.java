package com.api.ApiRest.controller.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.ApiRest.model.People;
import com.api.ApiRest.model.repository.PeopleRepository;

@Service
public class FindPeopleService {
	
	@Autowired
	private PeopleRepository PeopleRepository;
	
	public List<People> findAllPeople(){
		return PeopleRepository.findAll();
	}
	
	public People findPeopleById(Long id){
		Optional<People> PeopleOptional = PeopleRepository.findById(id);
		People People = null;
		
		if (!PeopleOptional.isPresent()) {
			System.out.println("Optional isn't present");
		} else {
			People = PeopleOptional.get();
		}
		
		return People;
	}
	
	public void deletePeople(Long id) {
		Optional<People> PeopleOptional = PeopleRepository.findById(id);
		
		if (!PeopleOptional.isPresent()) {
			System.out.println("Optional isn't present");
		} else {
			PeopleRepository.deleteById(id);
		}
	}
	
}
