package projectherança.application;

import projectherança.entities.Account2;
import projectherança.entities.SavingsAccount2;

import java.util.Locale;
import java.util.Scanner;

public class ProgramPolimorfismo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Account2 x = new Account2(1020,"Alex",1000.0);
        Account2 y = new SavingsAccount2(1023,"Maria",1000.0,0.01);

        x.withdraw(50.0);
        y.withdraw(50.0);

        System.out.println("x = " + x.getBalance());
        System.out.println("y = " + y.getBalance());

        // Importante entender: A associação do tipo específico com o tipo genérico é feita em tempo de execução (upcasting)
        // O compilador não sabe para qual tipo específico a chamada do metodo withdraw está sendo feita (ele só sabe
        // que são duas variáveis tipo Account).


        sc.close();
    }
}
