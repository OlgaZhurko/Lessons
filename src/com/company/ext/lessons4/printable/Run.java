package com.company.ext.lessons4.printable;

public class Run {

    public static void main(String[] args) {
        Magazine magazine = new Magazine("Cool");
        Magazine magazine1 = new Magazine("Pool");
        Printable[] printables = {magazine,magazine1};
       Magazine.printMagazines(printables);
       Book book = new Book("Война и мир");
       Book book1 = new Book("Ревизор");
       Printable[] printables1 = {book,book1};
       Book.printBooks(printables1);
    }
}
