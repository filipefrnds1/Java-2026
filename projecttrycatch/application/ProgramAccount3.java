package projecttrycatch.application;

import projecttrycatch.entities.Account3;
import projecttrycatch.model.exceptions.DomainExceptionAccount3;

import java.util.Locale;
import java.util.Scanner;

public class ProgramAccount3 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter account data");
        System.out.print("Number: ");
        int number = sc.nextInt();
        sc.nextLine();
        System.out.print("Holder: ");
        String holder = sc.nextLine();
        System.out.print("Initial balance: ");
        double balance = sc.nextDouble();
        System.out.print("Withdraw limit: ");
        double withdrawLimit = sc.nextDouble();

        Account3 acc = new Account3(number,holder,balance,withdrawLimit);

        System.out.print("\nEnter amount for withdraw: ");
        double amount = sc.nextDouble();

        try{
            acc.withdraw(amount);
            System.out.println("New Balance : " + String.format("%.2f", acc.getBalance()) );
        }
        catch (DomainExceptionAccount3 e){
            System.out.println("Withdraw error: " + e.getMessage());
        }
        finally {
            sc.close();
        }



    }
}
