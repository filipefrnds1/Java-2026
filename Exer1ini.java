import java.util.Locale;
import java.util.Scanner;

public class Exer1ini {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double x,y,area,price;
		
		x = sc.nextDouble();
		y = sc.nextDouble();
		price = sc.nextDouble();
		area = x*y;
		
		System.out.printf("AREA = %.2f %n", area);
		System.out.printf("PRECO = %.2f", price*area);
		
		
		
		
		
		sc.close();

	}

}
