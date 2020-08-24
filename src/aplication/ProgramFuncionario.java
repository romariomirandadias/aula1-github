package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class ProgramFuncionario {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Funcionario>  lista=new ArrayList<>();
		System.out.println("Quantos funcionários serão registrados ?");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			System.out.println();
			System.out.println("Funcionário #  " + i + " :");
			System.out.print("Id : ");
			int id=sc.nextInt();
			while(hasId(lista,id)) {
				System.out.println("Id inválido .Tente novamente.");
				id=sc.nextInt();
			}
			System.out.println("Nome : ");
			sc.nextLine();
			String nome=sc.nextLine();
			System.out.println("Salário :");
			double salario=sc.nextDouble();
			lista.add(new Funcionario(id,nome,salario));
		}
			System.out.println();
			System.out.println("Entre com o id do funcionário com salario incrementado :");
		int	 id=sc.nextInt();
			 Funcionario func = lista.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
			 if(func==null) {
				 System.out.println("Este id não existe");
			 }
			 else {
				 System.out.print("Entre com a porcentagem "); 
				 double porcen=sc.nextDouble();
				 func.salarioIncrement(porcen);
			 }
			 System.out.println();
			 System.out.println("Lista de empregados:");
			 for(Funcionario obj : lista) {
				 System.out.println(obj);	
			 }
		sc.close();
		}	
	public static boolean hasId(List<Funcionario>lista,int id) {
		Funcionario func=lista.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return func!=null;
	}
	
	}

