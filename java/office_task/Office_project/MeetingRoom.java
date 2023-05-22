package Office_project;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class MeetingRoom {

    private Office office;
    private int roomId;
    private String name;
    private boolean isRoomAvailable;
    ArrayList<Booking> bookingList = new ArrayList<>();

    public MeetingRoom(Office office, int roomId, String name) {
        this.office = office;
        this.roomId = roomId;
        this.name = name;
    }
    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
     

    public boolean isRoomAvailable() {
        return isRoomAvailable;
    }

    public void setRoomAvailable(boolean isRoomAvailable) {
        this.isRoomAvailable = isRoomAvailable;
    }

    public boolean isBookable(LocalDate date) {
        boolean booked= true;
        for (Booking existingBooking: this.bookingList) {
            if (existingBooking.getBookedDate().compareTo(date) == 0) {
               booked= false;
            }
            
        }
        return booked;
        
    }

    public boolean book(Employee employee, LocalDate date) {
        if (!this.isRoomAvailable()) {
            return false;
        }

        if (!this.office.meetingRoomsList.contains(this)) {
            return false;
        }

        if (!this.isBookable(date)){
            return false;
        }

        Booking booking = new Booking(employee, date, this);
        this.bookingList.add(booking);

        return true;
    }



    @Override
    public String toString() {
        return "MeetingRoom [roomId=" + roomId + ", name=" + name + ", isRoomAvailable=" + isRoomAvailable + "]";
    }



}
