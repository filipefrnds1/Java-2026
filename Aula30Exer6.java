import java.util.Locale;
import java.util.Scanner;

public class Aula30Exer6 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		
		double A,B,C,PI;
		double areaTri,areaCirc,areaTrap,areaQua,areaRet;
		
		PI = 3.14159;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		areaTri = (A*C)/2;
		areaCirc = PI*C*C;
		areaTrap = ((A+B)*C)/2;
		areaQua = B*B;
		areaRet = A*B;
		
		System.out.printf("TRIANGULO: %.3f %n", areaTri);
		System.out.printf("CIRCULO: %.3f %n", areaCirc);
		System.out.printf("TRAPEZIO: %.3f %n", areaTrap);
		System.out.printf("QUADRADO: %.3f %n", areaQua);
		System.out.printf("RETANGULO: %.3f %n", areaRet);
		
		

		
		sc.close();
	}

}
