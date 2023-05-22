package Office_project;

import java.time.LocalDate;
import java.util.ArrayList;

public class Booking {

    private Employee employee;
    private LocalDate bookedDate;
    private MeetingRoom meetingroom;

    
    public Booking(Employee employee, LocalDate bookedDate, MeetingRoom meetingroom) {
        this.employee = employee;
        this.bookedDate = bookedDate;
        this.meetingroom = meetingroom;
    }

    
public Employee getEmployee() {
        return employee;
    }


    public void setEmployee(Employee employee) {
        this.employee = employee;
    }


    public LocalDate getBookedDate() {
        return bookedDate;
    }


    public void setBookedDate(LocalDate bookedDate) {
        this.bookedDate = bookedDate;
    }


    public MeetingRoom getMeetingroom() {
        return meetingroom;
    }


    public void setMeetingroom(MeetingRoom meetingroom) {
        this.meetingroom = meetingroom;
    }


    @Override
    public String toString() {
        return "Booking [employee=" + employee + ", bookedDate=" + bookedDate + ", meetingroom=" + meetingroom + "]";
    }
    


    

}
