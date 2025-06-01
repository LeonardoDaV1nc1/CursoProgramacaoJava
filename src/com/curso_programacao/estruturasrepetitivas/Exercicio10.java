package com.curso_programacao.estruturasrepetitivas;

import java.util.Scanner;

public class Exercicio10 { 

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro N: ");
        int n = scanner.nextInt();

        System.out.println("Divisores de " + n + ":");

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }

        scanner.close();
    }
}
