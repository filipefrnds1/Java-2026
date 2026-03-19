import java.util.Locale;
import java.util.Scanner;

public class Aula37Exer1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N;
		
		N = sc.nextInt();
		
		if(N >= 0) {
			System.out.println("NAO NEGATIVO");
		}else {
			System.out.println("NEGATIVO");
		}
		
		
		sc.close();
	}

}
