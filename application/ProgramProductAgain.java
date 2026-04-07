package application;

import entities.ProductAgain;

import java.util.Locale;
import java.util.Scanner;

public class ProgramProductAgain {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);




        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Price: ");
        double price = sc.nextDouble();

       /* System.out.print("Quantity in stock: ");
        int quantity = sc.nextInt();
       */
        ProductAgain prod = new ProductAgain(name,price);

        System.out.println("Name : " + prod.getName());
        prod.setName("Computer");

        System.out.println();
        System.out.println("Product " + prod.toString());

        System.out.print("Enter the number of products to be added in stock: ");
        prod.addProducts(sc.nextInt());
        System.out.println();

        System.out.println("Updated " + prod.toString());

        System.out.print("Enter the number of products to be removed from stock: ");
        int remov = sc.nextInt();
        prod.removeProducts(remov);
        System.out.println();

        System.out.println("Update " + prod.toString());
    }
}
