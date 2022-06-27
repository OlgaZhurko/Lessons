package com.company.ext.lessons4.animal;

public class Run {
    public static void main(String[] args) {
        Animal dog = new Dog("Жук", "издает звук", "Гав");
        Animal cat = new Cat("Пушок", "издает звук", "Мяу");
        Animal horse = new Horse("Рэй", "издает звук", "Иго-го");
        Animal[] animals = {dog, cat, horse};
        for (Animal animal:animals){
            System.out.println(animal.makeNoise());
            System.out.println(animal.eat());
        }

    }

}
