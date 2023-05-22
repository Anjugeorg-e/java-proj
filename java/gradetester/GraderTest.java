package gradetester;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Test;

public class GraderTest {
    @Test
    public void fiftyNineShouldReturnF(){
        var Grader = new Grader();
        assertEquals('F', Grader.determineLetterGrade(59));
    }
    @Test
    public void sixtyNineShouldReturnD(){
        var Grader = new Grader();
        assertEquals('D', Grader.determineLetterGrade(69));
    }
    @Test
    public void seventyNineShouldReturnC(){
        var Grader = new Grader();
        assertEquals('C', Grader.determineLetterGrade(79));
    }
    @Test
    public void eightyNineShouldReturnB(){
        var Grader = new Grader();
        assertEquals('B', Grader.determineLetterGrade(89));
    }
    @Test
    public void nintyNineShouldReturnA(){
        var Grader = new Grader();
        assertEquals('A', Grader.determineLetterGrade(99));
    }
    @Test
    public void zeroShouldReturnF(){
        var Grader = new Grader();
        assertEquals('F', Grader.determineLetterGrade(0));
    }
    @Test
    public void negativeOneShouldReturnException(){
        var Grader = new Grader();
        assertThrows(IllegalArgumentException.class, () -> {

            Grader.determineLetterGrade(-1);
        });
    }
}
