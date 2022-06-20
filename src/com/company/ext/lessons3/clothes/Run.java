package com.company.ext.lessons3.clothes;

import com.company.ext.lessons3.clothes.jacket.AJacket;
import com.company.ext.lessons3.clothes.jacket.IJacket;
import com.company.ext.lessons3.clothes.pants.APants;
import com.company.ext.lessons3.clothes.pants.IPants;
import com.company.ext.lessons3.clothes.shoes.AShoes;
import com.company.ext.lessons3.clothes.shoes.IShoes;

public class Run {
    public static void main(String[] args) {
        IJacket jacket = new AJacket();
        IPants pants = new APants();
        IShoes shoes = new AShoes();
        Human human = new Human("Tom",jacket,pants,shoes);
        System.out.println(human.getName());
        human.actionPut();
        human.actionTake();

    }
}
