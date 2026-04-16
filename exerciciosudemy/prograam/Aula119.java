package exerciciosudemy.prograam;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Aula119 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        LocalDate d01 = LocalDate.parse("2022-07-20");

        LocalDateTime d02 = LocalDateTime.parse("2022-07-20T01:30:26");

        Instant d03 = Instant.parse("2022-07-20T01:30:26Z");

        LocalDate d04 = LocalDate.ofInstant(d03, ZoneId.systemDefault());
        LocalDate d05 = LocalDate.ofInstant(d03, ZoneId.of("Europe/Paris"));

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/HH/yyyy HH:mm").withZone(ZoneId.systemDefault());
        DateTimeFormatter fmt4 = DateTimeFormatter.ofPattern("dd/HH/yyy HH:mm").withZone((ZoneId.of("Portugal")));
        DateTimeFormatter fmt5 = DateTimeFormatter.ISO_DATE_TIME;
        DateTimeFormatter fmt6 = DateTimeFormatter.ISO_INSTANT;

        System.out.println("d01 = " + d01);
        System.out.println("d01 = " + d01.format(fmt1));
        System.out.println("d01 = " + fmt1.format(d01));
        System.out.println("d01 = " + d01.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.println("d02 = " + d02.format(fmt2));
        System.out.println("d03 = " + fmt3.format(d03)); // obs: o instant não tem o método formmat
        System.out.println("d03 = " + d03);
        System.out.println("d02 = " + fmt5.format(d02));
        System.out.println("d03 = " + fmt6.format(d03));
        System.out.println("d04 = " + d04);
        System.out.println("d05 = " + d05);
        System.out.println("d05 mes = " + d05.getMonthValue());
        System.out.println("d05 dia do mes= " + d05.getDayOfMonth());
        System.out.println("d05 ano = " + d05.getYear());
        System.out.println("d05 dia do ano = " + d05.getDayOfYear());
        sc.close();
    }
}
