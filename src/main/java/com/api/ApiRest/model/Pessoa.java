package com.api.ApiRest.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name = "pessoa")
public class Pessoa {
	
	@Id
	private Long idblablablas;
	
	private String nome;
	
	@Column(name = "data_nascimento")
	private Date dataNascimento;
	
	@ManyToOne
	@JoinColumn(nullable = false)
	private Endereco endereco;
	
	public Pessoa() { }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
}
