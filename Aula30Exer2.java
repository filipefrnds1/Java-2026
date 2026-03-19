import java.util.Locale;
import java.util.Scanner;

public class Aula30Exer2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double raio;
		raio = sc.nextDouble();
		double area = 3.14159*(raio*raio);
		System.out.printf("A=%.4f", area);
		
		
		sc.close();

	}

}
