import java.util.Locale;
import java.util.Scanner;

public class RetanguleTES {

	public static void main(String[] args) {
		Retangule retangule = new Retangule();
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe a largura do retângulo : ");
		double largura = sc.nextDouble();
		System.out.println("Informe o comprimento do retângulo : ");
		double comprimento = sc.nextDouble();
		double P = retangule.perimetro(comprimento, largura);
		double A = retangule.area(comprimento, largura);
		System.out.printf("Perímetro: %.2f%n", P);
		System.out.printf("Área: %.2f%n", A);
		sc.close();
	}
}
