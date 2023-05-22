package Office_project;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Employee {

    private String name;
    private int id;
    ArrayList<MeetingRoom> bookedRoomsListFromEmployee = new ArrayList<>();

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    // public boolean bookMeetingroom(MeetingRoom room, Office office, LocalDate date) {
    //     if (office.activateMeetingRoom(room) == false || room.bookedDates.contains(date)) {
    //         return false;
    //     }
    //     office.bookedRoomList.add(room);
    //     room.setAvailable(false);
    //     room.bookedDates.add(date);
    //     room.setDate(date.plusDays(1));
    //     return true;
    // }

    public boolean bookMeetingRoomTwo(MeetingRoom room, Office office, LocalDate date){
        boolean booked = false;
        if(office.activateMeetingRoom(room) == false || room.bookedDates.contains(date)){
            booked = false;
        }else{
        office.bookedRoomList.add(room);
        // office.totalBookings.add(b1);
        this.bookedRoomsListFromEmployee.add(room);
        // room.setAvailable(false);
        room.bookedDates.add(date);

        // Booking b1 = new Booking();`

        // b1.setRoom(room);
        // b1.setDate(date);
        // b1.setEmpName(this.getName());
        booked = true;
    }
    return booked;
    }

    public boolean clearMeetingRoomAfterMeeting(MeetingRoom room, Office office, LocalDate date) {
        if ((office.bookedRoomList.contains(room)) && (room.bookedDates.contains(date))) {
            office.bookedRoomList.remove(room);
            room.bookedDates.remove(date);
            room.setAvailable(true);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Employee [name=" + name + ", id=" + id + "]";
    }

}
