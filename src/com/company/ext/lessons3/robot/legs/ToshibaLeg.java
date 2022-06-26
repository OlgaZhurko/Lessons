package com.company.ext.lessons3.robot.legs;

public class ToshibaLeg implements ILeg{
    private int price;

    public ToshibaLeg(int price) {
        this.price = price;
    }

    public ToshibaLeg() {
    }

    @Override
    public void step() {
        System.out.println("Говорят ноги Toshiba");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
