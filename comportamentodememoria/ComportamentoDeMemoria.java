package com.curso_programacao.comportamentodememoria;

import java.util.Scanner;

public class ComportamentoDeMemoria {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int N;

		do {
			System.out.print("Digite um número inteiro positivo N (máximo = 10): ");
			N = scanner.nextInt();
			if (N <= 0 || N > 10) {
				System.out.println("Valor inválido! N deve ser um inteiro positivo e no máximo 10.");
			}
		} while (N <= 0 || N > 10);

		int[] vetor = new int[N];

		System.out.println("Digite os " + N + " números inteiros:");
		for (int i = 0; i < N; i++) {
			System.out.print("Número " + (i + 1) + ": ");
			vetor[i] = scanner.nextInt();
		}

		System.out.println("\nNúmeros negativos lidos:");
		boolean encontrouNegativo = false;
		for (int i = 0; i < N; i++) {
			if (vetor[i] < 0) {
				System.out.println(vetor[i]);
				encontrouNegativo = true;
			}
		}

		if (!encontrouNegativo) {
			System.out.println("Nenhum número negativo foi digitado.");
		}

		scanner.close();
	}
}