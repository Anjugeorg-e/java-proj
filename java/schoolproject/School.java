package schoolproject;

import java.util.ArrayList;

public class School {

    private String schoolName;
    private String principalName;
    private double feeToBePayed;
    private double discount;
    private final double firstGradeFees = 20000;
    private final double secondAndThirdGradeFees = 30000;

    ArrayList<Student> listOfStudents = new ArrayList<>();
    ArrayList<Grade> listOfGrades = new ArrayList<>();
    ArrayList<String> listOfTeachers = new ArrayList<>();
    ArrayList<Student> finishedStudents = new ArrayList<>();
    ArrayList<Student> notPaidStudents = new ArrayList<>();
    ArrayList<Student> failedStudentsList = new ArrayList<>();
    ArrayList<Student> passedStudentsList = new ArrayList<>();

    public String getPrincipalName() {
        return principalName;
    }

    public void setPrincipalName(String principalName) {
        this.principalName = principalName;
    }

    public void addDivisionToSChool(Grade grade) {
        this.listOfGrades.add(grade);
    }

    public void replaceClassTeacher(Grade grade, String teacherName) {
        grade.setTeacherName(teacherName);
    }

    public boolean admitStudentToGrade(Student student, Grade grade) {
        boolean admitted = false;
        if (student.getAge() >= 5 && student.getGradeName() == grade.getGradeName()) {
            grade.listOfStudents.add(student);
            this.listOfStudents.add(student);
            admitted = true;
        } else {
            admitted = false;
        }
        return admitted;

    }

    public double feeDiscountCriteria(Student student) {
        if ((student.isSingleParent() == true) && (student.getGradeName() == 1)) {
            discount = 0.2 * firstGradeFees;
            feeToBePayed = firstGradeFees - discount;

        } else if ((student.isSingleParent() == false) && (student.getGradeName() == 1)) {
            feeToBePayed = firstGradeFees;

        } else if ((student.isSingleParent() == true)
                && (student.getGradeName() == 2 || (student.getGradeName() == 3))) {
            discount = 0.2 * secondAndThirdGradeFees;
            feeToBePayed = secondAndThirdGradeFees - discount;
        } else if ((student.isSingleParent() == false)
                && (student.getGradeName() == 2 || (student.getGradeName() == 3))) {
            feeToBePayed = secondAndThirdGradeFees;
        }
        return feeToBePayed;
    }

    public void notifyParentAboutFees(Student student) {
        if (student.isPaid() == true) {
            System.out.println("Student has paid complete Fees");
        } else {
            System.out.println("Please  pay the fees. Still fees is not paid.");
        }
    }

    public void passStudentToNextGrade(Student student, Grade grade) {
        if (grade.listOfStudents.contains(student)) {
            if (grade.isEligibleForNextGrade(student)) {
                student.setGradeName(student.getGradeName() + 1);
                if (student.getGradeName() > 3) {
                    finishedStudents.add(student);
                    grade.listOfStudents.remove(student);
                    passedStudentsList.add(student);

                } else {
                    grade.listOfStudents.remove(student);
                    passedStudentsList.add(student);
                }

            } else {
                failedStudentsList.add(student);
            }
        }

    }

    public void pendingFeeStudents() {
        for (Student student : listOfStudents) {
            if (student.isPaid() == false) {
                System.out.println("Pending feelist: " + student);
            }

        }
    }

}
