package com.curso_programacao.estruturasrepetitivas;

import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de valores N: ");
        int n = scanner.nextInt();

        int in = 0;
        int out = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Digite o valor X: ");
            int x = scanner.nextInt();

            if (x >= 10 && x <= 20) {
                in++;
            } else {
                out++;
            }
        }

        System.out.println(in + " in");
        System.out.println(out + " out");

        scanner.close();
    }
}