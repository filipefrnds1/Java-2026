import java.util.Locale;
import java.util.Scanner;

public class Aula30Exer5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub

		int codP1,numP1,codP2,numP2;
		double valorP1,valorP2,total;
		
		codP1 = sc.nextInt();
		numP1 = sc.nextInt();
		valorP1 = sc.nextDouble();
		
		codP2 = sc.nextInt();
		numP2 = sc.nextInt();
		valorP2 = sc.nextDouble();
		
		total = (numP1*valorP1)+(numP2*valorP2);
		
		System.out.printf("VALOR A PAGAR: R$ %.2f", total);
		
		
		sc.close();
	}

}
