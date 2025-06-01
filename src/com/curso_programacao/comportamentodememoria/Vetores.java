package com.curso_programacao.comportamentodememoria;

import java.util.Scanner;

public class Vetores {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Estudante[] quartos = new Estudante[10];

		System.out.print("Quantos estudantes vão alugar quartos (1 a 10)? ");
		int N = sc.nextInt();

		while (N < 1 || N > 10) {
			System.out.println("Valor inválido! O número de estudantes deve ser entre 1 e 10.");
			System.out.print("Quantos estudantes vão alugar quartos (1 a 10)? ");
			N = sc.nextInt();
		}

		System.out.println("\n--- Registro de Aluguéis ---");
		for (int i = 0; i < N; i++) {
			System.out.printf("\nDados do %dº estudante:\n", i + 1);
			sc.nextLine();

			System.out.print("Nome: ");
			String nome = sc.nextLine();

			System.out.print("Email: ");
			String email = sc.nextLine();

			int quartoEscolhido;
			boolean quartoOcupado;

			do {
				System.out.print("Quarto escolhido (0 a 9): ");
				quartoEscolhido = sc.nextInt();

				if (quartoEscolhido < 0 || quartoEscolhido > 9) {
					System.out.println("Quarto inválido! Escolha um número entre 0 e 9.");
					quartoOcupado = true;
				} else if (quartos[quartoEscolhido] != null) {
					System.out.println("Este quarto já está ocupado! Por favor, escolha outro.");
					quartoOcupado = true;
				} else {
					quartoOcupado = false;
				}
			} while (quartoOcupado);

			quartos[quartoEscolhido] = new Estudante(nome, email);
			System.out.println("Aluguel registrado com sucesso para o quarto " + quartoEscolhido + ".");
		}

		System.out.println("\n--- Relatório de Ocupações dos Quartos ---");
		for (int i = 0; i < quartos.length; i++) {
			if (quartos[i] != null) {
				System.out.println("Quarto " + i + ": " + quartos[i].getNome() + ", " + quartos[i].getEmail());
			}
		}

		sc.close();
	}
}

class Estudante {
	private String nome;
	private String email;

	public Estudante(String nome, String email) {
		this.nome = nome;
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}

	public String toString() {
		return nome + ", " + email;
	}
}
