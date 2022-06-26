package com.company.ext.lessons3.clothes.jacket;

public class AJacket implements IJacket{

    public AJacket() {
    }

    @Override
    public void putJacket() {
        System.out.println("Одеть куртку");
    }

    @Override
    public void takeJacket() {
        System.out.println("Снять куртку");
    }
}
