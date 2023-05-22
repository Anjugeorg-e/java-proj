package Schoolsystem;

import java.util.ArrayList;

import javax.print.DocFlavor.STRING;

public class School {
    public static void main(String[] args) {

        ArrayList<Student>studentData = new ArrayList<>();

        
        Student student1 = new Student(6, "anju", 2, false);
        Student student2 = new Student(5, "jeo", 1, false);
        Student student3 = new Student(7, "mary", 3, true);

        
        studentData.add(student1);
        studentData.add(student2);
        studentData.add(student3);
        
        
        for(int i =0; i<studentData.size(); i++){
            System.out.println(studentData.get(i));
        }
        System.out.println(studentData);

        
        Teacher newstudent = new Teacher();
        newstudent.newirstGradeAdmission(6,"anjali");
        
        
        student1.firstTermMark(93, 93, 96);
        student1.secondTermMark(93,96, 92);
        student1.thirdTermMark(94, 99, 95);
        student1.PassCondition(true);;

        student1.languageSum();
        
        // Teacher newstud = new Teacher(5, "sam", 1, "nithya");
        // newstudent.firstTermMark(0, 0, 0);
        // newstud.PassCondition();
        
        student1.feesStructure(1, true);
        student2.feesStructure(2, false);
        student3.feesStructure(3, true);

        
    }
}
