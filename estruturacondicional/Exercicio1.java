package com.curso_programacao.estruturacondicional;

import java.util.Scanner;

public class Exercicio1 {

	// Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
	public static void main(String[] args) {

		/*
		int a, b, c;
		
		a = -10;
		b = 8;
		c = 0;
		
		if(a < 0) {
			System.out.println(a + " é NEGATIVO");
		}else {
			System.out.println(a + " NÃO NEGATIVO");
		}
		*/
		
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
	    
		if (N < 0) {
			System.out.println(N + " NEGATIVO");
		}
		else {
			System.out.println(N + " NAO NEGATIVO");
		}

		sc.close();

	}

}
