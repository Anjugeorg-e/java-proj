package universityclass;

import java.util.ArrayList;

public class Faculty {

    private String facultyName;
    private int ID;
    ArrayList<Course> coursesTaught = new ArrayList<>();

    Faculty(String facultyName, int ID) {
        this.facultyName = facultyName;
        this.ID = ID;
    }

    public String getName() {
        return facultyName;
    }

    public void setName(String name) {
        this.facultyName = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        if (ID > 0) {
            ID = ID;
        }
    }

    public void addTaughtCourse(Course course) {
        coursesTaught.add(course);

    }

    public void removeTaughtCourse(Course course) {
        coursesTaught.remove(course);

    }

    public int noOfCOursesTaught() {
        return coursesTaught.size();
    }

    @Override
    public String toString() {
        return "Faculty [facultyName=" + facultyName + "]";
    }

}
