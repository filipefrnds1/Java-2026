package projecttrycatch.application;

import java.util.Locale;
import java.util.Scanner;

public class ProgramAccount2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Account Number");
        System.out.print("Number: ");
        String number = sc.nextLine();
        System.out.print("Holder: ");
        String holder = sc.nextLine();
        System.out.print("Initial Balance: ");
        Double balance = sc.nextDouble();
        System.out.print("Withdraw Limit: ");
        Integer limit = sc.nextInt();

        System.out.print("\nEnter amount for withdraw: ");
        Double withdraw = sc.nextDouble();



        sc.close();
    }
}
