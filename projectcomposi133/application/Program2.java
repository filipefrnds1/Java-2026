package projectcomposi133.application;


import projectcomposi133.entities.Client2;
import projectcomposi133.entities.Order2;
import projectcomposi133.entities.OrderItem2;
import projectcomposi133.entities.Product2;
import projectcomposi133.enums.OrderStatus2;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Enter cliente data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Birth date (DD/MM/YYYY): ");
        String brithDate = sc.next();
        LocalDate brithDate1 = LocalDate.parse(brithDate,fmt1);
        sc.nextLine();

        Client2 client = new Client2(name,email,brithDate1);

        System.out.println("Enter order data: ");
        System.out.print("Status: ");
        OrderStatus2 status = OrderStatus2.valueOf(sc.next());

        System.out.print("How many items to this order? ");
        int N = sc.nextInt();

        Order2 order = new Order2(LocalDateTime.now(), status,client);

        for(int i = 0; i < N; i++){

            sc.nextLine();
            System.out.println("Enter #" + (i+1) + " item data: ");
            System.out.print("Product name: ");
            String productName = sc.nextLine();
            System.out.print("Product price: ");
            Double productPrice = sc.nextDouble();
            System.out.print("Quantity: ");
            int quantity = sc.nextInt();

            Product2 product2 = new Product2(productName,productPrice);
            OrderItem2 it = new OrderItem2(quantity, productPrice,product2);
            order.addItem(it);
        }

        System.out.println();
        System.out.println(order);




        sc.close();
    }
}
