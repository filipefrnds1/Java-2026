package projetobeatbox.application;

import projetobeatbox.entities.MusicTest1;

import java.util.Locale;
import java.util.Scanner;

public class ProgramBeatBox {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        MusicTest1 mt = new MusicTest1();
        mt.play();


        sc.close();
    }
}
