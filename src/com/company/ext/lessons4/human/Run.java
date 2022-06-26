package com.company.ext.lessons4.human;

import com.company.ext.lessons4.human.Human;

public class Run {
    public static void main(String[] args) {

        Human human = new Human();
        human.move();
        human.talk();
        Human human1 = new Human("Tom", 20);
        human1.move();
        human1.talk();

    }

}
