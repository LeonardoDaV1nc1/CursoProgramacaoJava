package com.curso_programacao.comportamentodememoria;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import com.curso_programacao.comportamentodememoria.model.Funcionario;

public class Fixacao {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);

		List<Funcionario> listaFuncionarios = new ArrayList<>();

		System.out.print("Quantos funcionários serão registrados? ");
		int n = 0;
		try {
			n = sc.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("Entrada inválida. Por favor, digite um número inteiro.");
			sc.nextLine();
			return;
		}
		sc.nextLine();

		System.out.println("\n--- Cadastro de Funcionários ---");
		for (int i = 0; i < n; i++) {
			System.out.println("\nFuncionário #" + (i + 1) + ":");
			int id;
			boolean idRepetido;
			do {
				System.out.print("ID: ");
				try {
					id = sc.nextInt();
					sc.nextLine();

					idRepetido = hasId(listaFuncionarios, id);
					if (idRepetido) {
						System.out.println("Este ID já existe. Por favor, digite um ID diferente.");
					}
				} catch (InputMismatchException e) {
					System.out.println("Entrada inválida para o ID. Por favor, digite um número inteiro.");
					sc.nextLine();
					id = -1;
					idRepetido = true;
				}

			} while (idRepetido || id == -1);

			System.out.print("Nome: ");
			String nome = sc.nextLine();

			double salario = 0.0;
			boolean salarioValido = false;
			while (!salarioValido) {
				System.out.print("Salário: ");
				try {
					salario = sc.nextDouble();
					salarioValido = true;
				} catch (InputMismatchException e) {
					System.out.println("Entrada inválida para o salário. Por favor, digite um número.");
					sc.nextLine();
				}
			}
			sc.nextLine();

			listaFuncionarios.add(new Funcionario(id, nome, salario));
		}

		System.out.println("\n--- Aumento de Salário ---");
		System.out.print("Informe o ID do funcionário que terá aumento de salário: ");
		int idAumento = 0;
		Funcionario funcEncontrado = null;
		try {
			idAumento = sc.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("Entrada inválida para o ID. Por favor, digite um número inteiro.");
			sc.nextLine();
			System.out.println("Operação de aumento abortada.");
			sc.close();
			return;
		}
		
		funcEncontrado = buscarFuncionarios(listaFuncionarios, idAumento);

		if (funcEncontrado == null) {
			System.out.println("ID não encontrado. Operação de aumento abortada.");
		} else {
			System.out.print("Informe a porcentagem de aumento: ");
			double porcentagem = 0.0;
			try {
				porcentagem = sc.nextDouble();
				funcEncontrado.aumentarSalario(porcentagem);
				System.out.println("Salário atualizado com sucesso!");
			} catch (InputMismatchException e) {
				System.out.println("Entrada inválida para a porcentagem. Por favor, digite um número.");
				System.out.println("Operação de aumento abortada.");
			}
		}

		System.out.println("\n--- Listagem Atualizada de Funcionários ---");
		if (listaFuncionarios.isEmpty()) {
			System.out.println("Nenhum funcionário cadastrado.");
		} else {
			for (Funcionario f : listaFuncionarios) {
				System.out.println(f);
			}
		}

		sc.close();
	}

	private static Funcionario buscarFuncionarios(List<Funcionario> listaFuncionarios, final int idAumento) {
		return listaFuncionarios.stream().filter(f -> f.getId() == idAumento).findFirst().orElse(null);
	}

	public static boolean hasId(List<Funcionario> list, int id) {
		return list.stream().anyMatch(x -> x.getId() == id);
	}
}