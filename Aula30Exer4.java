import java.util.Locale;
import java.util.Scanner;

public class Aula30Exer4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		
		int staffNumber,staffHours;
		double staffHoursSalary,salary;
		
		staffNumber = sc.nextInt();
		staffHours = sc.nextInt();
		staffHoursSalary = sc.nextDouble();
		
		salary = staffHours*staffHoursSalary;
		
		System.out.println("NUMBER = " + staffNumber);
		System.out.printf("SALARY = U$ %.2f", salary);
		
		
		
		sc.close();
	}

}
