import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PrinterTest {
    Printer printer;

    @Before
    public void before() {
        printer = new Printer();
    }

    @Test
    public void hasNumberOfSheetsLeft() {
        assertEquals(20, printer.getSheetsLeft());
    }

    @Test
    public void ableToPrintEnoughSheets() {
        assertEquals(true, printer.print(2,3));
    }

    @Test
    public void ableToPrintNotEnoughSheets() {
        assertEquals(false, printer.print(10,3));
    }

    @Test
    public void removesSheetsWhenPrinting() {
        printer.print(2,3);
        assertEquals(14, printer.getSheetsLeft());
    }

    @Test
    public void canRefil() {
        printer.print(2,3);
        printer.refil();
        assertEquals(20, printer.getSheetsLeft());
    }

    @Test
    public void reducesTonerByOnePerPage() {
        printer.print(2,3);
        assertEquals(14, printer.getToner());
    }
}
