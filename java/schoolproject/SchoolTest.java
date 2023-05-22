package schoolproject;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class SchoolTest {

    @Test
    public void testSetPrincipalName() {
        School school = new School();
        school.setPrincipalName("Ram");
        assertEquals("Ram", school.getPrincipalName());

    }

    @Test
    public void testReplaceClassTeacher() {
        School school = new School();
        Grade grade1 = new Grade(1, "Rama");
        school.replaceClassTeacher(grade1, "sam");

        assertEquals("sam", grade1.getTeacherName());
    }

    @Test
    public void testAdmitStudentToGradeWithCorrectAge() {
        Student anu = new Student("Anu", 5, "Female", 1);
        Grade grade1 = new Grade(1, "Maya");
        School school = new School();

        assertEquals(true, school.admitStudentToGrade(anu, grade1));

    }

    @Test
    public void testAdmitStudentToGradeWithLessAge() {
        Student anu = new Student("Anu", 3, "Female", 1);
        Grade grade1 = new Grade(1, "Maya");
        School school = new School();

        assertEquals(false, school.admitStudentToGrade(anu, grade1));

    }

    @Test
    public void testFeeDiscountCriteriaOfSingleParentStudent() {
        Student anu = new Student("Anu", 3, "Female", 1);
        anu.setSingleParent(true);
        Grade grade1 = new Grade(1, "Maya");
        School school = new School();
        school.admitStudentToGrade(anu, grade1);

        Double got;
        Double expected;
        expected= 16000.0;
        got=school.feeDiscountCriteria(anu);
        assertEquals(expected, got);

    }
    @Test
    public void testFeeDiscountCriteriaOfNotSingleParentStudent() {
        Student anu = new Student("Anu", 3, "Female", 1);
        anu.setSingleParent(false);
        Grade grade1 = new Grade(1, "Maya");
        School school = new School();
        school.admitStudentToGrade(anu, grade1);

        Double got;
        Double expected;
        expected= 20000.0;
        got=school.feeDiscountCriteria(anu);
        assertEquals(expected, got);

    }
}
