package projecttrycatch.application;

import projecttrycatch.entities.Account;
import projecttrycatch.model.exceptions.DomainExceptionAccount;

import java.util.Locale;
import java.util.Scanner;

public class ProgramAccount {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter account data");
            System.out.print("Number: ");
            int number = sc.nextInt();
            sc.nextLine();
            System.out.print("Holder: ");
            String name = sc.nextLine();
            System.out.print("Initial Balance: ");
            double balance = sc.nextDouble();
            System.out.print("Withdraw limit: ");
            double withdrawLimit = sc.nextDouble();

            Account account = new Account(number,name,balance,withdrawLimit);

            System.out.print("\nEnter amount for withdraw: ");
            account.withDraw(sc.nextDouble());

            System.out.println("New balance : " + account.getBalance());
        }
        catch (DomainExceptionAccount e){
            System.out.println("Withdraw error: " + e.getMessage());
        }

    }
}
