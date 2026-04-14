package exerciciosudemy.prograam;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Aula118 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd 'de' MMMM 'de' yyyy").withZone(ZoneId.systemDefault());

        LocalDate d01 = LocalDate.now(); //data local
        LocalDateTime d02 = LocalDateTime.now(); // data e hora lolal
        Instant d03 = Instant.now(); // zulu time GMT

        LocalDate d04 = LocalDate.parse("2022-07-20");
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
        Instant d07 = Instant.parse("2022-07-20T01:30:26-03:00");

        LocalDate d08 = LocalDate.parse("20/07/2022", fmt1);
        LocalDateTime d09 = LocalDateTime.parse("20/03/2022 01:30", fmt2);
        LocalDate d10= LocalDate.parse("20/07/2022", DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        LocalDate d11 = LocalDate.of(2022, 7, 20);
        LocalDateTime d12 = LocalDateTime.of(2022, 7, 20, 1, 30);

        String d13 = d01.format(fmt3);

        LocalDate d14 = LocalDate.now();

        System.out.println("d01 = " + d01.toString());
        System.out.println("d02 = " + d02);
        System.out.println("d03 = " + d03);
        System.out.println("d04 = " + d04);
        System.out.println("d05 = " + d05);
        System.out.println("d06 = " + d06);
        System.out.println("d07 = " + d07);
        System.out.println("d08 = " + d08);
        System.out.println("d09 = " + d09);
        System.out.println("d10 = " + d10);
        System.out.println("d11 = " + d11);
        System.out.println("d12 = " + d12);
        System.out.println("d13 = " + d13);
        System.out.println("d14 = " + d14.format(fmt1));
        System.out.println("fmt3 = " + fmt3.format(d06));




        sc.close();
    }
}
