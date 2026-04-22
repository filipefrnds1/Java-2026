package projectcomposi133.application;

import projectcomposi133.entities.Client3;
import projectcomposi133.entities.Order3;
import projectcomposi133.entities.OrderItem3;
import projectcomposi133.entities.Product3;
import projectcomposi133.enums.OrderStatus3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program3 {
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
        String date = sc.nextLine();
        LocalDate dt1 = LocalDate.parse(date,fmt1);

        Client3 client = new Client3(name,email,dt1);

        System.out.println("Enter order data: ");
        System.out.print("Status: ");
        OrderStatus3 status = OrderStatus3.valueOf(sc.nextLine());

        LocalDateTime dateNow = LocalDateTime.now();
        Order3 order = new Order3(dateNow,status,client);

        System.out.print("How many items to this order? ");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){

            sc.nextLine();
            System.out.println("Enter #" + (i+1) + "item data: ");
            System.out.print("Product name: ");
            String product = sc.nextLine();
            System.out.print("Product price: ");
            double price = sc.nextDouble();
            System.out.print("Quantity: ");
            int quantity = sc.nextInt();

            Product3 prod = new Product3(product,price);
            OrderItem3 ordItem = new OrderItem3(quantity,price,prod);

            order.addItem(ordItem);

        }

        System.out.println(order);


        sc.close();
    }
}
