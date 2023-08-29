package ContaTerminal;

import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		Double saldo = 237.48;
		
		System.out.println("Informe o seu nome:");
		String nome = scan.next();
		
		System.out.println("Informe o número de sua agência");
		Integer agencia = scan.nextInt();
		
		System.out.println("Informe o número de sua conta:");
		Integer conta = scan.nextInt();
		
		System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco! "
				+ "A sua agência é: " + agencia + ", sua conta é a: " + conta + " e o seu saldo " + saldo + " já está disponível para saque!");
		
		
		
		
	}

}
