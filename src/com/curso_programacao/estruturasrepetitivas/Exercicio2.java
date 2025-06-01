package com.curso_programacao.estruturasrepetitivas;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Digite a coordenada X: ");
            int x = scanner.nextInt();
            System.out.print("Digite a coordenada Y: ");
            int y = scanner.nextInt();

            if (x == 0 || y == 0) {
                break; 
            }

            if (x > 0 && y > 0) {
                System.out.println("Primeiro quadrante");
            } else if (x < 0 && y > 0) {
                System.out.println("Segundo quadrante");
            } else if (x < 0 && y < 0) {
                System.out.println("Terceiro quadrante");
            } else {
                System.out.println("Quarto quadrante");
            }
        }

        scanner.close();
    }
}
