import java.util.Locale;
import java.util.Scanner;

public class Aula54Exer3 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// TODO Auto-generated method stub
		
		int N = sc.nextInt();
		
		double x1,x2,x3,mp;
		
		for(int i = 1; i <= N; i++) {
			
			x1 = sc.nextDouble();
			x2 = sc.nextDouble();
			x3 = sc.nextDouble();
			
			mp = ((x1*2)+(x2*3)+(x3*5))/(2+3+5);
			
			System.out.printf("%.1f%n",mp);
		}
		
		
		sc.close();
	}

}
