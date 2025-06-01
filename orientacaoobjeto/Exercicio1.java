package com.curso_programacao.orientacaoobjeto;

/*fazer um programa para ler os valores de largura e altura de um retangulo.Em seguida,mostrar na tela o valor de sua area, perimetro e diagonal.*/

import java.util.Scanner;

public class Exercicio1 {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        try {
	            System.out.print("Digite o valor da largura do retângulo: ");
	            double largura = scanner.nextDouble();

	            System.out.print("Digite o valor da altura do retângulo: ");
	            double altura = scanner.nextDouble();

	            double area = largura * altura;
	            double perimetro = 2 * (largura + altura);
	            double diagonal = Math.sqrt(Math.pow(largura, 2) + Math.pow(altura, 2));

	            System.out.printf("\nÁrea do retângulo: %.2f%n", area);
	            System.out.printf("Perímetro do retângulo: %.2f%n", perimetro);
	            System.out.printf("Diagonal do retângulo: %.2f%n", diagonal);

	        } catch (java.util.InputMismatchException e) {
	            System.out.println("Por favor, digite valores numéricos válidos para largura e altura.");
	        } finally {
	            scanner.close(); 
	        }
	    }
	}
