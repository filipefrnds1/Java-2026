package application;

import entities.Employee6;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ProgramEmployee6 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many employees will be registered? ");
        int quantEmploy = sc.nextInt();

        List<Employee6> list = new ArrayList<>();

        for(int i = 0; i < quantEmploy; i++){

            System.out.println("\nEmployee #" + (i+1) +":");
            System.out.print("Id: ");
            int id = sc.nextInt();

            while(hasId(list,id)){
                System.out.print("Id already taken! Try again: ");
                id = sc.nextInt();
            }

            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Salary: ");
            double salary = sc.nextDouble();

            list.add(new Employee6(id,name,salary));
        }

        System.out.print("\nEnter the employee id that will have salary increase: ");
        int salaryIncrease = sc.nextInt();

        Employee6 emp = list.stream().filter(x -> x.getId() == salaryIncrease).findFirst().orElse(null);

        if(emp != null){
            System.out.print("Enter the percentage: ");
            double percent = sc.nextDouble();
            emp.percentSalary(percent);
        }
        else {
            System.out.println("This id does not exist! ");
        }

        System.out.println("\nList of employees: ");
        for(Employee6 emp1 : list){
            System.out.println(emp1);
        }





        sc.close();
    }

    public static Boolean hasId(List<Employee6> list, Integer id){
        Employee6 emp = list.stream().filter(x -> x.getId().equals(id)).findFirst().orElse(null);
        return emp != null;
    }
}
