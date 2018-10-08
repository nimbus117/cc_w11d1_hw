public class Printer {
    private int sheets;

    public Printer() {
        this.sheets = 20;
    }

    public int getSheetsLeft() {
        return sheets;
    }

    public boolean print(int pages, int copies) {
        int sheetsToPrint = pages * copies;
        if (sheetsToPrint <= this.sheets) {
            this.sheets = this.sheets - sheetsToPrint;
            return true;
        }
        return false;
    }
}
