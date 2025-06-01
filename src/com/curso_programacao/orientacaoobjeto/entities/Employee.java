package com.curso_programacao.orientacaoobjeto.entities;

public class Employee {
	
	public String nome;
	public double salarioBruto;
	public double imposto;
	public Company company;
	
	public Employee() {
		
	}

    public double salarioLiquido() {
        return salarioBruto - imposto;
    }

    public void aumentarSalario(double porcentagem) {
        salarioBruto *= (1 + porcentagem / 100.0);
    }

    public String toString() {
        return "Nome: " + nome + ", Salário Líquido: " + String.format("%.2f", salarioLiquido());
    }
}
