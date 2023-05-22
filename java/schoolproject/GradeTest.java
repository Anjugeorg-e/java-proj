package schoolproject;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GradeTest {
    @Test
    public void testGetGradeNameAsOne() {

        Grade grade = new Grade(1, "Sam");
        grade.setGradeName(1);
        assertEquals(1, grade.getGradeName());
    }

    @Test
    public void testGetGradeNameAsNegative() {
        Grade grade = new Grade(1, "Sam");
        grade.setGradeName(-1);
        assertEquals(1, grade.getGradeName());
    }

    @Test
    public void testGetGradeNameAsMoreThanThree() {
        Grade grade = new Grade(1, "Sam");
        grade.setGradeName(4);
        assertEquals(1, grade.getGradeName());
    }

    @Test
    public void testIsEligibleForNextGradeOfStudentWithHighSCore() {
        Student anu = new Student("Anu", 5, "Female", 1);
        Grade grade1 = new Grade(1, "Maya");
        anu.setPaid(true);
        grade1.setFirsTermMarkOfStudent(anu, 73, 82, 99);
        grade1.setSecondTermMarkOfStudent(anu, 75, 88, 85);
        grade1.setThirdTermMarkOfStudent(anu, 99, 87, 91);

        assertEquals(true, grade1.isEligibleForNextGrade(anu));

    }

    @Test
    public void testIsEligibleForNextGradeOfStudentWithLOwSCore() {
        Student anu = new Student("Anu", 5, "Female", 1);
        Grade grade1 = new Grade(1, "Maya");
        anu.setPaid(true);
        grade1.setFirsTermMarkOfStudent(anu, 13, 52, 49);
        grade1.setSecondTermMarkOfStudent(anu, 35, 28, 33);
        grade1.setThirdTermMarkOfStudent(anu, 49, 87, 54);

        assertEquals(false, grade1.isEligibleForNextGrade(anu));

    }

    @Test
    public void testIsEligibleForNextGradeOfStudentWithHigScoreWithoutPayingFees() {
        Student anu = new Student("Anu", 5, "Female", 1);
        Grade grade1 = new Grade(1, "Maya");
        anu.setPaid(false);
        grade1.setFirsTermMarkOfStudent(anu, 83, 82, 89);
        grade1.setSecondTermMarkOfStudent(anu, 95, 98, 98);
        grade1.setThirdTermMarkOfStudent(anu, 85, 87, 79);

        assertEquals(false, grade1.isEligibleForNextGrade(anu));

    }

    @Test
    public void testNoOfStudentsInGradeWithOneStudent() {
        Student anu = new Student("Anu", 5, "Female", 1);
        Grade grade1 = new Grade(1, "Maya");
        School school = new School();
        school.admitStudentToGrade(anu, grade1);

        assertEquals(1, grade1.noOfStudentsInGrade());
    }

    @Test
    public void testNoOfStudentsInGradeWithNoStudent() {
        Student anu = new Student("Anu", 5, "Female", 1);
        Grade grade1 = new Grade(1, "Maya");
        School school = new School();

        assertEquals(0, grade1.noOfStudentsInGrade());
    }

    @Test
    public void testSetGradeNameBetweenOneAndThree() {
        Grade grade1 = new Grade(1, "Maya");
        grade1.setGradeName(1);

        assertEquals(1, grade1.getGradeName());

    }

    @Test
    public void testSetGradeNameLessThanOne() {
        Grade grade1 = new Grade(1, "Maya");
        grade1.setGradeName(0);

        assertEquals(1, grade1.getGradeName());

    }

    @Test
    public void testSetGradeNameMoreThanThree() {
        Grade grade1 = new Grade(1, "Maya");
        grade1.setGradeName(4);

        assertEquals(1, grade1.getGradeName());

    }

    @Test
    public void testUpdateMarkOfStudent() {
        Student anu = new Student("Anu", 5, "Female", 1);
        Grade grade1 = new Grade(1, "Maya");
        School school = new School();
        school.admitStudentToGrade(anu, grade1);
        grade1.setFirsTermMarkOfStudent(anu, 83, 82, 89);
        grade1.updateMarkOfStudent(anu, 1, 87, 1);

        double mark = anu.fistTermMark.get(1);
        assertEquals(87, (int) mark);

    }
}
