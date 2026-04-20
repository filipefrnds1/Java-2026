package projectcomposi133.application;

import project.entities.enums.OrderStatus;
import projectcomposi133.entities.Client;
import projectcomposi133.entities.Order;
import projectcomposi133.entities.OrderItem;
import projectcomposi133.entities.Product;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter  fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyy");

        System.out.println("Enter cliente data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Birth date (DD/MM/YYYY): ");
        String brithDate = sc.next();
        sc.nextLine();
        LocalDate date = LocalDate.parse(brithDate,fmt1);

        Client clt = new Client(name,email,date);

        System.out.println("Enter order data: ");
        LocalDateTime dt1 = LocalDateTime.now();
        System.out.print("Status: ");
        String status = sc.nextLine();

        Order ord = new Order(dt1, OrderStatus.valueOf(status),clt);


        System.out.print("How many items to this order? ");
        int n = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < n; i++){

            System.out.println("Enter #" + (i+1) + " item data: ");
            System.out.print("Product name: ");
            String prodName = sc.nextLine();
            System.out.print("Product price: ");
            Double prodPrice = sc.nextDouble();
            System.out.print("Quantity: ");
            Integer prodQuantity = sc.nextInt();
            sc.nextLine();

            OrderItem ordes = new OrderItem(prodQuantity,prodPrice);
            Product prods = new Product(prodName,prodPrice);

            ord.addItem(ordes);
            ord.getList().get(i).addProduct(prods);

        }

        System.out.println("\nORDER SUMMARY: ");
        System.out.println(ord);



        sc.close();
    }
}
