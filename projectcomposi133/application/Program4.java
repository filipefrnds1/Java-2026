package projectcomposi133.application;

import projectcomposi133.entities.Client4;
import projectcomposi133.entities.Order4;
import projectcomposi133.entities.OrderItem4;
import projectcomposi133.entities.Product4;
import projectcomposi133.enums.OrderStatus4;

import java.time.LocalDate;
import java.time.LocalDateTime;
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

        Client4 client = new Client4(name,email,dt1);

        Order4 order = new Order4(LocalDateTime.now(),status,client);

        System.out.print("How many items to this order? ");
        int qnItems = sc.nextInt();


        for(int i = 0; i < qnItems; i++){

            sc.nextLine();
            System.out.println("Enter #" + (i+1) + " item data: ");
            System.out.print("Product name: ");
            String prodName = sc.nextLine();
            System.out.print("Product price: ");
            double prodPrice = sc.nextDouble();
            System.out.print("Quantity: ");
            int prodQuantity = sc.nextInt();


            Product4 prod = new Product4(prodName,prodPrice);

            OrderItem4 orderItem = new OrderItem4(prodQuantity,prodPrice,prod);

            order.addItem(orderItem);

        }

        System.out.println(order);



        sc.close();
    }
}
