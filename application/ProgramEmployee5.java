package application;

import entities.Employee5;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ProgramEmployee5 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many employees will be registered? ");
        int n = sc.nextInt();

        List<Employee5> emp = new ArrayList<>();

        for(int i = 0; i < n; i++){

            System.out.println();
            System.out.println("Employee #" + (i+1));
            System.out.print("Id: ");
            int id = sc.nextInt();

            while(hasId(emp,id)){
                System.out.print("Id already taken! Try again: ");
                id = sc.nextInt();
            }

            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Salary: ");
            Double salary = sc.nextDouble();

            emp.add(new Employee5(id,name,salary));
        }

        System.out.println();
        System.out.print("Enter the employee id that will have salary increase : ");
        int idSalary = sc.nextInt();

        Employee5 empId = emp.stream().filter(x -> x.getId() == idSalary).findFirst().orElse(null);

        if(empId != null){
            System.out.print("Enter the percentage ");
            double percentSalary = sc.nextDouble();
            empId.percentSalary(percentSalary);
            System.out.println();
        }else{
            System.out.println("This id does not exist! ");
            System.out.println();
        }

        System.out.println("List of employees: ");
        for(Employee5 employ : emp){
            System.out.println(employ);
        }






        sc.close();
    }

    public static Boolean hasId(List<Employee5> list, int id){
        Employee5 emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }


}
