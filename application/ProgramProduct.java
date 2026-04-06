package application;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class ProgramProduct {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product prod = new Product();


        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        prod.name = sc.nextLine();

        System.out.print("Price: ");
        prod.price = sc.nextDouble();

        System.out.print("Quantity in stock: ");
        prod.quantity = sc.nextInt();

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



        sc.close();
    }
}
