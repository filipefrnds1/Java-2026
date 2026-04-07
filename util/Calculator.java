package util;

public class Calculator {

    public static final double PI = 3.14;

    public static double circum(double radius){  // o método MAIN é estático,
        return 2 * PI * radius;                 // nao pode chamar um metodo que não é estatico em um  método que é estático
    }

    public static double volume(double radius){
        return (4 * PI * Math.pow(radius, 3)) / 3;
    }
}
