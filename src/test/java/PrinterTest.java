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
}
