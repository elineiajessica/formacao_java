package br.com.dio.jessica.exercicios.loops;

import java.util.Scanner;

/* Faça um programa que leia 5 números e informe o maior deles e a média entre todos.
 */

public class Ex3_MaiorEMedia {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int numero;
		int maior = 0;
		int soma = 0;
		int count = 0;
		
		do {
			System.out.println("Informe um número: ");
			numero = scan.nextInt();
			soma = soma + numero;
			
			if (numero > maior) maior = numero;
			
			count++;
		} while (count < 5);
		
		System.out.println("Maior número é o: " + maior);
		System.out.println("A soma dos números inseridos é: " + soma + " e sua média é: " + (soma/5));
		
	}	

}
