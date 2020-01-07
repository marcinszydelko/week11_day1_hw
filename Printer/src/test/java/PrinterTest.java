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

    @Test
    public void hasTonner(){
        Printer printer = new Printer();
        assertEquals(1000, printer.getToner());
    }

    @Test
    public void doesPrint(){
        Printer printer = new Printer();
        printer.print(2,5);
        assertEquals(990, printer.getToner());
    }

    @Test
    public void doesNotPrint(){
        Printer printer = new Printer();
        printer.print(100, 12);
        assertEquals(500, printer.getSheets());
    }



}
