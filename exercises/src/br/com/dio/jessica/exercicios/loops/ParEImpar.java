package br.com.dio.jessica.exercicios.loops;

import java.util.Scanner;


/* Faça um programa que peça N números inteiros, 
 * calcule e mostre a quantidade de números pares e 
 * a quantidade de números ímpares; * 
 */

public class ParEImpar {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		int quantidade;
		int count = 0;
		int numero;
		int somapar = 0;
		int somaimpar = 0;
		
		System.out.println("Quantos números deseja informar?");
		quantidade = scan.nextInt();
		
		
		do {
			System.out.println("Informe um número: ");
			numero = scan.nextInt();
			count++;
			
			if(numero % 2 == 0) {
				somapar++;
			} else {
				somaimpar++;
			}
			
		} while (count < quantidade);
		
		System.out.println("A quantidade de números pares foi de: " + somapar);
		System.out.println("A quantidade de números impares foi de: " + somaimpar);


	}
}
