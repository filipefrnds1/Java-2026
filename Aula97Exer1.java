import java.util.Locale;
import java.util.Scanner;

public class Aula97Exer1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] name = new String[n];
        double[] price = new double[n];
        double sum = 0.0;

        for(int i = 0; i < n; i++){
            name[i] = sc.nextLine();
            sc.nextLine();
            price[i] = sc.nextDouble();
            sum += price[i];
        }

        System.out.printf("AVERAGE PRICE = %.2f", sum/n);


        sc.close();
    }
}
