package com.company.ext.lessons3.robot;

import com.company.ext.lessons3.robot.hands.IHand;
import com.company.ext.lessons3.robot.heads.IHead;
import com.company.ext.lessons3.robot.legs.ILeg;

public class SamsungRobot implements IRobot{
    private IHead head1;
    private IHand hand1;
    private ILeg leg1;

    public SamsungRobot(IHead head1, IHand hand1, ILeg leg1) {
        this.head1 = head1;
        this.hand1 = hand1;
        this.leg1 = leg1;
    }

    public SamsungRobot() {
    }

    public IHead getHead1() {
        return head1;
    }

    public void setHead1(IHead head1) {
        this.head1 = head1;
    }

    public IHand getHand1() {
        return hand1;
    }

    public void setHand1(IHand hand1) {
        this.hand1 = hand1;
    }

    public ILeg getLeg1() {
        return leg1;
    }

    public void setLeg1(ILeg leg1) {
        this.leg1 = leg1;
    }

    @Override
    public void action() {
        head1.speek();
        hand1.upHand();
        leg1.step();
    }

    @Override
    public int getPrice() {
        int price = head1.getPrice() + hand1.getPrice() + leg1.getPrice();
        return price;
    }
}
