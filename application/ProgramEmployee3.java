package application;

import entities.Employee3;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ProgramEmployee3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many employees will be registered? ");
        int n = sc.nextInt();
        List<Employee3> list = new ArrayList<>();

        for(int i = 0; i < n; i++){
            System.out.println();
            System.out.println("Employee #" + i+1);
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

            Employee3 emp = new Employee3(id,name,salary);
            list.add(emp);

        }

        System.out.println();
        System.out.print("Enter the employee id that will have salary increase: ");
        int x = sc.nextInt();
        Integer emp = increaseSalary(list,x);

        if(emp != null){
            System.out.print("Enter the percentage: ");
            double percent = sc.nextDouble();
            list.get(emp).increasePercent(percent);
        }else{
            System.out.println("This id does not exist!");
        }

        System.out.println();
        System.out.println("List of employees: ");
        for(Employee3 ep : list){
            System.out.println(ep);
        }

        sc.close();
    }
    public static Boolean hasId(List<Employee3> list, Integer id){
        Employee3 emp = list.stream().filter(x -> x.getId().equals(id)).findFirst().orElse(null);
        return emp != null;
    }

    public static Integer increaseSalary(List<Employee3> list, int id){
        for(int i = 0; i < list.size(); i++){
            if(id == list.get(i).getId()){
                return i;
            }
        }
        return null;
    }
}
