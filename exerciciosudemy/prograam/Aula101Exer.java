package exerciciosudemy.prograam;

import exerciciosudemy.entitiess.Pensionato;

import java.util.Locale;
import java.util.Scanner;

public class Aula101Exer {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many rooms will be rented? ");
        int n = sc.nextInt();
        System.out.println();

        String name,email;
        int room,aux;
        Pensionato[] pen = new Pensionato[10];

        for(int i = 0; i < n; i++){
            sc.nextLine();
            System.out.println("Rent #" + (i+1) + ": ");
            System.out.print("Name: ");
            name = sc.nextLine();
            System.out.print("Email: ");
            email = sc.nextLine();
            System.out.print("Room: ");
            room = sc.nextInt();
            pen[room] = new Pensionato(name,email);
            System.out.println();
        }

        System.out.println("Busy rooms: ");
        for(int i = 0; i < pen.length; i++){
            if(pen[i] != null){
                System.out.println(i + ": " + pen[i].getName() + ", " + pen[i].getEmail());
            }
        }


        sc.close();
    }
}
