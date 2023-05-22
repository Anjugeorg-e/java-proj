package Office_project;

import java.io.EOFException;
import java.util.ArrayList;

public class Office {

    private String name;
    ArrayList<Employee> employeesList = new ArrayList<>();
    ArrayList<MeetingRoom> meetingRoomsList = new ArrayList<>();
    ArrayList<Project>projectList = new ArrayList<>();
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

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

}
