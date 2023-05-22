package Office_project;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DateTimeException;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws ParseException, DateTimeException {

        Office office = new Office();

        Employee anu = new Employee("Anu", 23);
        Employee ann = new Employee("ann", 32);

        Employee sam = new Employee("sam", 24);
        Employee manu = new Employee("manu", 25);

        Employee john = new Employee("John", 43);
        office.addEmployee(ann);
        office.addEmployee(anu);
        office.addEmployee(manu);
        office.addEmployee(sam);

        MeetingRoom roomOne = new MeetingRoom(office, 1, "roomOne");
        MeetingRoom roomTwo = new MeetingRoom(office, 2, "roomTwo");

        office.addMeetingRoomToOffice(roomOne);
        office.addMeetingRoomToOffice(roomTwo);

        roomOne.setRoomAvailable(true);
        roomTwo.setRoomAvailable(true);

        roomOne.book(ann, LocalDate.of(2023, 5, 12));
        System.out.println("is bokkable :" + roomOne.isBookable(LocalDate.of(2023, 5, 12)));

        roomOne.book(anu, LocalDate.of(2023, 5, 13));
        System.out.println(roomOne.bookingList);
        System.out.println(roomTwo.bookingList);

        Project pilar = new Project("pilar", sam);
        Project azure = new Project("azure", manu);

        pilar.setStatus("testing");
        azure.setStatus("development");
        System.out.println(pilar.getStatus());
        System.out.println(azure.getStatus());

        pilar.addEmployeeToProject(anu);
        pilar.addEmployeeToProject(ann);
        azure.addEmployeeToProject(manu);

        azure.setProjectHead(sam);
        pilar.setProjectHead(john);
        // System.out.println("pilar members: " + pilar.projectMembers);

        // azure.addEmployeeToProject(anu);
        // System.out.println("azure members: " + azure.projectMembers);

        // office.listOfEmployeesWithoutProject();

        Technology html = new Technology("html", "frontend");
        Technology java = new Technology("java", "backend");
        html.addTechnologyToProject(azure);
        java.addTechnologyToProject(azure);
        System.out.println(azure.technologiesUsed);

        // anu.setTechnologyKnowledge("low", html);
        // html.addTechnologyExpertise(anu);
        // System.out.println(anu.getTechExpertise());

        ann.techExpertise.put(html, 5);
        ann.techExpertise.put(java, 1);
        anu.techExpertise.put(java, 5);
        anu.techExpertise.put(html, 2);
        System.out.println(anu.getTechExpertise());
        System.out.println(ann.getTechExpertise());
        System.out.println(ann.getTechExpertise().get(java));

        System.out.println("pilar members: " + pilar.projectMembers);

        // azure.addEmployeeToProject(anu);
        System.out.println("azure members: " + azure.projectMembers);
    }
}
