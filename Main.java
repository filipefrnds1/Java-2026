import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Hello World! ");
		System.out.println("Digite um numero inteiro: ");
		int X;
		X = sc.nextInt();
		System.out.println("Digite outro numero inteiro: ");
		int Y;
		Y = sc.nextInt();
		
		System.out.println("O resultado da soma dos numeros: " + (X+Y));
		
		sc.close();

	}

}
