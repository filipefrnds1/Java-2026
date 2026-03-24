import java.util.Locale;
import java.util.Scanner;

public class Aula54Exer4_again {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for(int i = 0; i < N; i++) {
			
			int n1 = sc.nextInt();
			int n2 = sc.nextInt();
			
			if(n2 == 0) {
				System.out.println("divisão impossível");
			}
			else {
				System.out.printf("%.1f%n", (double) n1/n2);
			}
		}
		
		
		
		sc.close();
	}

}
