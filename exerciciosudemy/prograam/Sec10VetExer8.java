package exerciciosudemy.prograam;

import java.util.Locale;
import java.util.Scanner;

public class Sec10VetExer8 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();

        int[] vet = new int[n];
        double media = 0;
        int sum = 0;

        for(int i = 0; i < vet.length; i++){
            System.out.print("Digite um numero: ");
            vet[i] = sc.nextInt();
            if(vet[i] % 2 == 0) {
                media += vet[i];
                sum++;
            }
        }

        if(sum == 0){
            System.out.println("NENHUM NUMERO PAR");
        }else {
            System.out.println("MEDIA DOS PARES = " + (media / sum));
        }

        sc.close();
    }
}
