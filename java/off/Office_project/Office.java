package Office_project;

import java.io.EOFException;
import java.util.ArrayList;

public class Office {

    ArrayList<Employee> employeesList = new ArrayList<>();
    ArrayList<MeetingRoom> meetingRoomsList = new ArrayList<>();
    ArrayList<MeetingRoom>bookedRoomList = new ArrayList<>();
    // ArrayList<Object> BookedRoomList = new ArrayList<>();
    
    ArrayList<Booking>totalBookings = new ArrayList<>();
    
    public void addMeetingRoomToOffice(MeetingRoom room) {
        this.meetingRoomsList.add(room);
    }

    public void removeMeetingRoomFromOffice(MeetingRoom room) {
       this.meetingRoomsList.remove(room);
    }

    public void addEmployee(Employee employee) {
       this.employeesList.add(employee);
    }

    public void removeEmployee(Employee employee) {
       this.employeesList.remove(employee);
    }

    public void checkRoomAvailbilty(MeetingRoom room) {
        if (bookedRoomList.contains(room)) {
            System.out.println("room is already booked");
        } else {
            System.out.println("room is available for booking ");
        }
    }

    public boolean activateMeetingRoom(MeetingRoom room) {
        if (room.isAvailable() == true && room.isUnderMaintance() == false) {
            return true;
        }
        return false;
    }

    public boolean deactivateMeetingRoom(MeetingRoom room) {
        if (room.isAvailable() == false || bookedRoomList.contains(room) || room.isUnderMaintance() == true) {
            return true;
        }
        return false;
    }

    // public void BookingDetails(MeetingRoom room) {
    //     for (int i = 0; i < bookedRoomList.size(); i++) {
    //         if (bookedRoomList.contains(room)) {
    //             System.out.println("booked details : " + bookedRoomList.get(i));
    //         }
    //     }
    // }

    public void employeeBookingDetails(Employee employee) {
        if (employeesList.contains(employee)) {
            System.out.println(employee.bookedRoomsListFromEmployee);

        }
    }
}
