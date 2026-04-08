package application;

import entities.Bank;

import java.util.Locale;
import java.util.Scanner;

public class ProgramBank {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Bank b;

        System.out.print("Enter account number: ");
        String accountNumber = sc.nextLine();
        System.out.print("Enter account holder: ");
        String holderName = sc.nextLine();
        System.out.print("Is there an initial deposit (y/n)? ");
        char init = sc.next().charAt(0);

        if(init == 'y'){
            System.out.print("Enter initial deposit value: ");
            double value = sc.nextDouble();
            b = new Bank(accountNumber,holderName,value);
        }else{
            b = new Bank(accountNumber,holderName);
        }

        System.out.println();
        System.out.println("Account data: ");
        System.out.println(b.toString());
        System.out.println();

        System.out.print("Enter a deposit value: ");
        double depValur = sc.nextDouble();
        b.depValue(depValur);
        System.out.println("Updated account data: ");
        System.out.println(b.toString());
        System.out.println();

        System.out.print("Enter a withdraw value: ");
        b.saqValue(sc.nextDouble());
        System.out.println("Updated account data: ");
        System.out.println(b.toString());


        sc.close();
    }
}
