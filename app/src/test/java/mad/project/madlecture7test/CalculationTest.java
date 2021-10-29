package mad.project.madlecture7test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculationTest {
    private Calculations calculations;

    public void setup(){
        calculations = new Calculations();
    }

    public void testAddNumbers(){
        int result = calculations.add(4,11);
        assertEquals(15, result);
    }

    public void testSubtract(){
        int result = calculations.subract(6,2);
        assertEquals(4, result);
    }

    public void testMultiply(){
        int result = calculations.multiply(6,2);
        assertEquals(12, result);
    }
}
