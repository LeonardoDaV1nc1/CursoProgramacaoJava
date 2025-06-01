package com.curso_programacao.estruturasrepetitivas;

import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor inteiro X (1 <= X <= 1000): ");
        int x = scanner.nextInt();

        if (x < 1 || x > 1000) {
            System.out.println("Valor inválido. O valor deve estar entre 1 e 1000.");
        } else {
            for (int i = 1; i <= x; i++) {
                if (i % 2 != 0) {
                    System.out.println(i);
                }
            }
        }

        scanner.close();
    }
}
