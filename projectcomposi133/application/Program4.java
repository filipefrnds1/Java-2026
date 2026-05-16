package projectcomposi133.application;

import projectcomposi133.enums.OrderStatus4;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Enter cliente data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Birth date (DD/MM/YYYY): ");
        String birthDate = sc.nextLine();
        LocalDate dt1 = LocalDate.parse(birthDate,fmt1);
        System.out.println("Enter order data: ");
        System.out.print("Status: ");
        OrderStatus4 status = OrderStatus4.valueOf(sc.nextLine());

        



        sc.close();
    }
}
