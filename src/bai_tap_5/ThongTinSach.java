package bai_tap_5;

import java.time.Year;
import java.util.Date;

public class ThongTinSach  {
    private TacGiaSach  tg;
    private String nameBook;
    private long priceBook;
    private int yearPrint;
    public ThongTinSach(String nameBook, long priceBook, int yearPrint) {
        this.nameBook = nameBook;
        this.priceBook = priceBook;
        this.yearPrint = yearPrint;
    }

    public ThongTinSach(String nameBook, long priceBook, int yearPrint,TacGiaSach tg) {
        this.tg = tg;
        this.nameBook = nameBook;
        this.priceBook = priceBook;
        this.yearPrint = yearPrint;
    }

    public ThongTinSach(){

}
    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public long getPriceBook() {
        return priceBook;
    }

    public void setPriceBook(long priceBook) {
        this.priceBook = priceBook;
    }

    public int getYearPrint() {
        return yearPrint;
    }

    public void setYearPrint(int yearPrint) {
        this.yearPrint = yearPrint;
    }

    @Override
    public String toString() {
        return "ThongTinSach\n" +
                "NameBook: " + nameBook +
                "\nPriceBook: " + priceBook +
                "\nYearPrint: " + yearPrint +
                "\nThong tin tac gia" + tg ;
    }
}


