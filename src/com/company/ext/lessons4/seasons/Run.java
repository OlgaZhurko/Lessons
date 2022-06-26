package com.company.ext.lessons4.seasons;

public class Run {
    public static void main(String[] args) {
        Seasons seasons = Seasons.WINTER;
        System.out.println(seasons);
        print(Seasons.WINTER);
        getAll();

        Seasons[] seasons1 = Seasons.values();
            for (Seasons s : seasons1){
                System.out.println(s);
            }
        }

    public static void print (Seasons seasons){
        switch (seasons){
            case AUTUMN:
                System.out.println("Я люблю осень");
                break;
            case SPRING:
                System.out.println("Я люблю весну");
                break;
            case SUMMER:
                System.out.println("Я люблю лето");
                break;
            case WINTER:
                System.out.println("Я люблю зиму");
                break;
        }
    }
    public static void getAll(){
        for (Seasons s : Seasons.values()){
            System.out.println(s + " " + s.getTem() + " " + s.getDescription());
        }
    }
}
