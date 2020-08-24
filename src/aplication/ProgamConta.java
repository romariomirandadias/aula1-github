package aplication;


import java.util.Scanner;

import entities.Conta;

public class ProgamConta {

	public static void main(String[] args) {
		
		Conta c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o número da conta : ");
		int numero = sc.nextInt();
		System.out.println("Informe titular da conta : ");
		sc.nextLine();
		String titular = sc.nextLine();
		System.out.println("Irá fazer um depósito ?:s/n ");
		char Idepositar = sc.next().charAt(0);		
		if (Idepositar == 's') {
			System.out.println("Entre com um valor de depósito");
		double depositoInicial = sc.nextDouble();
			c = new Conta(numero, titular, depositoInicial);
		} else {
			c = new Conta(numero, titular);
		}
		System.out.println();
		System.out.println("Dados da conta :");
		System.out.println(c);
		System.out.println();
		System.out.println("Entre com um valor de depósito:");
		double deposito = sc.nextDouble();
		c.depositar(deposito);
		System.out.println("Atualizando dados da conta:");
		System.out.println(c);
		System.out.println();
		System.out.println("Entre com um valor de saque:");
		double saque=sc.nextDouble();
		c.sacar(saque);
		System.out.println("Atualizando dados da conta:");
		System.out.println(c);
sc.close();
	}
}
