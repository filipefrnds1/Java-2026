import util.ProductAula97;

import java.util.Locale;
import java.util.Scanner;

public class Aula97Exer1v2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ProductAula97[] prod = new ProductAula97[n];

        for(int i = 0; i < prod.length; i++){
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();
            prod[i] = new ProductAula97(name,price);
        }

        double sum = 0;

        for(int i = 0; i < n; i++){
            sum += prod[i].getPrice();
        }

        double average = sum / n;

        System.out.printf("AVERAGE PRICE = %.2f", average3);



        sc.close();
    }
}
