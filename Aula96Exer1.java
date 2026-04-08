import java.util.Locale;
import java.util.Scanner;

public class Aula96Exer1 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        double[] vect = new double[N];

        for(int i = 0; i < N; i++){
            vect[i] = sc.nextDouble();
        }

        for(int i = 0; i < N; i++){
            System.out.printf("%.2f%n",vect[i]);
        }

        double average = 0;

        for(int i = 0; i < N; i++){
            average += vect[i];
        }

        System.out.printf("AVERAGE HEIGHT = %.2f", average/N);
        sc.close();
    }
}
