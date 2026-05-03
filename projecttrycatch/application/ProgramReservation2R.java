package projecttrycatch.application;

import projecttrycatch.model.entities.Reservation2R;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class ProgramReservation2R {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.print("Room number: ");
        int number = sc.nextInt();
        System.out.print("Check-in date (dd/MM/yyyy): ");
        LocalDate checkIn = LocalDate.parse(sc.next(),fmt1);
        System.out.print("Check-out date (dd/MM/yyyy): ");
        LocalDate checkOut = LocalDate.parse(sc.next(),fmt1);

        if(!checkOut.isAfter(checkIn)){
            System.out.println("Error in reservation: Check-out date must be after check-in date");
        }
        else{
            Reservation2R reservation = new Reservation2R(number,checkIn,checkOut);
            System.out.println("Reservation: " + reservation);

            System.out.println();
            System.out.print("Check-in date (dd/MM/yyyy): ");
            checkIn = LocalDate.parse(sc.next(),fmt1);
            System.out.print("Check-out date (dd/MM/yyyy): ");
            checkOut = LocalDate.parse(sc.next(),fmt1);


            String error = reservation.updateDates(checkIn,checkOut);
            if(error != null){
                System.out.println("error in reservation: " + error);
            }
            else {
                System.out.println("Reservation: " + reservation);
            }




        }

        sc.close();
    }
}
