import java.util.Locale;
import java.util.Scanner;

public class Aula49Exer1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		
		int passwrd = 2002;
		int key;
		
		do {
			key = sc.nextInt();
			if(key != passwrd) {
				System.out.println("Senha Invalida");
			}else {
				System.out.println("Acesso Permitido");
			}
		}while(key != passwrd);
		
		
		
		
		sc.close();
	}

}
