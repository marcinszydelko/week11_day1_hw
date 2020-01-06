import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    @Test
    public void hasSheets(){
        Printer printer = new Printer();
        assertEquals(500, printer.getSheets());
    }

    @Test
    public void canPrint(){
        Printer printer = new Printer();
        printer.print(2,5);
        assertEquals(490, printer.getSheets());
    }

}
