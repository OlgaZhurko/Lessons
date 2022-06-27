package com.company.ext.lessons4.clothing;

public class Shirt extends Clothing implements MenClothing,WomenClothing{

    public Shirt(int size, double summa, String color) {
        super(size, summa, color);
    }

    public Shirt() {
    }

    @Override
    public void dressMen() {

    }

    @Override
    public void dressWoman() {

    }

}
