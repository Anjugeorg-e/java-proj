package Office_project;

import java.util.ArrayList;

public class Office {

    private String name;
    ArrayList<Employee> employeesList = new ArrayList<>();
    ArrayList<MeetingRoom> meetingRoomsList = new ArrayList<>();
    ArrayList<Project> projectList = new ArrayList<>();

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

    public void addNewProject(Project project) {
        this.projectList.add(project);
    }

    public void listOfEmployeesWithoutProject() {
        for (int i = 0; i < employeesList.size(); i++) {
            if (employeesList.get(i).getProject() == null) {
                System.out.println(" list of employees without project: " + employeesList.get(i));
            }
        }
    }
}
