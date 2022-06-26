package com.company.ext.lessons3.spaceport;

public class Spaceport {

    public Spaceport() {
    }

    public void launch(IStart start) {

        if (start.systemCheck()) {
          start.engineStart();
            for (int i = 0; i < 11; i++){
                System.out.println(i);
                try {
                    Thread.sleep(800);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }start.start();

        }System.out.println("Предстартовая проверка провалена");
    }
}



