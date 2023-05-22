package Office_project;

import java.time.LocalDate;
import java.util.ArrayList;

public class Booking {
    int bookingId;
    String empName;
    MeetingRoom room;
    LocalDate date;

    
    public Booking() {
    }

    public Booking(int bookingId) {
        this.bookingId = bookingId;
    }

    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public MeetingRoom getRoom() {
        return room;
    }

    public void setRoom(MeetingRoom room) {
        this.room = room;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    @Override
    public String toString() {
        return "[bookingId=" + bookingId + ", empName=" + empName + ", room=" + room + ", date=" + date + "]";
    }

}
