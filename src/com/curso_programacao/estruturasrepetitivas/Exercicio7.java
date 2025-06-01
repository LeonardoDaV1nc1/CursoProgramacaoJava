package com.curso_programacao.estruturasrepetitivas;

import java.util.Scanner;

public class Exercicio7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de casos de teste: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Digite os três valores reais (com uma casa decimal): ");
            double valor1 = scanner.nextDouble();
            double valor2 = scanner.nextDouble();
            double valor3 = scanner.nextDouble();

            double mediaPonderada = (valor1 * 2 + valor2 * 3 + valor3 * 5) / 10;
            System.out.printf("Média ponderada: %.1f\n", mediaPonderada);
        }

        scanner.close();
    }
}
