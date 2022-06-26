package com.company.ext.lessons4.animal;

public class Cat extends Animal{

    private String meows;

    public Cat(String nickname, String sound, String meows) {
        super(nickname, sound);
        this.meows = meows;
    }

    public String getMeows() {
        return meows;
    }

    public void setMeows(String meows) {
        this.meows = meows;
    }

    @Override
    public String makeNoise() {

        return "Кот мяукает";
    }

    @Override
    public String eat() {

        return "Кот спит";
    }

    @Override
    public String toString() {
        return super.toString() + "Cat{" +
                "meows='" + meows + '\'' +
                '}';
    }
}
