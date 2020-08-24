package aplication;

import java.text.ParseException;
import java.util.Scanner;

import entities.Aluguel;

public class ProgramAluguel {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		
		Aluguel[] vect = new Aluguel[10];
		System.out.println("Quantos quartos serão alugados ?");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.println();
			System.out.println("Aluguel # " + i + ":");
			System.out.print("Nome :");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("E-mail : ");
			String email = sc.nextLine();
			System.out.print("Quarto : ");
			int numeroQuarto = sc.nextInt();
			vect [numeroQuarto] = new Aluguel (nome, email);
		}
		System.out.println();
		System.out.println("Quartos Alugados : ");
		for(int i=0;i<10;i++) {
			if (vect[i]!=null) {
				System.out.println(i + ":" + vect[i]);
			}
		}
		sc.close();
	}

}
