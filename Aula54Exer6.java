import java.util.Locale;
import java.util.Scanner;

public class Aula54Exer6 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N;
		N = sc.nextInt();
		
		
		for(int i = 1; i <= N; i++) {
			if(N%i == 0) {
				System.out.println(i);
			}
		}
		
		
		sc.close();
		
	}

}
