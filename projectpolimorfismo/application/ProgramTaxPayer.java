package projectpolimorfismo.application;

import projectpolimorfismo.entities.Company;
import projectpolimorfismo.entities.Individual;
import projectpolimorfismo.entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ProgramTaxPayer {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();
        double sum = 0;

        List<TaxPayer> list = new ArrayList<>();

        for(int i = 1; i <= n; i++){

            System.out.println("Tax payer #" + i + " data: ");
            System.out.print("Individual or company (i/c)? ");
            char ic = sc.next().charAt(0);
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Anual income: ");
            double income = sc.nextDouble();

            if(ic == 'i'){
                System.out.print("Health expenditures: ");
                double expenditure = sc.nextDouble();
                list.add( new Individual(name,income,expenditure));
            }
            else if(ic == 'c'){
                System.out.print("Number of employees: ");
                int employee = sc.nextInt();
                list.add( new Company(name,income,employee));
            }
        }

        System.out.println("\nTAXES PAID: ");
        for(TaxPayer tax : list){
            sum += tax.taxesPaid();
            System.out.println(tax.getName() + ": $ " + String.format("%.2f",tax.taxesPaid()));
        }

        System.out.println("\nTOTAL TAXES: $ " + String.format("%.2f", sum));




        sc.close();
    }
}
