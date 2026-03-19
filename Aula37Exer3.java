import java.util.Locale;
import java.util.Scanner;

public class Aula37Exer3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int A, B;
		
		A = sc.nextInt();
		B = sc.nextInt();
		
		/*
		if(A > B) {
			if(A % B == 0) {
				System.out.println("São Multiplos");
			}else {
				System.out.println("Não São Multiplos");
			}
		}else {
			if(B % A == 0) {
				System.out.println("São Multiplos");
			}else {
				System.out.println("Não São Multiplos");
			}
		}
		*/
		
		if(A % B == 0 || B % A == 0) {
			System.out.println("São Multiplos");
		}else {
			System.out.println("Não São Multiplos");
		}
		
		
		sc.close();

	}

}
