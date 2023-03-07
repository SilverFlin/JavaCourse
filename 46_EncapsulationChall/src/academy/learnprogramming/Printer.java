package academy.learnprogramming;

public class Printer {

    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {

        if (tonerLevel > -1 && tonerLevel <= 100){
            this.tonerLevel = tonerLevel;
        } else{
            this.tonerLevel = -1;
        }
        this.pagesPrinted = 0;
        this.duplex = duplex;
    }

    public int addToner(int tonerAmount){
     if (tonerAmount > 0 && tonerAmount <= 100){
         if (this.tonerLevel + tonerAmount <= 100){
             this.tonerLevel += tonerAmount;
         }else{
             return -1;
         }
     }else {
         return -1;
     }
        return this.tonerLevel;
    }
    public int printPages(int pages){

        int pagesToPrint = 0;
        if (this.duplex){
            pagesToPrint += (pages/2) + (pages % 2);
        } else{
            pagesToPrint += pages;
        }
        this.pagesPrinted += pagesToPrint;

        return pagesToPrint;

    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}

// Create a class and demonstate proper encapsulation techniques
// the class will be called Printer
// It will simulate a real Computer Printer
// It should have fields for the toner Level, number of pages printed, and
// also whether its a duplex printer (capable of printing on both sides of the paper).
// Add methods to fill up the toner (up to a maximum of 100%), another method to
// simulate printing a page (which should increase the number of pages printed).
// Decide on the scope, whether to use constructors, and anything else you think is needed.