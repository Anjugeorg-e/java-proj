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

        office.addEmployee(ann);
        office.addEmployee(anu);

        MeetingRoom roomOne = new MeetingRoom(office, 1, "roomOne");
        MeetingRoom roomTwo = new MeetingRoom(office,2,"roomTwo");

        office.addMeetingRoomToOffice(roomOne);
        office.addMeetingRoomToOffice(roomTwo);
        office.addEmployee(ann);
        office.addEmployee(anu);
        
        roomOne.setRoomAvailable(true);
        roomTwo.setRoomAvailable(true);

        System.out.println("is bokkable :"+ roomOne.isBookable(LocalDate.of(2023,5,12)));

        roomOne.book(ann, LocalDate.of(2023, 5, 12));
        System.out.println("is bokkable :"+ roomOne.isBookable(LocalDate.of(2023,5,12)));

        System.out.println(roomOne.bookingList);
        roomOne.book(anu, LocalDate.of(2023, 5, 13));
        System.out.println(roomOne.bookingList);
        System.out.println(roomTwo.bookingList);
       

    
    }
}
