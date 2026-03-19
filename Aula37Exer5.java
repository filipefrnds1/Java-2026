import java.util.Locale;
import java.util.Scanner;

public class Aula37Exer5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int cod,qnt;
		double total;
		
		cod = sc.nextInt();
		qnt = sc.nextInt();
		
		total = 0;
		
		if(cod == 1) {			
			total = qnt*4.0;
			
		}else if(cod == 2) {			
			total = qnt*4.5;
			
		}else if(cod == 3) {			
			total = qnt*5.0;
			
		}else if(cod == 4) {			
			total = qnt*2.0;
			
		}else{			
			total = qnt*1.5;
			
		}
		
		System.out.printf("TOTAL: R$ %.2f", total);
		
		
		
		sc.close();

	}

}
