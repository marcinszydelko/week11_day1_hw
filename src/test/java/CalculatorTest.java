import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {


    @Test
    public void canAdd(){
        Calculator calculator = new Calculator();
        assertEquals(15.00, calculator.add(10.00, 5.00), 0.01);
    }

    @Test
    public void canSubtract(){
        Calculator calculator = new Calculator();
        assertEquals(3.00, calculator.subtract(5.00, 2.00), 0.01);
    }

    @Test
    public void canMultiply(){
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.multiply(2.5, 2), 0.01);
    }

    @Test
    public void canDivide(){
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.divide(15, 3), 0.01);
    }

}
