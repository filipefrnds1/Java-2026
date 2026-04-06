import entities.EmployeAula77Exer2;

import java.util.Locale;
import java.util.Scanner;

public class Aula77Exer2 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        EmployeAula77Exer2 emp = new EmployeAula77Exer2();


        System.out.print("Name: ");
        emp.name = sc.nextLine();

        System.out.print("Gross salary: ");
        emp.grossSalary = sc.nextDouble();

        System.out.print("Tax: ");
        emp.tax = sc.nextDouble();

        System.out.println();

        System.out.printf("Employee: %s, $ %.2f%n", emp.name, emp.netSalary());
        System.out.println();

        System.out.print("Which percentage to increase salary? ");
        emp.increaseSalary(sc.nextDouble());
        System.out.println();

        System.out.printf("Update data: %s, $ %.2f", emp.name, emp.netSalary());





        sc.close();

    }
}
