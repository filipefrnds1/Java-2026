package projecttrycatch.model.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Reservation2R {

    private Integer roomNumber;
    private LocalDate checkIn;
    private LocalDate checkOut;

    private static DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Reservation2R(Integer roomNumber, LocalDate checkIn, LocalDate checkOut) {
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

    public String updateDates(LocalDate checkIn,LocalDate checkOut){
        if(checkIn.isBefore(LocalDate.now()) || checkOut.isBefore(LocalDate.now())){
            return "Error in reservation: Reservation dates for update must be future dates";
        }
        if(!checkOut.isAfter(checkIn)){
            return "Error in reservation: Check-out date must be after check-in date";
        }
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        return null;
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
