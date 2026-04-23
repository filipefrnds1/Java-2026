package projectherança.application;

import projectherança.entities.Account2;
import projectherança.entities.BusinessAccount2;
import projectherança.entities.SavingsAccount2;

import java.util.Locale;
import java.util.Scanner;

public class ProgAula139 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Account2 acc1 = new Account2(1001,"Alex", 1000.0);
        acc1.withdraw(200);
        System.out.println(acc1.getBalance());

        Account2 acc2 = new SavingsAccount2(1002,"Maria",1000.0,0.01);

        acc2.withdraw(200.0);

        System.out.println(acc2.getBalance());

        Account2 acc3 = new BusinessAccount2(1003,"Bob", 1000.0,500.0);
        acc3.withdraw(200.0);
        System.out.println(acc3.getBalance());



        sc.close();
    }
}
