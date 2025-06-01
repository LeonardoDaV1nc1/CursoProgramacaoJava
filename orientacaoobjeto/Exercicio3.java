package com.curso_programacao.orientacaoobjeto;

import java.util.Scanner;

public class Exercicio3 {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite o nome do aluno: ");
	        String nomeAluno = scanner.nextLine();

	        double[] notas = new double[3];
	        for (int i = 0; i < 3; i++) {
	            System.out.printf("Digite a nota do %dº trimestre: ", i + 1);
	            notas[i] = scanner.nextDouble();
	        }

	        double notaFinal = (notas[0] + notas[1] + notas[2]) / 3.0;
	        System.out.printf("\nNota final do aluno %s: %.2f%n", nomeAluno, notaFinal);

	        double notaAprovacao = 6.0; 

	        if (notaFinal >= notaAprovacao) {
	            System.out.println("Aluno APROVADO!");
	        } else {
	            double pontosFaltantes = notaAprovacao - notaFinal;
	            System.out.printf("Aluno REPROVADO. Faltam %.2f pontos para a aprovação.%n", pontosFaltantes);
	            System.out.println("Estudo para a prova final. boa sorte! :");
	            
	        }

	        scanner.close();
	    }
	}


