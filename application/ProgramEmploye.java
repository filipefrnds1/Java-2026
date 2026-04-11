package application;

import entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ProgramEmploye {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many employees will be registered? ");
        int n = sc.nextInt();
        System.out.println();

        List<Employee> emp = new ArrayList<>();
        Employee empp;

        for(int i = 0; i < n; i++){
            System.out.println("Employee #" + (i+1));
            System.out.print("Id: ");
            Integer id = sc.nextInt();
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Salary: ");
            Double salary = sc.nextDouble();
            empp = new Employee(id,name,salary);
            emp.add(empp);
            System.out.println();
        }


        System.out.print("Enter the employee id that will have salary increase: ");
        Integer id = sc.nextInt();
        Employee ep = emp.stream().filter(x -> x.getId().equals(id)).findFirst().orElse(null);

            if(ep == null){
                System.out.println("This id does not exist! ");
            }else{
                System.out.print("Enter the percentage: ");
                Double percent = sc.nextDouble();
                Double valor = ep.getSalary() + (ep.getSalary() * (percent/100));
                ep.setSalary(valor);
            }

        System.out.println();
        System.out.println("List of employees: ");
        for(Employee edd : emp){
            System.out.println(edd);
        }



        sc.close();
    }


}
