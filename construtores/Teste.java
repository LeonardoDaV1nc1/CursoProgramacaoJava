package com.curso_programacao.construtores;

import com.curso_programacao.construtores.entities.Product;

public class Teste {
	
	public static void main(String[] args) {
		Product product = new Product("TV", 1500, 10000);
		
		//Product product = new Product("TV", 1500d);
		
		//Product product = new Product();
		
		System.out.println("Produto: " + product.name);
		System.out.println("Preco: " + product.price);
		System.out.println("qtd em estoque: " + product.quantity);
	}
	

}


