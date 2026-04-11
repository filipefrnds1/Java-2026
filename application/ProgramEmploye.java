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


        List<Employee> list = new ArrayList<>();


        for(int i = 0; i < n; i++){

            System.out.println();
            System.out.println("Employee #" + (i+1));
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
            Employee emp = new Employee(id,name,salary);
            list.add(emp);

        }

        System.out.println();
        System.out.print("Enter the employee id that will have salary increase: ");
        int id = sc.nextInt();

        //Employee ep = list.stream().filter(x -> x.getId().equals(id)).findFirst().orElse(null);

        Integer pos = position(list,id);

        if(pos == null){
            System.out.println("This id does not exist! ");
        }
        else{
            System.out.print("Enter the percentage: ");
            Double percent = sc.nextDouble();
            list.get(pos).increaseSalary(percent);
        }
            /*if(ep == null){
                System.out.println("This id does not exist! ");
            }else{
                System.out.print("Enter the percentage: ");
                Double percent = sc.nextDouble();
                ep.increaseSalary(percent);

            }*/

        System.out.println();
        System.out.println("List of employees: ");
        for(Employee edd : list){
            System.out.println(edd);
        }



        sc.close();
    }

    public static Integer position(List<Employee> list, int id){
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).getId() == id){
                return i;
            }
        }
        return null;
    }

    public static boolean hasId(List<Employee> list, Integer id){
        Employee emp = list.stream().filter(x -> x.getId().equals(id)).findFirst().orElse(null);
        return emp != null;
    }


}
