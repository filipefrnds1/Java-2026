package application;

import entities.Employee4;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ProgramEmployee4 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many employees will be registered? ");
        int n = sc.nextInt();

        List<Employee4> list = new ArrayList<>();


        for(int i = 0; i < n; i++){

            System.out.println();
            System.out.println("Employee #" + i+1 +": ");
            System.out.print("Id: ");
            Integer id = sc.nextInt();

            while(hasId(list,id)){
                System.out.print("Id already taken! Try again: ");
                id = sc.nextInt();
            }

            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Salary: ");
            Double salary = sc.nextDouble();

            Employee4 emp = new Employee4(id,name,salary);
            list.add(emp);

        }

        System.out.print("\nEnter the employee id that will have salary increase: ");
        int empId = sc.nextInt();

        Integer incSal = increaseSalary(list,empId);

        if(incSal != null){
            System.out.print("Enter the percentage: ");
            double percent = sc.nextDouble();
            list.get(incSal).increasePercent(percent);

        }else{
            System.out.println("This id does not exist!");
        }


        System.out.println("\nList of employees: ");
        for(Employee4 emp : list){
            System.out.println(emp);
        }








        sc.close();
    }

    public static Boolean hasId(List<Employee4> list, Integer id){
        Employee4 emp = list.stream().filter( x -> x.getId().equals(id)).findFirst().orElse(null);
        return emp != null;
    }

    public static Integer increaseSalary(List<Employee4> list, int id){
        for(Employee4 emp : list){
            if(emp.getId() == id){
                return list.indexOf(emp);
            }
        }
        return null;
    }

}
