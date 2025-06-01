package com.curso_programacao;

	import java.util.Scanner;
	import java.util.ArrayList; 
 
	public class Altura {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Quantas pessoas você deseja cadastrar? ");
	        int N = sc.nextInt();
	   
	        String[] nomes = new String[N];
	        int[] idades = new int[N];
	        double[] alturas = new double[N];
	     
	        System.out.println("\nPor favor, insira os dados de cada pessoa:");
	        for (int i = 0; i < N; i++) {
	            System.out.printf("--- Dados da %dª pessoa ---\n", i + 1);
	            sc.nextLine(); 
	            System.out.print("Nome: ");
	            nomes[i] = sc.nextLine();
	            System.out.print("Idade: ");
	            idades[i] = sc.nextInt();
	            System.out.print("Altura (em metros): ");
	            alturas[i] = sc.nextDouble();
	        }

	       
	        double somaAlturas = 0;
	        for (int i = 0; i < N; i++) {
	            somaAlturas += alturas[i];
	        }
	        double alturaMedia = somaAlturas / N;
	        System.out.printf("\n--- Resultados ---\n");
	        System.out.printf("Altura média das pessoas: %.2f metros\n", alturaMedia);
	        
	        int contadorMenos16 = 0;
	        ArrayList<String> nomesMenos16 = new ArrayList<>(); 

	        for (int i = 0; i < N; i++) {
	            if (idades[i] < 16) {
	                contadorMenos16++;
	                nomesMenos16.add(nomes[i]);
	            }
	        }

	        double porcentagemMenos16 = (double) contadorMenos16 / N * 100;
	        System.out.printf("Porcentagem de pessoas com menos de 16 anos: %.2f%%\n", porcentagemMenos16);

	        if (contadorMenos16 > 0) {
	            System.out.println("Nomes das pessoas com menos de 16 anos:");
	            for (String nome : nomesMenos16) {
	                System.out.println("- " + nome);
	            }
	        } else {
	            System.out.println("Não há pessoas com menos de 16 anos cadastradas.");
	        }

	        sc.close();
	    
	}
	}
	
	

