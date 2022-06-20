package com.company.ext.lessons3.spaceport;

public class Shuttle implements IStart{

    public Shuttle() {
    }

    @Override
    public boolean systemCheck() {
        double a = Math.random()*10;
        if(a > 3){
            System.out.println(a);
            System.out.println(true);
            return true;
        }
        else {
            System.out.println(a);
            System.out.println(false);
            return false;
        }
    }

    @Override
    public void engineStart() {
//        if (systemCheck() == true) {
//            System.out.println("Двигатели Шатла запущены. Все системы в норме.");
//        } else {
//            System.out.println("Двигатели Шатла не запущены.");
//        }
    }
    @Override
    public void start() {
//        if (systemCheck() == true){
//            System.out.println("Старт Шатла");
//        }else {
//            System.out.println("Старт не будет");
//        }

    }
}
