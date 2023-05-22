package universityclass;

import java.util.ArrayList;

public class Department {

    private String departmentName;
    ArrayList<Faculty> listOfFacultyMembersInDepartment = new ArrayList<>();
    ArrayList<Course> coursesInDepartment = new ArrayList<>();
    private Course course;

    Department(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void addFacultyMemberInDepartment(Faculty faculty) {
        listOfFacultyMembersInDepartment.add(faculty);

    }

    public void removeFacultyMemberInDepartment(Faculty faculty) {
        listOfFacultyMembersInDepartment.remove(faculty);

    }

    public void addCoursesInDepartment(Course course) {
        coursesInDepartment.add(course);

    }

    public void removeCoursesInDepartment(Course course) {
        coursesInDepartment.remove(course);

    }

    // public boolean getCourseFromDepartment(String course) {
    // boolean hasCourse = false;
    // for (Course courses : coursesInDepartment) {
    // if (courses.getCourseName() == course) {
    // hasCourse = true;
    // }
    // }
    // return hasCourse;
    // }

    public Course getCourseFromDepartment(String coursetobefind) {
        for (Course courses : coursesInDepartment) {
            if (courses.getCourseName() == coursetobefind) {
                course = courses;
            }
        }
        return course;
    }

    @Override
    public String toString() {
        return "Department [departmentname=" + departmentName + "]";
    }

}
