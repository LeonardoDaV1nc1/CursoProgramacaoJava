package com.curso_programacao.orientacaoobjeto.entities;

import java.util.Scanner;

public class Retangulo {
	
	private double largura;
	private double altura;
	
	public Retangulo() {}
	
	public Retangulo(double largura, double altura) {
		super();
		this.largura = largura;
		this.altura = altura;
	}

	public double calcularArea() {
		return largura * altura;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Retangulo r1 = new Retangulo();
		//System.out.println("r1 -> " + r1.calcularArea());
		
		System.out.println("Entre com os valores do retangulo 1 (largura e altura)");
		r1.largura = sc.nextDouble();
		r1.altura = sc.nextDouble();
		
		Retangulo r2 = new Retangulo();
		//System.out.println("r2 -> " + r2.calcularArea());
		
		System.out.println("Entre com os valores do retangulo 2 (largura e altura)");
		r2.largura = sc.nextDouble();
		r2.altura = sc.nextDouble();
		
		if(r1.calcularArea() > r2.calcularArea()) {
			System.out.println("r1 é o maior.");
		}else if(r1.calcularArea() < r2.calcularArea()) {
			System.out.println("r2 é o maior.");
		}else {
			System.out.println("r1 e r2 sao do mesmo tamanho.");
		}
		
		sc.close();
		
	}

}
