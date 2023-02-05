package com.api.ApiRest.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.ApiRest.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long>{

}
