package com.company.ext.lessons3.robot.legs;

public class SonyLeg implements ILeg{
    private int price;

    public SonyLeg(int price) {
        this.price = price;
    }

    public SonyLeg() {
    }

    @Override
    public void step() {
        System.out.println("Говорят ноги Sony");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
