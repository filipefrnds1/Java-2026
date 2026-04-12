package application;

import entities.Employee2;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ProgramEmployee2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many employees will be registered? ");
        int n = sc.nextInt();

        List<Employee2> list = new ArrayList<>();

        for(int i = 0; i < n; i++){

            System.out.println();
            System.out.println("Employee #" + (i+1) + ":");
            System.out.print("Id: ");
            Integer id = sc.nextInt();
            while(hasId(list,id)){
                System.out.println("Id already taken! Try again: ");
                System.out.print("Id: ");
                id = sc.nextInt();
            }

            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Salary: ");
            Double salary = sc.nextDouble();

            list.add(new Employee2(id,name,salary));

        }

        System.out.println();
        System.out.print("Enter the employee id that will have salary increase: ");
        Integer empId = sc.nextInt();
        Integer emp = incId(list,empId);

        if(emp >= 0){
            System.out.print("Enter the percentage: ");
            Double percent = sc.nextDouble();
            list.get(emp).increasePercent(percent);
            System.out.println();
        }else{
            System.out.println("This id does not exist!");
            System.out.println();
        }


        System.out.println("List of employees: ");
        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).toString());
        }

        sc.close();
    }

    public static boolean hasId(List<Employee2> list, Integer id){
        Employee2 emp = list.stream().filter(x -> x.getId().equals(id)).findFirst().orElse(null);
        return emp != null;
    }

    public static Integer incId(List<Employee2> list, Integer id){
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).getId().equals(id)){
                return i;
            }
        }
        return -1;
    }
}
