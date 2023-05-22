import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import simplecalculator.Simplecalculator;

public class SimplecalculatordemoTest {
    @Test
    public void testAddTwoPlusTwo() {
        var calculator = new Simplecalculator();
        assertEquals(4,calculator.add(2,2));
        assertNotEquals(3, calculator.add(2, 2));
        // assertTrue(null, false);
        // assertFalse(null, false);
        // assertNull(calculator);
        // assertNotNull(calculator);
    }
    @Test
    public void testAddThreePlusThree() {
        var calculator = new Simplecalculator();
        assertEquals(6,calculator.add(3,3));
   
    }
}
