package com.curso_programacao.estruturasrepetitivas;

	import java.util.Scanner;

	public class Exercicio3 {
		{
	}

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        int alcool = 0;
	        int gasolina = 0;
	        int diesel = 0;
	        int codigo;

	        while (true) {
	            System.out.print("Digite o código do combustível (1-Álcool, 2-Gasolina, 3-Diesel, 4-Fim): ");
	            codigo = scanner.nextInt();

	            if (codigo == 4) {
	                break; 
	            }

	            if (codigo < 1 || codigo > 3) {
	                System.out.println("Código inválido. Digite um código válido.");
	                continue; 
	            }

	            switch (codigo) {
	                case 1:
	                    alcool++;
	                    break;
	                case 2:
	                    gasolina++;
	                    break;
	                case 3:
	                    diesel++;
	                    break;
	            }
	        }

	        System.out.println("MUITO OBRIGADO");
	        System.out.println("Alcool: " + alcool);
	        System.out.println("Gasolina: " + gasolina);
	        System.out.println("Diesel: " + diesel);

	        scanner.close();
	    }
	}

