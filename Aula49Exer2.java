import java.util.Locale;
import java.util.Scanner;

public class Aula49Exer2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		
		int x,y;
		
		
		x = sc.nextInt();
		y = sc.nextInt();
		
		while(x != 0 && y != 0) {
			if(x >= 1 && y >= 1) {
				System.out.println("primeiro");
				
			}else if(x >= 1 && y <= -1) {
				System.out.println("quarto");
				
			}else if(x <= -1 && y >= 1) {
				System.out.println("segundo");
				
			}else{
				System.out.println("terceiro");
								
			}
			
			x = sc.nextInt();
			y = sc.nextInt();
			
			
		}
		
		
		
		
		sc.close();
	}

}
