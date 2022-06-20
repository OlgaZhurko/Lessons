package com.company.ext.lessons3.clothes.shoes;

public class AShoes implements IShoes{

    public AShoes() {
    }

    @Override
    public void putShoes() {
        System.out.println("Надеть обувь");
    }

    @Override
    public void takeShoes() {
        System.out.println("Снять обувь");
    }
}
