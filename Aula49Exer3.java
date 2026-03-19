import java.util.Locale;
import java.util.Scanner;

public class Aula49Exer3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		
		int y,alc,gas,die;
		
		alc = 0;
		gas = 0;
		die = 0;
		
		y = sc.nextInt();
		
		while(y != 4) {
			
			if(y == 1) {
				alc = alc + 1;
				
			}else if(y == 2){
				gas = gas + 1;
				
			}else if(y == 3) {
				die = die + 1;
				
			}
			
			y = sc.nextInt();
		}
		
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alc);
		System.out.println("Gasolina: " + gas);
		System.out.println("Diesel: " + die);
		
		sc.close();
	}

}
