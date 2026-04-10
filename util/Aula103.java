package util;

import java.util.Locale;
import java.util.Scanner;

public class Aula103 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int x = 20;

        Integer obj = x; // As wrapper classes são classes que tem o objetivo de tratar os tipos primitivos como classes
                        // só que de uma forma transparente ao compilador, sem precisar com conversões e casting
                       // campos de entidades em sistemas de informação, pois tipos referencia aceitam valor null e usufruem dos recursos de OO

        System.out.println(obj);

        int y = (int) obj;

        System.out.println(y);


        sc.close();
    }
}
