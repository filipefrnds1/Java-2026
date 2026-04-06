import java.util.Locale;
import java.util.Scanner;

public class ProgramTriangle {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Triangle x = new Triangle();
        Triangle y = new Triangle();

        double areaX,areaY,px,py;

        System.out.println("Enter the measures of triangle X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Enter the measures of triangle Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        px = (x.a+x.b+x.c)/2;
        py = (y.a+y.b+y.c)/2;

        areaX = x.area();
        areaY = y.area();

        System.out.printf("Triangle X area: %.4f%n", areaX);
        System.out.printf("Triangle Y area: %.4f%n", areaY);

        if(areaX > areaY){
            System.out.println("Larger area: X");
        }else{
            System.out.println("Larger area: Y");
        }
    }
}
