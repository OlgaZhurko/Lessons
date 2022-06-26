package com.company.ext.lessons4.animal;

public class Dog extends Animal{
    private String barks;

    public Dog(String nickname, String sound, String barks) {
        super(nickname, sound);
        this.barks = barks;
    }

    public Dog(String nickname, String sound) {
        super(nickname, sound);
    }

    public String getBarks() {
        return barks;
    }

    public void setBarks(String barks) {
        this.barks = barks;
    }

    @Override
    public String makeNoise() {
        return "Собака лает";
    }

    @Override
    public String eat() {
        return "Собака ест";
    }

    @Override
    public String toString() {
        return super.toString() + "Dog{" +
                "barks='" + barks + '\'' +
                '}';
    }
}
