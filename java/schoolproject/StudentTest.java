package schoolproject;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

public class StudentTest {

    @Test
    public void testGetGenderFemale() {
        Student anu = new Student("Anu", 5, "Female", 1);
        assertEquals("Female", anu.getGender());
    }

    @Test
    public void testGetGenderMale() {
        Student sam = new Student("Sam", 5, "Male", 1);
        assertEquals("Male", sam.getGender());
    }

    @Test
    public void testGetGradeName() {
        Student anu = new Student("Anu", 5, "Female", 1);
        assertEquals(1, anu.getGradeName());
    }

    @Test
    public void testGetName() {
        Student anu = new Student("Anu", 5, "Female", 1);
        assertEquals("Anu", anu.getName());
    }

    @Test
    public void testSetPaidAsTrue() {
        Student anu = new Student("Anu", 5, "Female", 1);
        anu.setPaid(true);
        assertEquals(true, anu.isPaid());
    }

    @Test
    public void testSetPaidAsFalse() {
        Student anu = new Student("Anu", 5, "Female", 1);
        anu.setPaid(false);
        assertEquals(false, anu.isPaid());
    }

    @Test
    public void testSetSingleParentAsTrue() {
        Student anu = new Student("Anu", 5, "Female", 1);
        anu.setSingleParent(true);
        assertEquals(true, anu.isSingleParent());
    }

    @Test
    public void testSetSingleParentAsFalse() {
        Student anu = new Student("Anu", 5, "Female", 1);
        anu.setSingleParent(false);
        assertEquals(false, anu.isSingleParent());
    }

    @Test
    public void testLanguageAverageMark() {
        Student anu = new Student("Anu", 5, "Female", 1);
        Grade grade1 = new Grade(1, "Maya");
        anu.setPaid(true);
        grade1.setFirsTermMarkOfStudent(anu, 13, 52, 49);
        grade1.setSecondTermMarkOfStudent(anu, 35, 28, 33);
        grade1.setThirdTermMarkOfStudent(anu, 49, 87, 54);

        assertEquals(32, (int) anu.languageAverageMark());
    }

    @Test
    public void testCraftAverageMark() {
        Student anu = new Student("Anu", 5, "Female", 1);
        Grade grade1 = new Grade(1, "Maya");
        anu.setPaid(true);
        grade1.setFirsTermMarkOfStudent(anu, 13, 52, 49);
        grade1.setSecondTermMarkOfStudent(anu, 35, 28, 33);
        grade1.setThirdTermMarkOfStudent(anu, 49, 87, 54);

        assertEquals(45, (int) anu.craftAverageMark());
    }

    @Test
    public void testDrrawingAverageMark() {

        Student anu = new Student("Anu", 5, "Female", 1);
        Grade grade1 = new Grade(1, "Maya");
        anu.setPaid(true);
        grade1.setFirsTermMarkOfStudent(anu, 13, 52, 49);
        grade1.setSecondTermMarkOfStudent(anu, 35, 28, 33);
        grade1.setThirdTermMarkOfStudent(anu, 49, 87, 54);

        assertEquals(55, (int) anu.drrawingAverageMark());
    }

}
