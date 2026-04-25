package projectherança.application;

import projectherança.entities.Product;
import projectherança.entities.ImportedProduct;
import projectherança.entities.UsedProduct;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ProgramProduct {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();

        List<Product> list = new ArrayList<>();

        for(int i = 1; i <= n; i++){

            System.out.println("Product #" + i + " data: ");
            System.out.print("Common, used or imported (c/u/i)? ");
            char typeTag = sc.next().charAt(0);
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Price: ");
            Double price = sc.nextDouble();

            if(typeTag == 'c'){
                list.add(new Product(name,price));
            }
            else if(typeTag == 'u'){
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                sc.nextLine();
                LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                /* String dt = sc.nextLine();
                LocalDate date = LocalDate.parse(dt,fmt1); */
                list.add(new UsedProduct(name,price,date));
            }else{
                System.out.print("Customs fee: ");
                double fee = sc.nextDouble();
                list.add(new ImportedProduct(name,price,fee));
            }

        }

        System.out.println();
        System.out.println("PRICE TAGS: ");
        for(Product p : list){
            System.out.println(p.priceTag());
        }


        sc.close();
    }
}
