package project.applicationn;

import project.entities.Department;
import project.entities.HourContract;
import project.entities.Worker;
import project.entities.enums.WorkerLevel;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class ProgramWorker {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.print("Enter department's name: ");
        String depart = sc.nextLine();

        Department dep = new Department(depart);


        System.out.println("Enter worker data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Level: ");
        String level = sc.nextLine();

        System.out.print("Base salary: ");
        Double salary = sc.nextDouble();

        Worker work = new Worker(name, WorkerLevel.valueOf(level),salary, dep);

        System.out.print("How many contracts to this worker? ");
        int n = sc.nextInt();


        for(int i = 0; i < n; i++){

            sc.nextLine();
            System.out.println("Enter contract #" + i+1 + " data:");
            System.out.print("Date (DD/MM/YYYY): ");
            String d1 = sc.nextLine();
            LocalDate date = LocalDate.parse(d1,fmt1);

            System.out.print("Value per hour: ");
            Double value = sc.nextDouble();

            System.out.print("Duration (hours): ");
            Integer hours = sc.nextInt();

            HourContract contract = new HourContract(date,value,hours);

            work.addContract(contract);
        }


        System.out.print("Enter month and year to calculate income (MM/YYYY): ");
        String dateIncome = sc.next();

        int month = Integer.parseInt(dateIncome.substring(0,2));
        int year = Integer.parseInt(dateIncome.substring(3));

        System.out.println("Nome: " + work.getName());
        System.out.println("Departamento: " + work.getDepartment().getName());
        System.out.println("Ganho para " + dateIncome + ": " + String.format("%.2f", work.income(year,month)));






        sc.close();
    }
}
