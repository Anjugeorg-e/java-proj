package schoolproject;

import java.beans.Transient;

public class Main {

    public static void testSetGrade() {

        Grade grade1 = new Grade(1, "Ramya");

        int given;
        int expected;
        int got;

        // test case1
        given = 2;
        expected = 2;
        grade1.setGradeName(given);
        got = grade1.getGradeName();
        assert (got == expected) : "setgradename : Test 1 failed,  exp: " + expected + " but got: " + got;

        // test case2
        given = -1;
        grade1.setGradeName(given);
        got = grade1.getGradeName();
        assert (got == expected) : "setgradename  : Test 2 failed,  exp: " + expected + " but got: " + got;

        // test case 3
        given = 4;
        grade1.setGradeName(given);
        got = grade1.getGradeName();
        assert (got == expected) : "setgradename  : Test 3 failed,  exp: " + expected + " but got: " + got;

    }

    public static void testAdmitStudentToGrade() {

        Student ann = new Student("ann", 6, "Female", 1);
        Student john = new Student("john", 3, "Male", 1);
        Grade grade1 = new Grade(1, "Ramya");
        School school = new School();
        Grade grade2 = new Grade(2, "Paul");
        boolean given;
        boolean expected;
        boolean got;

        // test case1
        expected = true;
        got = school.admitStudentToGrade(ann, grade1);
        assert (got == expected) : "admit student  : Test 1 failed,  exp: " + expected + " but got: " + got;

        // test case2
        expected = false;
        got = school.admitStudentToGrade(john, grade1);
        assert (got == expected) : "admit student  : Test 2 failed,  exp: " + expected + " but got: " + got;

    }

    public static void testFeeDiscountCriteria() {
        Student ann = new Student("ann", 6, "Female", 2);
        ann.setSingleParent(false);
        Grade grade1 = new Grade(1, "Ramya");
        School school = new School();
        Student John = new Student("JOhn", 6, "Male", 3);
        Grade grade3 = new Grade(3, "Nivya");
        John.setSingleParent(true);

        double given;
        double expected;
        double got;

        // test case1

        expected = 30000;
        got = school.feeDiscountCriteria(ann);
        assert (got == expected) : "fee criteria  : Test 1 failed,  exp: " + expected + " but got: " + got;

        // test case 2
        expected = 24000;
        got = school.feeDiscountCriteria(John);
        assert (got == expected) : "fee criteria  : Test 2 failed,  exp: " + expected + " but got: " + got;

    }

    public static void testReplacePrincipal() {
        School school = new School();

        String given;
        String expected;
        String got;

        // test case1
        given = "Ram";
        expected = "Ram";
        school.setPrincipalName(given);
        got = school.getPrincipalName();
        assert (got == expected) : "replace principal name  : Test 1 failed,  exp: " + expected + " but got: " + got;

    }

    public static void testChangeClassTeacher() {
        School school = new School();
        Grade grade1 = new Grade(1, "Ramya");
        String given;
        String expected;
        String got;

        // test case1
        given = "Ram";
        expected = "Ram";
        school.replaceClassTeacher(grade1, given);
        got = grade1.getTeacherName();
        assert (got == expected) : "replace teacher name  : Test 1 failed,  exp: " + expected + " but got: " + got;

    }

    public static void testNoOfStudentsInGrade() {

        Student anu = new Student("anu", 5, "Female", 1);
        Student ann = new Student("ann", 6, "Female", 2);
        Grade grade1 = new Grade(1, "Ramya");
        Grade grade2 = new Grade(2, "Sam");
        School school = new School();
        school.admitStudentToGrade(anu, grade1);
        int given;
        int expected;
        int got;

        // test case1

        expected = 1;
        got = grade1.noOfStudentsInGrade();
        assert (got == expected) : "no of students in a grade  : Test 1 failed,  exp: " + expected + " but got: " + got;

        // test case2
        expected = 0;
        got = grade2.noOfStudentsInGrade();
        assert (got == expected) : "no of students in a grade  : Test 2 failed,  exp: " + expected + " but got: " + got;

    }

    public static void testIsEligibleForNextGrade() {
        Student anu = new Student("anu", 5, "Female", 1);
        Grade grade1 = new Grade(1, "Ramya");
        School school = new School();
        school.admitStudentToGrade(anu, grade1);

        grade1.setFirsTermMarkOfStudent(anu, 99, 88, 97);
        grade1.setSecondTermMarkOfStudent(anu, 89, 98, 99);
        grade1.setThirdTermMarkOfStudent(anu, 98, 95, 89);

        boolean given;
        boolean expected;
        boolean got;

        // test case1
        given = true;
        anu.setPaid(given);
        expected = true;
        got = grade1.isEligibleForNextGrade(anu);
        assert (got == expected) : "IsEligile for next grade  : Test 1 failed,  exp: " + expected + " but got: " + got;

        // test case2
        given = false;
        expected = false;
        anu.setPaid(given);
        got = grade1.isEligibleForNextGrade(anu);
        assert (got == expected) : " IsEligile for next grade  : Test 2 failed,  exp: " + expected + " but got: " + got;

    }

    public static void main(String[] args) {

        Student ann = new Student("ann", 6, "Female", 2);
        ann.setSingleParent(true);
        Student John = new Student("John", 7, "Male", 1);
        John.setSingleParent(false);
        Student anu = new Student("anu", 5, "Female", 1);
        anu.setSingleParent(false);
        anu.setPaid(true);
        ann.setPaid(false);
        John.setPaid(true);

        Grade grade1 = new Grade(1, "Ramya");
        Grade grade2 = new Grade(2, "rama");
        Grade grade3 = new Grade(3, "Nivya");
        School school = new School();

        school.replaceClassTeacher(grade1, "niya");
        school.setPrincipalName("Ram");

        school.admitStudentToGrade(anu, grade1);
        school.admitStudentToGrade(ann, grade2);
        school.admitStudentToGrade(John, grade1);

        System.out.println(grade1.listOfStudents);
        grade1.setFirsTermMarkOfStudent(anu, 99, 88, 97);
        grade1.setSecondTermMarkOfStudent(anu, 89, 98, 99);
        grade1.setThirdTermMarkOfStudent(anu, 98, 95, 89);
        grade1.updateMarkOfStudent(anu, 1, 87, 2);
        school.passStudentToNextGrade(anu, grade1);

        System.out.println("students in school: " + school.listOfStudents);
        System.out.println("passed students in the current year: " + school.passedStudentsList);

        testSetGrade();
        testAdmitStudentToGrade();
        testFeeDiscountCriteria();
        testNoOfStudentsInGrade();
        testReplacePrincipal();
        testChangeClassTeacher();
        testIsEligibleForNextGrade();

        System.out.println("Test cases passed");
    }

}
