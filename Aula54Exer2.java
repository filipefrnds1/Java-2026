import java.util.Locale;
import java.util.Scanner;

public class Aula54Exer2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		
		int x,in,out;
		in = 0;
		out = 0;
		
		int N;
		N = sc.nextInt();
		
		for(int i = 1; i <= N; i++) {
			
			x = sc.nextInt();
			
			if(x >= 10 && x <= 20) {
				in = in + 1;
				
			}else {
				out = out + 1;
				
			}
		}
		
		System.out.println(in + " in");
		System.out.println(out + " out");
		

		sc.close();
	}

}
