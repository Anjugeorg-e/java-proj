package schoolproject;

import java.util.ArrayList;

import javax.lang.model.util.ElementScanner6;

public class Grade {

    private int gradeName;
    private String teacherName;
    private int fees;
    private int noOfStudents;
    private double classAverageMark;

    ArrayList<Student> listOfStudents = new ArrayList<>();
    ArrayList<String> subjects = new ArrayList<>();
    ArrayList<Student> EligibleStudents = new ArrayList<>();

    Grade(int gradeName, String teacherName) {
        this.gradeName = gradeName;
        this.teacherName = teacherName;

    }

    public int getGradeName() {
        return gradeName;
    }

    public void setGradeName(int gradeName) {
        if (gradeName > 0 && gradeName < 4) {
            this.gradeName = gradeName;
        }
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public void addSubjectInGrade(String subject) {
        subjects.add(subject);
    }

    public void setFirsTermMarkOfStudent(Student student, double language, double drawing, double craft) {
        student.fistTermMark.add(language);
        student.fistTermMark.add(drawing);
        student.fistTermMark.add(craft);

    }

    public void setSecondTermMarkOfStudent(Student student, double language, double drawing, double craft) {
        student.secondTermMark.add(language);
        student.secondTermMark.add(drawing);
        student.secondTermMark.add(craft);
    }

    public void setThirdTermMarkOfStudent(Student student, double language, double drawing, double craft) {
        student.thirdTermMark.add(language);
        student.thirdTermMark.add(drawing);
        student.thirdTermMark.add(craft);
    }

    public void updateMarkOfStudent(Student student, int term, double mark, int idx) {
        if (listOfStudents.contains(student)) {

            if (term == 1) {
                student.fistTermMark.set(idx, mark);
                System.out.println(student.fistTermMark);
            } else if (term == 2) {
                student.secondTermMark.set(idx, mark);
            } else {
                student.thirdTermMark.set(idx, mark);
            }
        } else {
            System.out.println("Student is not present in this grade ");
        }
    }

    public boolean isEligibleForNextGrade(Student student) {
        boolean eligible = false;
        if (student.languageAverageMark() >= 50 && student.craftAverageMark() >= 50
                && student.drrawingAverageMark() >= 50 && student.isPaid() == true) {
            this.EligibleStudents.add(student);
            eligible = true;
        } else {
            eligible = false;
        }
        return eligible;
    }

    public int noOfStudentsInGrade() {
        return listOfStudents.size();

    }

}
