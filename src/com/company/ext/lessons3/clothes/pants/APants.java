package com.company.ext.lessons3.clothes.pants;

public class APants implements IPants{
    public APants() {
    }

    @Override
    public void putPants() {
        System.out.println("Одеть штаны");
    }

    @Override
    public void takePants() {
        System.out.println("Снять штаны");
    }
}
