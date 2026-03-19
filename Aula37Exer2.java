import java.util.Locale;
import java.util.Scanner;

public class Aula37Exer2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N;
		
		N = sc.nextInt();
		
		if(N%2 == 0) {
			System.out.println("PAR");
		}else {
			System.out.println("IMPAR");
		}
		
		
		
		sc.close();
	}

}
