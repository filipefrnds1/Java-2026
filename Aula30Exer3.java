import java.util.Locale;
import java.util.Scanner;

public class Aula30Exer3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		
		int A,B,C,D;
		
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		
		System.out.println("DIFERENCA = " + ((A*B)-(C*D)));
		
		
		
		
		sc.close();
	}

}
