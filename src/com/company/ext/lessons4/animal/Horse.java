package com.company.ext.lessons4.animal;

public class Horse extends Animal{

    private String roars;

    public Horse(String nickname, String sound, String roars) {
        super(nickname, sound);
        this.roars = roars;
    }

    public String getRoars() {
        return roars;
    }

    public void setRoars(String roars) {
        this.roars = roars;
    }

    @Override
    public String makeNoise() {

        return "Лошадь ржет";
    }

    @Override
    public String eat() {

        return "Лошадь спит";
    }
    @Override
    public String toString() {
        return super.toString() + "Horse{" +
                "roars='" + roars + '\'' +
                '}';
    }
}
