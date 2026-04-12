package exerciciosudemy.prograam;

import java.util.Locale;
import java.util.Scanner;

public class ExerAula110 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] mat = new int[n][n];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                mat[i][j] = sc.nextInt();
            }
        }

        int sum = 0;

        System.out.println("Main Diagonal:");
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[i].length; j++){
                if(i == j){
                    System.out.print(mat[i][j] + " ");
                }
                if(mat[i][j] < 0){
                    sum++;
                }

            }
        }

        System.out.println("\nNegative numbers: = " + sum);

        sc.close();
    }


}

