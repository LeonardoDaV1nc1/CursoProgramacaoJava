package com.curso_programacao.orientacaoobjeto.entities;

public class Company {
	
	private Integer id;
	private String nome;
	
	public Company() {}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public String toString() {
		return this.id + " - " + this.nome;
	}

}
