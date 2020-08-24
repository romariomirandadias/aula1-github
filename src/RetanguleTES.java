import java.util.Locale;
import java.util.Scanner;

public class RetanguleTES {

	public static void main(String[] args) {
		Retangule retangule = new Retangule();
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe a largura do ret�ngulo : ");
		double largura = sc.nextDouble();
		System.out.println("Informe o comprimento do ret�ngulo : ");
		double comprimento = sc.nextDouble();
		double P = retangule.perimetro(comprimento, largura);
		double A = retangule.area(comprimento, largura);
		System.out.printf("Per�metro: %.2f%n", P);
		System.out.printf("�rea: %.2f%n", A);
		sc.close();
	}
}
