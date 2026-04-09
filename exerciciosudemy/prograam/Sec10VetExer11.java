package exerciciosudemy.prograam;

import java.util.Locale;
import java.util.Scanner;

public class Sec10VetExer11 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas?");
        int n = sc.nextInt();

        double[] alt = new double[n];
        char[] gen = new char[n];

        for(int i = 0; i < alt.length; i++){
            System.out.print("Altura da " + (i+1) + "º pessoa: ");
            alt[i] = sc.nextDouble();
            System.out.print("Genero da " + (i+1) + "º pessoa: ");
            gen[i] = sc.next().charAt(0);
        }

        double auxmenor = alt[0];
        double auxmaior = alt[0];
        double mediaM = 0;
        int sumM = 0;
        int sumF = 0;

        for(int i = 1; i < alt.length; i++){
            if(auxmenor > alt[i]){
                auxmenor = alt[i];
            }
            if(auxmaior < alt[i]){
                auxmaior = alt[i];
            }
        }

        for(int i = 0; i < alt.length; i++){
            if(gen[i] == 'F'){
                mediaM += alt[i];
                sumF++;
            }else{
                sumM++;
            }

        }

        System.out.printf("Menor altura = %.2f%n", auxmenor);
        System.out.printf("Maior altura = %.2f%n", auxmaior);
        System.out.printf("Media das alturas das mulheres = %.2f%n", (mediaM/sumF));
        System.out.println("Numero de homens = " + sumM);

        sc.close();
    }
}
