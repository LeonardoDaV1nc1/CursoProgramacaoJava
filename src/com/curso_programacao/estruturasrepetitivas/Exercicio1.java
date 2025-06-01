package com.curso_programacao.estruturasrepetitivas;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int senhaCorreta = 2002;

        while (true) {
            System.out.print("Digite a senha: ");
            int senhaDigitada = scanner.nextInt();

            if (senhaDigitada == senhaCorreta) {
                System.out.println("Acesso Permitido");
                break; 
            } else {
                System.out.println("Senha Invalida");
            }
        }

        scanner.close();
    }
}


