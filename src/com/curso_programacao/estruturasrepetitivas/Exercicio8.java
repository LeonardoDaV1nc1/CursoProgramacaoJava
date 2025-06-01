package com.curso_programacao.estruturasrepetitivas;

import java.util.Scanner;

public class Exercicio8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de pares a serem lidos: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Digite o primeiro número: ");
            int numerador = scanner.nextInt();
            System.out.print("Digite o segundo número: ");
            int denominador = scanner.nextInt();

            if (denominador == 0) {
                System.out.println("divisao impossivel");
            } else {
                double resultado = (double) numerador / denominador;
                System.out.printf("Resultado: %.1f\n", resultado);
            }
        }

        scanner.close();
    }
}


