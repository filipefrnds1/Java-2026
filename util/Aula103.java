package util;

import java.util.Locale;
import java.util.Scanner;

public class Aula103 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int x = 20;

        Object obj = x;

        System.out.println(obj);

        int y = (int) obj;

        System.out.println(y);


        sc.close();
    }
}
