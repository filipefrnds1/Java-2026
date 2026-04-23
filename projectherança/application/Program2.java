package projectherança.application;

import projectherança.entities.Account2;
import projectherança.entities.BusinessAccount2;
import projectherança.entities.SavingsAccount2;

import java.util.Locale;
import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Account2 acc = new Account2(1001, "Alex", 0.0);
        BusinessAccount2 bacc = new BusinessAccount2(1002,"Maria",0.0,500.0);

        //UPCASTING - pegar um objeto do tipo businessAccount2 e atribui-lo para uma variavel do tipo Account2

        Account2 acc1 = bacc;
        Account2 acc2 = new BusinessAccount2(1003,"Bob", 0.0, 200.0);
        Account2 acc3 = new SavingsAccount2(1004, "Anna", 0.0, 0.01);

        //DOWNCASTING - é converter um objeto da superclass para a subclasse

        BusinessAccount2 acc4 = (BusinessAccount2) acc2;

        acc4.loan(100.0);

        // BusinessAccount2 acc5 = (BusinessAccount2) acc3;

        if (acc3 instanceof BusinessAccount2){
            BusinessAccount2 acc5 = (BusinessAccount2) acc3;
            acc5.loan(200.0);
            System.out.println("Lioan!");
        }

        if(acc3 instanceof SavingsAccount2){
            SavingsAccount2 acc5 = (SavingsAccount2) acc3;
            acc5.updateBalance();
            System.out.println("Update!");
        }



        System.out.println(acc1.getBalance());






        sc.close();
    }
}
