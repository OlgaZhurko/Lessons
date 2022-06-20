package com.company.ext.lessons3.clothes;

import com.company.ext.lessons3.clothes.jacket.IJacket;
import com.company.ext.lessons3.clothes.pants.IPants;
import com.company.ext.lessons3.clothes.shoes.IShoes;

public class Human implements IHuman{
    private String name;
    private IJacket jacket;
    private IPants pants;
    private IShoes shoes;

    public Human(String name, IJacket jacket, IPants pants, IShoes shoes) {
        this.name = name;
        this.jacket = jacket;
        this.pants = pants;
        this.shoes = shoes;
    }

    public Human() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public IJacket getJacket() {
        return jacket;
    }

    public void setJacket(IJacket jacket) {
        this.jacket = jacket;
    }

    public IPants getPants() {
        return pants;
    }

    public void setPants(IPants pants) {
        this.pants = pants;
    }

    public IShoes getShoes() {
        return shoes;
    }

    public void setShoes(IShoes shoes) {
        this.shoes = shoes;
    }

    @Override
    public void actionPut() {
        jacket.putJacket();
        pants.putPants();
        shoes.putShoes();
    }

    @Override
    public void actionTake() {
        jacket.takeJacket();
        pants.takePants();
        shoes.takeShoes();
    }
}
