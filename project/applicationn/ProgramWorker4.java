package project.applicationn;

import project.entities.Department4;
import project.entities.HourContract4;
import project.entities.Worker4;
import project.entities.enums.WorkerLevel4;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class ProgramWorker4 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.print("Enter department's name: ");
        String department = sc.nextLine();
        System.out.println("Enter worker data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Level: ");


        WorkerLevel4 level = WorkerLevel4.valueOf(sc.next());
        System.out.print("Base salary: ");
        Double baseSalary = sc.nextDouble();

        Worker4 work = new Worker4(name,level,baseSalary,new Department4(department));

        System.out.print("How many contracts to this worker? ");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){

            sc.nextLine();
            System.out.println("Enter contract #" + (i+1) + " data: ");
            System.out.print("Date (DD/MM/YYYY): ");
            String dt1 = sc.nextLine();
            LocalDate date = LocalDate.parse(dt1,fmt1);
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();
            System.out.print("Duration (hours): ");
            int hours = sc.nextInt();

            HourContract4 contract = new HourContract4(date,valuePerHour,hours);
            work.addContract(contract);

        }

        System.out.print("\nEnter month and year to calculate income (MM/YYYY): ");
        String dateIncome = sc.next();

        int year = Integer.parseInt(dateIncome.substring(3));
        int month = Integer.parseInt(dateIncome.substring(0,2));

        System.out.println(work);
        System.out.println("Income for " + dateIncome + ": " + String.format("%.2f",work.income(year,month)));





        sc.close();
    }
}
