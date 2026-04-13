package exerciciosudemy.prograam;

import java.util.Locale;
import java.util.Scanner;

public class Aula111Exerv2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int l = sc.nextInt();
        int c = sc.nextInt();

        int[][] mat = new int[l][c];

        for(int i = 0; i < l; i++){
            for(int j = 0; j < c; j++){
                mat[i][j] = sc.nextInt();
            }
        }

        int position = sc.nextInt();

        for(int i = 0; i < l; i++){
            for(int j = 0; j < c; j++){
                if(position == mat[i][j]){
                    System.out.println("Position: " + i + "," + j);
                    if(j > 0){
                        System.out.println("Left: " + mat[i][j-1]);
                    }
                    if(j < c-1){
                        System.out.println("Right: " + mat[i][j+1]);
                    }
                    if(i > 0){
                        System.out.println("Up: " + mat[i-1][j]);
                    }
                    if(i < l-1){
                        System.out.println("Down: " + mat[i+1][j]);
                    }
                }
            }
        }


        sc.close();
    }
}
