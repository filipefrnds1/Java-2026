package projectherança.application;

import projectherança.entities.Account2;
import projectherança.entities.BusinessAccount2;
import projectherança.entities.SavingsAccount2;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ProgramAbstract {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        /*
        Account2 acc1 = new Account2(1001,"Alex",1000.0);
        Account2 acc2 = new SavingsAccount2(1002,"Maria",1000.0,0.01);
        Account2 acc3 = new BusinessAccount2(1003,"Bob",1000.0,500.0);*/

        List<Account2> list = new ArrayList<>();
        list.add(new SavingsAccount2(1001,"Alex",500.0,0.01));
        list.add(new BusinessAccount2(1002,"Maria", 1000.0,400.0));
        list.add(new SavingsAccount2(1004,"Bob",300.0,0.01));
        list.add(new BusinessAccount2(1005,"Anna",500.0,500.0));

        double sum = 0.0;
        for(Account2 acc : list){
            sum += acc.getBalance();
        }

        System.out.printf("Total balance: %.2f%n",sum);

        for(Account2 acc : list){
            acc.deposit(10.0);
        }

        for(Account2 acc : list){
            System.out.printf("Updated balance for account %d: %.2f%n",acc.getNumber(), acc.getBalance());
        }


        sc.close();
    }
}
