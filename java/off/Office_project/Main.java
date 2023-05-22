package Office_project;

import java.util.ArrayList;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DateTimeException;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws ParseException,DateTimeException {

        Office office = new Office();

        Employee anu = new Employee("Anu", 23);
        Employee ann = new Employee("ann", 32);

        Booking b1 = new Booking(1);
        Booking b2 = new Booking(2);
        Booking b3 = new Booking(3);

        office.addEmployee(ann);
        office.addEmployee(anu);

        MeetingRoom roomOne = new MeetingRoom(1);
        MeetingRoom roomTwo = new MeetingRoom(2);
        MeetingRoom roomThree = new MeetingRoom(3);
        
        roomOne.setAvailable(true);
        roomTwo.setAvailable(true);
        roomThree.setAvailable(true);
        roomOne.setUnderMaintance(false);
        roomTwo.setUnderMaintance(false);

        office.addMeetingRoomToOffice(roomOne);
        office.addMeetingRoomToOffice(roomTwo);
        office.addMeetingRoomToOffice(roomThree);

        // System.out.println("date of room to be booked "+roomOne.getDate());
        // System.out.println(" date of room to be free after the meeting "+roomOne.getdueDate());

        // System.out.println("available status before booking :  " + roomOne.isAvailable());
        // System.out.println(roomTwo.isAvailable());

        System.out.println("Booking status: " + anu.bookMeetingRoomTwo(roomOne, office, LocalDate.of(2023, 05, 04),b1));
        System.out.println("Booking status: " + ann.bookMeetingRoomTwo(roomTwo, office, LocalDate.of(2023, 05, 9),b2));
        // System.out.println("Booking status: " + anu.bookMeetingRoomTwo(roomThree, office, LocalDate.of(2023, 05, 04),b3));

        // System.out.println("room one availbility status after booking : " + roomOne.isAvailable());

        // System.out.println(office.activateMeetingRoom(roomOne));

        // System.out.println("booked rooms list: "+office.bookedRoomList);
        // office.BookingDetails(roomOne);
        // System.out.println(roomTwo.bookedDates);
        // System.out.println(roomOne.bookedDates);

        // System.out.println(roomOne.getDate());
        System.out.println(anu.clearMeetingRoomAfterMeeting(roomOne, office,LocalDate.of(2023, 05, 04)));
        System.out.println("Booking status: " + anu.bookMeetingRoomTwo(roomOne, office, LocalDate.of(2023, 05, 9),b3));
        // System.out.println("booked rooms list: "+office.bookedRoomList);

       office.employeeBookingDetails(anu);

       System.out.println(b1);
    //    System.out.println(b2);
       System.out.println("Total bookings happened: " + office.totalBookings);
    }
}
