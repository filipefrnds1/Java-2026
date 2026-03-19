import java.util.Locale;
import java.util.Scanner;

public class Aula54Exer5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		
		int n = sc.nextInt();
		
		int fat = 1;
		for(int i=1; i<=n;i++) {
			fat = fat * i;
		}
		
		System.out.println(fat);
		
		
		sc.close();
	}

}
