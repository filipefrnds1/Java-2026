package project.applicationn;

import project.entities.Department5;
import project.entities.HourContract5;
import project.entities.Worker5;
import project.entities.enums.WorkerLevel5;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class ProgramWorker5 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.print("Enter department's name: ");
        Department5 depart = new Department5(sc.nextLine());

        System.out.println("Enter worker data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Level: ");
        WorkerLevel5 level = WorkerLevel5.valueOf(sc.nextLine());

        System.out.print("Base salary: ");
        double baseSalary = sc.nextDouble();

        Worker5 work = new Worker5(name,level,baseSalary,depart);

        System.out.print("How many contracts to this worker? ");
        int quantityCont = sc.nextInt();

        for(int i = 0; i < quantityCont; i++){

            sc.nextLine();

            System.out.println("Enter contract #" + (i+1) + " data:");
            System.out.print("Date (DD/MM/YYYY): ");
            LocalDate date = LocalDate.parse(sc.nextLine(),fmt1);

            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();

            System.out.print("Duration (hours): ");
            int duration = sc.nextInt();

            HourContract5 hCont = new HourContract5(date,valuePerHour,duration);

            work.addContract(hCont);
        }

        sc.nextLine();

        System.out.print("\nEnter mont and year to calculate income (MM/YYYY): ");
        String dateIncome = sc.nextLine();


        int month = Integer.parseInt(dateIncome.substring(0,2));
        int year = Integer.parseInt(dateIncome.substring(3));

        double sumIncome = work.income(year,month);

        System.out.println(work);
        System.out.println("Income for " + dateIncome + ": " + String.format("%.2f",sumIncome));



        sc.close();
    }
}
