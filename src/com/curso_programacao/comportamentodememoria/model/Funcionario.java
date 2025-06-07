package com.curso_programacao.comportamentodememoria.model;

public class Funcionario {
	
	private int id;
	private String nome;
	private double salario;

	public Funcionario(int id, String nome, double salario) {
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}

	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public double getSalario() {
		return salario;
	}

	@SuppressWarnings("unused")
	private void setSalario(double salario) {
		this.salario = salario;
	}

	public void aumentarSalario(double porcentagem) {
		salario += salario * porcentagem / 100.0;
	}

	public String toString() {
		return "ID: " + id + ", Nome: " + nome + ", Salário: R$" + String.format("%.2f", salario);
	}
}
