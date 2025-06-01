package com.curso_programacao.estruturasrepetitivas;

import java.util.Scanner;

public class Exercicio9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor inteiro N: ");
        int n = scanner.nextInt();

        long fatorial = 1; 

        if (n < 0) {
            System.out.println("Fatorial não definido para números negativos.");
        } else {
            for (int i = 1; i <= n; i++) {
                fatorial *= i;
            }
            System.out.println("Fatorial de " + n + " = " + fatorial);
        }

        scanner.close();
    }
}