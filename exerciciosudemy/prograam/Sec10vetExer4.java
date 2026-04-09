package exerciciosudemy.prograam;

import java.util.Locale;
import java.util.Scanner;

public class Sec10vetExer4 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros você vai digitar? ");
        int n = sc.nextInt();
        int[] num = new int[n];
        int sum = 0;

        for(int i = 0; i < num.length; i++){
            System.out.print("Digite um número: ");
            num[i] = sc.nextInt();
        }

        System.out.println("\nNUMEROS PARES: ");
        for(int i = 0; i < num.length; i++){
            if(num[i] % 2 == 0){
                System.out.print(num[i] + "  ");
                sum++;
            }
        }

        System.out.println("\n\nQUANTIDADE DE PARES = " + sum);



        sc.close();
    }
}
