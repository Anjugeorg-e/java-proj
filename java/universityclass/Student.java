package universityclass;

import java.util.ArrayList;

public class Student {

    private String studentName;
    private int ID;
    ArrayList<Course> coursesEnrolled = new ArrayList<>();
    private double mark;

    Student(String studentName, int ID) {
        this.studentName = studentName;
        this.ID = ID;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        if (mark > 0 && mark < 10) {

            this.mark = mark;
        }
    }

    public void setName(String name) {
        this.studentName = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        if (ID > 0) {
            ID = ID;
        }
    }

    public ArrayList<Course> getCourses() {
        return coursesEnrolled;
    }

    public boolean addStudentCourse(Course course) {
        coursesEnrolled.add(course);
        return true;

    }

    public boolean removeStudentCourse(Course course) {
        coursesEnrolled.remove(course);
        return true;
    }

    public int noOfCoursesEnrolled() {
        return coursesEnrolled.size();
    }

    @Override
    public String toString() {
        return "Student [studentName=" + studentName + ", ID=" + ID + "]";
    }

}
