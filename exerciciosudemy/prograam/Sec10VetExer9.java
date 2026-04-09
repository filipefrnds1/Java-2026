package exerciciosudemy.prograam;

import exerciciosudemy.entitiess.Pessoas;

import java.util.Locale;
import java.util.Scanner;

public class Sec10VetExer9 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas voce vai digitar? ");
        int n = sc.nextInt();

        Pessoas[] p = new Pessoas[n];

        for(int i = 0; i < p.length; i++){
            sc.nextLine();
            System.out.println("Dados da " + (i+1) + "a pessoa:");
            System.out.print("Nome: ");
            String name = sc.nextLine();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            p[i] = new Pessoas(name,idade);
        }

        String name = p[0].getName();
        int aux = p[0].getIdade();
        int pos = 0;

        for(int i = 1; i < p.length; i++){
            if(aux < p[i].getIdade()){
                aux = p[i].getIdade();
                pos = i;
            }
        }

        System.out.println("PESSOA MAIS VELHA: " + p[pos].getName());
        sc.close();
    }
}
