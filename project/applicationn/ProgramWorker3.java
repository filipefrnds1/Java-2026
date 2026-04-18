package project.applicationn;

import project.entities.Department3;
import project.entities.HourContract3;
import project.entities.Worker3;
import project.entities.enums.WorkerLevel3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class ProgramWorker3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.print("Enter department's name: ");
        String depart = sc.nextLine();
        Department3 department = new Department3(depart);
        System.out.println("Enter worker data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Level: ");
        String level = sc.nextLine();
        System.out.print("Base Salary: ");
        Double salary = Double.parseDouble(sc.nextLine());

        Worker3 work = new Worker3(name, WorkerLevel3.valueOf(level),salary,department);

        System.out.print("How many contracts to this worker? ");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){

            sc.nextLine();
            System.out.print("Enter contract #" + i+1 + " data: ");
            System.out.print("Date (DD/MM/YYYY): ");
            String dt = sc.nextLine();
            LocalDate date = LocalDate.parse(dt,fmt1);

            System.out.print("Value per hour: ");
            Double value = sc.nextDouble();

            System.out.print("Duration (hours): ");
            Integer hours = sc.nextInt();

            HourContract3 contract = new HourContract3(date,value,hours);
            work.addContract(contract);

        }

        System.out.println();
        System.out.print("Enter month and year to calculate income (MM/YYYY): ");
        String dateInc = sc.next();

        int year = Integer.parseInt(dateInc.substring(3));
        int month = Integer.parseInt(dateInc.substring(0,2));

        double incomeValue = work.income(year,month);

        System.out.println("Name: " + work.getName());
        System.out.println("Department: " + work.getDepartment().getName());
        System.out.println("Income for " + dateInc + ": " + String.format("%.2f", incomeValue));



        sc.close();
    }
}
