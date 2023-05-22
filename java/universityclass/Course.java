package universityclass;

import java.util.ArrayList;

public class Course {

    private String courseName;
    private Faculty facultyMember;
    ArrayList<Student> enrolledStudentsInCourse = new ArrayList<>();

    Course(String courseName, Faculty facultyMember) {
        this.courseName = courseName;
        this.facultyMember = facultyMember;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setFacultyMember(Faculty facultyMember) {
        this.facultyMember = facultyMember;
    }

    public Faculty getFacultyMember() {
        return facultyMember;
    }

    public void addStudentToCourse(Student student) {
        enrolledStudentsInCourse.add(student);

    }

    public void removeStudentFromCourse(Student student) {
        enrolledStudentsInCourse.remove(student);

    }

    public int noOfEnrolledStudentsInCourse() {
        return enrolledStudentsInCourse.size();
    }

    @Override
    public String toString() {
        return "Course [courseName=" + courseName + "," + facultyMember + "]";
    }

    public double averageGradeOfStudentsInCourse() {

        double average = 0;
        double total = 0;
        for (Student student : enrolledStudentsInCourse) {

            total += student.getMark();
            average = total / noOfEnrolledStudentsInCourse();
        }

        // return total;
        return average;
    }

}
