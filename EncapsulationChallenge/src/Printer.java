public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;
    
    public Printer(int tonerLevel, boolean duplex) {
        this(tonerLevel, 0, duplex);
    }

    public Printer(int tonerLevel, int pagesPrinted, boolean duplex) {
        this.tonerLevel = (tonerLevel >= 0 && tonerLevel <=100) ? tonerLevel : -1;
        this.pagesPrinted = pagesPrinted;
        this.duplex = duplex;
    }

    public int addToner(int tonerAmount) {
        if (tonerAmount < 0 || tonerAmount > 100) return -1;
        int tempAmount = tonerAmount + this.tonerLevel;
        if (tempAmount > 100 || tempAmount < 0) {
            return -1;
        } else {
            this.tonerLevel += tonerAmount;
            return this.tonerLevel;
        }
    }

    public int printPages(int pages) {
        int jobPages = (duplex) ? (pages / 2) + pages % 2 : pages;
        this.pagesPrinted += jobPages;
        return jobPages;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
    
}
