import java.util.Locale;
import java.util.Scanner;

public class ExerCondicionalCelsoParaFahrenheit {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		
		char again1;
		double cels1,fahren1;
		
		do {
			System.out.print("Digite a temperatura em Celsius: ");
			cels1 = sc.nextDouble();
			fahren1 = ((9*cels1)/5)+32;
			System.out.printf("Equivalente em Fahrenheit: %.1f%n",fahren1);
			System.out.print("Deseja repetir (s/n)?");
			again1 = sc.next().charAt(0);
		}while(again1 != 'n');
		
		
		
		
		
		sc.close();
	}

}
