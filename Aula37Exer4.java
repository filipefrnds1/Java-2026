import java.util.Locale;
import java.util.Scanner;

public class Aula37Exer4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int horaI,horaF;
		
		horaI = sc.nextInt();
		horaF = sc.nextInt();
		
		int duracao;
		
		/*
		if(horaI > horaF) {
			horaI = 24 - horaI;
			System.out.println("O JOGO DUROU " + (horaI+horaF) + " HORA(S)");
			
		}else if(horaI != horaF){
			System.out.println("O JOGO DUROU " + (horaF-horaI) + " HORA(S)");
		}else {
			System.out.println("O JOGO DUROU 24 HORA(S)");
		}
		*/
		
		if(horaI < horaF) {
			duracao = horaF - horaI;
		}else {
			duracao = 24 - horaI + horaF;
		}
		
		System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
		
		sc.close();
	}

}
