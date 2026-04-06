import entities.AlunoAula77;

import java.util.Locale;
import java.util.Scanner;

public class Aula77Exer3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        AlunoAula77 student = new AlunoAula77();

        student.name = sc.nextLine();
        student.nota1 = sc.nextDouble();
        student.nota2 = sc.nextDouble();
        student.nota3 = sc.nextDouble();

        //System.out.printf("FINAL GRADE = %.2f%n", student.finalGrade());

        if(student.finalGrade() >= 60.00){
            System.out.printf("FINAL GRADE = %.2f%n", student.finalGrade());
            System.out.println("PASS");
        }else{
            System.out.printf("FINAL GRADE = %.2f%n", student.finalGrade());
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS", 60-student.finalGrade());
        }

        sc.close();
    }
}
