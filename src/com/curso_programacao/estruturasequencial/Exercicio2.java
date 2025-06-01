package com.curso_programacao.estruturasequencial;

import java.util.Scanner;

public class Exercicio2 {
	
	// Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		
		if(a % b == 0 ) {
			System.out.println("par");
		}else {
			System.out.println("impar");
		}
		
		sc.close();
		
	}
	
}
