package projecttrycatch.model.entities;

import projecttrycatch.model.exceptions.DomainException2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Reservation2B {
    private Integer roomNumber;
    private LocalDate checkIn;
    private LocalDate checkOut;

    private static DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    // A GENTE DEVE TRATAR O ERRO OU PROPAGAR - NESSE CASO IREMOS PROPAGAR - QUEM VAI TRATAR O ERRO É O PROGRAMA PRINCIPAL
    public Reservation2B(Integer roomNumber, LocalDate checkIn, LocalDate checkOut){
        if(!checkOut.isAfter(checkIn)){ // PROGRAMAÇÃO DEFENSIVA - BOAS PRATICAS
            throw new DomainException2("Error in reservation: Check-out date must be after check-in date");
        }
        this.roomNumber = roomNumber;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public LocalDate getCheckIn() {
        return checkIn;
    }

    public LocalDate getCheckOut() {
        return checkOut;
    }

    public long duration(){
        return ChronoUnit.DAYS.between(checkIn,checkOut);
    }

    public void updateDates(LocalDate checkIn,LocalDate checkOut){

        if(checkIn.isBefore(LocalDate.now()) || checkOut.isBefore(LocalDate.now())){
            throw new DomainException2("Reservation dates for update must be future dates");
        }

        this.checkIn = checkIn;
        this.checkOut = checkOut;

    }

    @Override
    public String toString(){
        return "Room " +
                roomNumber +
                ", check-in: " +
                checkIn.format(fmt1) +
                ", check-out: " +
                checkOut.format(fmt1) +
                ", " +
                duration() +
                " nights";


    }
}
