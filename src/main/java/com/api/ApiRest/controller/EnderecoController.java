package com.api.ApiRest.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.ApiRest.model.Endereco;
import com.api.ApiRest.model.repository.EnderecoRepository;

@RestController
@RequestMapping(value = "api")
public class EnderecoController {

	@Autowired
	private EnderecoRepository enderecoRepository;
	
	@GetMapping(path = "/endereco-id/{id}")
	private Optional<Endereco> pesquisarEnderecoPorId(
			@PathVariable(name = "id", required = true) Long id){
		return enderecoRepository.findById(id);
	}	
	
	@GetMapping(path = "/endereco")
	private List<Endereco> pesquisarEnderecoPorId(){
		return enderecoRepository.findAll();
	}
	
	@PostMapping(path = "endereco-save")
	public void salvarEndereco(@RequestBody Endereco endereco) {
		enderecoRepository.save(endereco);
	}
	
	@DeleteMapping(path = "endereco-delete-id/{}")
	public void deleteEndereco(
			@PathVariable(name = "id", required = true) Long id) {
		enderecoRepository.deleteById(id);
	}
	
}
