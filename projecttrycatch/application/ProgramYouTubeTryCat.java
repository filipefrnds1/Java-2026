package projecttrycatch.application;

import projecttrycatch.entities.Financiamento;

import java.util.Locale;
import java.util.Scanner;

public class ProgramYouTubeTryCat {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double valorTotal = 1000.0;
        double entrada = 100.0;
        int parcelas = 10;


        try{
            Financiamento f = new Financiamento(valorTotal,entrada,parcelas);
            System.out.println(f.prestacao());
        }
        catch (RuntimeException e){
            System.out.println(e.getMessage());
        }





        sc.close();
    }
}
