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

}
