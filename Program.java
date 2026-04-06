import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double xa,xb,xc,ya,yb,yc,areaX,areaY,px,py;

        System.out.println("Enter the measures of triangle X: ");
        xa = sc.nextDouble();
        xb = sc.nextDouble();
        xc = sc.nextDouble();

        System.out.println("Enter the measures of triangle Y: ");
        ya = sc.nextDouble();
        yb = sc.nextDouble();
        yc = sc.nextDouble();

        px = (xa+xb+xc)/2;
        py = (ya+yb+yc)/2;

        areaX = Math.sqrt(px*(px-xa)*(px-xb)*(px-xc));
        areaY = Math.sqrt(py*(py-ya)*(py-yb)*(py-yc));

        System.out.printf("Triangle X area: %.4f%n", areaX);
        System.out.printf("Triangle Y area: %.4f%n", areaY);

        if(areaX > areaY){
            System.out.println("Larger area: X");
        }else{
            System.out.println("Larger area: Y");
        }

        sc.close();
    }
}
