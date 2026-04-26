package projecttrycatch.application;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class ProgramFinally {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        File file = new File("C:\\temp\\in.txt");

        try (Scanner sc = new Scanner(file)) {
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error opening file: " + e.getMessage());
        }
        finally {
            System.out.println("Finally block executed");
        }
    }
}
