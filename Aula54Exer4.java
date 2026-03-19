import java.util.Locale;
import java.util.Scanner;

public class Aula54Exer4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		
		int N = sc.nextInt();
		
		for(int i = 0; i < N; i++) {
			
			int x1 = sc.nextInt();
			int x2 = sc.nextInt();
			
			if(x2 == 0) {
				System.out.println("divisao impossivel");
			}else {
				double d = (double) x1 / x2;
				System.out.printf("%.1f%n", d);
			}
			
			
		}
		
		
		
		sc.close();
	}

}
