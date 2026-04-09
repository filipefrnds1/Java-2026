package exerciciosudemy.prograam;

import exerciciosudemy.entitiess.Pessoas;

import java.util.Locale;
import java.util.Scanner;

public class Sec10VetExer3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas? ");
        int n = sc.nextInt();
        double media = 0;
        int sum = 0;
        Pessoas[] p = new Pessoas[n];

        for(int i = 0; i < p.length; i++){
            sc.nextLine();
            System.out.println("Dados da " + (i+1) + "a pessoa: ");
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            System.out.print("Altura: ");
            double altura = sc.nextDouble();
            p[i] = new Pessoas(nome,idade,altura);
        }

        for(int i = 0; i < p.length; i++){
           media += p[i].getAltura();
        }

        media = media / p.length;
        System.out.printf("\nAltura média: %.2f%n", media);

        for(int i = 0; i < p.length; i ++){
            if(p[i].getIdade() < 16){
                sum += 1;
            }
        }

        System.out.println("Pessoas com menos de 16 anos: " + (((double)sum/p.length)*100) + "%");

        for(int i = 0; i < p.length; i++){
            if(p[i].getIdade() < 16){
                System.out.println(p[i].getName());
            }
        }


        sc.close();
    }
}
