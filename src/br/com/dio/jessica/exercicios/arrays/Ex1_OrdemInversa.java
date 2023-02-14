package br.com.dio.jessica.exercicios.arrays;

/*
 * Crie um vetor de 6 números inteiros e 
 * mostre-os na order inversa.
 */


public class Ex1_OrdemInversa {
	
	public static void main(String[] args) {
		
		int[] vetor = {5, -4, 19, 56, 95, 61};
		
		System.out.print("Vetor: ");
		int count = 0;
		
		while(count < (vetor.length)) {
			System.out.print(vetor[count] + " ");
			count++;
		}
		
		System.out.print("\nVetor na ordem contrária: ");
		
		for(int i = (vetor.length - 1); i >= 0; i--) {
			System.out.print(vetor[i] + " ");
		}		
		
	}

}
