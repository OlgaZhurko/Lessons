package com.company.ext.lessons3.spaceport;

public class Spaceport {

    public Spaceport() {
    }

    public void launch(IStart start) {

        if (start.systemCheck() == false) {
            System.out.println( false + " Предстартовая проверка провалена");
        } else {
            System.out.println(true + " Все успешно");
        }
        if (start.systemCheck() == true) {
            System.out.println("Двигатели Шатла запущены. Все системы в норме.");
        } else {
            System.out.println("Двигатели Шатла не запущены.");
        }
        if (start.systemCheck() == true){
            System.out.println("Старт Шатла");
        }else {
            System.out.println("Старта не будет");
        }
        if (start.systemCheck() == true){
        start.engineStart();
        for (int i =10; i >= 1; i--){
            System.out.println(i);
        }start.start();
    }else {
            System.out.println("Отсчета не будет");
        }
    }
    }



