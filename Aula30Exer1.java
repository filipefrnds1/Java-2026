import java.util.Locale;
import java.util.Scanner;

public class Aula30Exer1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x,y;
		x = sc.nextInt();
		y = sc.nextInt();
		
		
		
		System.out.println("SOMA = " + (x+y));
		
		
		sc.close();

	}

}
