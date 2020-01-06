import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    @Test
    public void hasSheets(){
        Printer printer = new Printer();
        assertEquals(500, printer.getSheets());
    }

    
}
