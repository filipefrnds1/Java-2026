package exerciciosudemy.prograam;

import java.util.Locale;
import java.util.Scanner;

public class Sec10VetExer10 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos alunos serao digitados? ");
        int n = sc.nextInt();

        String[] aluno = new String[n];
        double[] n1 = new double[n];
        double[] n2 = new double[n];
        double[] media = new double[n];

        for(int i = 0; i < aluno.length; i++){
            sc.nextLine();
            System.out.println("Digite nome, primeira e segunda nota do " + (i+1) + "º aluno: ");
            aluno[i] = sc.nextLine();
            n1[i] = sc.nextDouble();
            n2[i] = sc.nextDouble();
            media[i] = (n1[i] + n2[i]) / 2;
        }

        System.out.println("Alunos aprovados: ");
        for(int i = 0; i < aluno.length; i++){
            if(media[i] >= 6.0){
                System.out.println(aluno[i]);
            }

        }


        sc.close();

    }
}
