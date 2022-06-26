package com.company.ext.lessons4.animal;

public abstract class Animal {
    private String nickname;
    private String sound;

    public Animal(String nickname, String sound) {
        this.nickname = nickname;
        this.sound = sound;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public abstract String makeNoise();

    public abstract String eat();

    public void sleep(){
        System.out.println("Кот Вася спит");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nickname='" + nickname + '\'' +
                ", sound='" + sound + '\'' +
                '}';
    }
}
