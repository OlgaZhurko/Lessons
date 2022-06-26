package com.company.ext.lessons3.spaceport;

public class Shuttle implements IStart{

    public Shuttle() {
    }

    @Override
    public boolean systemCheck() {
        return (Math.random() * 10) > 3 ? true : false;
    }

    @Override
    public void engineStart() {

            System.out.println("Двигатели Шатла запущены. Все системы в норме.");
    }
    @Override
    public void start() {

        System.out.println("Старт Шатла");
    }
}
