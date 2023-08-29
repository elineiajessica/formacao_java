package br.com.dio.jessica.exercicios.loops;
import java.util.Scanner;

	
/*
* Faça um programa que leia conjunto de dois valores, 
* o primeiro representando o nome do aluno e o segundo representando a sua idade. 
* Pare inserindo 0 no campo.
*/
	
public class Ex1_NomeEIdade {
	
	public static void main(String[] args) {
			
		Scanner scan = new Scanner(System.in);
			
			
		int idade;
		String nome;
			
		while (true) {
			System.out.println("Nome: ");
			nome = scan.next();
			if(nome.equals("0")) break;
				
			System.out.println("Idade: ");
			idade = scan.nextInt();
				
		}
			
		System.out.println("Programa finalizado.");
			
		}
}
