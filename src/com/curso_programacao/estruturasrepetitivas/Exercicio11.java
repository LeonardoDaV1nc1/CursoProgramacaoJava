package com.curso_programacao.estruturasrepetitivas;

import java.util.Scanner;

public class Exercicio11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo N: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("O número N deve ser positivo.");
        } else {
            for (int i = 1; i <= n; i++) {
                System.out.println(i + " " + (i * i) + " " + (i * i * i));
            }
        }

        scanner.close();
    }
}
