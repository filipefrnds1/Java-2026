package exerciciosudemy.prograam;

import java.util.Locale;
import java.util.Scanner;

public class Sec10VetExer5 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int n = sc.nextInt();
        double[] par = new double[n];
        double aux = 0;
        int pos = 0;

        for(int i = 0; i < par.length; i++){
            System.out.print("Digite um numero: ");
            par[i] = sc.nextDouble();
        }

        aux = par[0];
        for(int i = 1; i < par.length; i++){
            if(par[i] > aux ){
                aux = par[i];
                pos = i;
            }
        }

        System.out.println("\nMAIOR VALOR = " + aux);
        System.out.println("POSIÇÃO DO MAIOR VALOR = " + pos);


        sc.close();
    }
}
