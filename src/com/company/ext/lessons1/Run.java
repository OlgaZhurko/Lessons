package com.company.ext.lessons1;

public class Run {
    public static void main(String[] args) {
    int i=4522;
    int minut;
    int sek;
    int chas;

    minut = i / 60;
    sek = i%60;
        System.out.println("Минуты" +minut + " и секунды " + sek);

        chas = i / 3600;
        minut = i / 60%60;
        sek = i%60;
        System.out.println("Часы " + chas + " Минуты " + minut + " и секунды " + sek);
    }

}
