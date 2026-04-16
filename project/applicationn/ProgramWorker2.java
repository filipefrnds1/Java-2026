package project.applicationn;

import project.entities.Department2;
import project.entities.HourContract2;
import project.entities.Worker2;
import project.entities.enums.WorkerLevel2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class ProgramWorker2 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyy");

        System.out.print("Enter department's name: ");
        String depart = sc.nextLine();

        Department2 department = new Department2(depart);

        System.out.println("Enter worker data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Level: ");
        String level = sc.nextLine();

        System.out.print("Base salary: ");
        Double salary = Double.parseDouble(sc.nextLine());

        Worker2 worker = new Worker2(name, WorkerLevel2.valueOf(level),salary,department);

        System.out.print("How many contracts to this worker? ");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){

            sc.nextLine();
            System.out.println("Enter contract #" + i+1 + " data:");
            System.out.print("Date (DD/MM/YYYY):");
            String dt = sc.nextLine();
            LocalDate date = LocalDate.parse(dt,fmt1);

            System.out.print("Value per hour: ");
            Double value = sc.nextDouble();

            System.out.print("Duration (hours): ");
            Integer hours = sc.nextInt();

            HourContract2 contract2 = new HourContract2(date,value,hours);
            worker.addContract(contract2);
        }

        System.out.print("\nEnter month and year to calculate income (MM/YYYY): ");
        String dateCalc = sc.next();

        int year = Integer.parseInt(dateCalc.substring(3));
        int month = Integer.parseInt(dateCalc.substring(0,2));

        System.out.println("Name: " + worker.getName());
        System.out.println("Department: " + worker.getDepart().getName());
        System.out.println("Income for " + dateCalc + ": " + String.format("%.2f", worker.income(year,month)));


        sc.close();
    }
}
