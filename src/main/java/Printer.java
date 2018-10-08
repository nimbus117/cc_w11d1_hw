public class Printer {
    private int sheets;
    private int toner;

    public Printer() {
        this.sheets = 20;
        this.toner = 20;
    }

    public int getSheetsLeft() {
        return sheets;
    }

    public boolean print(int pages, int copies) {
        int totalPages = pages * copies;
        if (totalPages <= this.sheets) {
            this.sheets = this.sheets - totalPages;
            this.toner = this.toner - totalPages;
            return true;
        }
        return false;
    }

    public void refil() {
        this.sheets = 20;
    }

    public int getToner() {
        return toner;
    }
}
