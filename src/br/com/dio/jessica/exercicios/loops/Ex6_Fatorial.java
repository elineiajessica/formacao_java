package br.com.dio.jessica.exercicios.loops;

import java.util.Scanner;


/*
 * Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
 * Ex.: 5! = 120.
 */

public class Ex6_Fatorial {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Informe o número que deseja calcular o fatorial: ");
		int fatorial = scan.nextInt();
		
		int multiplicacao = 1;
		
		for (int i = fatorial; i >= 1; i--) {
			multiplicacao = multiplicacao * i;			
		}
		
		System.out.println(fatorial + "! = " + multiplicacao);
		
	}

}
