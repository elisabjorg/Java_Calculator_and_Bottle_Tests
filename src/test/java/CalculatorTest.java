import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private Calculator calculator;

    @Before

    public void before() {
        this.calculator = new Calculator();
    }

    @Test
    public void canAdd() {
        assertEquals(4, calculator.add(3,1), 0.001);

    }

    @Test
    public void canSubtract() {
        assertEquals(5, calculator.subtract(6,1), 0.001);
    }

    @Test
    public void canMultiply() {
        assertEquals(6, calculator.multiply(6,1), 0.001);
    }

    @Test
    public void canDivide() {
        assertEquals(2, calculator.divide(6,3),0.001);
    }
}