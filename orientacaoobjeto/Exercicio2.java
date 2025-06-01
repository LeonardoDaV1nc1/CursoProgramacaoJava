package com.curso_programacao.orientacaoobjeto;

import java.util.Scanner;

import com.curso_programacao.orientacaoobjeto.entities.Employee;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Employee employee = new Employee();

		System.out.println("Digite os dados do funcionário:");
		System.out.print("Nome: ");
		employee.nome = scanner.nextLine();

		System.out.print("Salário Bruto: ");
		employee.salarioBruto = scanner.nextDouble();

		System.out.print("Imposto: ");
		employee.imposto = scanner.nextDouble();

		System.out.println("\nDados do funcionário:");
		System.out.println(employee);

		System.out.print("\nDigite a porcentagem para aumentar o salário (ex: 10 para 10%): ");
		double porcentagemAumento = scanner.nextDouble();
		employee.aumentarSalario(porcentagemAumento);

		System.out.println("\nDados do funcionário após o aumento:");
		System.out.println(employee);

		scanner.close();
	}
}