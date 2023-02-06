package com.api.ApiRest.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.ApiRest.model.People;
import com.api.ApiRest.model.repository.PeopleRepository;

@RestController
@RequestMapping(value = "api")
public class PeopleController {
	
	@Autowired
	private PeopleRepository pessoaRepository;
	
	@GetMapping(path = "/pessoa-id/{}")
	public ResponseEntity<Optional<People>> pesquisarPessoaPorId(
			@PathVariable(name = "id", required = true) Long idPessoa) {
		return ResponseEntity.ok(pessoaRepository.findById(idPessoa));
	}

}
