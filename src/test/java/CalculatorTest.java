import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before() {
        calculator = new Calculator();
    }

    @Test
    public void canAdd() {
        assertEquals(5, calculator.add(2,3));
    }

    @Test
    public void canSubtract() {
        assertEquals(2, calculator.add(5,3));
    }

    @Test
    public void canMultiply() {
        assertEquals(10, calculator.add(2,5));
    }

    @Test
    public void canDivide() {
        assertEquals(5, calculator.add(10,2));
    }
}
