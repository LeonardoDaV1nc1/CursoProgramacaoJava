package com.curso_programacao.comportamentodememoria;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Fixacao1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int m = 0;
		int n = 0;

		boolean inputValido = false;
		while (!inputValido) {
			System.out.print("Digite o número de linhas (M): ");
			try {
				m = sc.nextInt();
				if (m <= 0) {
					System.out.println("O número de linhas deve ser maior que zero.");
				} else {
					inputValido = true;
				}
			} catch (InputMismatchException e) {
				System.out.println("Entrada inválida. Por favor, digite um número inteiro.");
				sc.nextLine();
			}
		}

		inputValido = false;
		while (!inputValido) {
			System.out.print("Digite o número de colunas (N): ");
			try {
				n = sc.nextInt();
				if (n <= 0) {
					System.out.println("O número de colunas deve ser maior que zero.");
				} else {
					inputValido = true;
				}
			} catch (InputMismatchException e) {
				System.out.println("Entrada inválida. Por favor, digite um número inteiro.");
				sc.nextLine();
			}
		}

		int[][] matriz = new int[m][n];

		System.out.println("\nDigite os elementos da matriz:");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				inputValido = false;
				while (!inputValido) {
					System.out.printf("Elemento [%d][%d]: ", i, j);
					try {
						matriz[i][j] = sc.nextInt();
						inputValido = true;
					} catch (InputMismatchException e) {
						System.out.println("Entrada inválida. Por favor, digite um número inteiro.");
						sc.nextLine();
					}
				}
			}
		}

		int x = 0;
		inputValido = false;
		while (!inputValido) {
			System.out.print("\nDigite o número X a ser buscado na matriz: ");
			try {
				x = sc.nextInt();
				inputValido = true;
			} catch (InputMismatchException e) {
				System.out.println("Entrada inválida. Por favor, digite um número inteiro.");
				sc.nextLine();
			}
		}

		System.out.println("\n--- Ocorrências de " + x + " e seus vizinhos ---");
		boolean xEncontrado = false;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (matriz[i][j] == x) {
					xEncontrado = true;
					System.out.printf("Posição [%d][%d]:\n", i, j);

					if (j > 0) {
						System.out.println("  Esquerda: " + matriz[i][j - 1]);
					}

					if (i > 0) {
						System.out.println("  Acima: " + matriz[i - 1][j]);
					}

					if (j < n - 1) {
						System.out.println("  Direita: " + matriz[i][j + 1]);
					}

					if (i < m - 1) {
						System.out.println("  Abaixo: " + matriz[i + 1][j]);
					}
					System.out.println("---");
				}
			}
		}

		if (!xEncontrado) {
			System.out.println("O número " + x + " não foi encontrado na matriz.");
		}

		sc.close();
	}
}
