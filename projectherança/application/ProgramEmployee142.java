package projectherança.application;

import projectherança.entities.Employee;
import projectherança.entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ProgramEmployee142 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();

        List<Employee> list = new ArrayList<>();
        Employee emp;


        for(int i = 0; i < n; i++){


            System.out.println("Employee #" + (i+1) + " data:");
            System.out.print("Outsourced (y/n)? ");
            char outs = sc.next().charAt(0);

            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Hours: ");
            int hours = sc.nextInt();

            System.out.print("Value per hours: ");
            double valuePerHour = sc.nextDouble();

            if(outs == 'y'){
                System.out.print("Additional charge: ");
                double addCharge = sc.nextDouble();
                emp = new OutsourcedEmployee(name,hours,valuePerHour,addCharge);
                list.add(emp);
            }
            else{
                emp = new Employee(name,hours,valuePerHour);
                list.add(emp);
            }

        }


        System.out.println("\nPAYMENTS: ");

        for(Employee emps : list){
            System.out.println(emps);
        }



        sc.close();
    }
}
