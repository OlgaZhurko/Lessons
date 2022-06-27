package com.company.ext.lessons4.clothing;

public class Pants extends Clothing implements MenClothing,WomenClothing{

    public Pants(int size, double summa, String color) {
        super(size, summa, color);
    }

    public Pants() {
    }

    @Override
    public void dressMen() {

    }

    @Override
    public void dressWoman() {

    }
}
