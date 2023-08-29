package br.com.dio.jessica.exercicios.loops;

import java.util.Scanner;

/*
 * Desenvolva um gerador de tabuada, 
 * capaz de gerar uma tabuada de qualquer número inteiro de 1 a 10.
 * O usuário deve informar qual número deseja ver a tabuada.
 * A saída deve ser conforme exemplo:
 * 
 * Tabuada de 5:
 * 
 * 5x1 = 5
 * 5x2 = 10
 * ...
 * 5x10 = 50
 */


public class Tabuada {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int tabuada;
		int resultado;
		
		System.out.println("Insira o número que deseja calcular a tabuada: ");
		tabuada = scan.nextInt();
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(tabuada + " X " + i + " = " + (tabuada*i));			
		}	
		
	}

}
